package dboperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import HospitalCon.HospitalData;
import patientData.Patientclass;

public class DBcon {
      
	    static Connection con = null;
	    public static void connect()
	    {
	    	String url =  "jdbc:mysql://localhost:3306/HospitalData";
	    	String uname = "root";
	    	String  upass  = "123456789";
	    	
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,uname,upass);
			    }
	    	catch (Exception e) 
	    	{
				System.out.println(e);
			}
	    }
	     public static void  insert(HospitalData hd)
	     {
	    	 connect();
	    	 try {
				PreparedStatement ps = con.prepareStatement("insert into Hospital value(?,?,?,?)");
				ps.setInt(1, hd.getdoctorId());
				ps.setString(2,hd.getdoctorName());
				ps.setString(3,hd.getdoctorCategory());
				ps.setDouble(4,hd.getdoctorcontactNO());
				
				if(!ps.execute())
				{
					System.out.println("Data Inserted");
				}
				else
				{
					System.out.println("Data not Inserted");
				}
				con.close();
          	} catch (Exception e) 
	    	 {
			System.out.println(e);
			}
	     } 
	     public static void insert(Patientclass ps)
	     {
	    	 connect();
	    	 try {
				PreparedStatement ss = con.prepareStatement("insert into Hospital1 value(?,?,?,?)");
				ss.setInt(1, ps.getpatientID());
				ss.setString(2, ps.getpatientName());
				ss.setString(3, ps.getpatientCategory());
				ss.setDouble(4,ps.getpatientcontactNO());
				if(!ss.execute())
				{
					System.out.println("Data Inserted");
				}
				else
				{
					System.out.println("Data not Inserted");
				}
				con.close();
			     } 
	    	 catch (Exception e) 
	    	     {
	    		 System.out.println(e);
			     }
	     }
	     
	     public static void view() 
	     {
	    	connect();
	    	try {
	    		PreparedStatement ps= con.prepareStatement("select * from hospital");
	    		ResultSet rs = ps.executeQuery();
	    		while (rs.next()) {
	    			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDouble(4));                   
				}				
			} catch (Exception e) {
				System.out.println(e);
			}
	     }
	     public static void show()
	     {
	    	 connect();
	    	 try {	
	   PreparedStatement ss = con.prepareStatement("select * from hospital1");
	   ResultSet rv = ss.executeQuery();
		while(rv.next()) {
			System.out.println(rv.getInt(1)+" "+rv.getString(2)+"  "+rv.getString(3)+" "+rv.getDouble(4));
		}
				
			} catch (Exception e) {
				System.out.println(e);
			}
	     }
     } 


























