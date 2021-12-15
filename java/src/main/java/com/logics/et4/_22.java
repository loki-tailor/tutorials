package com.logics.et4;

import java.io.IOException;

class PortConnector {
	public PortConnector() throws Exception {
		if (Math.random() > 0.5) {
			throw new IOException();
		}
		throw new RuntimeException();
	}
}

public class _22 {
	public static void main(String[] args) {
		try {
			PortConnector pc = new PortConnector();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
