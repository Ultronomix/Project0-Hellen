
public class ShoppingMain {
   public static void main(String[] args) {
	   JDBCPostgresSQLConnection app = new JDBCPostgresSQLConnection();
	   app.connect();
	   ClothesShopping cl = new ClothesShopping();
	   cl.displayClothes();
	   cl.order();
	   
   }
}
