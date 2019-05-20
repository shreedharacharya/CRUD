package email;

import java.util.Date;

import product.service.IObserver;

public class EmailSender implements IObserver {

	public void sendEmail(String string) {
		System.out.println("Sending email --------" + new Date() + " -- " + string);
	}

	public void update(String message) {
		sendEmail(message);
	}

}
