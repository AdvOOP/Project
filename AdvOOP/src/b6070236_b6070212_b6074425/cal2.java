package b6070236_b6070212_b6074425;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class cal2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal2 frame = new cal2();
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
	public cal2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand :");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrand.setBounds(12, 89, 80, 41);
		contentPane.add(lblBrand);
		
		JLabel lblModel = new JLabel("Model :");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModel.setBounds(12, 143, 80, 41);
		contentPane.add(lblModel);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrice.setBounds(12, 197, 80, 41);
		contentPane.add(lblPrice);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMonth.setBounds(12, 251, 80, 41);
		contentPane.add(lblMonth);
		
		JLabel lblStar = new JLabel("Star :");
		lblStar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStar.setBounds(12, 305, 80, 41);
		contentPane.add(lblStar);
		
		JLabel lblInterest = new JLabel("Interest :");
		lblInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInterest.setBounds(12, 359, 90, 41);
		contentPane.add(lblInterest);
		
		JLabel lblNewLabel = new JLabel(" The system calculates the amount of installments per month");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 13, 558, 41);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(104, 89, 161, 41);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(104, 143, 161, 41);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(104, 197, 161, 41);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(104, 251, 161, 41);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(104, 305, 161, 41);
		contentPane.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(104, 359, 161, 41);
		contentPane.add(textPane_5);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(137, 426, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblTotal = new JLabel("Total =");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(12, 481, 90, 41);
		contentPane.add(lblTotal);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(104, 481, 416, 41);
		contentPane.add(textPane_6);
	}
	
	

}
