import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class QueueService {
	
	public QueueService() {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");

		Connection connection;
		try {
			connection = factory.newConnection();

			Channel channel = connection.createChannel();

			channel.exchangeDeclare("abc", "direct");

			channel.close();
			connection.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
