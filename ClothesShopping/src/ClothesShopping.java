import java.util.Scanner;

public class ClothesShopping {
        // declare variables
		int Pants = 80;
		int Shirts = 50;
		int Dresses = 40;
		int Tops = 100;
		int Blazers = 65;
		int Jeans = 55;
		int ch;
		int quantity;
		static int total;
		String again;
		//String name;
		
		Scanner sc = new Scanner(System.in);
		
		//method to display clothes
		public void displayClothes() {
		  //System.out.println("What's your "+ name);
		  System.out.println("Welcome To Zeeeee Boutique!");
		  //System.out.println("***********************");
		  System.out.println("      1.Pants      $80");
		  System.out.println("      2.Shirts     $50");
		  System.out.println("      3.Dresses    $40");
		  System.out.println("      4.Tops       $100");
		  System.out.println("      5.Blazers    $65");
		  System.out.println("      6.Jeans      $55");
		  System.out.println("      7.Exit          ");
		  //System.out.println("************************");
		  System.out.println("What outfit would you like to buy?");
		}
		
		//method to generate bill
		public void generateBill() {
			System.out.println();
			System.out.println("Your bill is : $" + total);
			System.out.println("Thank You For Shopping With Us!");
			System.out.println("See You Again!");
		}
		
		//Method to order clothes
		//switch case is used
		public void order() {
			while(true) {
		  System.out.println("Enter Your Outfit");
		  ch = sc.nextInt();
		  switch(ch) {
		  case 1: //Pants
			  System.out.println("You have Selected Pants");
			  System.out.println();
			  System.out.println("Enter desired quantity: ");
			  quantity = sc.nextInt();
			  total = total + quantity*Pants;
			  break;
		  case 2: //Shirts
			  System.out.println("You have selected Shirts");
			  System.out.println();
			  System.out.println("Enter desired quantity: ");
			  quantity = sc.nextInt();
			  total = total + quantity*Shirts;
			  break;
		  case 3://Dresses
		      System.out.println("You have selected Dresses");
		      System.out.println();
		      System.out.println("Enter desired quantity: ");
		      quantity = sc.nextInt();
		      total = total + quantity*Dresses;
		  break;
		  case 4://Tops
			  System.out.println("You have selected Tops");
			  System.out.println();
			  System.out.println("Enter desired quantity: ");
			  quantity = sc.nextInt();
			  total = total + quantity*Tops;
			  break;
		  case 5://Blazers
			  System.out.println("You have selected Blazers");
			  System.out.println();
			  System.out.println("Enter desired quantity: ");
			  quantity = sc.nextInt();
			  total = total + quantity*Blazers;
			  break;
		  case 6://Jeans
			  System.out.println("You have selected Jeans");
			  System.out.println();
			  System.out.println("Enter desired quantity: ");
			  quantity = sc.nextInt();
			  total = total + quantity*Jeans;
			  break;
		  
		  case 7://exit
			  System.exit(1);
			  break;
			  default:
			  System.out.println("Invalid Selection");
		    }
		  
			System.out.println();
			System.out.print("Do you wish to buy anything else(Y/N)? : ");
			again = sc.next();
			
			//equalsIgnoreCase for comparison
		    if(again.equalsIgnoreCase("Y"))
		    {order();}
		    else if(again.equalsIgnoreCase("N")) {
		    generateBill();
		    System.exit(1);
		    }
		    else {
		    	System.out.println("Invalid choice");
		    }
		    }	
		    }
		  }
		
	


