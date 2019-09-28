package b6070236_b6070212_b6074425;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;


public class  Calculatcar extends JFrame {
	private JPanel contentPane;
	protected double month,price,pay,interest;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	Statement st;
	Connection con = null;
	ResultSet rs;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatcar frame = new Calculatcar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	});
	}
	
	public void fileCombobox(){
//		Kinematics DB_Kinematics = new Kinematics();
//		con =DB_Kinematics.connectdatabase();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			 st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
				comboBox.addItem(rs.getString("Brand"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	
	public void fileCombobox2(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next())
			{
				comboBox_1.addItem(rs.getString("Model"));
			}
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculatcar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E04\u0E33\u0E19\u0E27\u0E13\u0E08\u0E33\u0E19\u0E27\u0E19\u0E07\u0E27\u0E14\u0E15\u0E48\u0E2D\u0E40\u0E14\u0E37\u0E2D\u0E19");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(102, 13, 323, 45);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0E22\u0E35\u0E48\u0E2B\u0E49\u0E2D :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataadv", "root", "");
			String query = "select * from datamotorcycle";
			st = con.createStatement();
			rs = st.executeQuery(query);
		}catch(Exception e2){
			
		}
		label_1.setBounds(12, 84, 56, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0E23\u0E38\u0E48\u0E19 :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(12, 136, 56, 22);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0E23\u0E32\u0E04\u0E32 :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(12, 239, 56, 22);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0E07\u0E27\u0E14\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E1C\u0E48\u0E2D\u0E19 :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(12, 192, 146, 22);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u0E14\u0E32\u0E27\u0E19\u0E4C :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(12, 288, 56, 22);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0E14\u0E2D\u0E01\u0E40\u0E1A\u0E35\u0E49\u0E22 % :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(12, 337, 96, 22);
		contentPane.add(label_6);
		
		comboBox = new JComboBox();
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Honda", "Yamaha", "Suzuki", "Ducati", "BMW"}));
		comboBox.setBounds(80, 82, 167, 30);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"CBR1000RR", "R1M", "GSX-R1000", "Panigale1199", "S1000RR"}));
		comboBox_1.setBounds(80, 134, 167, 30);
		contentPane.add(comboBox_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(80, 239, 167, 30);
		contentPane.add(textPane);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"12", "24", "36", "48"}));
		comboBox_2.setBounds(170, 190, 167, 30);
		contentPane.add(comboBox_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(80, 288, 167, 30);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(120, 337, 167, 30);
		contentPane.add(textPane_2);
		
		JButton btnNewButton = new JButton("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(11, 26, 79, 25);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u0E41\u0E19\u0E30\u0E19\u0E33");
		button_1.setBounds(150, 404, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E23\u0E16");
		button_2.setBounds(382, 85, 113, 25);
		contentPane.add(button_2);
		
		JButton button = new JButton("\u0E04\u0E33\u0E19\u0E27\u0E13");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month = Double.parseDouble(comboBox_2.getSelectedItem().toString());
				price = Double.parseDouble(textPane.getText());
				pay = Double.parseDouble(textPane_1.getText());
				interest = Double.parseDouble(textPane_2.getText());
				
				Mom m = new Mom();
				calculate c1 = new calculate();
				claculate3 c3 = new claculate3();
				calculate2 c2 = new calculate2();				
				c3.mommom(month, price, pay, interest);
				c3.getFinance();
				c3.calStar(pay,price);
				c2.calTotal(c3.getFinance(),c1.getInterest());
				c2.calInstallment(month);

				
				int num = 20 ;
				String sum = String.valueOf(c2.getInstallment());
 				
				JOptionPane.showMessageDialog(null,sum);
				System.out.print(c3.getFinance() + " 1 ");
				System.out.print(c1.getInterest() + " 1 ");
				System.out.print(c2.getInstallment() + " 1 ");
				
			}
		});
		button.setBounds(12, 404, 97, 25);
		contentPane.add(button);
		fileCombobox2();
		fileCombobox();

	}
}
