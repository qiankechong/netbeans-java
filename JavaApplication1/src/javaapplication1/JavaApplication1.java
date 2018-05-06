/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xinning
 */
public class JavaApplication1 {

     //声明Connection对象
    static  Connection con;
    //驱动程序名
    static String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名mydata
    static String url = "jdbc:mysql://localhost:3306/mysql";
    //MySQL配置时的用户名
    static String user = "root";
    //MySQL配置时的密码
    static String password = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // system.out.printf("dadsfa");
       System.out.printf("%e\r\n",1500.34); 
        System.out.println("javaapplication1.JavaApplication1.main()");
        System.out.println("adsfa");
             	String name;
	        String id;
	     
	        PreparedStatement psql;
	        ResultSet res;
		    
		        //遍历查询结果集
		        try {
		            //加载驱动程序
		            Class.forName(driver);
		            //1.getConnection()方法，连接MySQL数据库！！
		            con = DriverManager.getConnection(url,user,password);
		            if(!con.isClosed())
		                System.out.println("Succeeded connecting to the Database!");
		            //2.创建statement类对象，用来执行SQL语句！！
		            Statement statement = con.createStatement();
		            //要执行的SQL语句
		            String sql = "select * from user";
                            //3.ResultSet类，用来存放获取的结果集！！
		            ResultSet rs = statement.executeQuery(sql);
		            System.out.println("-----------------");
		            System.out.println("执行结果如下所示:");  
		            System.out.println("-----------------");  
		            System.out.println("Host" + "\t\t\t" + "user" + "\t\t" + "password");  
		            System.out.println("-----------------");  
                            String  str_empNO = null;
		           String  job = null;
		             id = null;
		            while(rs.next()){
		            		//获取stuname这列数据
		            	str_empNO = rs.getString("Host");
		                //获取stuname这列数据
		                job = rs.getString("User");
		                //获取stuid这列数据
		                id = rs.getString("Password");

		                //输出结果
		                System.out.println(str_empNO + "\t" + id + "\t" + job);
		            }
                        }
                          catch(ClassNotFoundException e) {   
		            //数据库驱动类异常处理
		            System.out.println("Sorry,can`t find the Driver!");   
		            } catch(SQLException e) {
           //数据库连接失败异常处理
  
		            }catch (Exception e) {
           // TODO: handle exception
                            e.printStackTrace(); 
		        }finally{
		            System.out.println("数据库数据成功获取！！");
		        }
		        
    }
    
}
