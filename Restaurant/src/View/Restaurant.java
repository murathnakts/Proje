package View;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import Ürünler.Anayemek;
import Ürünler.Corba;
import Ürünler.Icecekler;
import Ürünler.Tatlilar;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class Restaurant extends JFrame {
	
	int ca1 = 0,ca2 = 0,ca3 = 0,ca4 = 0,ca5 = 0;
	int ya1 = 0,ya2 = 0,ya3 = 0,ya4 = 0,ya5 = 0;
	int ta1 = 0,ta2 = 0,ta3 = 0,ta4 = 0,ta5 = 0;
	int ia1 = 0,ia2 = 0,ia3 = 0,ia4 = 0,ia5 = 0;
	
	static String toplamtutar;
	
	Corba c = new Corba();
	Anayemek a = new Anayemek();
	Tatlilar t = new Tatlilar();
	Icecekler i = new Icecekler();

	public String hesaplar(JTextArea hesap) {
		hesap.setText("");
		
		if(ca1 != 0) {
			hesap.append(c.corbalar.get(0) + "     \t(x" +ca1+ ")  \t            " + ca1*c.fiyatlar.get(0) + " TL\n");
		}
		if(ca2 != 0) {
			hesap.append(c.corbalar.get(1) + "     \t(x" +ca2+ ")  \t            " + ca2*c.fiyatlar.get(1) + " TL\n");				
		}
		if(ca3 != 0) {
			hesap.append(c.corbalar.get(2) + "     \t(x" +ca3+ ")  \t            " + ca3*c.fiyatlar.get(2) + " TL\n");
		}
		if(ca4 != 0) {
			hesap.append(c.corbalar.get(3) + "     \t(x" +ca4+ ")  \t            " + ca4*c.fiyatlar.get(3) + " TL\n");
		}
		if(ca5 != 0) {
			hesap.append(c.corbalar.get(4) + "     \t(x" +ca5+ ")  \t            " + ca5*c.fiyatlar.get(4) + " TL\n");
		}
		if(ya1 != 0) {
			hesap.append(a.anayemekler.get(0) + "    	 \t(x" +ya1+ ")  \t            " + ya1*a.fiyatlar.get(0) + " TL\n");
		}
		if(ya2 != 0) {
			hesap.append(a.anayemekler.get(1) + "    	 \t(x" +ya2+ ")  \t            " + ya2*a.fiyatlar.get(1) + " TL\n");				
		}
		if(ya3 != 0) {
			hesap.append(a.anayemekler.get(2) + "    	(x" +ya3+ ")  \t            " + ya3*a.fiyatlar.get(2) + " TL\n");
		}
		if(ya4 != 0) {
			hesap.append(a.anayemekler.get(3) + "     \t(x" +ya4+ ")  \t            " + ya4*a.fiyatlar.get(3) + " TL\n");
		}
		if(ya5 != 0) {
			hesap.append(a.anayemekler.get(4) + "     \t(x" +ya5+ ")  \t            " + ya5*a.fiyatlar.get(4) + " TL\n");
		}
		if(ta1 != 0) {
			hesap.append(t.tatlilar.get(0) + "       	\t(x" +ta1+ ")  \t            " + ta1*t.fiyatlar.get(0) + " TL\n");
		}
		if(ta2 != 0) {
			hesap.append(t.tatlilar.get(1) + "       	\t(x" +ta2+ ")  \t            " + ta2*t.fiyatlar.get(1) + " TL\n");				
		}
		if(ta3 != 0) {
			hesap.append(t.tatlilar.get(2) + "       	\t(x" +ta3+ ")  \t            " + ta3*t.fiyatlar.get(2) + " TL\n");
		}
		if(ta4 != 0) {
			hesap.append(t.tatlilar.get(3) + "       	\t(x" +ta4+ ")  \t            " + ta4*t.fiyatlar.get(3) + " TL\n");
		}
		if(ta5 != 0) {
			hesap.append(t.tatlilar.get(4) + "     	    \t(x" +ta5+ ")  \t            " + ta5*t.fiyatlar.get(4) + " TL\n");
		}
		if(ia1 != 0) {
			hesap.append(i.icecekler.get(0) + "          \t\t(x" +ia1+ ")  \t            " + ia1*i.fiyatlar.get(0) + " TL\n");			
		}
		if(ia2 != 0) {
			hesap.append(i.icecekler.get(1) + "          \t\t(x" +ia2+ ")  \t            " + ia2*i.fiyatlar.get(1) + " TL\n");				
		}
		if(ia3 != 0) {
			hesap.append(i.icecekler.get(2) + "          \t\t(x" +ia3+ ")  \t            " + ia3*i.fiyatlar.get(2) + " TL\n");
		}
		if(ia4 != 0) {
			hesap.append(i.icecekler.get(3) + "          \t\t(x" +ia4+ ")  \t            " + ia4*i.fiyatlar.get(3) + " TL\n");
		}
		if(ia5 != 0) {
			hesap.append(i.icecekler.get(4) + "          \t\t(x" +ia5+ ")  \t            " + ia5*i.fiyatlar.get(4) + " TL\n");
		}
		
		int ödenecekCorba = ((c.fiyatlar.get(0)*ca1) + (c.fiyatlar.get(1)*ca2) + (c.fiyatlar.get(2)*ca3) + (c.fiyatlar.get(3)*ca4) + (c.fiyatlar.get(4)*ca5));
		int ödenecekYemek = ((a.fiyatlar.get(0)*ya1) + (a.fiyatlar.get(1)*ya2) + (a.fiyatlar.get(2)*ya3) + (a.fiyatlar.get(3)*ya4) + (a.fiyatlar.get(4)*ya5));
		int ödenecekTatli = ((t.fiyatlar.get(0)*ta1) + (t.fiyatlar.get(1)*ta2) + (t.fiyatlar.get(2)*ta3) + (t.fiyatlar.get(3)*ta4) + (t.fiyatlar.get(4)*ta5));
		int ödenecekIcecek = ((i.fiyatlar.get(0)*ia1) + (i.fiyatlar.get(1)*ia2) + (i.fiyatlar.get(2)*ia3) + (i.fiyatlar.get(3)*ia4) + (i.fiyatlar.get(4)*ia5));
		int toplamÖdenecek = ödenecekCorba + ödenecekIcecek + ödenecekTatli + ödenecekYemek;
		String strTutar = String.valueOf(toplamÖdenecek);
		return strTutar;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant frame = new Restaurant();
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
	public Restaurant() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Restaurant.class.getResource("/View/logo.png")));
		setTitle("AKİNSA RESTAURANT");
		getContentPane().setLayout(null);
		setBounds(200, 100, 1200, 650);
		
		JTextArea hesap = new JTextArea();
		hesap.setFont(new Font("Tahoma", Font.BOLD, 12));
		hesap.setBackground(new Color(192, 192, 192));
		hesap.setLayout(null);
		hesap.setEditable(false);
		
		JScrollPane scrollBar = new JScrollPane();
		scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollBar.setBounds(685, 134, 385, 243);
		scrollBar.setViewportView(hesap);
		
		JLabel etiket = new JLabel("           ÜRÜN                           	 ADET                             FİYAT");
		scrollBar.setColumnHeaderView(etiket);
		etiket.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel tutar = new JLabel("TOPLAM TUTAR :");
		tutar.setBounds(685, 388, 204, 33);
		tutar.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		
		JLabel tutarSonuc = new JLabel("");
		tutarSonuc.setBounds(939, 384, 112, 40);
		tutarSonuc.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 25));
		
		JLabel restaurant_name = new JLabel("AKİNSA RESTAURANT");
		restaurant_name.setBounds(185, 12, 885, 78);
		restaurant_name.setFont(new Font("Segoe UI Black", Font.BOLD, 70));
		
		JButton cancel_btn = new JButton();
		cancel_btn.setBackground(new Color(255, 0, 0));
		cancel_btn.setBounds(685, 441, 167, 59);
		cancel_btn.setIcon(new ImageIcon(Restaurant.class.getResource("cancel.png")));
		
		JButton ödeme_btn = new JButton();
		ödeme_btn.setBackground(new Color(0, 255, 0));
		ödeme_btn.setBounds(909, 441, 161, 59);
		ödeme_btn.setIcon(new ImageIcon(Restaurant.class.getResource("okey.jpg")));
		
		JRadioButton nakit_rbtn = new JRadioButton("Nakit");
		nakit_rbtn.setBounds(909, 516, 111, 23);
		nakit_rbtn.setBackground(new Color(192, 192, 192));
		JRadioButton kredikarti_rbtn = new JRadioButton("Kredi Kartı");
		kredikarti_rbtn.setBounds(909, 542, 111, 23);
		kredikarti_rbtn.setBackground(new Color(192, 192, 192));
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(kredikarti_rbtn);
		bg.add(nakit_rbtn);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p4.setLayout(null);
		
		JLabel c1 = new JLabel(c.corbalar.get(0) + " --> (" +c.fiyatlar.get(0) + " TL)");
		c1.setForeground(new Color(255, 255, 255));
		JLabel c2 = new JLabel(c.corbalar.get(1) + " --> (" +c.fiyatlar.get(1) + " TL)");
		c2.setForeground(new Color(255, 255, 255));
		JLabel c3 = new JLabel(c.corbalar.get(2) + " --> (" +c.fiyatlar.get(2) + " TL)");
		c3.setForeground(new Color(255, 255, 255));
		JLabel c4 = new JLabel(c.corbalar.get(3) + " --> (" +c.fiyatlar.get(3) + " TL)");
		c4.setForeground(new Color(255, 255, 255));
		JLabel c5 = new JLabel(c.corbalar.get(4) + " --> (" +c.fiyatlar.get(4) + " TL)");
		c5.setForeground(new Color(255, 255, 255));
		
		c1.setBounds(25, 22, 175, 23);   
		c2.setBounds(25, 88, 175, 23);
		c3.setBounds(25, 154, 175, 23);
		c4.setBounds(25, 220, 175, 23);
		c5.setBounds(25, 286, 175, 23);
		
		JButton cb1 = new JButton("+");
		JButton cb2 = new JButton("-");
		JButton cb3 = new JButton("+");
		JButton cb4 = new JButton("-");
		JButton cb5 = new JButton("+");
		JButton cb6 = new JButton("-");
		JButton cb7 = new JButton("+");
		JButton cb8 = new JButton("-");
		JButton cb9 = new JButton("+");
		JButton cb10 = new JButton("-");
		JButton onay1 = new JButton("ONAYLA");
		
		cb1.setBounds(206, 22, 45, 23);
		cb2.setBounds(250, 22, 45, 23);
		cb3.setBounds(206, 88, 45, 23);
		cb4.setBounds(250, 88, 45, 23);
		cb5.setBounds(206, 154, 45, 23);
		cb6.setBounds(250, 154, 45, 23);
		cb7.setBounds(206, 220, 45, 23);
		cb8.setBounds(250, 220, 45, 23);
		cb9.setBounds(206, 286, 45, 23);
		cb10.setBounds(250, 286, 45, 23);
		onay1.setBounds(461, 314, 89, 23);
		
		JLabel cAdet1 = new JLabel();
		JLabel cAdet2 = new JLabel();
		JLabel cAdet3 = new JLabel();
		JLabel cAdet4 = new JLabel();
		JLabel cAdet5 = new JLabel();
		
		cAdet1.setBounds(310, 22, 100, 23);
		cAdet2.setBounds(310, 88, 100, 23);
		cAdet3.setBounds(310, 154, 100, 23);
		cAdet4.setBounds(310, 220, 100, 23);
		cAdet5.setBounds(310, 286, 100, 23);
		
		cb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ca1++;
				cAdet1.setText("ADET: " + ca1);
				
			}
		});
		
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca1 == 0) {
					cAdet1.setText("ADET: " + ca1);
				}
				else {
					ca1--;
					cAdet1.setText("ADET: " + ca1);
				}	
			}
		});
		
		cb3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ca2++;
				cAdet2.setText("ADET: " + ca2);
				
			}
		});
		
		cb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca2 == 0) {
					cAdet2.setText("ADET: " + ca2);
				}
				else {
					ca2--;
					cAdet2.setText("ADET: " + ca2);
				}	
			}
		});
		
		cb5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ca3++;
				cAdet3.setText("ADET: " + ca3);
				
			}
		});
		
		cb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca3 == 0) {
					cAdet3.setText("ADET: " + ca3);
				}
				else {
					ca3--;
					cAdet3.setText("ADET: " + ca3);
				}	
			}
		});
		
		cb7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ca4++;
				cAdet4.setText("ADET: " + ca4);
				
			}
		});
		
		cb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca4 == 0) {
					cAdet4.setText("ADET: " + ca4);
				}
				else {
					ca4--;
					cAdet4.setText("ADET: " + ca4);
				}	
			}
		});
		
		cb9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ca5++;
				cAdet5.setText("ADET: " + ca5);
				
			}
		});
		
		cb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ca5 == 0) {
					cAdet5.setText("ADET: " + ca5);
				}
				else {
					ca5--;
					cAdet5.setText("ADET: " + ca5);
				}	
			}
		});
		
		onay1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tutarSonuc.setText(hesaplar(hesap) + " TL");
			}
		});
		
		p1.add(onay1);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		p1.add(cb7);
		p1.add(cb8);
		p1.add(cb9);
		p1.add(cb10);
		p1.add(cAdet5);
		p1.add(cAdet4);
		p1.add(cAdet3);
		p1.add(cAdet2);
		p1.add(cAdet1);
		p1.add(c5);
		p1.add(c4);
		p1.add(c3);
		p1.add(c2);
		p1.add(c1);
		
		JLabel y1 = new JLabel(a.anayemekler.get(0) + " --> (" +a.fiyatlar.get(0) + " TL)");
		y1.setForeground(new Color(255, 255, 255));
		JLabel y2 = new JLabel(a.anayemekler.get(1) + " --> (" +a.fiyatlar.get(1) + " TL)");
		y2.setForeground(new Color(255, 255, 255));
		JLabel y3 = new JLabel(a.anayemekler.get(2) + " --> (" +a.fiyatlar.get(2) + " TL)");
		y3.setForeground(new Color(255, 255, 255));
		JLabel y4 = new JLabel(a.anayemekler.get(3) + " --> (" +a.fiyatlar.get(3) + " TL)");
		y4.setForeground(new Color(255, 255, 255));
		JLabel y5 = new JLabel(a.anayemekler.get(4) + " --> (" +a.fiyatlar.get(4) + " TL)");
		y5.setForeground(new Color(255, 255, 255));
		
		y1.setBounds(25, 22, 175, 23);   
		y2.setBounds(25, 88, 175, 23);
		y3.setBounds(25, 154, 175, 23);
		y4.setBounds(25, 220, 175, 23);
		y5.setBounds(25, 286, 175, 23);
		
		JButton yb1 = new JButton("+");
		JButton yb2 = new JButton("-");
		JButton yb3 = new JButton("+");
		JButton yb4 = new JButton("-");
		JButton yb5 = new JButton("+");
		JButton yb6 = new JButton("-");
		JButton yb7 = new JButton("+");
		JButton yb8 = new JButton("-");
		JButton yb9 = new JButton("+");
		JButton yb10 = new JButton("-");
		JButton onay2 = new JButton("ONAYLA");
		
		yb1.setBounds(206, 22, 45, 23);
		yb2.setBounds(250, 22, 45, 23);
		yb3.setBounds(206, 88, 45, 23);
		yb4.setBounds(250, 88, 45, 23);
		yb5.setBounds(206, 154, 45, 23);
		yb6.setBounds(250, 154, 45, 23);
		yb7.setBounds(206, 220, 45, 23);
		yb8.setBounds(250, 220, 45, 23);
		yb9.setBounds(206, 286, 45, 23);
		yb10.setBounds(250, 286, 45, 23);
		onay2.setBounds(461, 314, 89, 23);
		
		JLabel yAdet1 = new JLabel();
		JLabel yAdet2 = new JLabel();
		JLabel yAdet3 = new JLabel();
		JLabel yAdet4 = new JLabel();
		JLabel yAdet5 = new JLabel();
		
		yAdet1.setBounds(310, 22, 100, 23);
		yAdet2.setBounds(310, 88, 100, 23);
		yAdet3.setBounds(310, 154, 100, 23);
		yAdet4.setBounds(310, 220, 100, 23);
		yAdet5.setBounds(310, 286, 100, 23);
		
		yb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ya1++;
				yAdet1.setText("ADET: " + ya1);
				
			}
		});
		
		yb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ya1 == 0) {
					yAdet1.setText("ADET: " + ya1);
				}
				else {
					ya1--;
					yAdet1.setText("ADET: " + ya1);
				}	
			}
		});
		
		yb3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ya2++;
				yAdet2.setText("ADET: " + ya2);
				
			}
		});
		
		yb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ya2 == 0) {
					yAdet2.setText("ADET: " + ya2);
				}
				else {
					ya2--;
					yAdet2.setText("ADET: " + ya2);
				}	
			}
		});
		
		yb5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ya3++;
				yAdet3.setText("ADET: " + ya3);
				
			}
		});
		
		yb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ya3 == 0) {
					yAdet3.setText("ADET: " + ya3);
				}
				else {
					ya3--;
					yAdet3.setText("ADET: " + ya3);
				}	
			}
		});
		
		yb7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ya4++;
				yAdet4.setText("ADET: " + ya4);
				
			}
		});
		
		yb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ya4 == 0) {
					yAdet4.setText("ADET: " + ya4);
				}
				else {
					ya4--;
					yAdet4.setText("ADET: " + ya4);
				}	
			}
		});
		
		yb9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ya5++;
				yAdet5.setText("ADET: " + ya5);
				
			}
		});
		
		yb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ya5 == 0) {
					yAdet5.setText("ADET: " + ya5);
				}
				else {
					ya5--;
					yAdet5.setText("ADET: " + ya5);
				}	
			}
		});
		
		onay2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tutarSonuc.setText(hesaplar(hesap) + " TL");
			}
		});
	
		p2.add(onay2);
		p2.add(yb10);
		p2.add(yb9);
		p2.add(yb8);
		p2.add(yb7);
		p2.add(yb6);
		p2.add(yb5);
		p2.add(yb4);
		p2.add(yb3);
		p2.add(yb2);
		p2.add(yb1);
		p2.add(yAdet1);
		p2.add(yAdet2);
		p2.add(yAdet3);
		p2.add(yAdet4);
		p2.add(yAdet5);
		p2.add(y5);
		p2.add(y4);
		p2.add(y3);
		p2.add(y2);
		p2.add(y1);
		
		JLabel t1 = new JLabel(t.tatlilar.get(0) + " --> (" +t.fiyatlar.get(0) + " TL)");
		t1.setForeground(new Color(255, 255, 255));
		JLabel t2 = new JLabel(t.tatlilar.get(1) + " --> (" +t.fiyatlar.get(1) + " TL)");
		t2.setForeground(new Color(255, 255, 255));
		JLabel t3 = new JLabel(t.tatlilar.get(2) + " --> (" +t.fiyatlar.get(2) + " TL)");
		t3.setForeground(new Color(255, 255, 255));
		JLabel t4 = new JLabel(t.tatlilar.get(3) + " --> (" +t.fiyatlar.get(3) + " TL)");
		t4.setForeground(new Color(255, 255, 255));
		JLabel t5 = new JLabel(t.tatlilar.get(4) + " --> (" +t.fiyatlar.get(4) + " TL)");
		t5.setForeground(new Color(255, 255, 255));
		
		t1.setBounds(25, 22, 175, 23);   
		t2.setBounds(25, 88, 175, 23);
		t3.setBounds(25, 154, 175, 23);
		t4.setBounds(25, 220, 175, 23);
		t5.setBounds(25, 286, 175, 23);
		
		JButton tb1 = new JButton("+");
		JButton tb2 = new JButton("-");
		JButton tb3 = new JButton("+");
		JButton tb4 = new JButton("-");
		JButton tb5 = new JButton("+");
		JButton tb6 = new JButton("-");
		JButton tb7 = new JButton("+");
		JButton tb8 = new JButton("-");
		JButton tb9 = new JButton("+");
		JButton tb10 = new JButton("-");
		JButton onay3 = new JButton("ONAYLA");
		
		tb1.setBounds(206, 22, 45, 23);
		tb2.setBounds(250, 22, 45, 23);
		tb3.setBounds(206, 88, 45, 23);
		tb4.setBounds(250, 88, 45, 23);
		tb5.setBounds(206, 154, 45, 23);
		tb6.setBounds(250, 154, 45, 23);
		tb7.setBounds(206, 220, 45, 23);
		tb8.setBounds(250, 220, 45, 23);
		tb9.setBounds(206, 286, 45, 23);
		tb10.setBounds(250, 286, 45, 23);
		onay3.setBounds(461, 314, 89, 23);
		
		JLabel tAdet1 = new JLabel();
		JLabel tAdet2 = new JLabel();
		JLabel tAdet3 = new JLabel();
		JLabel tAdet4 = new JLabel();
		JLabel tAdet5 = new JLabel();
		
		tAdet1.setBounds(310, 22, 100, 23);
		tAdet2.setBounds(310, 88, 100, 23);
		tAdet3.setBounds(310, 154, 100, 23);
		tAdet4.setBounds(310, 220, 100, 23);
		tAdet5.setBounds(310, 286, 100, 23);
		
		tb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta1++;
				tAdet1.setText("ADET: " + ta1);
				
			}
		});
		
		tb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta1 == 0) {
					tAdet1.setText("ADET: " + ta1);
				}
				else {
					ta1--;
					tAdet1.setText("ADET: " + ta1);
				}	
			}
		});
		
		tb3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta2++;
				tAdet2.setText("ADET: " + ta2);
				
			}
		});
		
		tb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta2 == 0) {
					tAdet2.setText("ADET: " + ta2);
				}
				else {
					ta2--;
					tAdet2.setText("ADET: " + ta2);
				}	
			}
		});
		
		tb5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta3++;
				tAdet3.setText("ADET: " + ta3);
				
			}
		});
		
		tb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta3 == 0) {
					tAdet3.setText("ADET: " + ta3);
				}
				else {
					ta3--;
					tAdet3.setText("ADET: " + ta3);
				}	
			}
		});
		
		tb7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta4++;
				tAdet4.setText("ADET: " + ta4);
				
			}
		});
		
		tb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta4 == 0) {
					tAdet4.setText("ADET: " + ta4);
				}
				else {
					ta4--;
					tAdet4.setText("ADET: " + ta4);
				}	
			}
		});
		
		tb9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ta5++;
				tAdet5.setText("ADET: " + ta5);
				
			}
		});
		
		tb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta5 == 0) {
					tAdet5.setText("ADET:" + ta5);
				}
				else {
					ta5--;
					tAdet5.setText("ADET: " + ta5);
				}	
			}
		});
		
		onay3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tutarSonuc.setText(hesaplar(hesap) + " TL");
			}
		});
		
		p3.add(onay3);
		p3.add(tb10);
		p3.add(tb9);
		p3.add(tb8);
		p3.add(tb7);
		p3.add(tb6);
		p3.add(tb5);
		p3.add(tb4);
		p3.add(tb3);
		p3.add(tb2);
		p3.add(tb1);
		p3.add(tAdet1);
		p3.add(tAdet2);
		p3.add(tAdet3);
		p3.add(tAdet4);
		p3.add(tAdet5);
		p3.add(t5);
		p3.add(t4);
		p3.add(t3);
		p3.add(t2);
		p3.add(t1);
		
		JLabel i1 = new JLabel(i.icecekler.get(0) + " --> (" +i.fiyatlar.get(0) + " TL)");
		i1.setForeground(new Color(255, 255, 255));
		JLabel i2 = new JLabel(i.icecekler.get(1) + " --> (" +i.fiyatlar.get(1) + " TL)");
		i2.setForeground(new Color(255, 255, 255));
		JLabel i3 = new JLabel(i.icecekler.get(2) + " --> (" +i.fiyatlar.get(2) + " TL)");
		i3.setForeground(new Color(255, 255, 255));
		JLabel i4 = new JLabel(i.icecekler.get(3) + " --> (" +i.fiyatlar.get(3) + " TL)");
		i4.setForeground(new Color(255, 255, 255));
		JLabel i5 = new JLabel(i.icecekler.get(4) + " --> (" +i.fiyatlar.get(4) + " TL)");
		i5.setForeground(new Color(255, 255, 255));
		
		i1.setBounds(25, 22, 175, 23);   
		i2.setBounds(25, 88, 175, 23);
		i3.setBounds(25, 154, 175, 23);
		i4.setBounds(25, 220, 175, 23);
		i5.setBounds(25, 286, 175, 23);
		
		JButton ib1 = new JButton("+");
		JButton ib2 = new JButton("-");
		JButton ib3 = new JButton("+");
		JButton ib4 = new JButton("-");
		JButton ib5 = new JButton("+");
		JButton ib6 = new JButton("-");
		JButton ib7 = new JButton("+");
		JButton ib8 = new JButton("-");
		JButton ib9 = new JButton("+");
		JButton ib10 = new JButton("-");
		JButton onay4 = new JButton("ONAYLA");
		
		ib1.setBounds(206, 22, 45, 23);
		ib2.setBounds(250, 22, 45, 23);
		ib3.setBounds(206, 88, 45, 23);
		ib4.setBounds(250, 88, 45, 23);
		ib5.setBounds(206, 154, 45, 23);
		ib6.setBounds(250, 154, 45, 23);
		ib7.setBounds(206, 220, 45, 23);
		ib8.setBounds(250, 220, 45, 23);
		ib9.setBounds(206, 286, 45, 23);
		ib10.setBounds(250, 286, 45, 23);
		onay4.setBounds(461, 314, 89, 23);
		
		JLabel iAdet1 = new JLabel();
		JLabel iAdet2 = new JLabel();
		JLabel iAdet3 = new JLabel();
		JLabel iAdet4 = new JLabel();
		JLabel iAdet5 = new JLabel();
		
		iAdet1.setBounds(310, 22, 100, 23);
		iAdet2.setBounds(310, 88, 100, 23);
		iAdet3.setBounds(310, 154, 100, 23);
		iAdet4.setBounds(310, 220, 100, 23);
		iAdet5.setBounds(310, 286, 100, 23);
		
		ib1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ia1++;
				iAdet1.setText("ADET: " + ia1);
				
			}
		});
		
		ib2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ia1 == 0) {
					iAdet1.setText("ADET: " + ia1);
				}
				else {
					ia1--;
					iAdet1.setText("ADET: " + ia1);
				}	
			}
		});
		
		ib3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ia2++;
				iAdet2.setText("ADET: " + ia2);
				
			}
		});
		
		ib4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ia2 == 0) {
					iAdet2.setText("ADET: " + ia2);
				}
				else {
					ia2--;
					iAdet2.setText("ADET: " + ia2);
				}	
			}
		});
		
		ib5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ia3++;
				iAdet3.setText("ADET: " + ia3);
				
			}
		});
		
		ib6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ia3 == 0) {
					iAdet3.setText("ADET: " + ia3);
				}
				else {
					ia3--;
					iAdet3.setText("ADET: " + ia3);
				}	
			}
		});
		
		ib7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ia4++;
				iAdet4.setText("ADET: " + ia4);
				
			}
		});
		
		ib8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ia4 == 0) {
					iAdet4.setText("ADET: " + ia4);
				}
				else {
					ia4--;
					iAdet4.setText("ADET: " + ia4);
				}	
			}
		});
		
		ib9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ia5++;
				iAdet5.setText("ADET: " + ia5);
				
			}
		});
		
		ib10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ia5 == 0) {
					iAdet5.setText("ADET: " + ia5);
				}
				else {
					ia5--;
					iAdet5.setText("ADET: " + ia5);
				}	
			}
		});
		
		onay4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				tutarSonuc.setText(hesaplar(hesap) + " TL");
			}
		});
		
		p4.add(onay4);
		p4.add(ib10);
		p4.add(ib9);
		p4.add(ib8);
		p4.add(ib7);
		p4.add(ib6);
		p4.add(ib5);
		p4.add(ib4);
		p4.add(ib3);
		p4.add(ib2);
		p4.add(ib1);
		p4.add(iAdet1);
		p4.add(iAdet2);
		p4.add(iAdet3);
		p4.add(iAdet4);
		p4.add(iAdet5);
		p4.add(i5);
		p4.add(i4);
		p4.add(i3);
		p4.add(i2);
		p4.add(i1);
		
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds (50, 100, 600, 400);
		tp.add("ÇORBALAR", p1);
		tp.add("ANA YEMEKLER", p2);
		tp.add("TATLILAR", p3);
		tp.add("İÇECEKLER", p4);
		
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ca1 = 0;ca2 = 0;ca3 = 0;ca4 = 0;ca5 = 0;
				ya1 = 0;ya2 = 0;ya3 = 0;ya4 = 0;ya5 = 0;
				ta1 = 0;ta2 = 0;ta3 = 0;ta4 = 0;ta5 = 0;
				ia1 = 0;ia2 = 0;ia3 = 0;ia4 = 0;ia5 = 0;
				hesap.setText(""); 
				tutarSonuc.setText("");
				cAdet1.setText(""); yAdet1.setText(""); tAdet1.setText(""); iAdet1.setText("");
				cAdet2.setText(""); yAdet2.setText(""); tAdet2.setText(""); iAdet2.setText("");
				cAdet3.setText(""); yAdet3.setText(""); tAdet3.setText(""); iAdet3.setText("");
				cAdet4.setText(""); yAdet4.setText(""); tAdet4.setText(""); iAdet4.setText("");
				cAdet5.setText(""); yAdet5.setText(""); tAdet5.setText(""); iAdet5.setText("");
				
			}
		});
		
		ödeme_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tutarSonuc.getText().equals("")) {
					JOptionPane.showMessageDialog(hesap,"Lütfen Ürün Ekleyiniz!");
				}else {
					if(nakit_rbtn.isSelected()) {
						toplamtutar = hesaplar(hesap);
						Nakit ödemeEkrani = new Nakit(toplamtutar);
						ödemeEkrani.getContentPane().setLayout(null);
						ödemeEkrani.setVisible(true);
						
						ca1 = 0;ca2 = 0;ca3 = 0;ca4 = 0;ca5 = 0;
						ya1 = 0;ya2 = 0;ya3 = 0;ya4 = 0;ya5 = 0;
						ta1 = 0;ta2 = 0;ta3 = 0;ta4 = 0;ta5 = 0;
						ia1 = 0;ia2 = 0;ia3 = 0;ia4 = 0;ia5 = 0;
						hesap.setText(""); 
						tutarSonuc.setText("");
						cAdet1.setText(""); yAdet1.setText(""); tAdet1.setText(""); iAdet1.setText("");
						cAdet2.setText(""); yAdet2.setText(""); tAdet2.setText(""); iAdet2.setText("");
						cAdet3.setText(""); yAdet3.setText(""); tAdet3.setText(""); iAdet3.setText("");
						cAdet4.setText(""); yAdet4.setText(""); tAdet4.setText(""); iAdet4.setText("");
						cAdet5.setText(""); yAdet5.setText(""); tAdet5.setText(""); iAdet5.setText("");
						
					}else if(kredikarti_rbtn.isSelected()) {
						toplamtutar = hesaplar(hesap);
						CreditCard krediEkrani = new CreditCard(toplamtutar);
						krediEkrani.getContentPane().setLayout(null);
						krediEkrani.setVisible(true);
						
						ca1 = 0;ca2 = 0;ca3 = 0;ca4 = 0;ca5 = 0;
						ya1 = 0;ya2 = 0;ya3 = 0;ya4 = 0;ya5 = 0;
						ta1 = 0;ta2 = 0;ta3 = 0;ta4 = 0;ta5 = 0;
						ia1 = 0;ia2 = 0;ia3 = 0;ia4 = 0;ia5 = 0;
						hesap.setText(""); 
						tutarSonuc.setText("");
						cAdet1.setText(""); yAdet1.setText(""); tAdet1.setText(""); iAdet1.setText("");
						cAdet2.setText(""); yAdet2.setText(""); tAdet2.setText(""); iAdet2.setText("");
						cAdet3.setText(""); yAdet3.setText(""); tAdet3.setText(""); iAdet3.setText("");
						cAdet4.setText(""); yAdet4.setText(""); tAdet4.setText(""); iAdet4.setText("");
						cAdet5.setText(""); yAdet5.setText(""); tAdet5.setText(""); iAdet5.setText("");
						
					}else {
						JOptionPane.showMessageDialog(hesap,"Lütfen Bir Ödeme Yöntemi Seçiniz!");
					}
				}
				
			}
		});
		
		JLabel pbg1 = new JLabel(new ImageIcon(getClass().getResource("bg2.jpg")));
		pbg1.setBounds(0, 0, 600, 400);
		p1.add(pbg1);
		JLabel pbg2 = new JLabel(new ImageIcon(getClass().getResource("bg2.jpg")));
		pbg2.setBounds(0, 0, 600, 400);
		p2.add(pbg2);
		JLabel pbg3 = new JLabel(new ImageIcon(getClass().getResource("bg2.jpg")));
		pbg3.setBounds(0, 0, 600, 400);
		p3.add(pbg3);
		JLabel pbg4 = new JLabel(new ImageIcon(getClass().getResource("bg2.jpg")));
		pbg4.setBounds(0, 0, 600, 400);
		p4.add(pbg4);
		JLabel background = new JLabel(new ImageIcon(getClass().getResource("background.jpg")));
		background.setBounds(0, 0, 1200, 650);
		
		getContentPane().add(tp);
		getContentPane().add(scrollBar);
		getContentPane().add(cancel_btn);
		getContentPane().add(tutar);
		getContentPane().add(tutarSonuc);
		getContentPane().add(restaurant_name);
		getContentPane().add(nakit_rbtn);
		getContentPane().add(kredikarti_rbtn);
		getContentPane().add(ödeme_btn);
		getContentPane().add(background);
	
	}
}