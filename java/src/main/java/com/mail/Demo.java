package com.mail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.search.AndTerm;
import javax.mail.search.ComparisonTerm;
import javax.mail.search.ReceivedDateTerm;
import javax.mail.search.SearchTerm;

import com.file.FileOps;

public class Demo {

    public static void check(String host, String storeType, String user, String password) {
	try {

	    // create properties field
	    Properties properties = new Properties();

	    // properties.put("mail.pop3.host", host);
	    // properties.put("mail.pop3.port", "995");
	    // properties.put("mail.pop3.starttls.enable", "true");

	    properties.put("mail.store.protocol", "imaps");
	    Session emailSession = Session.getDefaultInstance(properties);

	    // create the POP3 store object and connect with the pop server
	    Store store = emailSession.getStore("imaps");

	    store.connect(host, user, password);

	    // create the folder object and open it
	    Folder emailFolder = store.getFolder("stylefunda2");
	    emailFolder.open(Folder.READ_ONLY);

	    // retrieve the messages from the folder in an array and print it
//	    Message[] messages = emailFolder.getMessages();
	     Message[] messages = emailFolder.search(searchTerm());
	    System.out.println("messages.length---" + messages.length);

	    for (int i = 0, n = messages.length; i < n; i++) {
		Message message = messages[i];
//		System.out.println("Email Number " + (i + 1));
//		System.out.println("Subject: " + message.getSubject());
//		System.out.println("From: " + message.getFrom()[0]);
//		System.out.println("Sent Date: " + message.getSentDate());
//		System.out.println("To: " + message.getRecipients(RecipientType.TO)[0]);
		
		StringBuilder sb = new StringBuilder();
		sb.append(i+1).append(",")
		.append(message.getSentDate()).append(",")
		.append(message.getSubject()).append(",")
		.append(message.getFrom()[0]).append(",")
		.append(message.getRecipients(RecipientType.TO)[0]);
		System.out.println(sb.toString());
		FileOps.append("/home/lokesh/Desktop/emails/demo.csv", sb.toString());
		
		String content = "\n**********\n" + (i+1) + "\t" + ((MimeMessage)message).getContent() + "\n**********\n";
		FileOps.append("/home/lokesh/Desktop/emails/content.log", content);

	    }

	    // close the store and folder objects
	    emailFolder.close(false);
	    store.close();

	} catch (NoSuchProviderException e) {
	    e.printStackTrace();
	} catch (MessagingException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static SearchTerm searchTerm() {
	try {
	    Date futureDate = new SimpleDateFormat("dd/MM/yyyy").parse("25/03/2020");
	    Date pastDateDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/10/2019");

	    SearchTerm olderThan = new ReceivedDateTerm(ComparisonTerm.LE, futureDate);
	    SearchTerm greaterThan = new ReceivedDateTerm(ComparisonTerm.GE, pastDateDate);
	    SearchTerm dateDiffTerm = new AndTerm(olderThan, greaterThan);
	    return dateDiffTerm;
	} catch (ParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }

    public static void main(String[] args) {

	String host = "pop.gmail.com";// change accordingly
	String mailStoreType = "pop3";
	String username = "lokeshwar@indusos.com";// change accordingly
	String password = "*********";// change accordingly

	check(host, mailStoreType, username, password);

    }

}
