package com.platinum.Integracion;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Banco_Platinum extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Banco_Platinum frame = new Login_Banco_Platinum();
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
	public Login_Banco_Platinum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new LineBorder(new Color(112, 128, 144), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto_titulo = new JLabel("Banco Platinum");
		texto_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		texto_titulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		texto_titulo.setBounds(103, 38, 166, 20);
		contentPane.add(texto_titulo);
		
		JButton btnButon = new JButton("Ingresar");
		btnButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_platinum","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from usuario where username='"+username.getText()+"' and password='"+password.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Inicio Sesión Correctamente \n" + username.getText());
						dispose();
					Usuario u = new Usuario();
					u.setVisible(true);
					}else
						JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña Incorrecto");
					con.close();
				}catch(Exception e) {System.out.print(e);}
			}
		});
		btnButon.setBackground(new Color(192, 192, 192));
		btnButon.setForeground(Color.BLACK);
		btnButon.setFont(new Font("Arial", Font.PLAIN, 15));
		btnButon.setBounds(118, 268, 143, 40);
		contentPane.add(btnButon);
		
		JLabel lblusuario = new JLabel("Usuario");
		lblusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblusuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblusuario.setBounds(62, 94, 46, 14);
		contentPane.add(lblusuario);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(62, 170, 66, 14);
		contentPane.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(62, 121, 250, 40);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(62, 195, 250, 40);
		contentPane.add(password);
		password.setColumns(10);
	}
}
