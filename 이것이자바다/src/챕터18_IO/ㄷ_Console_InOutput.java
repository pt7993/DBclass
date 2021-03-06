package 챕터18_IO;

public class ㄷ_Console_InOutput {
	// 콘솔(Console)은 시스템을 사용하기 위해 키보드로 입력 받고 화면으로 출력하는 소프트웨어를 말한다. 유닉스나 리눅스 운영체제는 터미널(terminal)에 해당하고, Windows 운영체제는 명령 프롬프트에 해당한다.
	// 이클립스에도 Console 뷰가 있는데, 키보드로 직접 입력을 받고 내용을 출력할 수 있다. 자바는 콘솔로부터 데이터를 입력받을 때 System.in을 사용하고, 콘솔에 데이터를 출력할 때 System.out을 사용한다.
	// 그리고 에러를 출력할 때에는 System.err를 사용한다.
	
	//	┌───────────┐							┌───────────────────────────────────┐
	//	│프로그램		│			입력 스트림			│관리자: 명령 프롬프트						│
	//	│		  System.in	←───────────────────├───────────────────────────────────┤
	//	│			│			출력 스트림			│Microsoft Windows [Version 6.0...]	│
	//	│		  System.out ──────────────────→│<C> Copyright ....					│
	//	│			│			에러 스트림			│									│
	//	│		  System.err ──────────────────→│C:\User\Administrator>				│
	//	└───────────┘							└───────────────────────────────────┘
	
			//	System.in Field
	
	// 자바는 프로그램이 콘솔로부터 데이터를 입력받을 수 있도록 System 클래스의 in 정적 필드를 제공하고 있다.
	// System.in은 InputStream 타입의 필드이므로 다음과 같이 InputStream 변수로 참조가 가능하다.
	
	//	InputStream is = System.in;
	
	// 키보드로부터 어떤 키가 입력되었는지 확인 하려면 InputStream의 read() 메소드로 한 바이트를 읽으면 된다. 리턴된 int 값에는 십진수 아스키 코드(Ascii Code)가 들어 있다.
	
	//	int asciiCode = is.read();
	
	// 컴퓨터는 0과 1만을 이해할 수 있다. 그래서 미국표준협회가 컴퓨터에서 문자를 숫자로 매칭하는 방법을 표준화시킨 것이 아스키 코드이다.
	// 아스키 코드는 1byte로 표현되는 256가지의 숫자에 영어 알파벳, 아라비아 숫자, 특수 기호를 매칭하고 있다. 만약 키보드에서 a를 입력하고 Enter키를 눌렀다면 a키의 97번과 Enter키의 13, 10번이 차례대로 읽혀진다.
	// Enter키는 캐리지 리턴(carriage return:13)과 라인 피드(line feed:10) 코드가 결합된 키라고 볼 수 있다.
	// 숫자로된 아스키 코드 대신에 키보드에서 입력한 문자를 직접 얻고 싶다면 read() 메소드로 읽은 아스키 코드를 char로 타입 변환하면 된다.
	
	//	char inputChar = (char) is.read();
	
	// 예를 들어 read() 메소드로 읽은 아스키 코드 97번을 다음과 같이 char 타입으로 변환하면 'a'문자를 얻을 수 있다.
	
	//	char inputChar = (char) 97;
	//		 └───────┘		
	//			'a'
	
	// 다음은 현금 자동 입출금기인 ATM(Automatic Teller Machine)과 비슷하게 사용자에게 메뉴를 제공하고 사용자가 어떤 번호를 입력했는지 알아내는 예제이다.
	
	// InputStream의 read() 메소드는 1바이트만 읽기 때문에 1바이트의 아스키 코드로 표현되는 숫자, 영어, 특수문자는 프로그램에서 잘 읽을 수 있지만,
	// 한글과 같이 2바이트를 필요로 하는 유니코드는 read() 메소드로 읽을 수 없다. 키보드로 입력된 한글을 얻기 위해서는 우선 read(byte[] b)나 read(byte[] b, int off, int len) 메소드로
	// 전체 입력된 내용을 바이트 배열로 받고, 이 배열을 이용해서 String 객체를 생성하면 된다. read(byte[] b) 메소드를 사용하기 전에 우선 키보드에서 입력한 문자를 저장할 바이트 배열을 만들어야 한다.
	// 바이트 배열의 길이는 읽어야 할 바이트 수를 고려해서 적절히 주면 되는데, 영어 한 문자는 1바이트, 한글 한 문자는 2바이트를 차지하므로 최대 영문자 15자 또는 한글 7자를 저장하려면 다음과 같이 바이트 배열을 선언하면 된다.
	
	//	byte[] byteData = new byte[15];
	//
	//				  0   1   2	  3   4   5   6   7   8   9  11  12  13  14  
	//				┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐		
	//	byteData ─→	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│
	//				└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
	
	// 다음과 같이 생성된 배열을 read(byte[] b) 메소드의 매개값으로 주면 키보드에서 입력한 문자를 저장할 수 있게 된다.
	
	//			┌───────────────────────────┐
	//	byte[] byteData = new byte[15];		↓
	//	int readByteNo = System.in.read(byteData);
	//		└────────┘
	//		읽은 바이트 수
	
	// read(byte[] b) 메소드는 매개값으로 주어진 바이트 배열에 읽은 문자를 저장하고, 실제로 읽은 바이트 개수를 리턴한다.
	// read(byte[] b) 메소드가 동작하는 방법을 다음을 통해 이해해보자. 키보드에서 "Java"라고 입력하고 Enter 키를 누르면 바이트 배열에 저장되는 값과 리턴값은 다음과 같다.
	
	//					readByteNo = 6 (읽은 바이트 수)
	//				┌───────────────────────┐
	//				  0   1   2	  3   4   5   6   7   8   9  11  12  13  14  
	//				┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
	//	byteData →	│74	│97	│118│97	│13	│10	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│ 0	│
	//				└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
	//				  ↑   ↑   ↑   ↑   ↑   ↑
	//				  │   │   │   │   └─┬─┘
	//				  │   │   │   │     │			[참고]
	//				┌───┬───┬───┬───┬───────┐		Enter 키 = 캐리지리턴(13) + 라인피드(10)
	//	키보드		│ J	│ a	│ v	│ a	│ Enter	│
	//				└───┴───┴───┴───┴───────┘
	
	// 프로그램에서 바이트 배열에 저장된 아스키 코드를 사용하려면 문자열로 변환해야 한다. 변환할 문자열은 바이트 배열의 0번 인덱스에서 시작해서 읽은 바이트 수 -2 만큼이다.
	// 2를 빼는 이유는 Enter키에 해당하는 마지막 두 바이트를 제외하기 위해서이다. 바이트 배열을 문자열로 변환할 때에는 다음과 같이 String 클래스의 생성자를 이용한다.
	
	//	String strData = new String( byteData, 0, readByteNo - 2 );
	//								 └──────┘  ↑  └────────────┘
	//								   바이트 배열      │	읽은 바이트 수 - 2
	//										시작 인덱스
	
	// 다음은 이름과 하고 싶은 말을 ㅣ보드로 입력받아 다시 출력하는 예제이다.
	
	//		실행결과
	//
	//	이름: 홍길동	────────────────┬───→	Console 뷰에서 직접 입력	
	//	하고 싶은 말: 동에 번쩍 서에 번쩍	────┘
	//	입력한 이름: 홍길동
	//	입력한 하고 싶은 말: 동에 번쩍 서에 번쩍
	
			//	System.out Field
	
	// 콘솔에 입력된 데이터를 System.in으로 읽었다면, 반대로 콘솔로 데이터를 출력하기 위해서는 System 클래스의 out 정적 필드를 사용한다.
	// out은 PrintStream 타입의 필드이다. PrintStream은 나중에 설명하기로 하고, 여기서는 PrintStream이 OutputStream의 하위 클래스이므로
	// out 필드를 OutputStream 타입으로 변환해서 사용할 수 있다는 것만 알아두자.
	
	//	OutputStream os = System.out;
	
	// 콘솔로 1개의 바이트를 출력하려면 OutputStream의 write(int b) 메소드를 이용하면 된다. 이때 바이트 값은 아스키 코드인데,
	// write() 메소드는 아스키 코드를 문자로 콘솔에 출력한다. 예를 들어 아스키 코드 97번을 write(int b) 메소드로 출력하면 'a'가 출력된다.
	
	//	byte b = 97;
	//	os.write(b)
	//	os.flush();
	
	// OutputStream의 write(int b) 메소드는 1바이트만 보낼 수 있기 때문에 1바이트 표현 가능한 숫자, 영어, 특수문자는 출력이 가능하지만, 2바이트로 표현되는 한글은 출력할 수 없다.
	// 한글을 출력하기 위해서는 우선 한글을 바이트 배열로 얻은 다음, write(byte[] b)나 write(byte[] b, int off, int len) 메소드로 콘솔에 출력하면 된다.
	
	//	String name = "홍길동"
	//	byte[] nameBytes = name.getBytes();
	//	os.write(nameBytes);
	//	os.flush();
	
	// 다음은 write(int b) 메소드를 사용해서 연속된 숫자, 영어를 출력하고 write(byte[] b) 메소드를 사용해서 한글을 출력한 예제이다.
	
	// System 클래스의 out 필드를 OutputStream 타입으로 변환해서 콘솔에 출력하는 작업은 그리 편하지 않다.
	// out은 원래 PrintStream 타입의 필드이므로 PrintStream의 print() 또는 println() 메소드를 사용하면 좀 더 쉬운 방법으로 다양한 타입의 데이터를 콘솔에 출력할 수 있다.
	
	//	PrintStream ps = System.out;	┬───→ System.out.println(...);
	//	ps.println(...);	────────────┘
	
	// 우리는 지금까지 이 방법으로 콘솔에 데이터를 출력해왔다. PrintStream에 대해서는 보조 스트림에서 자세한 설명이 나오므로 여기서는 이 정도만 알고 넘어가도록 하자.
	
			//	Console Class
	
	// 자바 6부터는 콘솔에서 입력받은 문자열을 쉽게 읽을 수 있도록 java.io.Console 클래스를 제공하고 있다.
	// Console 객체를 얻기 위해서는 System의 정적 메소드인 console()을 다음과 같이 호출하면 된다.
	
	//	Console console = System.console();
	
	// 주의할 점은 이클립스에서 실행하면 System.console() 메소드는 null을 리턴하기 때문에 반드시 명령 프롬프트에서 실행해야 한다.
	// Console 클래스에서 읽기 메소드는 다음과 같다.
	
	//	리턴 타입		메소드				설명
	//
	//	String		readLine()			Enter키를 입력하기 전의 모든 문자열을 읽음
	//
	//	char[]		readPassword()		키보드 입력 문자를 콘솔에 보여주지 않고 문자열을 읽음
	
	// 다음은 콘솔로부터 아이디와 패스워드를 입력받아 출력하는 예제이다.
	
	// ConsoleExample 클래스를 실행하려면 명령 프롬프트(cmd)를 열고 ConsoleExample 클래스의 패키지가 시작하는 디렉토리로 이동한 다음, 다음과 같이 java 명령어를 사용해야 한다.
	
	//	C:\~> cd	C:\Users\PC\eclipse-workspace\이것이자바다\bin
	//	C:\Users\PC\eclipse-workspace\이것이자바다\bin> java 챕터18_IO.ㄷ3_ConsoleExample
	
	// 아이디를 키보드로 입력할 때에는 입력 문자가 에코(echo) 출력이 되지만, 패스워드는 입력 문자가 에코 출력이 되지 않기 때문에 보안상 유리하다.
	
	//	┌───────────────────────────────────────────────────────────────────────────┐
	//	│관리자: 명령 프롬프트																│
	//	├───────────────────────────────────────────────────────────────────────────┤
	//	│Microsoft Windows [Version 10.0.17763.1039]								│
	//	│(c) 2018 Microsoft Corporation. All rights reserved.						│
	//	│																			│
	//	│C:\Users\PC>cd C:\Users\PC\eclipse-workspace\이것이자바다\bin					│
	//	│																			│
	//	│C:\Users\PC\eclipse-workspace\이것이자바다\bin> java 챕터18_IO.ㄷ3_ConsoleExample│
	//	│아이디: angel																│
	//	│패스워드:																		│
	//	│────────────																│
	//	│angel																		│
	//	│123																		│
	//	└───────────────────────────────────────────────────────────────────────────┘
	
			//	Scanner Class
	
	// Console 클래스는 콘솔로부터 문자열은 읽을 수 있지만 기본 타입(정수, 실수) 값을 바로 읽을 수는 없다. java.io 패키지의 클래스는 아니지만,
	// java.util 패키지의 Scanner 클래스를 이용하면 콘솔로부터 기본 타입의 값을 바고 읽을 수 있다.	
	// Scanner 객체를 생성하려면 다음과 같이 생성자에 System.in 매개값을 주면 된다.
	
	//	Scanner scanner = new Scanner(System.in);
	
	// Scanner가 콘솔에만 사용되는 것은 아니고,  생성자 매개값에는 File, InputStream, Path 등과 같이 다양한 입력 소스를 지정할 수도 있다.
	// Scanner는 기본 타입의 값을 읽기 위해 다음과 같은 메소드를 제공한다.
	
	//	리턴 타입		메소드				설명
	//
	//	boolean		nextBoolean()		boolean(true/false) 값을 얻는다.
	//	byte		nextByte()			byte 값을 얻는다.
	//	short		nextShort()			short 값을 얻는다.
	//	int			nextInt()			int 값을 얻는다.
	//	long		nextLong()			long 값을 얻는다.
	//	float		nextFloat()			float 값을 얻는다.
	//	double		nextDouble()		double 값을 얻는다.
	//	String		nextString()		String 값을 얻는다.
	
	// 위 메소드들은 콘솔에서 데이터를 입력한 후 Enter키를 누르면 동작하도록 되어 있다. 다음 예제는 콘솔로부터 문자열, 정수, 실수를 직접 읽고 다시 콘솔로 출력한다.
	
}
