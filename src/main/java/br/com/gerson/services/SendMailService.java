package br.com.gerson.services;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import br.com.gerson.models.Mail;

@Service
public class SendMailService {
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private JmsTemplate jmsTemplate;

	public Mail send(Mail mail) {
			
		jmsTemplate.convertAndSend(queue, mail);
		
		return mail;
	}

}
