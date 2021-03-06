package 챕터17_JavaFX;

public class ㄱ_JavaFX {
	// JavaFX는 크로스 플랫폼에서 실행하는 리치 클라이언트 애플리케이션(Rich Client Application)을 개발하기 위한 그래픽과 미디어 패키지를 말한다.
	// JavaFX는 자바 7부터 JDK에 포함되어 있기 때문에 병도의 SDK 설치 없이도 바로 사용할 수 있다.
	// 현재 JavaFX는 자바 표준 UI 라이브러리였던 Swing보다 더 가벼워지고 더 강력해졌기 때문에 Swing을 대체하는 새로운 라이브러리로 자림매김하고있다.
	// JavaFX는 데스크톱뿐만 아니라 임베디드 장비에서 실행하는 UI 애플리케이션을 개발할 수 있도록 가볍고 풍부한 UI를 제공하는 것을 목표로 하고 있다.
	
			/*	AWT	*/
	
	// 자바 언어가 탄생한 1995년에는 인터넷이 활성화되지 않았기 때문에 대부분의 클라이언트 애플리케이션은 운영체제가 제공하는 네이티브(native) UI 컴포넌트를 이용해서 개발되었다.
	// 그래서 java 1.0에 포함된 AWT(Abstract Window Toolkit)는 운영 체제가 제공하는 네이티브 UI 컴포넌트를 이용하는 자바 라이브러리였다.
	// 그렇다 보니 자바 애플리케이션이 실행되는 운영 체제에 따라 UI의 모양이 서로 달랐고, 종류도 제한적이였다.
	
			/*	Swing	*/
	
	// AWT의 다음 주자로 Swing이 나왔다. Swing의 중심 아이디어는 운영 체제가 제공하는 네이티브 UI 컴포넌트를 사용하지 말자는 것이었다.
	// 즉 모든 운영체제상에서 동일한 UI를 갖도록, Swing 자신만의 UI(look and feel)를 갖도록 하자는 것인데 이것이 사용자에게 불평의 요소가 되었다.
	// 시간이 흘러 네이티브 UI를 더 선호하게 되었다. 그래서 Swing은 네이티브 UI로 보여지도록 자신의 UI를 다시 재정비해야 했다.
	// 그렇다 보니 실행 성능이 느려지고, 메모리를 더 많이 사용함으로써 사용자들의 불평은 더 커졌다. 이러한 이유로 Swing은 점점 네이티브 UI에 밀려나기 시작했다.
	
			/*	JavaFX	*/
	
	// JavaFX는 어도비의 플래쉬(flash)와 마이크로소프트의 실버라이트(silverlight)의 대항마로 만들어졌다. 플래쉬가 웹 광고용으로만 사용되다가 멀티미디어 스트리밍 시장을 점령하게 되자,
	// 마이크로소프트는 이에 대항하기 위해 실버라이트를 내놓았다. 썬마이크로시스템즈도 이에 뒤질세라 2007년에 JavaFX 1.0이라는 새로운 기술을 소개했다.
	// JavaFX 1.0은 JavaFX 스크립트 언어로 개발된 애플리케이션을 JVM에서 실행하는 구조로 되어 있었다. JavaFX 스크립트 언어는 애니메이션과 시각적인 효과를 내는데 최적화된 언어였으나
	// 프로그래머들은 새로운 언어를 또 익혀야 하기 때문에 불평과 함께 JavaFX 1.0을 멀리했다. 그래서 2011년 오라클(Oracle)은 자바 언어 이외에 별도의 프로그래밍 언어가 필요없는 새로운 버전인 JavaFX 2.0을 릴리즈했다.
	// 자바 7 업데이트 6버전 부터JDK와 JRE에 JavaFX2.2를 포함시켜 자바의 한 식구가 되었으며, 자바 8에서는 복잡한 버전 번호를 간략화해서 JavaFX 8로 명칭을 변경하였다.
	
	// JavaFX 애플리케이션에서 UI 생성, 이벤트 처리, 멀티미디어 재생, 웹 뷰 등과 같은 기능은 JavaFX API로 개발하고 그 이외의 기능은 자바 표준 API를 활용해서 개발할 수 있다.
	// 멀티 스레딩과 서버와의 통신 기능은 자바 표준 API를 사용하면서 JavaFX에서 제공하는 풍부한 UI 기능을 할용할 수 있다는 점에서 매우 큰 장점이 될 수 있다.
	
	// JavaFX는 화며 ㄴ레이아웃과 스타일, 애플리케이션 로직을 분리할 수 있기 때문에 디자이너와 개발자들이 협력해서 JavaFX 애플리케이션을 개발할 수 있는 구조를 가지고 있다.
	// 자바 코드와 분리해서 스타일 시트(CSS)로 외관을 작성할 수 있기 때문에 그래픽 디자이너가 CSS로 작업할 동안 개발자들은 애플리케이션 로직에 더 많은 시간을 할해할 수 있다.
	/// 자바 코드에서도 레이아웃과 애플리케이션 로직을 분리하고 싶다면 레이아웃은 FXML 파일로 작성하고 애플리케이션은 자바 코드로 작성하면 된다.
	// 다음은 JavaFX 애플리케이션을 구성하는 파일 단위 요소를 보여준다.
	
	//	JavaFX 애플리케이션 구성 요소
	//
	//	[레이아웃]			[외관 및 스타일]		[리소스]
	//	자바 코드 파일		CSS 파일			그림 파일
	//		또는			[비즈니스 로직]		동영상 파일
	//	FXML 파일			자바 코드 파일		  ...
}
