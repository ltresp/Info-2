package main;

public class IsingModel {
  // pruefen ob eine Belegung des Schachbrettes gueltig ist
  public static boolean isValid(boolean[] board, int n) {
	  for (int i = 0; i < board.length; i++)
	  {
		  if (board[i])
		  {
			  //oben
			  boolean oben = true;
			  if (i - n >= 0) oben = !board[i-n]; 
			  //unten
			  boolean unten = true;
			  if (i + n < board.length) unten = !board[i+n]; 	  
			  //links
			  boolean links = true;
			  if (i % n > 0) links = !board[i-1]; 
			  //rechts
			  boolean rechts = true;
			  if (i % n < n-1) rechts = !board[i+1]; 
			  if (!(oben & unten & rechts & links)) return false;
		  }
	  }
	  return true;

  }

  public static void main(String[] args) {
    boolean[] example1 = {
      false, false, false,
      false, true, true,
      true, false, false
    };

    boolean[] example2 = {
      true, false, true,
      false, true, false,
      true, false, false
    };

    System.out.println(isValid(example1, 3));
    System.out.println(isValid(example2, 3));
  }
}
