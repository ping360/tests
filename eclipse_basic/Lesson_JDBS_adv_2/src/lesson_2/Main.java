package lesson_2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/pasik", "root", "123456")){
			
//			Statement st = conn.createStatement();
//			st.execute("CREATE Table User(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), age int)");
//			st.close();
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO User(name, age) values (?,?)");
			
//				ps.setString(1, "Nazar");
//				ps.setInt(2, 12);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Petro");
//				ps.setInt(2, 20);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Andriy");
//				ps.setInt(2, 32);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Yra");
//				ps.setInt(2, 43);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Vasul");
//				ps.setInt(2, 21);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Mukola");
//				ps.setInt(2, 18);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Anton");
//				ps.setInt(2, 14);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Maryan");
//				ps.setInt(2, 22);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Ibragim");
//				ps.setInt(2, 20);
//				ps.executeUpdate();
//				
//				ps.setString(1, "Maksum");
//				ps.setInt(2, 18);
//				ps.executeUpdate();
			
			ps = conn.prepareStatement("SELECT * FROM User");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("Name user: " + rs.getString(2) + " "  + "age: "  +  rs.getInt(3));
			}
			
			
			
		}catch (SQLException e) {	
			
			e.printStackTrace();	
			
		}

	}

}
