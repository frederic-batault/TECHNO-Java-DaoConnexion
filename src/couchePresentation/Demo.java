package couchePresentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo {

	public static void main(String[] args) {
		//driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// connexion � la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd","root",""); 
			
			// cr�ation requ�te 1
			Statement refStatement = refConnection.createStatement();
			
			// executer requ�te 1
			String refRequete = "INSERT INTO client(IdClient, nom, prenom, age, IdConseiller) VALUES (6, 'Batault', 'Frederic', 32, 1)";
			int i = refStatement.executeUpdate (refRequete);
					
			// pr�sentation r�sultats requ�te 1
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		

	}

}
