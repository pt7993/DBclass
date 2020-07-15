package Object;

public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 = " + proverb.length());
		
		s1 = proverb.concat(" never Bites!"); // 기입한 문자와 결합
		s2 = proverb.replace( 'A', 'a'); // 첫번째 문자, 두번째 문자로 치환
		s3 = proverb.substring(2,5); //2~5번째 문자 추출 "bar"
		s4 = proverb.toUpperCase(); //대문자 변환
		
		System.out.printf("%s\n%s\n%s\n%s\n",s1,s2,s3,s4);
	}
}
