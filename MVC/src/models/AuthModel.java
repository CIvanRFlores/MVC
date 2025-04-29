package models;

import java.io.*;

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
				String[] partes = i.split(", ");
				
				String u = partes[0];
				String p = partes[1];
				
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
	
	public boolean regist (String user, String password)
	{
		System.out.println("Usuario: " + user + "\nContraseña: " + password);
		
		return false;
	}
}
