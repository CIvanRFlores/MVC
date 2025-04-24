package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import models.AuthModel;

public class AuthView 
{
	Font label = new Font("Arial", Font.BOLD, 22);
	Font txtBox = new Font("SansSeriff", Font.PLAIN, 30);

	Border redondo = BorderFactory.createLineBorder(Color.WHITE, 4, true);
	
	Color verdeAzulado = new Color(54, 84, 79);
	Color grisBajo = new Color(77, 77, 77);
	
	LineBorder bordeado = new LineBorder(Color.BLACK, 3);
	
	JFrame frame;
	
	AuthModel funtions;
	
	public AuthView()
	{
		funtions = new AuthModel();
	}
	
	public void login()
	{		
		frame = new JFrame();
		frame.setTitle("Programa");
		frame.setVisible(true);
		frame.setSize(1024, 740);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel fondoLogin = new JPanel();
		fondoLogin.setBounds(0, 0, 1024, 720);
		fondoLogin.setOpaque(true);
		fondoLogin.setLayout(null);
		frame.add(fondoLogin);
		
		JPanel login = new JPanel();
		login.setBounds(177, 0, 670, 720);
		login.setOpaque(true);
		login.setLayout(null);
		fondoLogin.add(login);
		
		JLabel iniciaSesion = new JLabel("INICIAR SESIÓN");
		iniciaSesion.setBounds(100, 23, 470, 100);
		iniciaSesion.setForeground(Color.WHITE);
		iniciaSesion.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));
		login.add(iniciaSesion);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 180, 260, 45);
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label);
		login.add(ingresaUsuario);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 340, 260, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label);
		login.add(ingresaContraseña);
		
		JLabel contactaSoporte = new JLabel("¿Nesesitas ayuda? contacta");
		contactaSoporte.setBounds(20, 640 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		login.add(contactaSoporte);
		
		JTextField usuario = new JTextField();
		usuario.setBounds(21, 240, 480, 48);
		usuario.setForeground(Color.WHITE);
		usuario.setBorder(redondo);
		usuario.setOpaque(false);
		usuario.setFont(txtBox);
		login.add(usuario);
		
		JLabel fondoUsuario = new JLabel();
		fondoUsuario.setBounds(20, 240, 480, 48);
		fondoUsuario.setOpaque(true);
		fondoUsuario.setBorder(null);
		fondoUsuario.setIcon(new ImageIcon("images/etiquetas.jpg"));
		login.add(fondoUsuario);
		
		JLabel iconoUsuario = new JLabel();
		iconoUsuario.setIcon(new ImageIcon("images/usuario.png"));
		iconoUsuario.setBounds(511, 240, 48, 48);
		iconoUsuario.setOpaque(false);
		login.add(iconoUsuario);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 400, 480, 48);
		contraseña.setForeground(Color.WHITE);
		contraseña.setBorder(redondo);
		contraseña.setOpaque(false);
		contraseña.setFont(txtBox);
		login.add(contraseña);
		
		JLabel fondoContraseña = new JLabel();
		fondoContraseña.setBounds(20, 400, 480, 48);
		fondoContraseña.setBorder(null);
		fondoContraseña.setIcon(new ImageIcon("images/etiquetas.jpg"));
		login.add(fondoContraseña);
		
		JLabel iconoContra = new JLabel(new ImageIcon("images/contra.png"));
		iconoContra.setBounds(511, 400, 58, 58);
		iconoContra.setOpaque(false);
		login.add(iconoContra);
		
		JCheckBox guardarContraseña = new JCheckBox("Recordar");
		guardarContraseña.setBounds(20, 470, 240, 54);
		guardarContraseña.setOpaque(false);
		guardarContraseña.setForeground(Color.WHITE);
		guardarContraseña.setFont(new Font("Italic", Font.ITALIC, 20));
		guardarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	guardarContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	guardarContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(guardarContraseña);
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.setBounds(260, 490, 240, 70);
		confirmar.setForeground(Color.WHITE);
		confirmar.setBorder(null);
		confirmar.setFont(new Font("Arial", Font.BOLD, 40));
		confirmar.setOpaque(false);
		confirmar.setBackground(verdeAzulado);
		confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	confirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	confirmar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		
		confirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String cadenaContraseña = new String(contraseña.getPassword());
				String cadenaUsuario = new String(usuario.getText());
				boolean verif1 = false, verif2 = false;
				
				if( cadenaUsuario.equals("") ) 
				{	
					usuario.setBorder(BorderFactory.createLineBorder(Color.red,2));
					
				}else 
				{	
					usuario.setBorder(BorderFactory.createLineBorder(Color.green,2));
					verif1 = true;
				}
				
				if(cadenaContraseña.equals("")) {
					contraseña.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					contraseña.setBorder(BorderFactory.createLineBorder(Color.green,2));
					verif2 = true;
				}
				
				if(verif1 && verif2) 
				{
					boolean user_Auth = funtions.authenticate(cadenaUsuario,cadenaContraseña); 
					 
					if(user_Auth) 
					{	
						JOptionPane.showMessageDialog(frame, "Bienvenido.");
						
					}else 
					{
						JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos","Error de acceso",JOptionPane.WARNING_MESSAGE);
					}	
				}
			}
			
		});
		
		login.add(confirmar);
		
		JLabel fondoConfirmar = new JLabel();
		fondoConfirmar.setBounds(260, 490, 240, 70);
		fondoConfirmar.setBorder(redondo);
		fondoConfirmar.setIcon(new ImageIcon("images/etiquetas.jpg"));
		login.add(fondoConfirmar);
		
		JButton registro = new JButton("Registrarse");
		registro.setBounds(520, 635, 145, 40);
		registro.setForeground(Color.WHITE);
		confirmar.setBorder(null);
		registro.setFont(new Font("Arial", Font.BOLD, 20));
		registro.setOpaque(false);
		registro.setBackground(verdeAzulado);
		registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	registro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	registro.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		
		registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				frame.setVisible(false);
				register();
			}
		});;
		login.add(registro);
		
		JLabel fondoRegistrar = new JLabel();
		fondoRegistrar.setBounds(520, 635, 145, 40);
		fondoRegistrar.setBorder(redondo);
		fondoRegistrar.setIcon(new ImageIcon("images/etiquetas.jpg"));

		login.add(fondoRegistrar);
		
		JButton olvidoContraseña = new JButton("¿Olvidaste tu contraseña?");
		olvidoContraseña.setBounds(248, 570, 268, 30);
		olvidoContraseña.setForeground(Color.CYAN);
		olvidoContraseña.setFont(new Font("Arial", Font.BOLD, 20));
		olvidoContraseña.setOpaque(false);
		olvidoContraseña.setBackground(new Color(54, 84, 79));
		olvidoContraseña.setBorder(null);
		olvidoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	olvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	olvidoContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(olvidoContraseña);
		
		JButton soporteTecnico = new JButton("Soporte Tecnico");
		soporteTecnico.setBounds(262, 647 , 160, 30);
		soporteTecnico.setForeground(Color.CYAN);
		soporteTecnico.setFont(new Font("Arial", Font.BOLD, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		soporteTecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
            	soporteTecnico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            	
            }
            public void mouseExited(java.awt.event.MouseEvent e) {
            	soporteTecnico.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
		});
		login.add(soporteTecnico);
		
		JLabel imgFondo = new JLabel();
		imgFondo.setBounds(0, 0, 1024, 720);
		imgFondo.setIcon(new ImageIcon("images/fondoLogin.jpg"));
		fondoLogin.add(imgFondo);
		
		JLabel imgLogin = new JLabel();
		imgLogin.setBounds(0, 0, 670, 720);
		imgLogin.setIcon(new ImageIcon("images/login.jpg"));
		login.add(imgLogin);
		
		frame.repaint();
		frame.revalidate();
				
	}
	
	public void register()
	{
		frame = new JFrame();
		frame.setTitle("Programa");
		frame.setVisible(true);
		frame.setSize(1024, 740);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel fondoRegistro = new JPanel();
		fondoRegistro.setBounds(0, 0, 1024, 720);
		fondoRegistro.setOpaque(true);
		fondoRegistro.setBackground(new Color(41, 44, 55));
		fondoRegistro.setLayout(null);
		frame.add(fondoRegistro);
		
		JPanel registro = new JPanel();
		registro.setBounds(177, 0, 670, 720);
		registro.setOpaque(true);
		registro.setBackground(new Color(177, 22, 35));
		registro.setLayout(null);
		fondoRegistro.add(registro);
		
		JLabel Registrarse = new JLabel("REGISTRO");
		Registrarse.setBounds(179, 0, 312, 100);
		Registrarse.setForeground(Color.WHITE);
		Registrarse.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));
		registro.add(Registrarse);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 95, 260, 45);
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label);
		registro.add(ingresaUsuario);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 200, 240, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label);
		registro.add(ingresaContraseña);
		
		JLabel biografia = new JLabel("Biografia*");
		biografia.setBounds(284, 305, 110, 45);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(label);
		registro.add(biografia);
		
		JLabel pref = new JLabel("Peferencias*");
		pref.setBounds(20, 445, 140, 45);
		pref.setForeground(Color.WHITE);
		pref.setFont(label);
		registro.add(pref);
		
		JLabel contactaSoporte = new JLabel("¿Ya tienes una cuenta?");
		contactaSoporte.setBounds(20, 630 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		registro.add(contactaSoporte);
		
		JTextField usuario = new JTextField();
		usuario.setBounds(20, 140, 480, 48);
		usuario.setForeground(Color.WHITE);
		usuario.setOpaque(true);
		usuario.setBackground(grisBajo);
		usuario.setBorder(bordeado);
		usuario.setFont(txtBox);
		registro.add(usuario);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 245, 480, 48);
		contraseña.setForeground(Color.WHITE);
		contraseña.setOpaque(true);
		contraseña.setBackground(grisBajo);
		contraseña.setBorder(bordeado);
		contraseña.setFont(txtBox);
		registro.add(contraseña);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(20, 355, 630, 87);
		bio.setForeground(Color.WHITE);
		bio.setOpaque(true);
		bio.setBackground(grisBajo);
		bio.setBorder(bordeado);
		bio.setFont(new Font("Plain", Font.PLAIN, 20));
		registro.add(bio);
		
		JCheckBox notif1 = new JCheckBox("Recibir notificaciones de estado");
		notif1.setBounds(20, 475, 320, 45);
		notif1.setOpaque(false);
		notif1.setForeground(Color.WHITE);
		notif1.setFont(new Font("Italic", Font.ITALIC, 20));
		notif1.setFocusable(false);
		registro.add(notif1);
		
		JCheckBox notif2 = new JCheckBox("Recibir notificaciones de alertas");
		notif2.setBounds(20, 505, 320, 45);
		notif2.setOpaque(false);
		notif2.setForeground(Color.WHITE);
		notif2.setFont(new Font("Italic", Font.ITALIC, 20));
		notif2.setFocusable(false);
		registro.add(notif2);
		
		JRadioButton aceptar = new JRadioButton("Acepto los terminos y condiciones");
		aceptar.setBounds(20, 555, 320, 45);
		aceptar.setOpaque(false);
		aceptar.setForeground(Color.WHITE);
		aceptar.setFont(new Font("Italic", Font.ITALIC, 17));
		aceptar.setFocusable(false);
		registro.add(aceptar);
		
		JRadioButton rechazar = new JRadioButton("Rechazo los terminos y condiciones");
		rechazar.setBounds(20, 585, 320, 45);
		rechazar.setOpaque(false);
		rechazar.setForeground(Color.WHITE);
		rechazar.setFont(new Font("Italic", Font.ITALIC, 17));
		rechazar.setFocusable(false);
		registro.add(rechazar);
		
		ButtonGroup termYCond = new ButtonGroup();
		termYCond.add(aceptar);
		termYCond.add(rechazar);
		
		//CAJA DESPEGABLE
		JComboBox <String> ubi = new JComboBox<String>();
		ubi.setBounds(400, 490, 250, 45);
		ubi.setForeground(Color.WHITE);
		ubi.setFont(new Font("Plain", Font.PLAIN, 20));
		ubi.setBackground(grisBajo);
		ubi.setBorder(bordeado);
		ubi.setFocusable(false);
		ubi.addItem("Seleccione su ubicacion");
		ubi.addItem("Camino Real");
		ubi.addItem("Calafia");
		ubi.addItem("Peninsula Sur");
		ubi.addItem("Valle del mezquite");
		ubi.setSelectedItem(1);
		registro.add(ubi);
		
		JButton confirmar = new JButton("Registrarse");
		confirmar.setBounds(420, 604, 240, 70);
		confirmar.setForeground(Color.WHITE);
		confirmar.setFont(new Font("Italic", Font.ITALIC, 40));
		confirmar.setOpaque(true);
		confirmar.setBackground(grisBajo);
		confirmar.setBorderPainted(true);
		confirmar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		confirmar.setFocusPainted(false);
		confirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String cadenaContraseña = new String(contraseña.getPassword());
				String cadenaUsuario = new String(usuario.getText());
				boolean verif1 = false, verif2 = false;
				
				if(cadenaUsuario.equals(""))
				{
					usuario.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					usuario.setBorder(new LineBorder(Color.GREEN, 4, true));
					verif1 = true;
				}
				
				if(cadenaContraseña.equals(""))
				{
					contraseña.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
					verif2 = true;
				}
				
				if(verif1 & verif2)
				{
					boolean user_Auth = funtions.regist(cadenaUsuario,cadenaContraseña); 
				}
				
			}
			
		});
		registro.add(confirmar);
		
		JButton soporteTecnico = new JButton("Inicia sesion");
		soporteTecnico.setBounds(224, 638 , 120, 30);
		soporteTecnico.setForeground(Color.RED);
		soporteTecnico.setFont(new Font("Arial", Font.BOLD, 19));
		soporteTecnico.setOpaque(false);
		soporteTecnico.setBackground(new Color(54, 84, 79));
		soporteTecnico.setBorder(null);
		soporteTecnico.setFocusPainted(false);
		soporteTecnico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				frame.getContentPane().removeAll();
				frame.setVisible(false);
				login();
			}
		});
		registro.add(soporteTecnico);
		
		//IMAGENES DE FONDO
		JLabel imgFondo = new JLabel(new ImageIcon("images/fondoRegistro.jpg"));
		imgFondo.setBounds(0, 0, 1024, 720);
		fondoRegistro.add(imgFondo);
		
		JLabel imgLogin = new JLabel(new ImageIcon("images/registro.jpg"));
		imgLogin.setBounds(0, 0, 670, 720);
		registro.add(imgLogin);
		
		frame.repaint();
		frame.revalidate();
	}
}
