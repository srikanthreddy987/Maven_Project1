package Com.Maven.Maven_Project;
import java.util.Scanner;

public class SimpleInterest implements Interest {
	Scanner sc=new Scanner(System.in);
	double PrincipalAmount;
	double NoOfYears;
	double RateOfInterest;
	double InterestAmount;
	SimpleInterest()
	{
		EnterPrincipalAmount();
		EnterInterest();
		EnterNoOfYears();
		CalculateInterest();
		TotalAmount();
	}
	public void EnterInterest()
	{
		System.out.format("Enter Rate ofInterest per Year");
		RateOfInterest=sc.nextDouble();
	}
	public void EnterNoOfYears()
	{
		System.out.format("Enter No Of Years");
		NoOfYears=sc.nextDouble();
	}
	public void EnterPrincipalAmount()
	{
		System.out.format("Enter Principal Amount");
		PrincipalAmount=sc.nextDouble();
	}
	public void CalculateInterest()
	{
		InterestAmount=(PrincipalAmount*RateOfInterest*NoOfYears)/100;
		System.out.format("Interest Amount ="+InterestAmount+"\n");
	}
	public void TotalAmount()
	{
		System.out.format("Total amount after "+NoOfYears+" Years is :"+(PrincipalAmount+InterestAmount)+"\n");
	}

}
