package 챕터12_멀티스레드;

public class Question02_MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try { Thread.sleep(1000); } catch (Exception e) {}
		}
	}
}
