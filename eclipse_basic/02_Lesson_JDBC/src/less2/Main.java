package less2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "123456")){

//			Statement st = conn.createStatement();
//			
//			st.execute("CREATE TABLE Item(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), count int)");
//			
//			st.close();
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Item(name, count) values (?,?)");
			
//			ps.setString(1, "Skate");
//			ps.setInt(2, 4);
//			ps.executeUpdate();
//		
//			ps.setString(1, "GolfCar");
//			ps.setInt(2, 2);
//			ps.executeUpdate();
//			
//			ps.setString(1, "Moto");
//			ps.setInt(2, 2);
//			ps.executeUpdate();
//			
//			ps.setString(1, "Bike");
//			ps.setInt(2, 2);
//			ps.executeUpdate();
//			ps.close();
			
			ps = conn.prepareStatement("SELECT * FROM Item");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("Type: "+rs.getString(2)+"   Num wheels: "+rs.getInt(3));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}