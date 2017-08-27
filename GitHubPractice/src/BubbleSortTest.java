import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {
  
	@Test
    public void testBubbleSort() {
	  int[] expected={1,2,3,4,5};
	  int[] input={5,1,4,2,3};
	  
	  BubbleSort object=new BubbleSort();
	  int[] result=object.sort(input);
	  Assert.assertEquals(result, expected);
	}
	@Test
    public void testBubbleSort2() {
	  int[] expected={1,11,14,23,45,89,90};
	  int[] input={11,45,89,23,1,90,14};
	  
	  BubbleSort object=new BubbleSort();
	  int[] result=object.sort(input);
	  Assert.assertEquals(result, expected);
	}
	@Test
    public void testBubbleSort3() {
	  int[] expected={25,35,45,55,65,75};
	  int[] input={25,35,45,55,65,75};
	  
	  BubbleSort object=new BubbleSort();
	  int[] result=object.sort(input);
	  Assert.assertEquals(result, expected);
	}
}
