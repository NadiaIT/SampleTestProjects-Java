package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {

	private final String _URL = "jdbc:mysql://localhost/project";
	private final String _userName = "root";
	private final String _passWord = "";

	Connection _connection;
	Statement _statement;

	public DatabaseManager() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			_connection = DriverManager.getConnection(_URL, _userName,
					_passWord);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void executeUpdate(String query) {
		try {
			_statement = _connection.createStatement();
			_statement.executeUpdate(query);
			_statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet executeQuery(String query) {
		ResultSet resultSet = null;
		try {
			_statement = _connection.createStatement();
			resultSet = _statement.executeQuery(query);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return resultSet;
	}

	public void closeConnection() {
		try {
			_statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}