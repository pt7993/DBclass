package 챕터10_예외처리;

public class ㄱ_Exception_ExceptionClass {
	// 컴퓨터 하드웨어의 오동작 또는 고장으로 인해 응용프로그램 실행 오류가 발생하는 것을 자바에서는 에러(error)라고 한다.
	// 에러는 JVM 실행에 문제가 생겼다는 것이므로 JVM 위에서 실행되는 프로그램을 아무리 견고하게 만들어도 결국 실행 불능이 된다.
	// 개발자는 이런 에러에 대처할 방법이 전혀 없다. 자바에서는 에러 이외에 예외(Exception)라고 부르는 오류가 있다.
	// 예외란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류를 말한다. 예외가 발생되면 프로그램은 곧바로 종료된다는 점에서는 에러와 동일하다.
	// 그러나 예외는 예외 처리(Exception Handling)을 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있다.
	
	// 예외는 두 가지 종류가 있다. 하나는 일반 예외(Exception)이고, 다른 하나는 실행 예외(Runtime Exception)이다.
	// 일반 예외는 컴파일러 체크 예외라고도 하는데, 자바 소스를 컴파일하는 과정에서 예외 처리 코드가 필요한지 검사하기 때문이다. 만약 예외 처리 코드가 없다면 컴파일 오류가 발생한다.
	// 실행 예외는 컴파일하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말한다. 컴파일 시 예외 처리를 확인하는 차이일 뿐, 두 가지 예외는 모두 예외 처리가 필요하다.
	// 자바에서는 예외를 클래스로 관리한다. JVM은 프로그램을 실행하는 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성한다.
	// 그리고 나서 예외 처리 코드에서 예외 객체를 이용할 수 있도록 해준다. 모든 예외 클래스들은 다음과 같이 java.lang.Exception 클래스를 상속받는다.
	
	//											java.lang.Exception
	//				┌───────────────────┬───────────────┴┬──────────────────────┐
	//		java.lang.			java.lang.				...					java.lang.
	//	ClassNotFoundException	InterruptedException						RuntimeException
	//				일반 예외들													실행 예외
	
	// 일반 예외와 실행 예외 클래스를 구별하는 방법은 일반 예외는 Exception을 상속 받지만 RuntimeException울 상속받지 않는 클래스들이고, 실행 예외는 다음과 같이 RuntimeException을 상속받는 클래스들이다.
	// RuntimeException 역시 Exception을 상속받지만, JVM은 RuntimeException을 상속했는지 여부를 보고 실행 예외를 판단한다.
	
	//											java.lang.RuntimeException
	//				┌───────────────────┬───────────────┴───────┬─────────────────────────┐
	//		java.lang				java.lang			java.lang.					...
	//		NullPointerException	ClassCastException	NumberFormatException
	
}
