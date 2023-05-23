import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","admin");
	
		Statement stm=con.createStatement();
//		ResultSet rs=stm.executeQuery("select * from student");
//						
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//			}
		String sql = "CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 

      stm.executeUpdate(sql);
      System.out.println("Created table in given database..."); 
		
	} catch (Exception e) {
	e.printStackTrace();
	}
}
}
