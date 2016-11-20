/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.*;

import portal.portalPane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author XETHseth
 */
public class PracticeMenu extends JPanel {

    String userID;
    public JFrame presentframe;
    public JPanel presentpanel = this;

    private JButton btnBack;
    private JButton btnQc;
    private JButton btnQcStart;
    private JButton btnSp;
    private JButton btnSpStart;
    private JButton btnSm;
    private JButton btnSmStart;

    private JPanel container;

    private JPanel mQc;
    private boolean isQc = true;
    private JPanel mSp;
    private boolean isSp = false;
    private JPanel mSm;
    private boolean isSm = false;

    private JLabel backLabel;

    /**
     * Create the panel.
     */
    public PracticeMenu(String userID) {
        this.userID = userID;

        setVisible(true);
        setBounds(0, 0, 1000, 700);
        setLayout(null);

        container = new JPanel();
        container.setBounds(200, 0, 800, 700);
        container.setLayout(null);
        container.setOpaque(false);
        add(container);

        mQc = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/m1.png"));
                Image img = BG.getImage();
                g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
            }
        };
        mQc.setBounds(0, 0, 800, 700);
        mQc.setVisible(true);
        mQc.setLayout(null);
        container.add(mQc);

        mSp = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/m2.png"));
                Image img = BG.getImage();
                g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
            }
        };
        mSp.setBounds(0, 0, 800, 700);
        mSp.setVisible(true);
        mSp.setLayout(null);

        mSm = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon BG = new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/portal/m3.png"));
                Image img = BG.getImage();
                g.drawImage(img, 0, 0, BG.getIconWidth(), BG.getIconHeight(), BG.getImageObserver());
            }
        };
        mSm.setBounds(0, 0, 800, 700);
        mSm.setVisible(true);
        mSm.setLayout(null);

        btnQcStart = new JButton("START QUICK TEST");
        btnQcStart.setBounds(100, 100, 100, 100);

        btnQcStart.setIcon(null);
       
        mQc.add(btnQcStart);

        btnSpStart = new JButton();
        btnSpStart.setBounds(100, 100, 100, 100);
        btnSpStart.setIcon(null);
        btnSpStart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
        mSp.add(btnSpStart);

        btnSmStart = new JButton();
        btnSmStart.setBounds(100, 100, 100, 100);
        btnSmStart.setIcon(null);
        mSm.add(btnSmStart);

        btnBack = new JButton();
        btnBack.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/back.png")));
        btnBack.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/backO.png")));
   
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);
        btnBack.setBounds(0, 0, 136, 42);
        add(btnBack);
        backLabel = new JLabel();
        backLabel.setBounds(0, 0, 200, 100);
        backLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/backlabel.png")));
        add(backLabel);

        btnQc = new JButton();
        btnQc.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/qc.png")));
        btnQc.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/qcO.png")));
        btnQc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (isQc); else if (isSp) {
                    container.remove(mSp);
                    container.revalidate();
                    container.repaint();
                    container.add(mQc);
                    isSp = false;
                    isQc = true;
                } else if (isSm) {
                    container.remove(mSm);
                    container.revalidate();
                    container.repaint();
                    container.add(mQc);
                    isSm = false;
                    isQc = true;
                }
            }
        });
        btnQc.setBounds(0, 100, 200, 200);
        btnQc.setContentAreaFilled(false);
        btnQc.setBorderPainted(false);
        add(btnQc);

        btnSp = new JButton();
        btnSp.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/sp.png")));
        btnSp.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/spO.png")));
        btnSp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (isSp); else if (isQc) {
                    container.remove(mQc);
                    container.revalidate();
                    container.repaint();
                    container.add(mSp);
                    isQc = false;
                    isSp = true;
                } else if (isSm) {
                    container.remove(mSm);
                    container.revalidate();
                    container.repaint();
                    container.add(mSp);
                    isSm = false;
                    isSp = true;
                }

            }
        });
        btnSp.setBounds(0, 300, 200, 200);
        btnSp.setContentAreaFilled(false);
        btnSp.setBorderPainted(false);
        add(btnSp);

        btnSm = new JButton();
        btnSm.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/sm.png")));
        btnSm.setRolloverIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/practice menu/smO.png")));
        btnSm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (isSm); else if (isSp) {
                    container.remove(mSp);
                    container.revalidate();
                    container.repaint();
                    container.add(mSm);
                    isSp = false;
                    isSm = true;
                } else if (isQc) {
                    container.remove(mQc);
                    container.revalidate();
                    container.repaint();
                    container.add(mSm);
                    isQc = false;
                    isSm = true;
                }
            }
        });
        btnSm.setBounds(0, 500, 200, 200);
        btnSm.setContentAreaFilled(false);
        btnSm.setBorderPainted(false);
        add(btnSm);

    }
}
