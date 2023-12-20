import java.util.Scanner;

 
class BookMyshow
{
  
void movies ()
  {
    
System.out.println ("The Movies are Available Are: ");
    
System.out.println ("1. Animal -------- Rs.160 (Genre: Action)");
    
System.out.println ("2. Ready Player One - Rs.150 (Genre: Sci-Fi)");
    
System.out.println ("3. Stuart Little ---- Rs.120 (Genre: Comedy)");
    
System.out.println ("4. Housefull 2 ----- Rs.160 (Genre: Comedy)");
    
System.out.println ("5. Hulchul --------- Rs.140 (Genre: Comedy)");
    
System.out.println ("6. Phir Hera Pheri -- Rs.150 (Genre: Comedy)");

} 
} 
 
class Theatre extends BookMyshow

{
  
private String selectedTheatre;
  
 
void bookTicket (String movieName, double ticketPrice,
		      String movieCategory)
  {
    
Scanner scanner = new Scanner (System.in);
    
 
System.out.println ("Enter the number of tickets to be booked:");
    
int ticketsToBook = scanner.nextInt ();
    
 
if (ticketsToBook <= 0)
      {
	
System.out.println ("Invalid number of tickets. Exiting booking.");
	
return;
      
}
    
 
System.out.
      println ("For confirmation to book for this movie, press 1:");
    
int confirmation = scanner.nextInt ();
    
 
if (confirmation == 1)
      {
	
System.out.
	  println ("******************************************************");
	
System.out.println ("Theatre Booked: " + selectedTheatre);
	
System.out.println ("Movie Name: " + movieName);
	
System.out.println ("Movie Category: " + movieCategory);
	
System.out.println ("Number of Tickets: " + ticketsToBook);
	
System.out.println ("Cost of ticket: Rs." + ticketPrice);
	
System.out.println ("Total Cost: Rs." +
			     (ticketsToBook * ticketPrice));
	
System.out.
	  println ("******************************************************");
	
 
String paymentMethod =
	  performPayment (ticketsToBook * ticketPrice);
	
 
displayReceipt (selectedTheatre, movieName, movieCategory,
			   ticketsToBook, ticketPrice,
			   ticketsToBook * ticketPrice, paymentMethod);
	
 
collectReview ();
      
}
    
 
scanner.close ();
  
}
  
 
private String performPayment (double amount)
  {
    
System.out.println ("Select payment method:");
    
System.out.println ("1. p3 Credit Card");
    
System.out.println ("2. p3 Debit Card");
    
System.out.println ("3. p Net Banking");
    
System.out.println ("4. p1 PhonePe");
    
System.out.println ("5. p? PayPal");
    
System.out.println ("6. p0 Paytm");
    
 
Scanner scanner = new Scanner (System.in);
    
int paymentMethod = scanner.nextInt ();
    
 
switch (paymentMethod)
      {
      
case 1:
	
System.out.println ("Processing Credit Card payment...");
	
break;
      
case 2:
	
System.out.println ("Processing Debit Card payment...");
	
break;
      
case 3:
	
System.out.println ("Processing Net Banking payment...");
	
break;
      
case 4:
	
System.out.println ("Processing PhonePe payment...");
	
break;
      
case 5:
	
System.out.println ("Processing PayPal payment...");
	
break;
      
case 6:
	
System.out.println ("Processing Paytm payment...");
	
break;
      
default:
	
System.out.println ("Invalid payment method. Exiting program.");
	
return null;
      
}
    
 
System.out.
      println ("Payment successful! Thank you for booking ticket.");
    
 
return getPaymentMethod (paymentMethod);
  
}
  
 
private void displayReceipt (String theatreName, String movieName,
				  String movieCategory, int tickets,
				  double ticketPrice, double totalCost,
				  String paymentMethod)
  {
    
System.out.println ("\n*********** Receipt ************");
    
System.out.println ("Theatre: " + theatreName);
    
System.out.println ("Movie: " + movieName);
    
System.out.println ("Movie Category: " + movieCategory);
    
System.out.println ("Number of Tickets: " + tickets);
    
System.out.println ("Cost per Ticket: Rs." + ticketPrice);
    
System.out.println ("Total Cost: Rs." + totalCost);
    
System.out.println ("Payment Method: " + paymentMethod);
    
System.out.println ("****************************************\n");
  
} 
 
void theatres ()
  {
    
System.out.println ("The Theatres available are: ");
    
System.out.println ("1. Rang Mahal Theatre");
    
System.out.println ("2. Sangam Cineplex");
    
System.out.println ("3. Jyoti Cineplex");
  
} 
 
void moviesInCategory (String category)
  {
    
System.out.println ("Movies in Category " + category + ": ");
    
switch (category.toLowerCase ())
      {
      
case "action":
	
System.out.println ("1. Animal - Rs.160");
	
break;
      
case "sci-fi":
	
System.out.println ("2. Ready Player One - Rs.150");
	
break;
      
case "comedy":
	
System.out.println ("3. Stuart Little - Rs.120");
	
System.out.println ("4. Housefull 2 - Rs.160");
	
System.out.println ("5. Hulchul - Rs.140");
	
System.out.println ("6. Phir Hera Pheri - Rs.150");
	
break;
      
default:
	
System.out.println ("No movies found in the specified category.");
	
break;
      
}
  
}
  
 
void selectTheatre (int theatreChoice)
  {
    
switch (theatreChoice)
      {
      
case 1:
	
selectedTheatre = "Rang Mahal Theatre";
	
break;
      
case 2:
	
selectedTheatre = "Sangam Cineplex";
	
break;
      
case 3:
	
selectedTheatre = "Jyoti Cineplex";
	
break;
      
default:
	
System.out.println ("Invalid theatre choice. Exiting program.");
	
break;
      
}
  
}
  
 
private void collectReview ()
  {
    
Scanner scanner = new Scanner (System.in);
    
System.out.println ("Please rate your experience (1 to 5 stars):");
    
int rating = scanner.nextInt ();
    
 
if (rating >= 1 && rating <= 5)
      {
	
System.out.println ("Thank you for your review! Your rating: " +
			     rating + " stars" + "\n" +
			     "Have a Good Time !!");
      
}
    else
      {
	
System.out.println ("Invalid rating. Thank you for your booking!");
      
}
  
}
  
 
private String getPaymentMethod (int paymentMethod)
  {
    
switch (paymentMethod)
      {
      
case 1:
	
return "Credit Card p3";
      
case 2:
	
return "Debit Card p3";
      
case 3:
	
return "Net Banking p";
      
case 4:
	
return "PhonePe p1";
      
case 5:
	
return "PayPal p?";
      
case 6:
	
return "Paytm p0";
      
default:
	
return null;
      
}
  
}

}


 
public class MovieTickettBookingSystem
{
  
public static void main (String[]args)
{

Scanner scanner = new Scanner (System.in);
    
System.out.println("\nWelcome User!!\n");
System.out.println ("Enter Your Email: ");
    
String Email  = scanner.nextLine ();
    
System.out.println ("Password: ");
    
String Password = scanner.nextLine ();
System.out.println("\nUser Successfully Registered !!\n");
    
BookMyshow ob = new BookMyshow ();
    
Theatre a = new Theatre ();
    
 
System.out.
      println
      ("===========================================================\n");
    
System.out.
      println
      ("1.List of movies and Their prices \n2.To Access and Book tickets through Theater");
    
 
System.out.
      println
      ("\n===========================================================");
    
int choice = scanner.nextInt ();
    
 
switch (choice)
      {
      
case 1:
	
ob.movies ();
	
break;
      
case 2:
	
a.theatres ();
	
System.out.println ("Select a theatre (1 to 3):");
	
int theatreChoice = scanner.nextInt ();
	
a.selectTheatre (theatreChoice);
	
 
System.out.
	  println ("Enter a movie category (Action, Sci-Fi, Comedy):");
	
String category = scanner.next ();
	
a.moviesInCategory (category);
	
 
System.out.println ("Select a movie to book (1 to 6):");
	
int movieChoice = scanner.nextInt ();
	
switch (movieChoice)
	  {
	  
case 1:
	    
a.bookTicket ("Animal", 160, "Action");
	    
break;
	  
case 2:
	    
a.bookTicket ("Ready Player One", 150, "Sci-Fi");
	    
break;
	  
case 3:
	    
a.bookTicket ("Stuart Little", 120, "Comedy");
	    
break;
	  
case 4:
	    
a.bookTicket ("Housefull 2", 160, "Comedy");
	    
break;
	  
case 5:
	    
a.bookTicket ("Hulchul", 140, "Comedy");
	    
break;
	  
case 6:
	    
a.bookTicket ("Phir Hera Pheri", 150, "Comedy");
	    
break;
	  
default:
	    
System.out.println ("Invalid movie choice. Exiting program.");
	    
break;
	  
}
	
break;
      
default:
	
System.out.println ("Invalid choice. Exiting program.");
	
break;
      
}
    
 
scanner.close ();
  
 
}

}


