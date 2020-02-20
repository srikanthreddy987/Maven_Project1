package Com.Maven.Maven_Project;
import java.util.Scanner;
//import java.io.PrintStream;
/**
 * Hello world!
 *
 */
public class App 
{ 
	
    public static void main( String[] args )
     {
    	Scanner sc=new Scanner(System.in);
    	System.out.format("Choose which program to run:\n1.Interest\n2.House Construction Cost\n");
        int ch=sc.nextInt();
        if(ch==1)
        {
    	   CalcInterest a=new CalcInterest();
        }
        else if(ch==2)
        {
        	HouseCost a=new HouseCost();
        }
        else
        {
        	System.out.format("Invalid Input\n");
        }
        sc.close();
    }
}
