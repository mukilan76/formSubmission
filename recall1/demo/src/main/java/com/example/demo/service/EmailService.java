package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendConfirmationEmail(String toEmail, String userName) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("User Registration Confirmation");
        message.setText("Dear " + userName + ",\n\nThank you for registering!\n\nBest regards,\nMukilan.R");
        message.setFrom("mukilanr2001@gmail.com");
        mailSender.send(message);
    }
}

