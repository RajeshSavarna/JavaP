package programs;
import java.sql.*;
class OracleConnection
{
	public static void main(String...args)
	{
		try{
				Class.forName("oracle.jdbc.driver.OracleDriver");

				Connection con = null;
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");

				Statement stmt=con.createStatement();

				ResultSet rs=stmt.executeQuery("select * from std_result");
				
				while(rs.next())
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

				con.close();
			}catch(Exception e)
				{ 
					System.out.println(e);
				}
	}
}