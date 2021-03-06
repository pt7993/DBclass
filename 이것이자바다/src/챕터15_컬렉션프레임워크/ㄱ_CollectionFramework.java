package 챕터15_컬렉션프레임워크;

public class ㄱ_CollectionFramework {
	// 애플리케이션을 개발하다 보면 다수의 객체를 저장해 두고 필요할 때마다 꺼내서 사용하는 경우가 많다.
	// 만약 10개의 Product 객체를 저장해 두고, 필요할 때마다 하나씩 꺼내어 이용한다고 가정해보자.
	// 어떻게 Product 객체를 효율적으로 추가, 검색, 삭제할지 고민해야 하는데, 가장 간단한 방법은 배열을 이용하는 것이다.
	
	//	// 길이 10인 배열 검색
	//	Product[] array = new Product[10];
	//	// 객체 추가
	//	array[0] new Product("Model");
	//	// 객체 검색
	//	Product model1 = array[0];
	//	// 객체 삭제
	//	array[0] = null
	
	// 배열은 쉽게 생성하고 사용할 수 있지만, 저장할 수 있는 객체 수가 배열을 생성할 때 결정되기 때문에 불특정 다수의 객체를 저장하기에는 문제가 있다.
	// 물론 배열의 길이를 크게 생성하면 되지만, 이것은 좋은 방법이 될 수 없다. 배열의 또 다른 문제점은 객체를 삭제했을 때 해당 인덱스가 비게 되어 낱알이 듬성듬성 빠진 옥수수가 될 수 있다.
	// 그렇기 때문에 새로운 객체를 저장하려면 어디가 비어 있는지 확인하는 코드도 필요하다
	
	//	0	1	2	3	4	5
	//	o	x	x	o	o	x
	
	// 자바는 배열의 이러한 문제점을 해결하고, 널리 알려져 있는 자료구조( Data Structure )를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 
	// java.util 패키지에 컬렉션과 관련된 인터페이스와 클래스들을 포함시켜 놓았다. 이들을 총칭해서 컬렉션 프레임워크 ( Collection Framework )라고 부른다.
	// 컬렉션이란 사전적 의미로 요소를 수집해서 저장하는 것을 말하는데, 자바 컬렉션은 객체를 수집해서 저장하는 역할을 한다. 프레임워크란 사용 방법을 미리 정해 놓은 라이브러리를 말한다.
	// 자바 컬렉션 프레임워크는 몇 가지 인터페이스를 통해서 다양한 컬렉션 클래스를 이용할 수 있도록 하고 있다.
	// 컬렉션 프레임워크의 주요 인터페이스로는 List, Set, Map이 있다. 이 인터페이스들은 컬렉션을 사용하는 방법을 정의한 것인데, 다음은 이 인터페이스로 사용 가능한 컬렉션 클래스를 보여준다.
	
	//		Collection
	//	┌───────────────┐
	//	List			Set					Map
	//					
	//	├──	ArrayList	├──	HashSet			├──	HashMap
	//	├──	Vector		└──	TreeSet			├──	Hashtable
	//	└──	LinkedList						├──	TreeMap
	//										└──	Properties
	
	// ArrayList, Vector, LinkedList는 List 인터페이스를 구현한 클래스로, List 인터페이스로 사용 가능한 컬렉션이다.
	// 마찬가지로 HashSet, TreeSet은 Set 인터페이스를 구현한 클래스로 Set 인터페이스로 사용 가능한 컬렉션이다.
	//	HashMap, Hashtable, TreeMap, Properties는 Map 인터페이스를 구현한 클래스로 Map 인터페이스로 사용 가능한 컬렉션이다.
	
	// List와 Set은 객체를 추가, 검색, 삭제하는 방법에 많은 공통점이 있기 때문에 이 인터페이스들의 공통된 메소드들만 모아 Collection 인터페이스로 정의해 두고 있다.
	// Map은 키와 값을 하나의 쌍으로 묶어서 관리하는 구조로 되어 있어, List 및 Set과는 사용 방법이 완전히 다르다. 다음은 각 인터페이스별로 사용할 수 있는 컬렉션의 특징을 정리한 것이다.
	
	//	인터페이스 분류					특징					구현 클래스
	//					List	- 순서를 유지하고 저장			ArrayList, Vector
	//	Collection				- 중복 저장 가능				LickedList
	//					
	//					Set		- 순서를 유지하지 않고 저장		HashSet, TreeSet
	//							- 중복 저장이 안됨
	
	//	Map						- 키와 값의 쌍으로 저장			HashMap, Hashtable,
	//							- 키는 중복 저장 안 됨			TreeMap, Properties
		
	
}
