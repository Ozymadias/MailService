package client;

import mail.Email;
import server.EmailServer;

public class MailClient {
    public void sendEmail(String address, String title, String body) {
        Email email = new Email(address, title, body);
        EmailServer.sendEmail(email);
    }
}
