package com.connection.pooling;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

class JdbcConnectionPool {

	List<Connection> availableConnections = new ArrayList<Connection>();
	static int connectionCount;

	public JdbcConnectionPool()	{
		initializeConnectionPool();
	}
	private void initializeConnectionPool()	{
		while(!checkIfConnectionPoolIsFull()) {
			availableConnections.add(createNewConnectionForPool());
			System.out.println("new connection added "+ (++connectionCount));
		}
	}
	private synchronized boolean checkIfConnectionPoolIsFull() {
		final int MAX_POOL_SIZE = Configuration.getInstance().DB_MAX_CONNECTIONS;
		if(availableConnections.size() < MAX_POOL_SIZE)	{
			System.out.println("Connection_pool is not full with count"+ (connectionCount));
			return false;
		}
		System.out.println("Connection_pool is full with count"+ (connectionCount));
		return true;
	}

	//Creating a connection
	private Connection createNewConnectionForPool()	{
		Configuration config = Configuration.getInstance();
		try {
			Class.forName(config.DB_DRIVER);
			Connection connection = (Connection) DriverManager.getConnection(
					config.DB_URL, config.DB_USER_NAME, config.DB_PASSWORD);
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public synchronized Connection getConnectionFromPool() {
		Connection connection = null;
		if(availableConnections.size() > 0)	{
			connection = (Connection) availableConnections.get(0);
			availableConnections.remove(0);
		}
		return connection;
	}
	public synchronized void returnConnectionToPool(Connection connection){
		availableConnections.add(connection);
		System.out.println("Returned connection to Connection_pool and now count is "+ (connectionCount));
	}
}

class DataSource {

	static JdbcConnectionPool pool = new JdbcConnectionPool();
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection connection = pool.getConnectionFromPool();
		return connection;
	}
	public static void returnConnection(Connection connection) {
		pool.returnConnectionToPool(connection);
	}
}


class Configuration{
	public String DB_USER_NAME ;
	public String DB_PASSWORD ;
	public String DB_URL;
	public String DB_DRIVER;
	public Integer DB_MAX_CONNECTIONS;

	public Configuration(){
		init();
	}
	private static Configuration configuration = new Configuration();
	public static Configuration getInstance(){ 
		return configuration;
	}
	private void init(){
		DB_USER_NAME = "root";
		DB_PASSWORD = "Welcome123";
		DB_URL = "jdbc:mysql://localhost:3306/practice";
		DB_DRIVER = "com.mysql.jdbc.Driver";
		DB_MAX_CONNECTIONS = 2;
	}     
}

public class ConnectionPooling{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = null;
		
			con = DataSource.getConnection();
			System.out.println("We have got connection from ConnectionPool class");	

		PreparedStatement prepStmt = con.prepareStatement("select ID, NAME from EMP");
		ResultSet rs = prepStmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("ID") + " ");
			System.out.println(rs.getString("NAME"));
		}

		if (rs != null)
			rs.close(); // close resultSet
		if (prepStmt != null)
			prepStmt.close(); // close PreparedStatement

		DataSource.returnConnection(con);
		System.out.println("We have free/released connection to ConnectionPool class");

	}
}
