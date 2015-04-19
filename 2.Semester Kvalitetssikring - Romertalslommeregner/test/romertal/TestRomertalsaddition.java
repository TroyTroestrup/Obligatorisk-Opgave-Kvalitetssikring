package romertal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRomertalsaddition {

	@Test //Testcase 1)
	public void testMCCXVIIPlusDCCCCLXIEqualsMMCLXXVIII() {
				//3. Setup
				Romertalsaddition romertalsaddition;
				
				//2. Execution
				romertalsaddition = new Romertalsaddition( "MCCXVII", "DCCCCLXI" );
				
				//1. Verification
				assertEquals( "MMCLXXVIII", romertalsaddition.add() );
				
				//4. Teardown
	}
	
	@Test //Testcase 2)
	public void testIPlusMMMMDCCCCLXXXXVIIIIEqualsUgyldigtTalException() {
				//3. Setup
				Romertalsaddition romertalsaddition;
				
				//2. Execution
				romertalsaddition = new Romertalsaddition( "I", "MMMMDCCCCLXXXXVIIII" );
				
				//1. Verification

				
				//4. Teardown
	}


}
