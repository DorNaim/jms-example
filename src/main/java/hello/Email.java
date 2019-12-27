package hello;

public class Email {

	/**
	 * 
	 */
	private String to;
	private String from;
	private String body;

	public Email() {
	}

	public Email(String from, String to, String body) {
		this.from = from;
		this.to = to;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return String.format("Email{from=%s, to=%s, body=%s}", getFrom(), getTo(), getBody());
	}

}
