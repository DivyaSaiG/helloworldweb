package helloworldweb;

public class TestCounter {

	static Counter counter = new Counter();

	public static void main(String args[]) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());

		CounterIncrementer ci = new CounterIncrementer();
		ci.start();
		// ci.join();
		CounterIncrementer ci2 = new CounterIncrementer();
		ci2.start();
		// ci.join();

		System.out.println(counter.getI());

	}

	static class CounterIncrementer extends Thread {
		@Override
		public void run() {
			counter.increment();
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
