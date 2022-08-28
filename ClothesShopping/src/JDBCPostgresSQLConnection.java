import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCPostgresSQLConnection {
  private final String url = "jdbc:postgresql://127.0.0.1:5432/OutfitDB";
  private final String user = "postgres";
  private final String password = "Nsereko82%";
  
  private final String createTable = "CREATE TABLE INVENTORY ( ID serial, OUTFITS varchar(100), COST_PRICE integer, SELLING_PRICE integer, PROFIT integer);";
  private final String insertStmt = "INSERT INTO INVENTORY(OUTFITS, COST_PRICE, SELLING_PRICE, PROFIT) VALUES('Pants', 35, 80, 45)";
  /* Connect to the PostgreSQL database
   * 
   * @return a Connection object
   */
  
   public Connection connect() {
	  Connection conn = null;
	String outfits = "";
	int costPrice = 0;
	
	   try {
		   // make jdbc driver run(loading the driver)
		   Class.forName("org.postgresql.Driver");
		   conn = DriverManager.getConnection(url,user,password);
		   // check that we are connected
		   if(conn != null) {
			   System.out.println("Connected to the PostgreSQL server successfully.");
		   
		   
		   //PreparedStatement object
			   PreparedStatement state = conn.prepareStatement("select Outfits, cost_price from Inventory");
//			   PreparedStatement state = conn.prepareStatement(insertStmt);
//			   state.setString(1, "Pants");
//		   state.setInt(2,1);
//		   state.executeQuery();

		ResultSet rs = state.executeQuery();
		
		while (rs.next()) {
			outfits = rs.getString(1); //1 here gets the first column 
			costPrice = rs.getInt(2);
			System.out.println(outfits+" $"+costPrice);
		}
		
		   } else {
			   System.out.println("Failed to make connection!");
		   }
	   }catch(SQLException | ClassNotFoundException e) {
		   System.out.println(e.getMessage());
	   }
	   return conn;
	   
   }
	
}
