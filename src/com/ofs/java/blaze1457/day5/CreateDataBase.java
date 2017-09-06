
import java.sql.*;
public class CreateDataBase {
   
    static int NumberOfColumns = 3;
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://lp1073:3306/batch2";
    static String USER = "sabose";
    static String PASS = "sabose";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();
         
            String sql = "CREATE TABLE IF NOT EXISTS karteek(id INTEGER NOT NULL, firstName VARCHAR(20), lastName VARCHAR(20))";
            stmt.executeUpdate(sql);
            
            sql = "ALTER TABLE karteek ADD address VARCHAR(20)";
           stmt.executeUpdate(sql);
           sql = "ALTER TABLE karteek ADD PRIMARY KEY(id)";
           stmt.executeUpdate(sql);
         
           sql = "INSERT INTO karteek(id, firstName, lastName) VALUES(100, 'krishna', 'karteek')";
           stmt.executeUpdate(sql);
           
           sql = "INSERT INTO karteek(id, firstName, lastName) VALUES(200, 'yuvaraj', 'jonna')";
           stmt.executeUpdate(sql);
           
            sql = "INSERT INTO karteek(id, firstName, lastName) VALUES(300, 'bala', 'krishna')";
           stmt.executeUpdate(sql);
          
           sql = "UPDATE karteek SET address = 'chennai' WHERE id = 100 ";
           stmt.executeUpdate(sql);
           
           sql = "UPDATE karteek SET address = 'mumbai' WHERE id = 200 ";
           stmt.executeUpdate(sql);
           
           sql = "UPDATE karteek SET address = 'banglore' WHERE id = 300 ";
           stmt.executeUpdate(sql);
           
           sql = "DELETE FROM karteek WHERE id = 200";
           stmt.executeUpdate(sql);
           
           sql = "SELECT id, firstName, lastName, address FROM karteek";
           ResultSet rs = stmt.executeQuery(sql);
           
           while(rs.next()){
               int id = rs.getInt("id");
               String firstName = rs.getString("firstName");
               String lastName = rs.getString("lastName");
               String address = rs.getString("address");
               
               System.out.print("Id : "+id);
               System.out.print("First Name : "+firstName);
               System.out.print("Last Name : "+lastName);
               System.out.print("Address : "+address);
           }
           
        } catch (ClassNotFoundException e) {
            System.out.println("Exception = " + e);
        } 
            catch (Exception e) {
            System.out.println("Exception = " + e);
        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                System.out.println("Exception" + se);
            }
        }
    }
}

