package com.cg.JunitEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculationEx {

	public int add(int a, int b)
	{
		return a+ b;
	}

	public int sub(int a, int b)
	{
		return a- b;
	}
	
/*	public int insert( int a,String b,String c,int d,String e,int f,int g)
	{
	int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			stmt.setInt(1,a);
			stmt.setString(2,b);
			stmt.setString(3,c);
			stmt.setInt(4,d);
			stmt.setString(5,e);
			stmt.setInt(6,f);
			stmt.setInt(7,g);
			
			 i=stmt.executeUpdate();
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}

	public int update( int a,String b)
	{
	int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			PreparedStatement stmt=con.prepareStatement("update employee set name=? where id=?");
			stmt.setInt(2,a);
			stmt.setString(1,b);
			
			 i=stmt.executeUpdate();
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
		}
	
	public int delete( int a)
	{
	int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			PreparedStatement stmt=con.prepareStatement("delete from employee where id=?");
			stmt.setInt(1,a);
			 i=stmt.executeUpdate();
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
		}*/
	
	public String select ( int a)
	{
	String name = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kpr","root","root");
			PreparedStatement stmt=con.prepareStatement("select * from employee where id=?");
			stmt.setInt(1,a);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
			name=rs.getString(2);	
			}
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return name;
		}
	
	
	
	
	
	


}
