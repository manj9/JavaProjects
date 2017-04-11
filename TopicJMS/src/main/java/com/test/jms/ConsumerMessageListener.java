package com.test.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerMessageListener implements MessageListener {

	private String consumerName;
	public ConsumerMessageListener(String consumerName){
		this.consumerName=consumerName;
	}
	public void onMessage(Message message) {
	
		TextMessage textmessage = (TextMessage)message;
		try{
			System.out.println(consumerName +"received"+textmessage.getText());
		}catch(Exception e){
			
		e.printStackTrace();		
				
			}
		}

	}

