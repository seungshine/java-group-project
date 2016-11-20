/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
/**
 *
 * @author XETHseth
 */
public class Test extends JPanel {
    	String userID;
	public JFrame presentframe;
	public JPanel presentpanel = this;
	
	private JPanel container;

	private JPanel paperPane;
	
	
	
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	
	private JButton btnBack;
	private JButton btnPre;
	private JButton btnNex;
	private JButton btnSubmit;
	private JButton btnCollect;
	private JButton btnShare;
	private JButton btnCorrect;

	private JTextPane answerA;
	private JTextPane answerB;
	private JTextPane answerC;
	private JTextPane answerD;
	private JTextPane stemText;
	private JTextField textField;
	
	public Test(String userID) {
		this.userID = userID;

		setVisible(true);
		setBounds(0, 0, 1000, 700);
		setLayout(null);

		container = new JPanel();
		container.setBounds(0, 0, 1000, 700);
		container.setOpaque(false);
		add(container);
		container.setLayout(null);
		
		paperPane=new JPanel(){
		protected void paintComponent(Graphics g) {
			ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/sheet.png"));
			Image img = BG.getImage();
			g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
		}};
		paperPane.setBounds(252,28,500,550);
		paperPane.setOpaque(false);
		container.add(paperPane);
		paperPane.setLayout(null);
		

		btnBack=new JButton();
		btnBack.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/back.png")));
		btnBack.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/backO.png")));
		
		btnBack.setBounds(0,0,121,42);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		container.add(btnBack);
		
		btnPre=new JButton();
		btnPre.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/previous.png")));
		btnPre.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/previousP.png")));
		btnPre.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/previousO.png")));
		btnPre.setBounds(90,300,100,100);
		btnPre.setContentAreaFilled(false);
		btnPre.setBorderPainted(false);
		container.add(btnPre);
		
		btnNex=new JButton();
		btnNex.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/next.png")));
		btnNex.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/nextP.png")));
		btnNex.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/nextO.png")));
		btnNex.setBounds(810,300,100,100);
		btnNex.setContentAreaFilled(false);
		btnNex.setBorderPainted(false);
		container.add(btnNex);
		
		a=new JButton("choice a");
		a.setBounds(58,316,50,36);
		paperPane.add(a);
		
		b=new JButton("choice b");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b.setBounds(58,362,50,36);
		paperPane.add(b);
		
		c=new JButton("choice c");
		c.setBounds(58,420,50,48);
		paperPane.add(c);
		
		d=new JButton("choice d");
		d.setBounds(58,478,50,42);
		paperPane.add(d);
		
		btnSubmit= new JButton("submit");
		btnSubmit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/submit.png")));
		btnSubmit.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/submitO.png")));
		btnSubmit.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/submitP.png")));
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				
			}
		});
		btnSubmit.setBounds(429,588,180,55);
		btnSubmit.setContentAreaFilled(false);
		btnSubmit.setBorderPainted(false);
		container.add(btnSubmit);
		
		btnCollect =new JButton();
		btnCollect.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnCollect.png")));
		btnCollect.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnCollectO.png")));
		btnCollect.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnCollectP.png")));
		btnCollect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnCollect.setBounds(434,659,140,41);
		btnCollect.setContentAreaFilled(false);
		btnCollect.setBorderPainted(false);
		container.add(btnCollect);
		
		btnShare = new JButton();
		btnShare.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnShare.png")));
		btnShare.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnShareO.png")));
		btnShare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnShare.setBounds(339,659,140,41);
		btnShare.setContentAreaFilled(false);
		btnShare.setBorderPainted(false);
		container.add(btnShare);
		
		btnCorrect=new JButton();
		btnCorrect.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnCorrect.png")));
		btnCorrect.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/btnCorrectO.png")));
		btnCorrect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnCorrect.setBounds(539,659,140,41);
		btnCorrect.setContentAreaFilled(false);
		btnCorrect.setBorderPainted(false);
		container.add(btnCorrect);
		
		answerA = new JTextPane();
		answerA.setEditable(false);
		answerA.setText("a");
		answerA.setBounds(118, 316, 314, 42);
		paperPane.add(answerA);
		
		answerB = new JTextPane();
		answerB.setEditable(false);
		answerB.setText("b");
		answerB.setBounds(118, 368, 314, 42);
		paperPane.add(answerB);
		
		answerC = new JTextPane();
		answerC.setEditable(false);
		answerC.setText("c");
		answerC.setBounds(118, 420, 314, 42);
		paperPane.add(answerC);
		
		answerD = new JTextPane();
		answerD.setEditable(false);
		answerD.setText("d");
		answerD.setBounds(118, 478, 314, 42);
		paperPane.add(answerD);
		
		stemText = new JTextPane();
		stemText.setEditable(false);
		stemText.setText("123");
		stemText.setBounds(100, 87, 296, 183);
		paperPane.add(stemText);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 24));
		textField.setText("01");
		textField.setBounds(290, 10, 76, 36);
		paperPane.add(textField);
		textField.setColumns(10);
	}
	protected void paintComponent(Graphics g) {
		ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/testBG.png"));
		Image img = BG.getImage();
		g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
	}

}
