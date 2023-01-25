package structural.adapter.protocol;

import structural.adapter.classes.Email;

public class SendEmailProtocol2 {
	private Email email;
	
	public void setEmail(Email email) {
		this.email = email;
	}
	public  void send( ) {
		System.out.println(this.getClass().getSimpleName() + ": E-mail sent to: " + this.email.getEmail());
	}
}
