package 챕터12_멀티스레드;

public class ㅂ7_PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		}catch(InterruptedException e) {
				
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
