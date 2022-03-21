package com.test.http;

import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicStatusLine;

public class Client {
    
    public StatusLine getImage(String url) { return new BasicStatusLine(new  ProtocolVersion("http", 1, 2), 200, "Ok"); }
}
