/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.JComboBox;

import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JPasswordField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import login.CustomizedJComboBox.MyComboBoxUI;
/**
 *
 * @author XETHseth
 */
public class LoginMain extends JFrame implements ActionListener {
    	private JPanel contentPane;

	private ImageIcon BGimg;
	private JLabel BGLabel;

	static JPasswordField passwordField;

	private JButton btnLogin;
	private JButton btnFgtPw;
	private JButton btnRmb;
	private boolean isRmb = false;
	private JButton btnX;
	private JButton btnMove;
	private Point loc = null;
	private Point tmp = null;
	boolean isDragged = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMain frame = new LoginMain();
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
	public LoginMain() {
		loginUI();
	}
	
	public void loginUI(){
		setResizable(false);
		setBounds(650, 200, 300, 500);
		setUndecorated(true); 
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		

		
		BGimg = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/loginBG.png"));
		BGLabel = new JLabel(BGimg);
		getLayeredPane().add(BGLabel, new Integer(Integer.MIN_VALUE));	
		BGLabel.setBounds(0, 0, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setOpaque(false);

		btnMove = new JButton();
		btnMove.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/btn/moveOP.png")));
		btnMove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				isDragged = false;
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			
			@Override
			public void mousePressed(MouseEvent e) {
				tmp = new Point(e.getX(), e.getY());
				isDragged = true;
				setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}
		});

		btnMove.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (isDragged) {
					loc = new Point(getLocation().x + e.getX() - tmp.x, getLocation().y + e.getY() - tmp.y);
					setLocation(loc);
				}
			}
		});
		btnMove.setContentAreaFilled(false);
		btnMove.setBorderPainted(false);
		btnMove.setBounds(0, 0, 260, 23);
		contentPane.add(btnMove);

		btnX = new JButton();
		btnX.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/btnX.png")));
		btnX.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/btnXO.png")));
		btnX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		btnX.setContentAreaFilled(false);
		btnX.setBorderPainted(false);
		btnX.setBounds(264, 0, 26, 35);
		contentPane.add(btnX);

		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBounds(83, 228, 129, 23);
		contentPane.add(passwordField);

		JComboBox comboBox = new JComboBox();
		comboBox.setUI((ComboBoxUI) MyComboBoxUI.createUI(comboBox));
		comboBox.setOpaque(false);
		comboBox.setEditable(true);
		comboBox.setBorder(new EmptyBorder(0, 0, 0, 0));
		comboBox.setBounds(83, 195, 161, 23);
		contentPane.add(comboBox);

		btnFgtPw = new JButton();
		btnFgtPw.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/fgtpwO.png")));
		btnFgtPw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		btnFgtPw.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/fgtpw.png")));
		btnFgtPw.setContentAreaFilled(false);
		btnFgtPw.setBorderPainted(false);
		btnFgtPw.setBounds(74, 270, 150, 30);
		contentPane.add(btnFgtPw);

		btnLogin = new JButton();
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnLogin.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/btnLogin.png")));
		btnLogin.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/btnLoginP.png")));
		btnLogin.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.getImage("image/login/btnLoginO.png")));
		btnLogin.setBounds(70, 325, 161, 38);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		contentPane.add(btnLogin);

		JButton btnRegist = new JButton();
		btnRegist.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/register.png")));
		btnRegist.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(
				"image/login/registerO.png")));
		btnRegist.setPressedIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.getImage("image/login/registerP.png")));
		btnRegist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRegist.setBounds(75, 458, 150, 30);
		btnRegist.setContentAreaFilled(false);
		btnRegist.setBorderPainted(false);
		contentPane.add(btnRegist);

		btnRmb = new JButton();
		btnRmb.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/rmbX.png")));
		btnRmb.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/rmbO.png")));
		btnRmb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (isRmb) {
					btnRmb.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/rmbX.png")));
					isRmb = false;
				} else {
					btnRmb.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/rmbY.png")));
					isRmb = true;
				}
			}
		});
		btnRmb.setBounds(43, 226, 30, 30);
		btnRmb.setContentAreaFilled(false);
		btnRmb.setBorderPainted(false);
		contentPane.add(btnRmb);

		JLabel lblPortrait = new JLabel("portrait");
		lblPortrait.setBounds(100, 49, 100, 100);
		contentPane.add(lblPortrait);
        }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
