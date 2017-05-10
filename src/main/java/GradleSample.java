
public class GradleSample {

	public static void main(String[] args) {
		System.out.println("Hello Gradle");
		
		QueueService service = new QueueService();
		
		try {
			Thread.sleep(3600000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
