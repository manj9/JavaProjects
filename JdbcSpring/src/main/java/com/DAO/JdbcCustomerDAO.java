package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.App.Customer;
import com.RowMapper.CustomerRowMapper;

public class JdbcCustomerDAO implements CustomerDAO {

	private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    
    
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Customer customer) {

		String sql = "INSERT INTO CUSTOMER  VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public Customer findByCustomerId(int custId) {
        
		//This is without using Rowmapper
		/*String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getInt(3));
			}
			rs.close();
			ps.close();
	
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
				
		
			}
		}
	}
}
	*/
		String sql = "select * from customer where CUST_ID=?";
		
		Customer customer = (Customer)getJdbcTemplate().queryForObject(
				sql, new Object[] { custId }, new CustomerRowMapper());
	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return null;
	}
}
