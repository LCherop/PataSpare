package project.ui;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBConnect {
    Connection conny;

    public Connection getConny() {
        return conny;
    }

    public void setConny(Connection conny) {
        this.conny = conny;
    }
    
public void DBConnect()
{
	try
	{
		conny = DriverManager.getConnection("jdbc:mysql://localhost/pataspare","root","");
	}catch (SQLException ex) 
             {
                 Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                 ex.printStackTrace();
             }
}
}
