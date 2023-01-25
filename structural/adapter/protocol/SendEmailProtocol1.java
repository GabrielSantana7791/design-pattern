package structural.adapter.protocol;

import structural.adapter.classes.Email;

public class SendEmailProtocol1 {
	public  void send(Email email) {
		System.out.println(this.getClass().getSimpleName() + ": E-mail sent to: " + email.getEmail());
	}
}