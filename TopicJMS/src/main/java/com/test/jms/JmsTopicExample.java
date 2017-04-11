package com.test.jms;

import java.net.URI;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class JmsTopicExample {

	public static void main(String[] args)throws Exception {
		
		BrokerService broker = BrokerFactory.createBroker(new URI("broker:(tcp://localhost:61616)"));
        broker.start();
        Connection conn = null;
        try
        {
        	ConnectionFactory connectionfactory = new ActiveMQConnectionFactory(/*"tcp://localhost:61616)"*/);
        	conn = connectionfactory.createConnection();
        	Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
        	Topic topic = session.createTopic("customerTopic");
      
        
        MessageConsumer consumer1 = session.createConsumer(topic);
        consumer1.setMessageListener(new ConsumerMessageListener("Consumer1"));
        
        MessageConsumer consumer2 = session.createConsumer(topic);
        consumer2.setMessageListener(new ConsumerMessageListener("Consumer2"));
        conn.start();
        String payload = "imp task";
        Message msg = session.createTextMessage(payload);
        MessageProducer producer = session.createProducer(topic);
        System.out.println("sending text"+payload+"");
        producer.send(msg);
        Thread.sleep(30000);
        session.close();
        }finally{
		if(conn!=null){
			conn.close();
		}
	  
        }
	}
}
