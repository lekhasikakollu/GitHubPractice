import java.util.Scanner;

//Program to find the missing element from given array.
public class MissingNumber {

	public static void main(String[] args) {
		int count;
		
		MissingNumber missing=new MissingNumber();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter total number of elements :");
		count=scan.nextInt();
		
		int[] array=new int[count];
		System.out.println("Enter the array of elements : ");
		for(int i=0;i<count-1;i++){
			array[i]=scan.nextInt();
		}
	
		//Calling a method to find missing number
		int missingNumber=missing.findMissing(array,count);
		System.out.println("Number missing from the given list of numbers :"+missingNumber);
		
		
		
		//close scanner
		scan.close();
	}

	int findMissing(int[] array, int count) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int expectdSum=0;
		for(int i:array){
			sum+=i;
		}
		expectdSum=(count*(count+1))/2;
		//System.out.println(expectdSum);
		int missing=expectdSum-sum;
		return missing;
	}

}
