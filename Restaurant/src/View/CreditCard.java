package View;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CreditCard extends Restaurant {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCard frame = new CreditCard(toplamtutar);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("unchecked")
	public CreditCard(String toplamtutar) {
		setResizable(false);
		setBounds(600, 310, 400, 325);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JCheckBox tüketicionay = new JCheckBox("Tüketici Onayı");
		tüketicionay.setBackground(Color.WHITE);
		tüketicionay.setBounds(200, 165, 99, 23);

		JCheckBox kullansöz = new JCheckBox("Kullanıcı Sözleşmesi");
		kullansöz.setBackground(Color.WHITE);
		kullansöz.setBounds(200, 193, 99, 23);

		JLabel cardName_lbl = new JLabel("KART SAHİBİ");
		cardName_lbl.setBounds(35, 20, 106, 26);

		JLabel kartNo_lbl = new JLabel("KART NUMARASI");
		kartNo_lbl.setBounds(35, 83, 106, 26);

		JTextField cardNo_txt = new JTextField();
		cardNo_txt.setDisabledTextColor(new Color(255, 255, 255));
		cardNo_txt.setBounds(35, 105, 126, 20);
		cardNo_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				String number = cardNo_txt.getText();
				int len = number.length();
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					if (len < 16) {
						cardNo_txt.setEditable(true);
					} else {
						cardNo_txt.setEditable(false);
					}
				} else {
					if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
							|| e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
						cardNo_txt.setEditable(true);
					} else {
						cardNo_txt.setEditable(false);
					}
				}
			}
		});

		JTextField cardName_txt = new JTextField();
		cardName_txt.setBounds(35, 42, 126, 20);
		cardName_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char a = e.getKeyChar();
				if (Character.isLetter(a) || Character.isWhitespace(a) || Character.isISOControl(a)) {
					cardName_txt.setEditable(true);
				} else {
					cardName_txt.setEditable(false);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int num = cardName_txt.getCaretPosition();
				cardName_txt.setText(cardName_txt.getText().toUpperCase());
				cardName_txt.setCaretPosition(num);
			}

		});

		JLabel month_lbl = new JLabel("AY");
		month_lbl.setBounds(35, 146, 49, 14);

		JComboBox month_cbx = new JComboBox();
		month_cbx.setModel(new DefaultComboBoxModel(
				new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		month_cbx.setBounds(35, 165, 40, 22);

		JLabel year_lbl = new JLabel("YIL");
		year_lbl.setBounds(85, 146, 23, 14);

		JComboBox year_cbx = new JComboBox();
		year_cbx.setModel(
				new DefaultComboBoxModel(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030",
						"2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041" }));
		year_cbx.setBounds(85, 165, 56, 22);

		JLabel cvc_lbl = new JLabel("CVC");
		cvc_lbl.setBounds(35, 197, 49, 14);

		JTextField cvc_txt = new JTextField();
		cvc_txt.setBounds(35, 214, 30, 20);
		cvc_txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				String number = cvc_txt.getText();
				int len = number.length();
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
					if (len < 3) {
						cvc_txt.setEditable(true);
					} else {
						cvc_txt.setEditable(false);
					}
				} else {
					if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
							|| e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
						cvc_txt.setEditable(true);
					} else {
						cvc_txt.setEditable(false);
					}
				}
			}
		});

		JButton accept_btn = new JButton("ONAYLA");
		accept_btn.setBounds(200, 223, 89, 23);
		accept_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cardName_txt.getText().length() < 1) {
					JOptionPane.showMessageDialog(null, "Lütfen Geçerli Bir İsim Giriniz!");
				} else {
					if (cardNo_txt.getText().length() != 16) {
						JOptionPane.showMessageDialog(null, "Lütfen Geçerli Bir Kart No Giriniz!");
					} else {
						if (cvc_txt.getText().length() != 3) {
							JOptionPane.showMessageDialog(null, "CVC'yi Doğru Giriniz!");
						} else {
							if (tüketicionay.isSelected() && kullansöz.isSelected()) {
								JOptionPane.showMessageDialog(null, "Ödeme Alındı Teşekkürler.");
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Lütfen Tüm Sözleşmeleri Onaylayınız! ");

							}
						}

					}
				}
			}
		});

		JLabel price_lbl = new JLabel("Ödenecek Tutar: " + toplamtutar + " TL");
		price_lbl.setBounds(200, 128, 167, 51);

		JLabel icon1 = new JLabel(new ImageIcon(getClass().getResource("creditcards.png")));
		icon1.setBounds(181, 53, 195, 67);

		JLabel icon2 = new JLabel(new ImageIcon(getClass().getResource("creditcard.png")));
		icon2.setBounds(76, 214, 83, 64);

		contentPane.add(kullansöz);
		contentPane.add(tüketicionay);
		contentPane.add(cardName_lbl);
		contentPane.add(kartNo_lbl);
		contentPane.add(cardNo_txt);
		contentPane.add(cardName_txt);
		contentPane.add(cvc_txt);
		contentPane.add(month_lbl);
		contentPane.add(month_cbx);
		contentPane.add(year_lbl);
		contentPane.add(year_cbx);
		contentPane.add(cvc_lbl);
		contentPane.add(accept_btn);
		contentPane.add(price_lbl);
		contentPane.add(icon1);
		contentPane.add(icon2);

	}
}