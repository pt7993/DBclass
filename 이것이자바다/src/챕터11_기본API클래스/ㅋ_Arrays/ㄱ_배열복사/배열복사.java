package 챕터11_기본API클래스.ㅋ_Arrays.ㄱ_배열복사;

public class 배열복사 {
	// 배열 복사를 위해 사용할 수 있는 메소드는 copyOf(원본배열, 복사할 길이), copyOf(원본배열, 시작인덱스, 끝인덱스)이다.
	// copyOf() 메소드는 원본 배열의 0번 인덱스에서 복사할 길이만큼 복사한 타겟 배열을 리턴하는데, 
	// 복사할 길이는 원본 배열의 길이보다 커도 되며, 타겟 배열의 길이가 된다. 다음은 arr1[] 배열의 전체 항목을 복사해서 arr2[] 배열을 생성한다.
	
	//	char[] arr1 = { 'J', 'A', 'V', 'A' };
	//	char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	
	// copyOfRange(원본배열, 시작인덱스, 끝인덱스)는 원본 배열의 시작 인덱스에서 끝 인덱스까지 복사할 배열을 리턴한다.
	// 시작 인덱스는 포함되지만, 끝 인덱스는 포함되지 않는다. 다음은 arr1[] 배열 항목 중 1번, 2번 인덱스 항목을 arr2[] 배열의 0번, 1번 인덱스 항목으로 복사
	
	//	char[] arr1 = { 'J', 'A', 'V', 'A' };
	//	char[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
	
	//		원본 배열(arr1)				타겟 배열(arr2)
	//
	//		0	1	2	3			0	1
	//		□	■	■	□			■	■
	//			└───┘				└───┘
	//			  ↓					  ↑
	//			복사항목수2개─────────────┘
	
	// 단순히 배열을 복사할 목적이라면 Arrays 클래스를 사용하지 않고 System.arraycopy() 메소드를 이용할 수 있다.
	// System.arraycopy() 메소드는 다음과 같이 5개의 매개값이 필요하다.
	
	//	System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	//					      원본 배열	   원본시작인덱스		타겟배열	      타겟시작인덱스	  복사개수
	
	// 원본 시작 인덱스는 원본 배열에서 복사할 항목의 시작 위치이고, 타겟 시작 인덱스는 타겟 배열에서의 복사 시작 위치를 말한다.
	// 복사 개수는 원본 시작 인덱스에서부터 몇 개의 항목을 복사할 것인지를 말한다. 예를 들어 arraycopy(arr1, 1, arr2, 3, 2)는 다음과 같이 복사된다.
	
	//		원본 배열(arr1)				타겟 배열(arr2)
	//
	//		0	1	2	3			0	1	2	3	4
	//		□	■	■	□			□	□	□	■	■
	//			└───┘							└───┘
	//			  ↓								  ↑
	//			복사항목수2개─────────────────────────┘
}
