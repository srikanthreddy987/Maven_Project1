package Com.Maven.Maven_Project;
import java.util.Scanner;


public class CalcInterest {
      Scanner sc=new Scanner(System.in);
      CalcInterest()
      {
    	  System.out.println("Select type of Interest\n1.Simple Interest\n2.Compound Interest");
    	  int x=sc.nextInt();
    	  if(x==1)
    	  {
    		  SimpleInterest a=new SimpleInterest();
    	  }
    	  else if(x==2)
    	  {
    		  CompoundInterest b=new CompoundInterest();
    	  }
    	  else
    		  System.out.format("Invalid Input");
      }
}
