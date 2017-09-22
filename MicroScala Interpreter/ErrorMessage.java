// Author: Abhinav Bhandaram.
// CSE Machine: cse01.cse.unt.edu
// ErrorMessage class
// This class prints error messages.
// Class used to handle errors.
public class ErrorMessage {

  public static void print (String message) {
    System . out . println ("***** Error: " + message + " *****");
    System . exit (0);
  }

  public static void print (int position, String message) {
    System . out . println ("");
    for (int i = 0; i < position; i++) 
      System . out . print (" ");
    System . out . println ("^");
    print (message);
  }

}
