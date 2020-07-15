package Interface;

abstract class Shape { //추상 클래스로는 객체 생성 불가능
	int x,y;
	public void move(int x, int y) { // 추상 클래스라 하더라도 일반 메소드 생성 가능
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // 추상 메소드 생성. 추상 메소드를 하나만 가지고 있어도 추상 클래스가 됨
								//;으로 종료됨에 유의
}


public class Rectangle extends Shape {
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}