package models;

public class AuthModel 
{
	public AuthModel()
	{
		
	}
	
	public boolean authenticate (String user, String password)
	{
		if(user.equals("admin"))
		{
			if(password.equals("1234"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		return false;
	}
	
	public boolean regist (String user, String password)
	{
		System.out.println("Usuario: " + user + "\nContraseña: " + password);
		
		return false;
	}
}
