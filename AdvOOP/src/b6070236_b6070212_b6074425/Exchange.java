package b6070236_b6070212_b6074425;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.*;
import javax.swing.JLabel;
public class Exchange extends JFrame {	
	static String price;
	static int[] arr; 	
	/**
	 * Launch the application.
	 * @throws JSONException 
	 */
	public static void main(String[] args) throws JSONException {	
		
		try {
			URL url = new URL("https://api.coinbase.com/v2/prices/spot?currency=USD");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			while ((output = br.readLine()) != null) {              
			JSONObject obj = new JSONObject(output);
			price= obj.getJSONObject("data").getString("amount");			
             }
			
			
			conn.disconnect();
			

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();
		  }		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Exchange frame = new Exchange();
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
	public Exchange() {	
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BITCOIN PRICE = "+price+ " (From API coinbase.com)");
		lblNewLabel.setBounds(12, 13, 324, 16);
		getContentPane().add(lblNewLabel);
	
	}
	
	

		
}
