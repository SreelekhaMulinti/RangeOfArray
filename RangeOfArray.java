import java.util.*;
public class RangeOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int maxElement = Integer.MIN_VALUE,minElement = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		  //Finding Maximum Element
			maxElement = Math.max(arr[i],maxElement);
		 //Finding Minimum Element
			minElement = Math.min(arr[i],minElement);
		}
		//Difference b/w max and min Elements
		System.out.println(maxElement-minElement);	
	}
}
