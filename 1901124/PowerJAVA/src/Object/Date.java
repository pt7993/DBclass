package Object;

public class Date {
	public void printDate() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public int getday() {
		return day;
	}
	
	//�ʵ� ����
	private int year;
	private String month;
	private int day;
}
