package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int[] scores = {10,20,30,40,50,60,70,10,20,30,40,50,60,70,10,20,30,40,50,60,70,10,20,30,40,50,60,70,999};
		
		int last = scores[ scores.length - 1];
		
		int[] arr = new int[5];
		arr[3]=300;
		
		for (int i =0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[3]);
//		System.out.println(arr[9]);
 }
}
