package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "mailServer", containerFactory = "myFactory")
	public void receiveMessage(Email email) {
		System.out.println("Email recieved from the email server (MQ) - " + email);
	}

}
