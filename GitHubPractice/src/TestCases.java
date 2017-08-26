import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
  @Test
  public void testMissingNumber() {
	  MissingNumber missing=new MissingNumber();
	  
	  int[] arr={1,2,3,5,6};
	  int count=6;
	  int expected=4;
	  int response=missing.findMissing(arr,count);
	  Assert.assertEquals(expected,response);
  }
  
  @Test
  public void testMissingNumber2(){
MissingNumber missing=new MissingNumber();
	  
	  int[] arr={1,2,3,4,5,6};
	  int count=6;
	  int expected=0;
	  int response=missing.findMissing(arr,count);
	  Assert.assertEquals(expected,response);
  }
}
