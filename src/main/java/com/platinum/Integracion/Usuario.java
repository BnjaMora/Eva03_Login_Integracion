package com.platinum.Integracion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtRut;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
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
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Datos Usuario");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitulo.setBounds(121, 35, 220, 33);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNombre.setBounds(65, 106, 56, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 13));
		lblApellido.setBounds(65, 145, 56, 14);
		contentPane.add(lblApellido);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setFont(new Font("Arial", Font.PLAIN, 13));
		lblRut.setBounds(65, 184, 46, 14);
		contentPane.add(lblRut);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTelefono.setBounds(65, 223, 73, 14);
		contentPane.add(lblTelefono);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(121, 98, 220, 31);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(121, 137, 222, 31);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtRut = new JTextField();
		txtRut.setBounds(121, 176, 222, 31);
		contentPane.add(txtRut);
		txtRut.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(121, 214, 222, 31);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBackground(new Color(192, 192, 192));
		btnSalir.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSalir.setBounds(178, 279, 105, 33);
		contentPane.add(btnSalir);
	}
}
