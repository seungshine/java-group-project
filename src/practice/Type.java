/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.Font;
import java.awt.Color;
/**
 *
 * @author XETHseth
 */
public class Type extends JPanel{
    String userID;
	public JFrame presentframe;
	public JPanel presentpanel = this;
	
	private JPanel container;
	private JPanel typePane;
	
	private JButton btnBack;
	private JButton btnStart;
	private JButton btnReset;
	
	private JTextPane type1;
	private JTextPane type2;
	private JTextPane type3;
	/**
	 * Create the panel.
	 */
	public Type(String userID) {
		this.userID=userID;
		setVisible(true);
		setBounds(0, 0, 1000, 700);
		setLayout(null);

		container = new JPanel();
		container.setBounds(0, 0, 1000, 700);
		container.setOpaque(false);
		add(container);
		container.setLayout(null);
		
		btnBack=new JButton();
		btnBack.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/back.png")));
		btnBack.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/backO.png")));
		
		btnBack.setBounds(0,0,121,42);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		container.add(btnBack);
		
		typePane=new JPanel(){protected void paintComponent(Graphics g) {
			ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/type.png"));
			Image img = BG.getImage();
			g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
		}};
		typePane.setBounds(100, 80, 820, 470);
		typePane.setLayout(null);
		container.add(typePane);
		
		type1 = new JTextPane();
		type1.setText("0");
		type1.setForeground(Color.WHITE);
		type1.setOpaque(false);
		type1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		type1.setBounds(489, 56, 33, 30);
		typePane.add(type1);
		
		type2 = new JTextPane();
		type2.setText("0");
		type2.setForeground(Color.WHITE);
		type2.setOpaque(false);
		type2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		type2.setBounds(472, 212, 33, 30);
		typePane.add(type2);
		
		type3 = new JTextPane();
		type3.setText("0");
		type3.setForeground(Color.WHITE);
		type3.setOpaque(false);
		type3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		type3.setBounds(473, 357, 33, 30);
		typePane.add(type3);
		
		btnStart=new JButton();
		
		btnStart.setBounds(325, 579, 150, 50);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		btnStart.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/start.png")));
		btnStart.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/startO.png")));
		btnStart.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/startP.png")));
		container.add(btnStart);
		
		btnReset=new JButton();
		btnReset.setBounds(550, 579, 150, 50);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorderPainted(false);
		btnReset.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/reset.png")));
		btnReset.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/resetO.png")));
		btnReset.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/resetP.png")));
		container.add(btnReset);
		
		
	}
	protected void paintComponent(Graphics g) {
		ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice/typeBG.png"));
		Image img = BG.getImage();
		g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
	}
}
