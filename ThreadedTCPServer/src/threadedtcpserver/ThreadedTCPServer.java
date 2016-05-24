/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadedtcpserver;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author mozart
 */
public class ThreadedTCPServer {

    public static void main(String args[]) {
        int port = Integer.parseInt(args[0]);
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Waiting for client on port "
                    + serverSocket.getLocalPort() + "...");
        } catch (IOException e) {
            System.out.println("Error while creating server.");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        while (true) {
            try {
                socket = serverSocket.accept();
                System.out.println("Just connected to "
                        + socket.getRemoteSocketAddress());
            } catch (IOException e) {
                System.out.println("I/O error: " + e);
            }
            // new threat for a client
            try {
                new TCPServer(socket).start();
            } catch (IOException e) {
                System.out.println("Error while start server.");
                System.out.println(e.getMessage());
            }
        }
    }
}

class TCPServer extends Thread {

    // private ServerSocket serverSocket;
    protected Socket server;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    private static ArrayList<String> stringProcess(String str) {
        String reply_uppper = str.toUpperCase();
        String reply_lower = str.toLowerCase();
        List<String> allMatches = new ArrayList<>();
        String pattern = "([a-zA-Z]+)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        while (m.find()) {
            allMatches.add(m.group());
        }
        ArrayList<String> result = new ArrayList<>();
        result.add(reply_uppper);
        result.add(reply_lower);
        result.add("Number of word: " + String.valueOf(allMatches.size()));
        return result;
    }

    private static ArrayList<String> calulateExpr(String str) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("js");
        ArrayList<String> result = new ArrayList<>();
        try {
            String expr_val = engine.eval(str).toString();
            result.add(expr_val);
        } catch (ScriptException ex) {
            result.add("Math Error");
        }
        return result;
    }

    public TCPServer(Socket clientSocket) throws IOException {
        this.server = clientSocket;
        in = new ObjectInputStream(server.getInputStream());  // Error Line!
        out = new ObjectOutputStream(server.getOutputStream());  // Error Line!
        // serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Object object = in.readObject();
                ArrayList<String> data = (ArrayList<String>) object;
                ArrayList<String> answerList = null;
                int job = Integer.parseInt(data.get(0));
                if (job == 1) {
                    answerList = TCPServer.stringProcess(data.get(1));
                }
                else if (job == 2) {
                    answerList = TCPServer.calulateExpr(data.get(1));
                }
                out.writeObject(answerList);
            } catch (ClassNotFoundException e) {
                System.out.println("The title list has not come from the server.");
            } catch (EOFException e) {
                System.out.println("Client disconnect.");
                break;
            }
            catch (IOException e) {
                System.out.println("Client disconnect.");
                break;
            }
        }
    }
}
