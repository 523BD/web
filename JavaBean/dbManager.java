package cn.swpu.zzh;

import java.sql.*;
public class dbManager
{


	String driver = "com.mysql.jdbc.Driver";
    /*
     * URL指向要访问的数据库名(我用的是数据库名为test)
     * 192.168.179.128:3306 虚拟机的ip，本地用127.0.0.1
     */
    String url = "jdbc:mysql://127.0.0.1:3306/classmgr?useUnicode=true&amp;characterEncoding=utf-8";

    String user = "root";      //MySQL配置时的用户名
    String password = "qazlzh123";   //MySQL配置时的密码


    		/*数据库连接*/
    	    public  Connection getConn() 
    	    {
    	        Connection con = null;
    	        try  
    	        {  ////加载驱动程序
    	            Class.forName(driver);  
    	        }  
    	        catch (ClassNotFoundException e)  
    	        {  
    	            e.printStackTrace();  
    	        }  
    	        try  
    	        {  
    	            con = DriverManager.getConnection(url,user,password);//注意是三个参数 


    	        }  
    	        catch (SQLException e)  
    	        {  
    	            e.printStackTrace();
    	        }
    	        return con;
    	    }
    	    	/*数据库查询*/
    		    public Student select() throws SQLException
    		    {  
    		    	Student student=new Student();
    		        String sql = "select * from stubean where stuid='"+student.getId()+"'";  
    		        Connection con = getConn();  
    		        try{

    		            Statement stmt = con.createStatement();
    		            ResultSet rs = stmt.executeQuery(sql); 

    		            while(rs.next()){

    		                //获取id这列数据
    		                 student.setId(rs.getString("stuid")) ;
    		                //获取name这列数据
    		                 student.setName(rs.getString("stuname")) ;
    		               //获取password这列数据
    		                 student.setPassword(rs.getString("stupassword")) ;
    		                 //System.out.println(id + "\t" + name+"\t"+cell);
    		            }
    		            rs.close();
    		            con.close();
    		        }
    		        catch(SQLException e)
    		        {      
    		            e.printStackTrace();   
    		        } 
    		        return student;
    		    }
    		    /*数据库插入*/
    		    public void insert(Student student) 
    		    {
    		        Connection con = getConn();
    		        String sql = "insert into stubean values ('"+student.getName()+"','"+student.getPassword()+ "','"+student.getId()+"')";
    		        try {
    		            //用来执行SQL语句
     		            Statement stmt = null; 
     		            stmt = con.createStatement();
     		            stmt.executeUpdate(sql);
    		        }
    		        catch (Exception e) {
    		            e.printStackTrace();
    		        }

    		    }
    		    /*数据库更新*/
    		    public void update(Student student) 
    		    {
    		        String sql = "UPDATE stubean SET stuname = '"+student.getName()+"',stuid='"+student.getId()+"',stupassword='"+student.getPassword()+"'";
    		        Connection con=getConn();
    		        try {
    		            //用来执行SQL语句
    		            Statement stmt = null; 
    		            stmt = con.createStatement();
    		            stmt.executeUpdate(sql);
    		            System.out.println(sql);
    		        }
    		        catch (Exception e) {
    		            e.printStackTrace();
    		        }
    		    }

}