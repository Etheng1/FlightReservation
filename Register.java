import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.DatabaseConnection;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtZipCode;
	private JTextField txtState;
	private JTextField txtSSN;
	private JTextField txtSecurityQuestion;
	private JTextField txtSecurityAnswer;
	private JTextField txtFirstName;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(34, 57, 74, 14);
		contentPane.add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name\r\n");
		lblLastName.setBounds(34, 82, 74, 14);
		contentPane.add(lblLastName);

		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(34, 207, 113, 14);
		contentPane.add(lblEmailAddress);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(34, 107, 46, 14);
		contentPane.add(lblAddress);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(34, 157, 46, 14);
		contentPane.add(lblState);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(302, 207, 74, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(302, 232, 74, 14);
		contentPane.add(lblPassword);

		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setBounds(34, 232, 113, 14);
		contentPane.add(lblSecurityQuestion);

		txtLastName = new JTextField();
		txtLastName.setBounds(144, 79, 128, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(144, 104, 128, 20);
		contentPane.add(txtAddress);

		txtZipCode = new JTextField();
		txtZipCode.setColumns(10);
		txtZipCode.setBounds(144, 129, 128, 20);
		contentPane.add(txtZipCode);

		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(144, 154, 128, 20);
		contentPane.add(txtState);

		txtSSN = new JTextField();
		txtSSN.setColumns(10);
		txtSSN.setBounds(144, 179, 128, 20);
		contentPane.add(txtSSN);

		txtSecurityQuestion = new JTextField();
		txtSecurityQuestion.setColumns(10);
		txtSecurityQuestion.setBounds(144, 232, 128, 20);
		contentPane.add(txtSecurityQuestion);

		txtSecurityAnswer = new JTextField();
		txtSecurityAnswer.setColumns(10);
		txtSecurityAnswer.setBounds(144, 256, 128, 20);
		contentPane.add(txtSecurityAnswer);

		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(144, 54, 128, 20);
		contentPane.add(txtFirstName);

		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(34, 182, 46, 14);
		contentPane.add(lblSsn);

		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(34, 132, 63, 14);
		contentPane.add(lblZipCode);

		JLabel lblSecurityAnswer = new JLabel("Security Answer");
		lblSecurityAnswer.setBounds(34, 259, 113, 14);
		contentPane.add(lblSecurityAnswer);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\etheng\\Desktop\\Flights.jpg"));
		lblNewLabel_1.setBounds(318, 55, 182, 138);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Register");
	
    
		btnNewButton.setBounds(152, 287, 89, 23);
		contentPane.add(btnNewButton);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(144, 204, 128, 20);
		contentPane.add(txtEmail);

		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(372, 204, 128, 20);
		contentPane.add(txtUsername);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(372, 229, 128, 20);
		contentPane.add(txtPassword);
	}

	private void InsertUserData() {
		DatabaseConnection dbInteraction = new DatabaseConnection();
		String firstname = txtFirstName.getText();
		String lastname = txtLastName.getText();
		String address = txtAddress.getText();
		String zip = txtZipCode.getText();
		String state = txtState.getText();
		String username = txtUsername.getText();
		String password = txtPassword.getText();
		String email = txtEmail.getText();
		String ssn = txtSSN.getText();
		String securityQuestion = txtSecurityQuestion.getText();
		String secAnswer = txtSecurityAnswer.getText();
		DatabaseConnection.InsertUserData(firstname, lastname, address, zip, state, username, password, email, ssn,
				securityQuestion, secAnswer);
	}
}