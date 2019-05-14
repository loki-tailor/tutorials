package core.acceptor;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.fix42.Logon;
import quickfix.fix42.MessageCracker;
import quickfix.fix42.NewOrderSingle;
import quickfix.fix42.SecurityDefinition;

public class AcceptorApplication implements Application {

	@Override
	public void fromAdmin(Message arg0, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		// - notifies you when an administrative message is sent from a counterparty to
		// your FIX engine
		System.out.println("[acceptor] successfully called fromAdmin() for sessionId: " + arg1);
		System.out.println();
	}

	@Override
	public void fromApp(Message arg0, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		// TODO: add code similar to FIXimulator
		// - core entry point of our FIX Application
		// - every application level request will come thru this method
		System.out.println("[acceptor] successfully called fromApp() for sessionId: " + arg1);
		System.out.println();
	}

	@Override
	public void onCreate(SessionID arg0) {
		// - called when a new session is created
		// - this is kept empty in FIXimulator
		System.out.println("[acceptor] successfully called onCreate() for sessionId: " + arg0);
		System.out.println();

	}

	@Override
	public void onLogon(SessionID arg0) {
		// TODO: add code similar to FIXimulator
		// - notifies when valid logon is established with a counterparty
		System.out.println("[acceptor] successfully logged on for sessionId: " + arg0);
		System.out.println();
	}

	@Override
	public void onLogout(SessionID arg0) {
		// TODO: add code similar to FIXimulator
		// - notifies when a fix session is no longer online
		System.out.println("[acceptor] successfully logged out for sessionId: " + arg0);
		System.out.println();
	}

	@Override
	public void toAdmin(Message arg0, SessionID arg1) {
		// administrative messages sent from FIX engine to the counterparty
		System.out.println("[acceptor] Inside toAdmin()");
		System.out.println();

	}

	@Override
	public void toApp(Message arg0, SessionID arg1) throws DoNotSend {
		// TODO: add code similar to FIXimulator
		// - a call back to application messages that are being sent to counterparty
		System.out.println("[acceptor] [toApp()] Message : " + arg0 + " for sessionid : " + arg1);
		System.out.println();
	}

}
