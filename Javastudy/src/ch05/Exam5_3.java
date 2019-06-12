package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		
		char temp = ' ';
//		1. 배열요소 섞어주기
		for(int i = 1; i <10000; i++) {
			int idx = (int)(Math.random()*nums.length);
			temp = nums[0];
			nums[0] = nums[idx];
			nums[idx] = temp;
			
					

		}
//		 2. 배열요소 꾸며주면서 출력하기
		for(int i =0; i< nums.length; i++) {
			System.out.println(nums[i]+"\t");
			
			if((i+1) %3==0) {
				System.out.println();
			}
		}

			System.out.println(nums);
	}
}