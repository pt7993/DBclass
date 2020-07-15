package 챕터05_참조타입;

public class Question01_MaxNumber {
	public static void main(String[] args) {
		
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for(int compare : array) {
			if(compare >= max)
				max = compare;
		}
		
		System.out.println("max = " + max);
		
	}
}
