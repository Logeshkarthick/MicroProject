package com.ock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ock.service.MailSeviceInterface;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/email")
public class MailController {
	
	@Autowired
	MailSeviceInterface serv;
 
	@PostMapping("/sendEmailOTP/{email}/{total}")
	public ResponseEntity<String> sendOTPEmail(@PathVariable("email")String email, @PathVariable("total") String total){
		String toMail = email;
		String subject = "Interest Rate and Loan  - Estimation Confirmation";
		String body = "Your Order is successfully placed for the amount of " + total + ".\\n\\n\\n\\n ****Thank You****";
		try {
			serv.sendMail(toMail, subject, body);
			return ResponseEntity.ok("success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("mail send failure");
		}
 
	}

}
