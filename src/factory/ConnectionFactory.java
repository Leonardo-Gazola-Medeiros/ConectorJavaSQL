package factory;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/(Address Name)",
					"root_User",
					"password");
		}
		catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}

}
