package OnlineBookStore;
import java.util.Scanner;
public class Order	{
	    public static Scanner input = new Scanner(System.in);
	    public static String again;
	    public static int choose,quantity=1;
	    public static double total=0,pay;
	  public static  String name, Address;
	 		public static Scanner sc = new Scanner(System.in);
	 		
	 
	    public static void menu(){
	    	System.out.println("+======HELLO USER,    WELCOME TO OUR ONLINE BOOK STORE    PLEASE ENTER YOUR NAME TO LOGIN======+: ");
	 		name = sc.nextLine();
	 		
	 		System.out.println("+ ======Please enter your Address======+: ");
	 		Address = sc.nextLine();
	 	
	    	
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t           ORDERING MENU          ");
	    System.out.println("\t\t\t\t   1. THE JUNGLE BOOK---  By:Rudyard Kipling ---  Price Rs.450.00");
	    System.out.println("\t\t\t\t   2. MALGUDI DAYS--- By:RK Narayan---  Price Rs. 400.00");
	    System.out.println("\t\t\t\t   3.THE WINGS OF FIRE--- By:Dr APJ Kalam--- Price Rs. 350.00");
	    System.out.println("\t\t\t\t   4. ANGELS & DEMONS--- By:Dan Brown--- PriceRs. 500.00 ");
	    System.out.println("\t\t\t\t   5. CANCEL purchase      ");
	    System.out.println("\t\t\t\t+====================================+");
	    
	    }
	    
	    public static void order(){
	    	
	        
	    System.out.println("Press 1 for THE JUNGLE BOOK ");
	    System.out.println("Press 2 for MALGUDI DAYS " );
	    System.out.println("Press 3 for THE WINGS OF FIRE");
	    System.out.println("Press 4 for ANGELS & DEMONS");
	    System.out.println("Press 5 to CANCEL YOUR REQUEST");
	    System.out.print("Press you want to buy? :");
	    choose = input.nextInt();
	    //conditions
	    if(choose==1){
	        System.out.println("You have chosen -- THE JUNGLE BOOK--");
	        System.out.print("How many books you want to buy? :");
	        quantity =input.nextInt();
	        total = total +(quantity*450);
	        
	        System.out.println("Do you want to continue shopping? ");
	        System.out.println("Press Y for Yes and N for No : ");
	        again = input.next();
	        if(again.equalsIgnoreCase("Y")){
	            order();//call the method you to create 
	        }else{
	            System.out.println("Enter  your  payment      ******Only cash on delivery is applicable***** ");
	            System.out.println( "Your total purchase amount is :" + total);
	            pay = input.nextDouble();
	            
	            if(pay <total){
	              System.out.println("Not an enough payment");
	              again = input.next();
	              order();
	            }else{
	            System.out.println("Total price is " + total);
	            total = pay-total;
	            System.out.println("The change is " + total);
	        	System.out.println(" Hi  "  +   name   +   "  we will be delivering your order to your address : "   +   Address   +   "  in next 7 days");
	            System.out.println("Thanks for buying....Please visit again");
	            System.out.println("In case if you have recieved  a damaged or wrong product then feel free to contact us on 1800-120-9001, we will reach you for the RETURN");
	            }
	        }
	    }else if(choose==2){
	        System.out.println("You have chosen MALGUDI DAYS ");
	        System.out.print("How many books you want to buy? :");
	        quantity =input.nextInt();
	        total = total +(quantity*400);
	        
	        System.out.println("Do you want to continue shopping? ");
	        System.out.println("Press Y for Yes and N for No : ");
	        again = input.next();
	        if(again.equalsIgnoreCase("Y")){
	            order();//call the method you to create 
	        }else{
	            System.out.println("Enter your payment        ******Only cash on delivery is applicable***** ");
	            System.out.println( "Your total purchase amount is :" + total);
	      
	            pay = input.nextDouble();
	            if(pay <total){
	              System.out.println("Not an enough payment");
	              again = input.next();
	              order();
	            }else{
	            System.out.println("Total price is " + total);
	            total = pay-total;
	            System.out.println("The change is " + total);
	         	System.out.println(" Hi  "  +  name   +  "  we will be delivering your order to your address : "  +   Address   +  "  in next 7 days");

	            System.out.println("Thanks for buying....Please visit again");
	            System.out.println("In case if you have recieved a damaged or wrong product then feel free to contact us on 1800-120-9001, we will reach you for the RETURN");
	            }
	        }
	      }else if(choose==3){
	        System.out.println("You have chosen THE WINGS OF FIRE");
	        System.out.print("How many books you want to buy? :");
	        quantity =input.nextInt();
	        total = total +(quantity*350);
	        
	        System.out.println("Do you want to continue shopping? ");
	        System.out.println("Press Y for Yes and N for No : ");
	        again = input.next();
	        if(again.equalsIgnoreCase("Y")){
	            order();//call the method you to create 
	        }else{
	            System.out.println("Enter your payment          ******Only cash on delivery is applicable***** ");
	            System.out.println( "Your total purchase amount is :" + total);
	    
	            pay = input.nextDouble();
	            if(pay <total){
	              System.out.println("Not enough payment");
	              again = input.next();
	              order();
	            }else{
	            System.out.println("Total price is " + total);
	            total = pay-total;
	            System.out.println("The change is " + total);
	         	System.out.println(" Hi  "  +   name   +  "  we will be delivering your order to your address : "  +   Address   +  "  in next 7 days");

	            System.out.println("Thanks for buying....Please visit again");
	            System.out.println("In case of if you have recieved a damaged or wrong product then feel free to contact us on 1800-120-9001, we will reach you for the RETURN");
	            }
	        }  }else if(choose==4){
	            System.out.println("You have chosen ANGELS & DEMONS");
	            System.out.print("How many books you want to buy? :");
	            quantity =input.nextInt();
	            total = total +(quantity*500);
	            
	            System.out.println("Do you want to continue shopping? ");
	            System.out.println("Press Y for Yes and N for No : ");
	            again = input.next();
	            if(again.equalsIgnoreCase("Y")){
	                order();//call the method you to create 
	            }else{
	                System.out.println("Enter your payment         ******Only cash on delivery is applicable***** ");
	                System.out.println( "Your total purchase amount is :" + total);
	            
	                pay = input.nextDouble();
	                if(pay <total){
	                  System.out.println("Not an enough payment");
	                  again = input.next();
	                  order();
	                }else{
	                System.out.println("Total price is " + total);
	                total = pay-total;
	                System.out.println("The change is " + total);
	             	System.out.println(" Hi  "  +   name   +  "  we will be delivering your order to your address : "    +   Address   +  "  in next 7 days");

	                System.out.println("Thanks for buying....Please visit again");
	                System.out.println("In case of if you have recieved a damaged or wrong product then feel free to contact us on 1800-120-9001, we will reach you for the RETURN");
	            
	                
	                }
	                
	            }
	    }else if(choose==5){
	        System.exit(0);//close program
	    }else{
	        System.out.println("Choose 1 to 5 only!");
	        order();
	    }
	    }
	    public static void main(String[] args) {
	       menu();
	       order();
	    } 
	    }
