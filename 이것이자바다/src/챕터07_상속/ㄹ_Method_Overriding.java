package 챕터07_상속;

public class ㄹ_Method_Overriding {
	// 부모 클래스의 모든 메소드가 자식 클래스에게 맞게 걸계되어 있다면 가장 이상적인 상속이지만, 어떤 메소드는 자식 클래스가 사용하기에 적합하지 않을 수도 있다.
	// 이 경우 상속된 일부 메소드는 자식 클래스에서 다시 수정해서 사용해야 한다. 자바는 이런 경우를 위해 메소드 오버라이딩(Overriding) 기능을 제공한다.
	
			//	Method Overriding ( @Override )		메소드 재정의 ( @Override )
	
	// 메소드 오버라이딩은 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우, 자식 클래스에서 동일한 메소드를 재정의하는 것을 말한다.
	// 메소드가 오버라이딩되었다면 부모 객체의 메소드는 숨겨지기 때문에, 자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
	// 메소드를 오버라이딩할 때에는 다음과 같은 규칙에 주의해서 작성해야 한다.
	
	//	부모의 메소드와 동일한 시그너처(리턴 타입, 메소드 이름, 매개 변수 리스트)를 가져야 한다.
	//	접근 제한을 더 강하게 오버라이딩할 수 없다.
	//	새로운 예외(Exception)를 throws할 수 없다.
	
	// 접근 제한을 더 강하게 오버라이딩할 수 없다는 것은 부모 메소드가 public 접근 제한을 가지고 있을 경우 오버라이딩하는 자식 메소드는 default나 private 접근 제한으로 수정할 수 없다는 뜻이다.
	// 반대로는 가능하다. 부모 메소드가 default 접근 제한을 가지면 재정의되는 자식 메소드는 default 또는 public 접근 제한을 가질 수 있다.
	// 다음 예제 Calculator의 자식 클래스인 Computer을 살펴보자.
	
	// 이클립스는 부모 메소드 중 하나를 선택해서 오버라이딩 메소드를 자동 생성해주는 기능이 있다.
	// 이 기능은 부모 메소드의 시그너처를 정확히 모를 경우 매우 유용하게 사용 할 수 있다.
	
	//	자식 클래스에서 오버라이딩 메소드를 작성할 위치로 입력 커서를 옮긴다.
	//	메뉴에서 [Source	>	Override/Implement Methods ...]를 선택한다.
	//	부모 클래스에서 오버라이딩돨 메소드를 선택하고 [OK] 버튼을 클릭한다.
	
			//	Parents Method Invocation ( super )		부모 메소드 호출 ( super )
	
	// 자식 클래스에서 부모 클래스의 메소드를 오버라이딩하게 되면, 부모 클래스의 메소드는 숨겨지고 오버라이딩된 자식 메소드만 사용된다.
	// 그러나 자식 클래스 내부에서 오버라이딩된 부모 클래스의 메소드를 호출해야 하는 상황이 발생한다면 명시적으로 super 키워드를 붙여서 부모 메소드를 호출할 수 있다.
	// super는 부모 객체를 참조하고 있기 때문에 부모 메소드에 직접 접근할 수 있다.
	
	//	super.부모 메소드();
	
	// 다음 예제 Airplane과 SupersonicAirplane을 살펴보자. 일반 비행 모드와 초음속 비행 모드 두 동작을 설계했다고 보자.
}
