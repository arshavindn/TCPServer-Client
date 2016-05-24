/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author mozart
 */
public class Client extends Thread {

    private Socket client;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    DefaultListModel<String> listModel;

    public Client(DefaultListModel<String> listModel) {
        this.listModel = listModel;
        out = null;
        in = null;
    }

    public void connectToServer(String serverName, int port) throws IOException {
        client = new Socket(serverName, port);
        System.out.println("Just connected to "
                + client.getRemoteSocketAddress());

        // in = new ObjectInputStream(client.getInputStream());
    }

    public void sendDataObject(List<String> data) throws IOException {
        if (out == null) out = new ObjectOutputStream(client.getOutputStream());
        System.out.println("Sending data...");
        out.writeObject(data);
    }

    @Override
    public void run() {
        try {
            if (in == null) in = new ObjectInputStream(client.getInputStream()); //Error Line!
            while (true) {
                try {
                    Object object = in.readObject();
                    ArrayList<String> result = (ArrayList<String>) object;
                    result.stream().forEach((str) -> {
                        listModel.addElement(str);
                    });
                } catch (ClassNotFoundException e) {
                    System.out.println("The title list has not come from the server");
                } catch (IOException e) {
                    System.out.println("Server is down...");
                    throw new RuntimeException();
//                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Server is down... " + ex.getMessage());
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
