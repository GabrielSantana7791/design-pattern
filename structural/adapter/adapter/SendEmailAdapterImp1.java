package structural.adapter.adapter;

import structural.adapter.classes.Email;
import structural.adapter.protocol.SendEmailProtocol1;

public class SendEmailAdapterImp1 implements Target{
	private SendEmailProtocol1 sendEmailProtocol = new SendEmailProtocol1();
	
	@Override
	public void sendEmail(Email email) {
		sendEmailProtocol.send(email);		
	}

}
