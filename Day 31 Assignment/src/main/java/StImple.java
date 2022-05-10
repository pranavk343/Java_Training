import java.sql.*;
public class StImple implements StudentInter{
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs= null;
    StImple() throws Exception{
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        stmt = conn.createStatement();
    }
    @Override
    public void save(Student st) throws Exception{
        String name = st.getName();
        int id = st.getId();
        String sql = "insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }

    @Override
    public void update(Student st) throws Exception {
        String name = st.getName();
        int id = st.getId();
        String sql = "update student set name='" + name + "' where id=" + id;
        conn.close();
    }

    @Override
    public void select(Student st) throws Exception{
        String sql="select * from student";
        rs=stmt.executeQuery(sql);
        System.out.println("----------------------------------------");
        while (rs.next()) {
            System.out.println(rs.getInt("Id") +"   |   "+ rs.getString("Name"));
        }
        System.out.println("----------------------------------------");
        conn.close();
    }

    @Override
    public void delete(Student st) throws Exception{
        String name = st.getName();
        int id = st.getId();
        String sql = "delete from student where id="+id;
        System.out.println("Record Deleted!!");
        stmt.executeUpdate(sql);
        conn.close();

    }

    @Override
    public Student stud(int id) {
        return null;
    }
}