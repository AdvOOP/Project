package b6070236_b6070212_b6074425;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class calculate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate window = new calculate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand :");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBrand.setBounds(12, 89, 80, 41);
		frame.getContentPane().add(lblBrand);
		
		JLabel lblModel = new JLabel("Model :");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModel.setBounds(12, 143, 80, 41);
		frame.getContentPane().add(lblModel);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrice.setBounds(12, 197, 80, 41);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMonth.setBounds(12, 251, 80, 41);
		frame.getContentPane().add(lblMonth);
		
		JLabel lblStar = new JLabel("Star :");
		lblStar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStar.setBounds(12, 305, 80, 41);
		frame.getContentPane().add(lblStar);
		
		JLabel lblInterest = new JLabel("Interest :");
		lblInterest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInterest.setBounds(12, 359, 90, 41);
		frame.getContentPane().add(lblInterest);
		
		JLabel lblNewLabel = new JLabel(" The system calculates the amount of installments per month");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(12, 13, 558, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(104, 89, 161, 41);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(104, 143, 161, 41);
		frame.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(104, 197, 161, 41);
		frame.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(104, 251, 161, 41);
		frame.getContentPane().add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(104, 305, 161, 41);
		frame.getContentPane().add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(104, 359, 161, 41);
		frame.getContentPane().add(textPane_5);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(137, 426, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblTotal = new JLabel("Total =");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(12, 481, 90, 41);
		frame.getContentPane().add(lblTotal);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(104, 481, 416, 41);
		frame.getContentPane().add(textPane_6);
	}
}
