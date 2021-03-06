package 챕터13_제네릭;

public class ㅁ_BoundedTypeParameter {
	// 타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다. 예를 들어 숫자를 연산하는 제네릭 메소드는 매개값으로 Number 타입 또는 하위 클래스 타입(Byte, Short, Integer, Long, Double)의
	// 인스턴스를 가져야 한다. 이것이 제한된 타입 파라미터(bounded type parameter)가 필요한 이유이다.
	// 제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고 상위 타입을 명시하면 된다.
	// 상위 타입은 클래스뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지 않는다.
	
	//	public <T extends 상위타입> 리턴타입 메소드(매개변수, ...) {...}
	
	// 타입 파라미터에 지정되는 구체적인 타입은 상위 타입이거나 상위 타입의 하위 또는 구현 클래스만 가능하다. 주의할 점은 메소드의 중괄호 {} 안에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 멤버(필드, 메소드)로 제한된다.
	// 하위 타입에만 있는 필드와 메소드는 사용할 수 없다. 다음은 숫자 타입만 구체적인 타입으로 갖는 제네릭 메소드 compare()이다. 두 개의 숫자 타입을 매개값으로 받아 차이를 리턴한다.
	
	//	public <T extends Number> int compare(T t1, T t2) {
	//		double v1 = t1.doubleValue();	// Number의 doubleValue() 메소드 사용
	//		double v2 = t2.doubleValue();	// Number의 doubleValue() 메소드 사용
	//		return Double.compare(v1, v2);
	//	}
	
	// doubleValue() 메소드는 Number 클래스에 정의되어 있는 메소드로 숫자를 double 타입으로 변환한다.
	// Double.compare() 메소드는 첫 번째 매개값이 작으면 -1을, 같으면 0을, 크면 1을 리턴한다.
}
