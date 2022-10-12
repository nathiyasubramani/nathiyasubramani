
package unit;

	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	public class RunTest1 {
		
		@Test// check if FindBig() method returns right results
		
		public void runFindBig()
		{
			//assertequals check if first argument is equal to 2nd
			assertEquals(500,Calculator.findBig(500,200));
		}
		
		@Test //check if FindBig() method returns right results
		public void runFindSmall()
		{
			//assertequals check if first argument is equal to 2nd
			assertEquals(10,Calculator.findSmall(10,20));
		}

	}
	//asserEquals(expected value,actual value)


