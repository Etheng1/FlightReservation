package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class DatabaseConnection {
	public static Connection dbConnector() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root",
					"24665123");

		} catch (SQLException e)

		{
			Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
			JOptionPane.showMessageDialog(null, e);

		}
		return null;
	}

	public static void InsertUserData(String firstname, String lastname, String address, String zip, String state,
			String username, String password, String email, String ssn, String securityQuestion, String secAnswer) {
		// TODO Auto-generated method stub
		
	}
	
}
