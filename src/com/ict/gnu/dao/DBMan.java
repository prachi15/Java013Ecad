package com.ict.gnu.dao;
import java.sql.*;
public class DBMan {

	private static String url="jdbc:mysql://au-cdbr-sl-syd-01.cleardb.net/ibmx_85ce15767fb3812?user=bb29fda195509f&password=12c61b9f";
	private static String uname="bb29fda195509f";
	private static String upass="12c61b9f";
	
	private static Connection cn;
	private static Statement st;
	
	static
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			cn=DriverManager.getConnection(url,uname,upass);
			st=cn.createStatement();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
//	public static void main(String args[])
//	{
//		System.out.println("OK");
//	}
	public static int InsertRecord(String roll,String stuname,String branch,String category,String message)
	{
		 String sql="insert into feedback (roll,stuname,branch,category,message)"+"values('"+roll+"','"+stuname+"','"+branch+"','"+category+"','"+message+"')";
		try
		{
		 return st.executeUpdate(sql);
		}
		catch (Exception e) {
			return -1;
		}
		
		// String sql="insert into feedback (roll,stuname,branch,category,message)"+"values(?,?,?,?,?,?)";
			//try
			//{
				/*PreparedStatement ps=cn.prepareStatement(sql);
				ps.setString(1, roll);
				ps.setString(2, stuname);
				ps.setString(3, branch);
				ps.setString(4, category);
				ps.setString(5, message);
			return ps.executeUpdate();*/
				/*ps.addBatch();
				int res[]=ps.executeBatch();
				return res[0];*/
			}//
			/*catch (Exception e) {
				return -1;
			}*/
//}
	
	public static ResultSet getFeedbacks() throws Exception
	{
		return st.executeQuery("select * from feedback order by fid desc limit 5");
	}
}
