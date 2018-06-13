package helloworldweb;

public class Counter {
	
	private volatile int i=0;
	
	public synchronized void increment(){
		i++;
	}
	
	public synchronized void decrement(){
		i--;
	}
	
	public synchronized int getI(){
		return i;
	}
	
	

}
