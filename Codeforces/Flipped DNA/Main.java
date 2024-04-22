
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sn = new Scanner (System.in);
	int n = sn.nextInt ();
	String X = sn.next ();
	String Y = sn.next ();
	  Map < String, String > pares = new HashMap <> ();
	  pares.put ("A", "T");
	  pares.put ("G", "C");
	  pares.put ("C", "G");
	  pares.put ("T", "A");
	  String[] letrasX = X.split ("");
	  String[] letrasY = Y.split ("");
	boolean res = true;
	for (int i = 0; i < n; i++)
	  {
		if (letrasX[i].equals(letrasY[i]) || letrasY[i].equals(pares.get (letrasX[i])))
		  {
			res = true;
		  }
		else
		  {
			res = false;
			break;
		  }
	  }
	System.out.println (res ? "YES" : "NO");
  }
}
