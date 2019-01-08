package com.proconpb.sistramite.services;

import org.springframework.mail.SimpleMailMessage;

import com.proconpb.sistramite.domain.Usuario;

public interface EmailService {
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Usuario usuario, String newPass);
}
