package tasks;

public class OddPrinterTask implements Runnable {
	private int start;
	private int end;
	
	
	public OddPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("Invoked by "+Thread.currentThread().getName());
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Thread started");
		for (int i = start; i < end; i++) 
			if (i % 2 != 0)
				System.out.println(Thread.currentThread().getName()+" Printing Odd Number: "+i);
		System.out.println(Thread.currentThread().getName()+" Over");
		
	}
	

}
