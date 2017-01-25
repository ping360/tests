package lesson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Main {

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "1987")){

		}catch(SQLException e){
		}
	}

}