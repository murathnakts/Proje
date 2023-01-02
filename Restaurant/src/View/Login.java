package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Login extends Restaurant {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setBounds(550, 150, 483, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cikis = new JButton("ÇIKIŞ");
		cikis.setBounds(256, 340, 112, 45);
		cikis.setBackground(new Color(255, 0, 0));
		cikis.setForeground(new Color(0, 0, 0));
		cikis.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 dispose();
			}
			
		});
		
		
		JButton giris = new JButton("MENÜ GİRİŞ");
		giris.setBounds(67, 340, 119, 45);
		giris.setForeground(new Color(0, 0, 0));
		giris.setBackground(new Color(0, 128, 0));
		giris.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Restaurant menü = new Restaurant();
				menü.getContentPane().setLayout(null);
				menü.setVisible(true);
				dispose();
			}
			
		});
		
		JLabel restad = new JLabel("AKİNSA RESTAURANT");
		restad.setForeground(new Color(0, 0, 0));
		restad.setBounds(76, 168, 300, 79);
		restad.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		
		JLabel hg= new JLabel("HOŞ GELDİNİZ");
		hg.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		hg.setBounds(116, 216, 297, 54);
		
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("giris.png")));
		background.setBounds(0, 0, 469, 475);
		
		contentPane.add(cikis);
		contentPane.add(giris);
		contentPane.add(restad);
		contentPane.add(hg);
		contentPane.add(background);
	}
}