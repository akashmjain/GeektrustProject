package com.akashmjain;
import com.akashmjain.core.*;
import com.akashmjain.input_formatting.Input;
import java.io.*;
import java.util.ArrayList;
class Resolve {
    private Universe universe;
    private SenderKingdom senderKingdom;
    private ArrayList<Input> inputData;
    private ArrayList<Kingdom> alliance;


    public Resolve(Universe universe, String fileName, SenderKingdom senderKingdom) throws Exception { 
        this.universe = universe; 
        this.senderKingdom = senderKingdom;
        this.inputData =  getInputsFromFile(fileName);
        this.alliance = getAllianceArray();
    }

    private ArrayList<Kingdom> getAllianceArray() throws Exception {
        for(Input input: inputData) {
            ReciverKingdom reciverKingdom = (ReciverKingdom) input.getKingdom();
            String secretMessage = input.getSecretMessage();
            senderKingdom.send(reciverKingdom, secretMessage);
        }
        return senderKingdom.getAllianceArray();
    }

    private ArrayList<Input> getInputsFromFile(String fileName) throws Exception {
        BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
        ArrayList<Input> kingdomMessage = new ArrayList<Input>();
        String line;
        while((line = bufferReader.readLine()) != null) {
            String kingdomName = line.substring(0, line.indexOf(" "));
            String secretMessage = line.substring(line.indexOf(" ") + 1);
            Kingdom kingdom = universe.getKingdomByName(kingdomName);
            kingdomMessage.add(new Input(kingdom, secretMessage));
        }
        return kingdomMessage;
    }


    @Override
    public String toString() {
        if(alliance.size() < 3) return "NONE";

        String data = senderKingdom.getName() + " ";
        for(Kingdom kingdom : alliance) {
            data += kingdom.getName() + " ";
        }
        return data;
    }
}