package controller.command.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class EmailSender {
    public static void send(String email) {
        EmailSender main = new EmailSender(email);
    }
    final String senderEmailID = "bandits.corporation@gmail.com";
    final String senderPassword = "bandits12345";
    final String emailSMTPserver = "smtp.gmail.com";
    final String emailServerPort = "465";

    static String emailSubject = "Selection results ";
    static String emailBody = "Dear candidate. Thank you for your interested in out program. We congratulation  you on successful test.";
    public EmailSender(String email){

        // Receiver Email Address
        // Subject
        Properties props = new Properties();
        props.put("mail.smtp.user",senderEmailID);
        props.put("mail.smtp.host", emailSMTPserver);
        props.put("mail.smtp.port", emailServerPort);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", emailServerPort);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        SecurityManager security = System.getSecurityManager();
        try{
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(emailBody);
            msg.setSubject(emailSubject);
            msg.setFrom(new InternetAddress(senderEmailID));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(email));
            Transport.send(msg);
            System.out.println("Message send Successfully:)"); }

        catch (Exception mex){
            mex.printStackTrace();}


    }
    public class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmailID, senderPassword);
        }

  }
}