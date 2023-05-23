import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exmp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the studentID");
	int EmpId=sc.nextInt();
	System.out.println("Enter the studentName");
	String Ename=sc.next();
	System.out.println("Do you want to Enter the record Again");
	String ans=sc.next();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa","root","admin");
		String qury=("insert into student values('"+EmpId+"','"+Ename+"')");
		Statement stm=con.createStatement();
		stm.executeUpdate(qury);
		System.out.println("successfully");
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("Please Enter the studentID Again");
			int Id=sc.nextInt();
			System.out.println("Please Enter the studentName Again");
			String Empname=sc.next();
			PreparedStatement pr=con.prepareStatement("insert into student values(?,?)");
			pr.setInt(1, Id);
			pr.setString(2, Empname);
		int an=pr.executeUpdate();
		System.out.println("Inserted ThankYou");
			
		}
		if(ans.equalsIgnoreCase("no")) {
			System.out.println("Thankyou");
			con.close();
		}
		
		
	} catch (Exception e) {
	e.printStackTrace();
	}
}
}
