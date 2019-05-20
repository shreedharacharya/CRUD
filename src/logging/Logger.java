package logging;

import java.util.Date;
import product.service.IObserver;

public class Logger implements IObserver {


	public void log(String logstring) {
		System.out.println("log--------" + new Date() + " -- " + logstring);
	}

	public void update(String message) {
		log(message);

	}

}
