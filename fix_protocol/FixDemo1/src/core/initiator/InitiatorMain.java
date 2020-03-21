package core.initiator;

import java.io.File;
import java.io.FileInputStream;

import quickfix.Application;
import quickfix.DefaultMessageFactory;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;

public class InitiatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String fileName = "src/resources/config-initiator.cfg";

			Application application = new InitiatorApplication();
			System.out.println("[initiator] quickfix.Application initialized");
			System.out.println();

			SessionSettings settings = new SessionSettings(new FileInputStream(new File(fileName)));
			System.out.println("[initiator] quickfix.SessionSettings initialized with file - "
					+ new File(fileName).getAbsolutePath());
			System.out.println();

			MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
			System.out.println("[initiator] quickfix.MessageStoreFactory initialized with 'settings'");
			System.out.println();

			LogFactory logFactory = new FileLogFactory(settings);
			System.out.println("[initiator] quickfix.LogFactory initialized with 'settings'");
			System.out.println();

			MessageFactory messageFactory = new DefaultMessageFactory();
			System.out.println("[initiator] quickfix.MessageFactory initialized with 'settings'");
			System.out.println();

			SocketInitiator socketInitiator = new SocketInitiator(application, messageStoreFactory, settings,
					logFactory, messageFactory);
			System.out.println(
					"[initiator] quickfix.SocketAcceptor initialized with - 'application', 'messageStoreFactory', 'setttings', 'messageFactory'");
			System.out.println();

			socketInitiator.start();
			System.out.println("[initiator] socketInitiator.start() called");
			System.out.println();

			System.out.println("[initiator] Wait for 5 seconds after socketInitiator.start()");
			Thread.sleep(5000);
			System.out.println();

			SessionID sessionId = socketInitiator.getSessions().get(0);
			System.out.println("[initiator] Fetched sessionId from 'socketInitiator' as: " + sessionId);

			Session.lookupSession(sessionId).logon();

			Thread.sleep(50000);

//			socketInitiator.stop();
//			System.out.println("[initiator] socketInitiator.stop() called.");
//			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
