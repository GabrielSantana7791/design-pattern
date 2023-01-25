package structural.adapter;

import structural.adapter.adapter.Target;
import structural.adapter.adapter.SendEmailAdapterImp1;
import structural.adapter.adapter.SendEmailAdapterImp2;
import structural.adapter.classes.Email;

public class Run {

	public static void main(String[] args) {
		Target sendEmailAdapter1 = new SendEmailAdapterImp1();
		Target sendEmailAdapter2 = new SendEmailAdapterImp2();
		
		Email email = new Email("gabrielsantana7791@gmail.com", "Hello there");
		
		
		sendEmail(sendEmailAdapter1, email);
		sendEmail(sendEmailAdapter2, email);

	}
	
	static void sendEmail(Target adapter, Email email) {
		adapter.sendEmail(email);
	}
}
