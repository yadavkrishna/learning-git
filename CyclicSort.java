import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {2,4,1,3,9,6,7,5,};
		System.out.println("Arrays Before sort: "+Arrays.toString(ar));
		cyclicSort(ar);
		System.out.println("\nArrays After Cyclic Sort: "+Arrays.toString(ar));
	}
	//creat method for sort
	static void cyclicSort(int[] a)
	{
		int i=0;
		//loop through array
		while(i<a.length)
		{
			//what is the correct position of elements
			int correctPos=a[i]-1;			/* a[i]= value-1==index */
			
			//check is value/element is at correct pos or not
			if(a[i]!=a[correctPos])
			{
				swap(a, i, correctPos);
			}else {
				// 
				i++;
			}
		}
	}
	static void swap(int[] a, int first, int second)
	{
		int temp=a[first];
		a[first]=a[second];
		a[second]=temp;
	}
	
}
