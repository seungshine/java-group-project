/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;
import java.awt.*;
import java.sql.SQLException;

import javax.swing.*;

import portal.*;


/**
 *
 * @author XETHseth
 */
public class adminPane extends JPanel{
    String userID;
	public JFrame presentframe;
	public JPanel presentpanel = this;
	
	private JPanel container;
	
	private JButton userM;
	private JButton appM;
	private JButton teacooM;
	/**
	 * Create the panel.
	 */
	public adminPane(String userID) {
		this.userID=userID;
		
		setVisible(true);
		setBounds(0, 0, 1000, 700);
		setLayout(null);

		container = new JPanel();
		container.setBounds(0, 0, 1000, 700);
		container.setOpaque(false);
		add(container);
		container.setLayout(null);
		
		userM=new JButton();
		
		userM.setBounds(356, 143, 300, 520);
		userM.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/usermanagement.png")));
	    userM.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/usermanagementO.png")));
		userM.setContentAreaFilled(false);
		userM.setBorderPainted(false);
		container.add(userM);
		
		appM=new JButton();
		
		appM.setBounds(37, 158, 300, 520);
		appM.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/applymanagement.png")));
	    appM.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/applymanagementO.png")));
		appM.setContentAreaFilled(false);
		appM.setBorderPainted(false);
		container.add(appM);

		teacooM=new JButton();
		
		teacooM.setBounds(679, 170, 300, 520);
		teacooM.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/teacoomanagement.png")));
	    teacooM.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/teacoomanagementO.png")));
		teacooM.setContentAreaFilled(false);
		teacooM.setBorderPainted(false);
		container.add(teacooM);

	}

	protected void paintComponent(Graphics g) {
		ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/management/managementMenu.png"));
		Image img = BG.getImage();
		g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
	}
	
	public static void main(String[] args) throws SQLException {
		String userID = "10000";
		adminPane pPanel = new adminPane(userID);
		MainFrame pFrame = new MainFrame(userID);
		pFrame.setVisible(true);
		pFrame.getContentPane().add(pPanel);
		pPanel.presentframe = pFrame;
	}
}
