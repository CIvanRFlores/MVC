package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
	Font label_2 = new Font("Arial", Font.BOLD, 16);
	Font txtBox = new Font("SansSeriff", Font.PLAIN, 30);
	Font txtBox_2 = new Font("SansSeriff", Font.PLAIN, 20);

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
					usuario.setBorder(BorderFactory.createLineBorder(Color.orange,2));
					verif1 = true;
				}
				
				if(cadenaContraseña.equals("")) {
					contraseña.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					contraseña.setBorder(BorderFactory.createLineBorder(Color.orange,2));
					verif2 = true;
				}
				
				if(verif1 && verif2) 
				{
					boolean user_Auth = funtions.authenticate(cadenaUsuario,cadenaContraseña);
					 
					if(user_Auth) 
					{	
						usuario.setBorder(BorderFactory.createLineBorder(Color.green,2));
						
						contraseña.setBorder(BorderFactory.createLineBorder(Color.green,2));

						JOptionPane.showMessageDialog(frame, "Bienvenido.");
						
						frame.dispose();	//FUNCION PARA DESTRUIR VENTANA
						AuthView.this.home();	//LLAMADO DE LA NUEVA VENTANA
						
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
		
		JLabel ingresaNombres = new JLabel("Nombres*");
		ingresaNombres.setBounds(20, 95, 260, 45);
		ingresaNombres.setForeground(Color.WHITE);
		ingresaNombres.setFont(label_2);
		registro.add(ingresaNombres);
		
		JTextField nombres = new JTextField();
		nombres.setBounds(20, 130, 245, 40);
		nombres.setForeground(Color.WHITE);
		nombres.setOpaque(true);
		nombres.setBackground(grisBajo);
		nombres.setBorder(bordeado);
		nombres.setFont(txtBox_2);
		registro.add(nombres);
		
		JLabel ingresaApellido_P = new JLabel("Apellido paterno*");
		ingresaApellido_P.setBounds(285, 95, 260, 45);
		ingresaApellido_P.setForeground(Color.WHITE);
		ingresaApellido_P.setFont(label_2);
		registro.add(ingresaApellido_P);
		
		JTextField apellido_P = new JTextField();
		apellido_P.setBounds(285, 130, 160, 40);
		apellido_P.setForeground(Color.WHITE);
		apellido_P.setOpaque(true);
		apellido_P.setBackground(grisBajo);
		apellido_P.setBorder(bordeado);
		apellido_P.setFont(txtBox_2);
		registro.add(apellido_P);
		
		JLabel ingresaApellido_M = new JLabel("Apellido materno*");
		ingresaApellido_M.setBounds(465, 95, 260, 45);
		ingresaApellido_M.setForeground(Color.WHITE);
		ingresaApellido_M.setFont(label_2);
		registro.add(ingresaApellido_M);
		
		JTextField apellido_M = new JTextField();
		apellido_M.setBounds(465, 130, 160, 40);
		apellido_M.setForeground(Color.WHITE);
		apellido_M.setOpaque(true);
		apellido_M.setBackground(grisBajo);
		apellido_M.setBorder(bordeado);
		apellido_M.setFont(txtBox_2);
		registro.add(apellido_M);
		
		JLabel ingresaEmpresa = new JLabel("Empresa*");
		ingresaEmpresa.setBounds(20, 175, 240, 45);
		ingresaEmpresa.setForeground(Color.WHITE);
		ingresaEmpresa.setFont(label_2);
		registro.add(ingresaEmpresa);
		
		JTextField empresa = new JTextField();
		empresa.setBounds(20, 210, 290, 45);
		empresa.setForeground(Color.WHITE);
		empresa.setOpaque(true);
		empresa.setBackground(grisBajo);
		empresa.setBorder(bordeado);
		empresa.setFont(txtBox_2);
		registro.add(empresa);
		
		JLabel ingresaCargo = new JLabel("Cargo*");
		ingresaCargo.setBounds(330, 175, 240, 45);
		ingresaCargo.setForeground(Color.WHITE);
		ingresaCargo.setFont(label_2);
		registro.add(ingresaCargo);
		
		JTextField cargo = new JTextField();
		cargo.setBounds(330, 210, 290, 45);
		cargo.setForeground(Color.WHITE);
		cargo.setOpaque(true);
		cargo.setBackground(grisBajo);
		cargo.setBorder(bordeado);
		cargo.setFont(txtBox_2);
		registro.add(cargo);
		
		JLabel ingresaUsuario = new JLabel("Nombre de usuario*");
		ingresaUsuario.setBounds(20, 260, 240, 45);
		ingresaUsuario.setForeground(Color.WHITE);
		ingresaUsuario.setFont(label_2);
		registro.add(ingresaUsuario);
		
		JTextField usuario = new JTextField();
		usuario.setBounds(20, 295, 290, 45);
		usuario.setForeground(Color.WHITE);
		usuario.setOpaque(true);
		usuario.setBackground(grisBajo);
		usuario.setBorder(bordeado);
		usuario.setFont(txtBox_2);
		registro.add(usuario);
		
		JLabel ingresaCorreo = new JLabel("Correo electronico*");
		ingresaCorreo.setBounds(330, 260, 240, 45);
		ingresaCorreo.setForeground(Color.WHITE);
		ingresaCorreo.setFont(label_2);
		registro.add(ingresaCorreo);
		
		JTextField correo = new JTextField();
		correo.setBounds(330, 295, 290, 45);
		correo.setForeground(Color.WHITE);
		correo.setOpaque(true);
		correo.setBackground(grisBajo);
		correo.setBorder(bordeado);
		correo.setFont(txtBox_2);
		registro.add(correo);
		
		JLabel ingresaContraseña = new JLabel("Contraseña*");
		ingresaContraseña.setBounds(20, 340, 240, 45);
		ingresaContraseña.setForeground(Color.WHITE);
		ingresaContraseña.setFont(label_2);
		registro.add(ingresaContraseña);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(20, 375, 290, 45);
		contraseña.setForeground(Color.WHITE);
		contraseña.setOpaque(true);
		contraseña.setBackground(grisBajo);
		contraseña.setBorder(bordeado);
		contraseña.setFont(txtBox_2);
		registro.add(contraseña);
		
		JLabel repetirContraseña = new JLabel("Repetir contraseña*");
		repetirContraseña.setBounds(330, 340, 240, 45);
		repetirContraseña.setForeground(Color.WHITE);
		repetirContraseña.setFont(label_2);
		registro.add(repetirContraseña);
		
		JPasswordField rContraseña = new JPasswordField();
		rContraseña.setBounds(330, 375, 290, 45);
		rContraseña.setForeground(Color.WHITE);
		rContraseña.setOpaque(true);
		rContraseña.setBackground(grisBajo);
		rContraseña.setBorder(bordeado);
		rContraseña.setFont(txtBox_2);
		registro.add(rContraseña);
		
		JLabel contactaSoporte = new JLabel("¿Ya tienes una cuenta?");
		contactaSoporte.setBounds(20, 630 , 250, 45);
		contactaSoporte.setForeground(Color.WHITE);
		contactaSoporte.setFont(new Font("Italic", Font.ITALIC, 19));
		registro.add(contactaSoporte);
		
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
		JComboBox <String> ambito = new JComboBox<String>();
		ambito.setBounds(20, 450, 250, 45);
		ambito.setForeground(Color.WHITE);
		ambito.setFont(new Font("Plain", Font.PLAIN, 20));
		ambito.setBackground(grisBajo);
		ambito.setBorder(bordeado);
		ambito.setFocusable(false);
		ambito.addItem("Ambito de la empresa");
		ambito.addItem("Tecnologia");
		ambito.addItem("Salud");
		ambito.addItem("Educacion");
		ambito.addItem("Comercio");
		ambito.addItem("Otro....");
		ambito.setSelectedItem(1);
		registro.add(ambito);
		
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

				String cadenaNombres = new String(nombres.getText());
				String cadenaApellidoP = new String(apellido_P.getText());
				String cadenaApellidoM = new String(apellido_M.getText());
				String cadenaEmpresa = new String(empresa.getText()); 
				String cadenaCargo = new String(cargo.getText());
				String cadenaUsuario = new String(usuario.getText());
				String cadenaCorreo = new String (correo.getText());
				String cadenaContraseña = new String (contraseña.getPassword());
				String verifContraseña = new String (rContraseña.getPassword());
				
				boolean v1 = false, v2 = false, v3 = false, v4 = false, v5 = false, v6 = false, v7 = false, v8 = false, v9 = false, v10 = false, v11 = false;
				
				if(cadenaNombres.equals(""))
				{
					nombres.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					nombres.setBorder(new LineBorder(Color.GREEN, 4, true));
					v1 = true;
				}
				
				if(cadenaApellidoP.equals(""))
				{
					apellido_P.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					apellido_P.setBorder(new LineBorder(Color.GREEN, 4, true));
					v2 = true;
				}
				
				if(cadenaApellidoM.equals(""))
				{
					apellido_M.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					apellido_M.setBorder(new LineBorder(Color.GREEN, 4, true));
					v3 = true;
				}
				
				if(cadenaEmpresa.equals(""))
				{
					empresa.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					empresa.setBorder(new LineBorder(Color.GREEN, 4, true));
					v4 = true;
				}
				
				if(cadenaCargo.equals(""))
				{
					cargo.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					cargo.setBorder(new LineBorder(Color.GREEN, 4, true));
					v5 = true;
				}
				
				if(cadenaUsuario.equals(""))
				{
					usuario.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					usuario.setBorder(new LineBorder(Color.GREEN, 4, true));
					v6 = true;
				}
				
				if(cadenaCorreo.equals(""))
				{
					correo.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					correo.setBorder(new LineBorder(Color.GREEN, 4, true));
					v7 = true;
				}
				
				if(cadenaContraseña.equals(""))
				{
					contraseña.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					contraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
					v8 = true;
				}
				
				if(verifContraseña.equals(""))
				{
					rContraseña.setBorder(new LineBorder(Color.RED, 4, true));
				}
				else if(verifContraseña.equals(cadenaContraseña))
				{
					rContraseña.setBorder(new LineBorder(Color.GREEN, 4, true));
					v9 = true;
				}
				else
				{
					rContraseña.setBorder(new LineBorder(Color.ORANGE, 4, true));	
				}
				
				if(ambito.getSelectedIndex() == 0)
				{
					ambito.setBorder(new LineBorder(Color.ORANGE, 4, true));
				}
				else
				{
					ambito.setBorder(new LineBorder(Color.GREEN, 4, true));
					v10 = true;
				}

				if(v1 & v1 & v3 & v4 & v5 & v6 & v7 & v8 & v9 & v10)
				{
					if(aceptar.isSelected())
					{
							try {
								funtions.regist(cadenaNombres, cadenaApellidoP, cadenaApellidoM, cadenaEmpresa, cadenaCargo, cadenaUsuario, cadenaCorreo, cadenaContraseña, ambito.getSelectedItem().toString());
								JOptionPane.showMessageDialog(frame, "Registro exitoso.");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}			
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "Debe aceptar Terminos y condiciones","Error de registro",JOptionPane.WARNING_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "LLene los campos correctamente","Error de registro",JOptionPane.WARNING_MESSAGE);
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
	
	public void home()
	{
		frame = new JFrame();
		frame.setTitle("Programa");
		frame.setVisible(true);
		frame.setSize(1024, 740);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel fondoInicio = new JPanel();
		fondoInicio.setBounds(0, 0, 1024, 720);
		fondoInicio.setOpaque(true);
		fondoInicio.setBackground(new Color(200, 229, 187));
		fondoInicio.setLayout(null);
		frame.add(fondoInicio);
		
		JPanel inicio = new JPanel();
		inicio.setBounds(177, 0, 670, 720);
		inicio.setOpaque(true);
		inicio.setBackground(new Color(117, 163, 97));
		inicio.setLayout(null);
		fondoInicio.add(inicio);
		
		JLabel home = new JLabel("INICIO");
		home.setBounds(179, 0, 400, 100);
		home.setForeground(Color.WHITE);
		home.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 60));
		inicio.add(home);
	}
}
