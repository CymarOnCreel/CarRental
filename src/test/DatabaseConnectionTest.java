package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

	@Test
	public void testDatabaseConnection() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/car_rental?useSSL=false";
		String username = "root";
		String password = "";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcUrl, username, password);

			if (connection != null) {
				System.out.println("Database connection established successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}