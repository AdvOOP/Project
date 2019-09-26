package b6070236_b6070212_b6074425;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Kinematics extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox_1;
	
	Statement st;
	Connection con = null;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Kinematics DB_Kinematics = new Kinematics();
		Connection con = null;
		con =DB_Kinematics.connectdatabase();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kinematics frame = new Kinematics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	public Connection connectdatabase(){
//		try{
//			 Class.forName("com.mysql.jdbc.Driver");
//			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
//			 st = con.createStatement();
//			 st.close();
//		}
//			catch(SQLException e){
//				System.out.println(e);
//		}
//			catch(Exception ex) {
//				System.out.println(ex);
//		}
//		return con;
//	}
	
	public void fileCombobox(){
//		Kinematics DB_Kinematics = new Kinematics();
//		con =DB_Kinematics.connectdatabase();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from physics";
			 st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
				comboBox_1.addItem(rs.getString("formula"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	/**
	 * Create the frame.
	 */
	public Kinematics() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 815, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.addItem("Kinamatics");
		comboBox.addItem("Movement");
		comboBox.addItem("Kinamatics");
		comboBox.setBounds(165, 120, 141, 35);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(417, 120, 278, 35);
		contentPane.add(comboBox_1);
		fileCombobox();
		
		JLabel lblb = new JLabel("\u0E01\u0E32\u0E23\u0E04\u0E33\u0E19\u0E27\u0E13\u0E17\u0E32\u0E07\u0E1F\u0E34\u0E2A\u0E34\u0E01\u0E2A\u0E4C");
		lblb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblb.setBounds(302, 45, 210, 29);
		contentPane.add(lblb);
		
		JLabel label = new JLabel("\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E2B\u0E32");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(51, 120, 104, 35);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u0E2A\u0E39\u0E15\u0E23");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(341, 124, 50, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(275, 197, 237, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(275, 256, 237, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(275, 315, 237, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(275, 374, 237, 35);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(275, 431, 237, 35);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("\u0E04\u0E33\u0E19\u0E27\u0E13");
		btnNewButton.setBounds(560, 196, 111, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0E25\u0E49\u0E32\u0E07\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25");
		btnNewButton_1.setBounds(560, 255, 111, 29);
		contentPane.add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(275, 499, 237, 46);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E04\u0E27\u0E32\u0E21\u0E40\u0E23\u0E47\u0E27\u0E1B\u0E25\u0E32\u0E22(V)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(108, 265, 126, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblU = new JLabel("\u0E04\u0E27\u0E32\u0E21\u0E40\u0E23\u0E47\u0E27\u0E15\u0E49\u0E19(U)");
		lblU.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblU.setBounds(108, 206, 126, 26);
		contentPane.add(lblU);
		
		JLabel lblA = new JLabel("\u0E2D\u0E31\u0E15\u0E23\u0E32\u0E40\u0E23\u0E48\u0E07(A) \u0E2B\u0E23\u0E37\u0E2D");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA.setBounds(108, 324, 89, 26);
		contentPane.add(lblA);
		
		JLabel lblT = new JLabel("\u0E40\u0E27\u0E25\u0E32(T)");
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblT.setBounds(108, 389, 89, 26);
		contentPane.add(lblT);
		
		JLabel lblS = new JLabel("\u0E23\u0E30\u0E22\u0E30\u0E17\u0E32\u0E07(S)");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblS.setBounds(108, 440, 89, 26);
		contentPane.add(lblS);
		
		JLabel label_1 = new JLabel("\u0E1C\u0E25\u0E25\u0E31\u0E1E\u0E18\u0E4C");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(108, 507, 89, 26);
		contentPane.add(label_1);
		
	}
}
