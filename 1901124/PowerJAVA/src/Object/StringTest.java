package Object;

public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("���ڿ��� ���� = " + proverb.length());
		
		s1 = proverb.concat(" never Bites!"); // ������ ���ڿ� ����
		s2 = proverb.replace( 'A', 'a'); // ù��° ����, �ι�° ���ڷ� ġȯ
		s3 = proverb.substring(2,5); //2~5��° ���� ���� "bar"
		s4 = proverb.toUpperCase(); //�빮�� ��ȯ
		
		System.out.printf("%s\n%s\n%s\n%s\n",s1,s2,s3,s4);
	}
}
