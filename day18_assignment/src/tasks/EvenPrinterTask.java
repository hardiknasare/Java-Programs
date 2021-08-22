package tasks;

public class EvenPrinterTask implements Runnable {
	private int start;
	private int end;
	
	
	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("Invoked by "+Thread.currentThread().getName());
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Thread started");
		for (int i = start; i < end; i++) 
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName()+" Printing Even Number: "+i);
		System.out.println(Thread.currentThread().getName()+" Over");
		
	}
	

}
