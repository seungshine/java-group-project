/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.Color;
/**
 *
 * @author XETHseth
 */
public class CustomizedJComboBox {
    public static void main(String args[]) {
    String labels[] = { "A", "B", "C", "D", "E", "F", "G" };
    JFrame frame = new JFrame("Popup JComboBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComboBox comboBox = new JComboBox(labels);
    comboBox.setOpaque(false);
    comboBox.setEditable(true);
    comboBox.setBorder(null);
    comboBox.setBackground(new Color(255, 255, 255));
    comboBox.setUI((ComboBoxUI) MyComboBoxUI.createUI(comboBox));
    frame.getContentPane().add(comboBox, BorderLayout.NORTH);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }

  static class MyComboBoxUI extends BasicComboBoxUI {
    public static ComponentUI createUI(JComponent c) {
      return new MyComboBoxUI();
    }

    protected JButton createArrowButton() {
    	ImageIcon img=new ImageIcon(Toolkit.getDefaultToolkit().getImage("image/login/rmbY.png"));
      JButton button = new JButton(img);
      button.setContentAreaFilled(false);
	button.setBorderPainted(false);
      return button;
    }
  }
}
