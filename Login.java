import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Login {

	private JFrame frame;
	private JTextField username;

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

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 204));
		frame.setBounds(100, 100, 794, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 25));
		lblUsername.setBounds(182, 283, 164, 45);
		frame.getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setBounds(386, 285, 228, 45);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 18));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 100, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=username.getText();
				JOptionPane.showMessageDialog(frame, "Login done successfully");
				
			}
		});
		btnLogin.setBounds(280, 390, 191, 45);
		frame.getContentPane().add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(316, 105, 174, 138);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblShowimages = new JLabel("show-images");
		lblShowimages.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\\uADF8\uB9BC1.png"));
		lblShowimages.setBounds(12, 0, 150, 138);
		panel.add(lblShowimages);
		
		JLabel lblKonkukCardGame = new JLabel("KonKuk Card Game");
		lblKonkukCardGame.setForeground(new Color(0, 100, 0));
		lblKonkukCardGame.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 32));
		lblKonkukCardGame.setBounds(253, 25, 386, 70);
		frame.getContentPane().add(lblKonkukCardGame);
	}
}
