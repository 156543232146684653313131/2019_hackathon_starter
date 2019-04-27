package com.shasta.client;

import com.shasta.threaded.ClientRunnable;
import java.net.Socket;


/**
 * Client object that contains methods to handle connects, disconnects, and messages for one client.
 *
 * @author Chandler Severson
 * @since 2019-12-10
 * <p>Made as a starter project for the 2019 Shasta Networks/SOU CS Club Hackathon.</p>
 */
public class Client extends ClientRunnable {
	private static TextFormattingBot botty = new TextFormattingBot();
	private static StringChain std = new StringChain();
	private Shape triangle = new Shape();
    public Client(Socket clientSocket) {
        super(clientSocket);
        System.out.println(getClientSocket().getLocalAddress() + ": New Connection. Port: " + getClientSocket().getPort());
    }

    /**
     * Called when a client connects.
     */
    @Override
    public void handleConnect() {
        //TODO IMPLEMENT
    	System.out.println("Welcome Back!");
    	try {
    		String mess = botty.parse("~OLWelcome~RS ~OLBack~RS ~OLto~RS ~OLDeltaQuest!~RS"+'\r'+'\n'+"~OLDo~RS ~OLYou~RS ~OLWant~RS ~OLTo~RS ~OLPlay~RS ~OLAgain?~RS"+'\r'+'\n');
    		Client.super.sendMessage(mess);
    		mess = botty.parse("");
    	}
    	catch (Exception e) {
    		System.err.println("We're in over our heads boys");
    	}
    }

    /**
     * Called when a client disconnects
     */
    @Override
    public void handleDisconnect() {
        //TODO IMPLEMENT
    	System.out.println("they're leggin' it");
    }

    /**
     * Handle client input.
     * @param str The message to handle.
     */
    @Override
    protected void handleMessage(String str) {
        //TODO IMPLEMENT
    	System.out.println("Dare you send?");
    	try {
    		String j = std.toSend(triangle.pickPath(str));
    		j = botty.parse(j);
    		//if(triangle.canDraw()) {
    		//	String[] x = triangle.whatDraw();
    		//	for(int i = 0; i < x.length; i++) {
    		//		Client.super.sendMessage(x[i]+'\r' + '\n');
    		//	}
    		//}
    		Client.super.sendMessage(j + '\r' + '\n');
    	}
    	catch (Exception e) {
    		System.err.println("Unacceptable string");
    	}
    }
}
