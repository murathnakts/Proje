package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Nakit extends Restaurant {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nakit frame = new Nakit(toplamtutar);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	public Nakit(String toplamtutar) {
		setResizable(false);
		setBounds(600, 310, 400, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Ödenen Tutar : " + "(TL)");
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		l1.setBounds(100, 20, 200, 30);

		JTextField t1 = new JTextField();
		t1.setBounds(100, 50, 200, 30);
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				String number = t1.getText();
				int len = number.length();
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					if (len < 6) {
						t1.setEditable(true);
					} else {
						t1.setEditable(false);
					}
				} else {
					if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
						t1.setEditable(true);
					} else {
						t1.setEditable(false);
					}
				}
			}
		});

		JLabel l2 = new JLabel("Hesap: " + "(TL)");
		l2.setFont(new Font("Tahoma", Font.BOLD, 12));
		l2.setBounds(100, 80, 200, 30);

		JTextField t2 = new JTextField(toplamtutar);
		t2.setBounds(100, 110, 200, 30);
		t2.setEditable(false);

		JLabel l3 = new JLabel("Para Üstü : ");
		l3.setFont(new Font("Tahoma", Font.BOLD, 12));
		l3.setBounds(100, 140, 100, 30);

		JTextField t3 = new JTextField();
		t3.setBounds(100, 170, 200, 30);
		t3.setEditable(false);
		
		JButton btn = new JButton("HESAPLA");
		btn.setBounds(100, 200, 200, 30);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = 0;
				if(t1.getText().equals("")) {
					a = 0;
				} else {
					a = Integer.parseInt(t1.getText());
				}
				int b = Integer.parseInt(toplamtutar);
				int c = a - b;
				String paraüstü = String.valueOf(c);
				t3.setText(paraüstü + " TL");
				if (c < 0) {
					t3.setText("");
					JOptionPane.showMessageDialog(null, "Lütfen Geçerli Bir Tutar Giriniz!");

				} else {
					JOptionPane.showMessageDialog(null,
							"Ödeme Alındı Teşekkürler.\n" + "Para Üstü : " + paraüstü + " TL");
					dispose();
				}
			}

		});

		JLabel bg = new JLabel(new ImageIcon(getClass().getResource("cash.jpg")));
		bg.setBounds(0, 0, 397, 300);

		getContentPane().add(l1);
		getContentPane().add(t1);
		getContentPane().add(l2);
		getContentPane().add(t2);
		getContentPane().add(l3);
		getContentPane().add(t3);
		getContentPane().add(btn);
		getContentPane().add(bg);
	}
}
