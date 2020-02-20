package Com.Maven.Maven_Project;
import java.util.Scanner;
public class HouseCost {
       Scanner sc=new Scanner(System.in);
        double sqfeet;
        HouseCost()
        {
        	 System.out.format("Enetr No Of Square Feets");
        	 sqfeet=sc.nextDouble();
        	 System.out.format("choose Category of Material\n1.Standard Material\n2.Above Standard <Material\n3.High Standard Material");
        	 int ch=sc.nextInt();
        	 switch(ch)
        	 {
        	 case 1: System.out.format("Total Construction Cost:"+(sqfeet*1200)+"Rs");
        	         break;
        	 case 2: System.out.format("Total Construction Cost:"+(sqfeet*1500)+"Rs");
	                 break;
        	 case 3: System.out.format("Choose fully automated or not:\n1.Fully automated\n2.Not Fully automated");
        	         int x=sc.nextInt();
        	         if(x==1)
        	         {
        	        	 System.out.format("Total Construction Cost:"+(sqfeet*2500)+"Rs");
   
        	         }
        	         else if(x==2)
        	         {
        	        	 System.out.format("Total Construction Cost:"+(sqfeet*1800)+"Rs");
        	         }
        	         else
        	         {
        	        	 System.out.format("Invalid Input");
            	      
        	         }
        	         break;
        	   default:System.out.format("Invalid Input");
        	 }
        	 
        }
}
