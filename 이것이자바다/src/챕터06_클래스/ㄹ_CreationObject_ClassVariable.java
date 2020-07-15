package 챕터06_클래스;

public class ㄹ_CreationObject_ClassVariable {
	// 클래스로부터 객체를 생성하는 방법은 다음과 같이 new 연산자를 사용하면 된다.
	
	// new 클래스();
	
	// new는 클래스로부터 객체를 생성시키는 연산자이다. new 연산자 뒤에는 생성자가 오는데, 생성자는 클래스 () 형태를 가지고있다.
	// new 연산자로 생성된 객체는 메모리 힙(heap) 영역에 생성된다. 생성 후, 객체의 주소를 리턴하도록 되어있다.
	// 이 주소를 참조하는 타입인 클래스 변수에 저장해 두면, 변수를 통해 객체를 사용할 수 있다. 다음은 클래스 타입으로 선언된 변수에 new 연산자가 리턴한 객체의 주소를 저장하는 코드이다.
	
	// 클래스 변수;
	// 변수 = new 클래스();
	
	// 클래스 변수 선언과 객체 생성을 한 개의 실행문으로 작성할 수도 있다.
	
	// 클래스 변수 = new 클래스();
	
	// 이렇게 new 연산자로 객체를 생성하고 리턴된 객체의 주소를 변수에 저장하면 변수가 객체를 참조하게 된다.
	// 클래스 선언에서부터 생성까지 예제를 통해 익혀 보자. Student 클래스를 선언하고 StudentExample 클래스의 main() 메소드에서 Student 객체를 생성한다.
	
	// 예제가 실행되면 메모리에 클래스 변수와 객체가 생성된다. Student 클래스는 하나지만 new 연산자를 사용한 만큼 객체가 메모리에 생성된다.
	// 이러한 객체들은 Student 클래스의 인스턴스들이다.비록 같은 클래스로부터 생성되었지만 각각의 Student 객체는 자신만의 공유 데이터를 가지면서 메모리에서 활동하게 된다.
	// s1과 s2가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체이다.
	
	// 여기서 하나더 집허야 할 점은 Student와 StudentExample의 클래스에 대한 용도이다.
	// 클래스는 크게 두가지 용도가 있다. 하나는 라이브러리 (API : Application Program Interface) 용이고 다른 하나는 실행용이다.
	// 라이브러리 클래스는 다른 클래스에서 이용할 목적으로 설계한다. 실행 클래스는 프로그램의 실행 진입점인 main() 메소드를 제공하는 역할을 한다.
	// Student 클래스는 라이브러리 클래스, StudentExample은 실행 클래스이다. 하지만 Student에 main() 메소드를 작성해서 라이브러리인 동시에 실행클래스로 만들 수 있다.
	
	// 프로그램이 단 하나의 클래스로 구성된다면 좋은 작성법일 수 있지만, 대부분 객체 지향이니 실행 클래스와 분리되어 있다.
	// 가급적 클래스들을 분리해서 작성해보자.
	
}
