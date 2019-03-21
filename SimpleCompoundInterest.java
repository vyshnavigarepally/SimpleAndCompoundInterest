package simplecompoundinterest;

public class SimpleCompoundInterest 
{
	float principle,rateofinterest,timeperiod;
	/**
	 * constructor which initializes principle,rateofinterest,timeperiod
	 * @param principle
	 * @param rateofinterest
	 * @param timeperiod
	 */
	public SimpleCompoundInterest(float principle,float rateofinterest,float timeperiod)
	{
		 this.principle=principle;
		 this.rateofinterest=rateofinterest;
		 this.timeperiod=timeperiod;
	}
	/**
	 * function to calculate simple interest
	 * @return simpleinterest
	 */
    public double calculateSimpleInterest()
    {
    	return(( principle*rateofinterest*timeperiod)/100);
    }
    
    /**
     * function to calculate compound interest
     * @return compoundinterest
     */
    public double calculateCompoundInterest()
    {
    	return principle*Math.pow(((1+rateofinterest)/100),timeperiod);
    }
}
