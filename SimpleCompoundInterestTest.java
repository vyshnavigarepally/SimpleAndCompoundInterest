package simplecompoundinterest;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCompoundInterestTest {

	@Test
	public void simpleInterestTest() 
	{
		SimpleCompoundInterest sit;
		sit=new SimpleCompoundInterest(20202,2.5f,3);
		assertEquals(1515.1500244,sit.calculateSimpleInterest());
		sit=new SimpleCompoundInterest(20202,2.5f,5);
		assertEquals(2525.25,sit.calculateSimpleInterest());
	}
	@Test
	public void compoundInterestTest()
	{
		SimpleCompoundInterest cit;
		cit=new SimpleCompoundInterest(20202,2.5f,3);
		assertEquals(21755.342888,cit.calculateCompoundInterest());
		cit=new SimpleCompoundInterest(20202,2.5f,5);
		assertEquals(22856.706058,cit.calculateCompoundInterest());
	}

}
