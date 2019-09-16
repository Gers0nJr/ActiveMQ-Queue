package br.com.gerson.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import br.com.gerson.models.Mail;

@Component
public class Consumer {
	
	@JmsListener(destination = "mail.queue")
	public void listenerMail(Mail mail) {
		
		System.out.println("Gravar no banco >>> " + mail);
		
	}
	
}
