import java.util.Scanner;
import java.sql.*;
class SQLCmds{
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String name;
    int id;
    Scanner ob = new Scanner(System.in);
    void insertCmd() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        stmt = conn.createStatement();
        System.out.println("Enter id: ");
        id = ob.nextInt();
        System.out.println("Enter name : ");
        name = ob.next();
        String sql = "insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }
    void selectCmd() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        stmt = conn.createStatement();
        String sql="select * from student";
        rs=stmt.executeQuery(sql);
        System.out.println("----------------------------------------");
         while (rs.next()) {
             System.out.println(rs.getInt("Id") +" | "+ rs.getString("Name"));
         }
        System.out.println("----------------------------------------");
        conn.close();
    }
    void updateCmd() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        stmt = conn.createStatement();
        System.out.println("Enter which column to be updated (id/name) : ");
        String sel = ob.next();
        if(sel.equalsIgnoreCase("id")){
            System.out.println("Enter id: ");
            id = ob.nextInt();
            System.out.println("Enter name : ");
            name = ob.next();
            String sql = "update student set id="+id+" where "+"name ='"+name+"'";
            stmt.executeUpdate(sql);
            conn.close();
        }else if(sel.equalsIgnoreCase("name")){
            System.out.println("Enter name : ");
            name = ob.next();
            System.out.println("Enter id: ");
            id = ob.nextInt();
            String sql = "update student set name ='"+name+"' where "+"id ="+id;
            stmt.executeUpdate(sql);
            conn.close();
        }

    }
    void deleteCmd() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        stmt = conn.createStatement();
        System.out.println("Do you want delete all data : Yes/No ");
        String data = ob.next();
//        if(data.equalsIgnoreCase("yes")){
//            String sql = "delete from student";
//            System.out.println("All Data Deleted!!");
//            stmt.executeUpdate(sql);
//            conn.close();
//        }
         if(data.equalsIgnoreCase("no")){
            System.out.println("Enter which column (id/name): ");
            String sel = ob.next();
            if(sel.equalsIgnoreCase("id")){
                System.out.println("Enter id: ");
                id = ob.nextInt();
                String sql = "delete from student where id="+id;
                System.out.println("Record Deleted!!");
                stmt.executeUpdate(sql);
                conn.close();
            }else if(sel.equalsIgnoreCase("name : ")){
                System.out.println("Enter id: ");
                id = ob.nextInt();
                String sql = "delete from student where name='"+name+"'";
                stmt.executeUpdate(sql);
                System.out.println("Record Deleted!!");
                conn.close();
            }

        }
    }
}
public class Assignment {
    public static void main(String[] args) throws Exception{
        Scanner ob = new Scanner(System.in);
        SQLCmds s1 = new SQLCmds();
        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Select");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            int x = ob.nextInt();
            switch (x){
                case 1 :
                    s1.insertCmd();
                    break;
                case 2 :
                    s1.selectCmd();
                    break;
                case 3 :
                    s1.updateCmd();
                    break;
                case 4 :
                    s1.deleteCmd();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Please enter correct choice!!");

            }

        }

    }
}
