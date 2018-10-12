package bankingTool;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankingGuiTest {

	int amountOfMoney;
	int accountTotal;
	
	BankingGui bankingGui;
	

	@Before
	public void setUp() throws Exception {
		
		bankingGui = new BankingGui();
		
		amountOfMoney = 100;
		
		accountTotal = 1000;
		
		bankingGui.setAccountTotal(accountTotal);		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void deposit() 
	{
		bankingGui.depositMoney(amountOfMoney);
		
		//accountTotal =  bankingGui.getAccountTotal();
		
		assertEquals(accountTotal + amountOfMoney, bankingGui.getAccountTotal());
	}
	
	@Test
	public void withdrawal() 
	{
		bankingGui.withdrawMoney(amountOfMoney);
		
		//accountTotal =  bankingGui.getAccountTotal();
		
		assertEquals(accountTotal - amountOfMoney, bankingGui.getAccountTotal());
	}
	
	@Test
	public void emptyAccount() 
	{
		bankingGui.emptyAccount();

		assertEquals(0, bankingGui.getAccountTotal());
	}

}
