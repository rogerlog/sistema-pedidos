package io.github.rogerlog.services;

import org.springframework.mail.SimpleMailMessage;

import io.github.rogerlog.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
