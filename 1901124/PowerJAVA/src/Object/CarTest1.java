package Object;

class Car1 {
	private String color;
	private int speed;
	private int gear;
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public int getSpeed() {		return speed;	}
	public void setSpeed(int s) {		speed = s;	}
	public int getGear() {		return gear;	}
	public void setGear(int g) {		gear = g;	}
}

public class CarTest1 {
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("���� �ڵ����� ������ " + myCar.getColor());
		System.out.println("���� �ڵ����� �ӵ��� " + myCar.getSpeed());
		System.out.println("���� �ڵ����� ���� " + myCar.getGear());
	}
}
