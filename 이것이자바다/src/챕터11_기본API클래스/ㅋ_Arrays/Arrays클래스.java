package 챕터11_기본API클래스.ㅋ_Arrays;

public class Arrays클래스 {
	// Arrays 클래스는 배열 조작 기능을 가지고 있다. 배열 조작이란 배열의 복사, 항목 정렬, 항목 검색과 같은 기능을 말한다.
	// 단순한 배열 복사는 System.arraycopy() 메소드를 사용할 수 있으나, Arrays는 추가적으로 항목 정렬, 항목 검색, 항목 비교와 같은 기능을 제공한다.
	// 다음은 Arrays 클래스가 가지고 있는 메소드들이다. 메소드 이름만 보면 어떤 기능을 제공하는지 쉽게 알 수 있다.
	// Arrays 클래스의 모든 메소드는 정적(static)이므로 Arrays 클래스로 바로 사용이 가능하다.
	
	//	리턴 타입		메소드 이름						설명
	
	//	int			binartSearch(배열, 찾는값)		전체 배열 항목에서 찾는 값이 있는 인덱스 리턴
	
	//	타겟 배열		copyOf(원본 배열, 복사할 길이)		원본 배열의 0번 인덱스에서 복사할 길이만큼 복사할 배열 리턴, 
	//											복사할 길이는 원본 배열의 길이보다 커도 되며, 타겟 배열의 길이가 된다.
	
	//	타겟 배열		copyOfRange(원본 배열,			원본 배열의 시작 인덱스에서 끝 인덱스까지 복사한 배열 리턴
	//					시작인덱스, 끝인덱스)
	
	//	boolean		deepEquals(배열, 배열)			두 배열의 깊은 비교(중첩 배열의 항목까지 비교)
	
	//	boolean		equals(배열, 배열)				두 배열의 얕은 비교(중첩 배열의 항목은 비교하지 않음)
	
	//	void		fill(배열, 값)				전체 배열 항목에 동일한 값을 저장
	
	//	void		fill(배열, 시작인덱스, 끝인덱스)	시작 인덱스부터 끝 인덱스까지의 항목에만 동일한 값을 저장
	
	//	void		sort(배열)					배열의 전체 항목을 오름차순으로 정렬
	
	//	String		toString(배열)				"[값1, 값2, ...]"와 같은 문자열 리턴
	
}
