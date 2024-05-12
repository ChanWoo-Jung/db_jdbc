package jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class T1 {

	String driver = "org.postgresql.Driver";

	String url = "jdbc:postgresql://localhost:5432/Task_DB";
	String user = "postgres";
	String password = "1234";

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement prst = null;
	String sql = "insert into student(id,name,dept_name,tot_cred)" + "values(?,?,?,?)";

	public void do_practice1() {
		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			prst = conn.prepareStatement(sql);

			prst.setString(1,"00000");
			prst.setString(2, "SQL3_test_name");
			prst.setString(3, "Finance");
			prst.setInt(4, 0);
		
			int resultNum = prst.executeUpdate();
			System.out.println(resultNum);
			prst.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
