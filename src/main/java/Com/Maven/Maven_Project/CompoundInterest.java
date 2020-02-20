package Com.Maven.Maven_Project;

public class CompoundInterest extends SimpleInterest{
	   double NoOfTimes;
	   double Total_Amount;
      CompoundInterest()
      {
    	  EnterPrincipalAmount();
  		  EnterInterest();
  		  EnterNoOfYears();
  		  CalculateInterest();
  		  TotalAmount();
      }
      public void EnterNoOfTimes()
      {
    	  System.out.format("Enter No Of times interest is computed anually");
    	  NoOfTimes=sc.nextInt();
      }
      public void CalculateInterest()
      {
    	  EnterNoOfTimes();
    	  Total_Amount=PrincipalAmount;
    	  for(int i=1;i<=NoOfTimes*NoOfYears;i++)
    	  {
    		  Total_Amount=Total_Amount*(1+(RateOfInterest/(100*NoOfTimes)));
    	  }
    	  InterestAmount=Total_Amount-PrincipalAmount;
  		  System.out.format("Interest Amount ="+InterestAmount+"\n");
      }
      public void TotalAmount()
  	 {
  	 	System.out.format("Total amount after "+NoOfYears+" Years is :"+Total_Amount+"\n");
  	 }
      
}
