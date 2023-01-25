package structural.adapter.adapter;

import structural.adapter.classes.Email;
import structural.adapter.protocol.SendEmailProtocol2;

public class SendEmailAdapterImp2 implements Target{
	private SendEmailProtocol2 sendEmail = new SendEmailProtocol2();
	
	@Override
	public void sendEmail(Email email) {
		sendEmail.setEmail(email);
		sendEmail.send();
	}

}
