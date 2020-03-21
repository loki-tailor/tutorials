package core.acceptor;

import java.io.File;
import java.io.FileInputStream;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.DefaultMessageFactory;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public class AcceptorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String fileName = "src/resources/config-acceptor.cfg";

			Application application = new AcceptorApplication();
			System.out.println("[acceptor] quickfix.Application initialized");
			System.out.println();

			SessionSettings settings = new SessionSettings(new FileInputStream(new File(fileName)));
			System.out.println(
					"[acceptor] quickfix.SessionSettings initialized with file - " + new File(fileName).getAbsolutePath());
			System.out.println();

			MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
			System.out.println("[acceptor] quickfix.MessageStoreFactory initialized with 'settings'");
			System.out.println();

			LogFactory logFactory = new FileLogFactory(settings);
			System.out.println("[acceptor] quickfix.LogFactory initialized with 'settings'");
			System.out.println();

			MessageFactory messageFactory = new DefaultMessageFactory();
			System.out.println("[acceptor] quickfix.MessageFactory initialized with 'settings'");
			System.out.println();

			SocketAcceptor socketAcceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory,
					messageFactory);
			System.out.println(
					"[aceptor] quickfix.SocketAcceptor initialized with - 'application', 'messageStoreFactory', 'setttings', 'messageFactory'");
			System.out.println();

			socketAcceptor.start();
			System.out.println("[acceptor] socketAcceptor.start() called");
			System.out.println();

//			System.out.println("[acceptor] Wait for 5 seconds after socketAcceptor.start()");
//			Thread.sleep(5000);
//			System.out.println();

//			socketAcceptor.stop();
//			System.out.println("[acceptor] socketAcceptor.stop() called.");
//			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
