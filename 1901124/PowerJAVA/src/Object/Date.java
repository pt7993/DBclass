package Object;

public class Date {
	public void printDate() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public int getday() {
		return day;
	}
	
	//필드 선언
	private int year;
	private String month;
	private int day;
}
