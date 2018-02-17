Singleton Pattern
==================
Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern

* Early Instantiation: creation of instance at load time.
* Lazy Instantiation: creation of instance when required.

> Advantage of Singleton design patten

Saves memory because object is not created at each request. Only single instance is reused again and again.

> Usage of Singleton design pattern

Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

> How to create Singleton design pattern?

To create the singleton class, we need to have static member of class, private constructor and static factory method.

Static member: It gets memory only once because of static, itcontains the instance of the Singleton class.
Private constructor: It will prevent to instantiate the Singleton class from outside the class.
Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.

> Understanding Real Example of Singleton Pattern

We are going to create a JDBCSingleton class. This JDBCSingleton class contains its constructor as private and a private static instance jdbc of itself.
JDBCSingleton class provides a static method to get its static instance to the outside world. Now, JDBCSingletonDemo class will use JDBCSingleton class to get the JDBCSingleton object.

>Assumption: 

you have created a table userdata that has three fields `uid`, `uname` and `upassword` in mysql database. Database name is `testdb`, username is `estdb`, password is `Testdb@123`.

> JDBCSingleton.javaa

```
package demo.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
    //Step 1
    //Create  a JDBCSingleton Class
    //static member holds only one instance of the JDBCSingleton class
    private static JDBCSingleton jdbc;
    
    //JDBCSingleton prevents the instantiation from any other class
    private JDBCSingleton(){
        
    }
    
    //Now we are providing global point of access
    public static JDBCSingleton getInstance(){
        if(jdbc==null){
            jdbc=new JDBCSingleton();
        }
        return jdbc;
    }
    
    //to get the connection from methods like insert, view etc
    private static Connection getConnection() throws ClassNotFoundException,SQLException{
        Connection con=null;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "testdb", "Testdb@123");
        return con;
    }
    
    //to insert the record into the database
    public int insert(String name,String pass)throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try{
            c=this.getConnection();
            ps=c.prepareStatement("insert into userdata(uname,upassword) values(?,?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter=ps.executeUpdate();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(ps!=null){
                ps.close();
            }
            if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
    
    //to view the data from the database
    public void view(String name) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con=this.getConnection();
            ps=con.prepareStatement("select * from userdata where uname=?");
            ps.setString(1, name);
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("Name="+rs.getString(2)+"\t"+" Password="+rs.getString(3));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(rs!=null){
                rs.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(con!=null){
                con.close();
            }
        }
    }
    
    //to update the password for the given username
    public int update(String name, String password) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try{
            c=this.getConnection();
            ps=c.prepareStatement(" update userdata set upassword=? where uname='"+name+"'");
            ps.setString(1,password);
            recordCounter=ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(ps!=null){
                ps.close();             
            }
            if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
    
    //to delete the data from the database
    public int delete(int userid) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try{
            c=this.getConnection();
            ps=c.prepareStatement(" delete from userdata where uid='"+userid+"'");
            recordCounter=ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(ps!=null){
                ps.close();
            }
            if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
}

```

> JDBCSingletonDemo.java

```
package demo.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {
    static int count = 1;
    static int choice;

    public static void main(String args[]) throws IOException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Databse operations");
            System.out.println("----------------------");
            System.out.println("1.Insertion");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");

            System.out.println("\n");
            System.out
                    .println("Please enter the choice what you want to perform in the database");

            choice = Integer.parseInt(br.readLine());
            switch (choice) {
            case 1: {
                System.out
                        .println("Enter the username you want to insert data into the database");
                String username = br.readLine();
                System.out
                        .println("Enter the password you want to insert data into the database");
                String password = br.readLine();
                try {
                    int i = jdbc.insert(username, password);
                    if (i > 0) {
                        System.out.println((count++)
                                + " Data has been inserted successfully");
                    } else {
                        System.out.println("Data has not be inserted");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                //System.err.println("Press enter key to continue");
                break;
            }// End of case
                

            case 2: {
                System.out.println("Enter the username :");
                String username = br.readLine();
                try {
                    jdbc.view(username);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //System.out.println("Press Enter key to continue ..");
                break;
            }// End of case2
                

            case 3: {
                System.out.println("Enter the userid, you want to delete ?");
                int userid = Integer.parseInt(br.readLine());

                try {
                    int i = jdbc.delete(userid);
                    if (i > 0) {
                        System.out.println((count++)
                                + "Data has been deleted successfully");
                    } else {
                        System.out.println("Data has not been deleted");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                //System.out.println("Press Enter key to continue..");
                break;
            }// End of case 3
                
            case 4: {
                System.out.println("Enter the username, you want to update");
                String username = br.readLine();

                System.out.println("Enter the ne1w password");
                String password = br.readLine();
                try {
                    int i = jdbc.update(username, password);
                    if (i > 0) {
                        System.out.println((count++)
                                + " Data has been updated successfully");
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;
            }// end of case 4
                
            case 5:{
                System.out.println("Bye for now!!");
                break;
                
            }
            default:
                System.out.println("Please enter the range");
            }
        } while (choice != 5);
    }
}

```