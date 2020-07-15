package Interface;

abstract class Shape { //�߻� Ŭ�����δ� ��ü ���� �Ұ���
	int x,y;
	public void move(int x, int y) { // �߻� Ŭ������ �ϴ��� �Ϲ� �޼ҵ� ���� ����
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // �߻� �޼ҵ� ����. �߻� �޼ҵ带 �ϳ��� ������ �־ �߻� Ŭ������ ��
								//;���� ����ʿ� ����
}


public class Rectangle extends Shape {
	int width, height;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
	}
}