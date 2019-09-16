package br.com.gerson.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerson.models.Mail;
import br.com.gerson.services.SendMailService;

@RestController
@RequestMapping("/mail")
public class ProducerMailMessage {
	
	@Autowired
	private SendMailService sendMailService;

	@PostMapping("/send")
	public ResponseEntity<Mail> sendMail(@RequestBody Mail mail){
		
		Mail msg = sendMailService.send(mail);
		
		return ResponseEntity.ok().body(msg);
	}
	
}
