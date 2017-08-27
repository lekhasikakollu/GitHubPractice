import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj=new BubbleSort();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int num=scan.nextInt();
		int[] array=new int[num];
		System.out.println("Enter the elements of the array :");
		
		for(int i=0;i<num;i++){
			array[i]=scan.nextInt();
		}
		
		System.out.println("Before sorting :");
		obj.printArray(array);
		
		int[] resultArray=obj.sort(array);
		System.out.println("Sorted array :");
		obj.printArray(resultArray);
		scan.close();

	}

	 void printArray(int[] resultArray) {
		for(int i:resultArray){
			System.out.print(i+" ");
		}
		
	}

	int[] sort(int[] array) {
		boolean swapped;
		int temp;
		 int n=(array.length);
		 for(int i=0;i<n-1;i++){
			 swapped=true;
			 for(int j=0;j<n-i-1;j++){
				 if(array[j]>array[j+1]){
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				 }
			 }
			 if(swapped==false)
				 break;
			 
		 }
		return array;
	}

}
