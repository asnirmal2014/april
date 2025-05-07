package com.nirmal.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VerifyPassword_1 
{
	public VerifyPassword_1() 
	{
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		FlowLayout flayout = new FlowLayout();
		jp.setLayout(flayout);

		JLabel jl1 = new JLabel("User Name");
		JTextField jtf1 = new JTextField(12);
		jtf1.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
		jtf1.setBackground(Color.YELLOW);
		jtf1.setForeground(Color.BLUE);

		jtf1.setText("Nirmal Kumar");

		JLabel jl2 = new JLabel("Password");
		JPasswordField passwordField = new JPasswordField(5);

		passwordField.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
		passwordField.setBackground(Color.YELLOW);
		passwordField.setForeground(Color.BLUE);

		JButton jb = new JButton("Submit");

		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(passwordField);
		jp.add(jb);
		jf.add(jp);

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == jb) {
					char password[] = passwordField.getPassword();
					char ckpassword[] = new char[] { 'j', 'a', 'v', 'a' };

					if (password.length < 4) {
						System.out.println("Password should be 4 Characters");
						JOptionPane.showMessageDialog(jb, "Password should be 4 Characters");
					}

					if (password.length > 4) {
						System.out.println("Password should not be more than 4 Characters");
						JOptionPane.showMessageDialog(jb, "Password should not be more than 4 Characters");
					}

					if (Arrays.equals(password, ckpassword)) {
						System.out.println("Valid User");
						JOptionPane.showMessageDialog(jb, "Valid User");
					} else {
						System.out.println("Invalid User");
						JOptionPane.showMessageDialog(jb, "Invalid User");

						// Arrays.fill(ckpassword,'0');
						// Arrays.fill(correctPass, '0');
					}
				}
			}
		});
		jf.setSize(250, 250);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		VerifyPassword_1 obj = new VerifyPassword_1();
		System.out.println(obj);
	}
}
