package structural.adapter.classes;

public class Email {
	private String text, email;
	
	public Email(String email, String text) {
		this.text = text;
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
