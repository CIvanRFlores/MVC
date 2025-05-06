package models;

import java.io.*;
import java.net.URISyntaxException;

public class AuthModel 
{
	public AuthModel()
	{
		
	}
	
	public boolean authenticate (String user, String password)
	{
		try {

			String direccion = AuthModel.class.getResource("/users.txt").toURI().getPath();
			
			BufferedReader fR = new BufferedReader (new FileReader(direccion));
			
			String i;
						
			while((i = fR.readLine()) != null)
			{
				String[] partes = i.split("\\|");
												
				String u = partes[6];
				
				String p = partes[8];
				
				if(user.equals(u))
				{
					if(password.equals(p))
					{
						return true;
					}
				}
			}
			
			fR.close();
			
			return false;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Error");
		}
		
		return false;
	}
	
	public void regist (String nombres, String apellidoP, String apellidoM, String empresa, String cargo, String usuario, String correo, String contraseña, String ambito) throws IOException
	{
		try {
			String direccion = AuthModel.class.getResource("/users.txt").toURI().getPath();
					
			File archivo = new File(direccion);
						
			FileWriter escritura = new FileWriter(archivo, true);
			
			String txt = nombres + "|" + apellidoP + "|" + apellidoM + "|" + empresa + "|" + cargo + "|" + ambito + "|" + usuario + "|" + correo + "|" + contraseña;
						
			escritura.write(txt + "\n");
			escritura.close();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
	}
}
