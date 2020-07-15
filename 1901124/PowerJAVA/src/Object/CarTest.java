package Object;

class Car {
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
		
	}

}
