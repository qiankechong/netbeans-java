/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_tcpclient;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author xinning
 */
public class JavaApplication_tcpclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {  
        //    Socket s=new Socket(InetAddress.getByName(null),4040);//"localhost" "127.0.0.1s"  
           Socket s=new Socket("115.236.28.50",4040);//"localhost" "127.0.0.1s"  
            OutputStream os=s.getOutputStream();  
            InputStream is=s.getInputStream();  
            byte []buf=new byte[100];  
            int len=is.read(buf);  
            System.out.println(new String(buf,0,len));  
            os.write("Hello,this is zhangsan".getBytes());  
            Thread.sleep(100);  
            os.close();  
            is.close();  
            s.close(); 
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }
    
}
