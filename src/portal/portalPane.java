/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portal;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.*;

import practice.*;
/**
 *
 * @author XETHseth
 */
public class portalPane extends JPanel{
    String userID;
	public JFrame presentframe;
	public JPanel presentpanel = this;
private JPanel bottom;
	
	private JPanel container;
	
	private mPanel1 m1;
	private boolean is1=true;
	private mPanel2 m2;
	private boolean is2=false;
	private mPanel3 m3;
	private boolean is3=false;
	private mPanel4 m4;
	private boolean is4=false;
	
	private JButton btnPractice;
	private JButton btnReport;
	private JButton btnCollection;
	private JButton btnDonation;
	
	private JLabel portrait;
	private JLabel portraitShade;

	public portalPane(String userID) {
		this.userID = userID;
		setVisible(true);
		setBounds(0, 0, 1000, 700);
		setLayout(null);
		
		container = new JPanel();
		container.setBounds(0, 0, 1000, 600);
		container.setOpaque(false);
		container.setLayout(null);
		
		m1 = new mPanel1();
		m1.setVisible(true);
		container.add(m1);
		
		m2 = new mPanel2();
		m2.setVisible(true);


		m3 = new mPanel3();
		m3.setVisible(true);

		m4 = new mPanel4();
		m4.setVisible(true);

		bottom = new JPanel();
		bottom.setBounds(0,550,1000,150);
		bottom.setLayout(null);
		bottom.setOpaque(false);
		add(container);
		add(bottom);
		

		portraitShade=new JLabel();
		portraitShade.setBounds(443,6,120,120);
		portraitShade.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/eclipse.png")));
		bottom.add(portraitShade);
		
		btnReport = new JButton();
		btnReport.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/report.png")));
		btnReport.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/reportP.png")));
		btnReport.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/reportO.png")));
		btnReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(is1);
				else{
					if(is2){
						container.remove(m2);
						container.revalidate();
						container.repaint();
						container.add(m1);
						is2=false;
						is1=true;
					}
					else if(is3){
						container.remove(m3);
						container.revalidate();
						container.repaint();
						container.add(m1);
						is3=false;
						is1=true;
					}
					else if(is4){
						container.remove(m4);
						container.revalidate();
						container.repaint();
						container.add(m1);
						is4=false;
						is1=true;
					}
					else{
						container.add(m1);
						is1=true;
					}
					
				}
			}
		});
		btnReport.setBounds(0, 30, 250, 120);
		btnReport.setContentAreaFilled(false);
		btnReport.setBorderPainted(false);
		bottom.add(btnReport);
		
		btnPractice = new JButton();

		btnPractice.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/practice.png")));
		btnPractice.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/practiceP.png")));
		btnPractice.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/practiceO.png")));
		
		btnPractice.setBounds(250,30, 250, 120);
		btnPractice.setContentAreaFilled(false);
		btnPractice.setBorderPainted(false);
		bottom.add(btnPractice);
		
		btnCollection = new JButton();
		btnCollection.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/collection.png")));
		btnCollection.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/collectionP.png")));
		btnCollection.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/collectionO.png")));
		
		btnCollection.setBounds(500, 30, 250, 120);
		btnCollection.setContentAreaFilled(false);
		btnCollection.setBorderPainted(false);
		bottom.add(btnCollection);
		
		btnDonation = new JButton();
		btnDonation.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/donation.png")));
		btnDonation.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/donationP.png")));
		btnDonation.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/donationO.png")));
		btnDonation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(is4);
				else{
					if(is2){
						container.remove(m2);
						container.revalidate();
						container.repaint();
						container.add(m4);
						is2=false;
						is4=true;
					}
					if(is3){
						container.remove(m3);
						container.revalidate();
						container.repaint();
						container.add(m4);
						is3=false;
						is4=true;
					}
					if(is1){
						container.remove(m1);
						container.revalidate();
						container.repaint();
						container.add(m4);
						is1=false;
						is4=true;
					}
					
				}
			}
		});
		btnDonation.setBounds(750, 30,250, 120);
		btnDonation.setContentAreaFilled(false);
		btnDonation.setBorderPainted(false);
		bottom.add(btnDonation);
		
		
		
		portrait = new JLabel();
		portrait.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		portrait.setBounds(450, 0, 100, 100);
		portrait.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/defaultPortrait.jpg")));
		bottom.add(portrait);
	
	}

	public static void main(String[] args) throws SQLException {
		String userID = "10000";
		portalPane pPanel = new portalPane(userID);
		MainFrame pFrame = new MainFrame(userID);
		pFrame.setVisible(true);
		pFrame.getContentPane().add(pPanel);
		pPanel.presentframe = pFrame;

	}
}
