package jdbc;

import java.sql.*;
import java.util.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
	ResultSetMetaData rsmd = null;
	
	// String sql = "insert into student(id,name,dept_name,tot_cred)" + "values(?,?,?,?)";
	String sql = "Select * from takes";
	public void do_practice1() {
		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			rsmd = rs.getMetaData();
			
			int colCnt = rsmd.getColumnCount();
			
			for(int i=1;i<=colCnt;i++)
			{
				System.out.print(rsmd.getColumnTypeName(i) + " ");
			}
			System.out.println();
			
			while(rs.next())
			{
				for(int i=1;i<=colCnt;i++)
				{
					Object value = rs.getObject(i);
					System.out.print(value + " ");
				}
				System.out.println();
			}
			
			rs.close();
			st.close();
			conn.close();

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
