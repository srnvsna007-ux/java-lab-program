public class impentls {
	public static void main(String[] args) throws InterruptedException {
		Thread worker = new Thread(() -> {
			for (int number = 1; number <= 5; number++) {
				System.out.println("Worker: " + number);
			}
		});

		worker.start();
		worker.join();

		System.out.println("Main thread finished.");
	}
}

