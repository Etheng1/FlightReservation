package Login;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Database.DatabaseConnection;
import java.awt.BorderLayout;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Login() throws ClassNotFoundException, SQLException {
		initialize();
		connection = DatabaseConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(291, 74, 64, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(291, 118, 64, 14);
		frame.getContentPane().add(lblPassword);

		JTextField usernameField = new JTextField();
		usernameField.setForeground(new Color(0, 0, 0));
		usernameField.setBackground(new Color(255, 255, 255));
		usernameField.setBounds(365, 70, 144, 23);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(365, 114, 144, 23);
		passwordField.setEchoChar('*');
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(291, 217, 96, 23);
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					String sql = "select username, password from user where username = ? and password = ?";
					PreparedStatement pst = connection.prepareStatement(sql);
					pst.setString(0, usernameField.getText());
					pst.setString(1, passwordField.getText());

					ResultSet rs = pst.executeQuery();
					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "Username and Password is correct!");
					}

					else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password!");
					}

					else {
						JOptionPane.showMessageDialog(null, "Username and Password is incorrect!");
					}

					rs.close();
					pst.close();

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);

				}
			}
		});
		frame.getContentPane().add(btnLogin);

		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setBounds(291, 183, 218, 23);
		btnForgetPassword.setBackground(new Color(255, 255, 255));
		btnForgetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnForgetPassword);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(413, 217, 96, 23);
		btnRegister.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnRegister);

		JLabel lblPicture = new JLabel("New label");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\ethen\\Desktop\\Admin.png"));
		lblPicture.setBounds(27, 49, 223, 225);
		frame.getContentPane().add(lblPicture);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember my login");
		chckbxNewCheckBox.setBounds(291, 147, 196, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
	}

}
