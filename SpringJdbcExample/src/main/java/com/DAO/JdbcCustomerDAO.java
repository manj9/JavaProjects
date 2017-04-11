package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.spring.Customer;

public class JdbcCustomerDAO implements CustomerDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;

	}

	public void insert(Customer customer) {

		String sql = "insert into customer values(?,?,?";

		Connection conn = null;
		try {

			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e)

				{
				}

			}
		}
	}

	public Customer findByCustomerId(int custId) {

		String sql = "select * from customer where CUST_ID = ?";

		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer(rs.getInt("CUST_ID"), rs.getString("NAME"), rs.getInt("Age"));

			}
			rs.close();
			ps.close();
			return customer;

		} catch (Exception e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}

			}
		}

	}

}
