package br.com.gerson.models;

public class Mail {
	
	private String to;
	private String from;
	private String message;
	
	public Mail() {
	}

	public Mail(String to, String from, String message) {
		this.to = to;
		this.from = from;
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Mail [to=" + to + ", from=" + from + ", message=" + message + "]";
	}
	
}
