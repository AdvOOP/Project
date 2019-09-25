package b6070236_b6070212_b6074425;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Command {
/// LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL>
	private JFrame frmB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Command window = new Command();
					window.frmB.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Command() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {			
		frmB = new JFrame();		
		frmB.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\download3.jpg"));
		frmB.setTitle("ProjectAdvOOP");
		frmB.setBounds(100, 100, 408, 329);
		frmB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmB.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19");
		label.setBackground(Color.WHITE);
		label.setFont(new Font("KodchiangUPC", Font.BOLD | Font.ITALIC, 40));
		label.setForeground(Color.BLUE);
		label.setBounds(12, 21, 314, 42);
		frmB.getContentPane().add(label);
		
		JButton button = new JButton("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E41\u0E1B\u0E25\u0E07\u0E04\u0E48\u0E32\u0E40\u0E07\u0E34\u0E19\u0E14\u0E34\u0E08\u0E34\u0E17\u0E2D\u0E25");
		button.setBounds(97, 162, 207, 34);
		frmB.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E04\u0E33\u0E19\u0E27\u0E19\u0E14\u0E2D\u0E01\u0E40\u0E1A\u0E35\u0E49\u0E22\u0E21\u0E2D\u0E40\u0E15\u0E2D\u0E23\u0E4C\u0E44\u0E0B\u0E14\u0E4C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(97, 86, 263, 34);
		frmB.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E1F\u0E34\u0E2A\u0E34\u0E01\u0E2A\u0E4C");
		button_2.setBounds(97, 235, 127, 34);
		frmB.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/images.png")).getImage();
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(28, 149, 50, 50);
		frmB.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
		label_2.setIcon(new ImageIcon(img3));
		label_2.setBounds(28, 76, 50, 50);
		frmB.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/download (1).png")).getImage();		
		label_3.setIcon(new ImageIcon(img2));
		label_3.setBounds(28, 219, 50, 50);
		frmB.getContentPane().add(label_3);
	}
}
