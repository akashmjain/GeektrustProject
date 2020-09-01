package com.akashmjain;
import com.akashmjain.core.*;
import com.akashmjain.input_formatting.Input;
import java.io.*;
import java.util.ArrayList;
class Resolve {
    private Universe universe;
    private SenderKingdome senderKingdome;
    private ArrayList<Input> inputData;
    private ArrayList<Kingdome> alliance;
    public Resolve(Universe universe, String fileName, SenderKingdome senderKingdome) throws Exception { 
        this.universe = universe; 
        this.senderKingdome = senderKingdome;
        this.inputData =  getInputsFromFile(fileName);
        this.alliance = getAllianceArray(senderKingdome);
    }
    private ArrayList<Kingdome> getAllianceArray(SenderKingdome senderKingdome) throws Exception {
        for(Input input: inputData) {
            ReciverKingdome reciverKingdome = (ReciverKingdome) input.getKingdome();
            String secretMessage = input.getSecretMessage();
            senderKingdome.send(reciverKingdome, secretMessage);
        }
        return senderKingdome.getAllianceArray();
    }

    private ArrayList<Input> getInputsFromFile(String fileName) throws Exception {
        BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
        ArrayList<Input> kingdomeMessage = new ArrayList<Input>();
        String line;
        while((line = bufferReader.readLine()) != null) {
            String kingdomeName = line.substring(0, line.indexOf(" "));
            String secretMessage = line.substring(line.indexOf(" ") + 1);
            Kingdome kingdome = universe.getKingdomeByName(kingdomeName);
            kingdomeMessage.add(new Input(kingdome, secretMessage));
        }
        return kingdomeMessage;
    }
    @Override
    public String toString() {
        String data = senderKingdome.getName() + " ";
        for(Kingdome kingdome : alliance) {
            data += kingdome.getName() + " ";
        }
        data += '\n';
        return data;   
    }
}

// package com.akashmjain;
// import com.akashmain.core.*;
// import java.util.*;

// public class Resolve {
//     private Universe universe;
//     private ArrayList<Input> kingdomeMessage;
//     private ArrayList<Kingdome> alliance;
//     public Resolve(Universe universe) {
//         this.universe = universe;
//     }

//     public void getInputsFromFile(String fileName) throws Exception {
//         BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
//         // ArrayList<Input> kingdomeMessage = new ArrayList<Input>();
//         String line;
//         while((line = bufferReader.readLine()) != null) {
//             String kingdomeName = line.substring(0, line.indexOf(" "));
//             String secretMessage = line.substring(line.indexOf(" ") + 1);
//             Kingdome kingdome = universe.getKingdomeByName(kingdomeName);
//             kingdomeMessage.add(new Input(kingdome, secretMessage));
//         }
//     }
//     @Override
//     public String toString() {
//         SenderKingdome sender =  (SenderKingdome) universe.getKingdomeByName("SPACE");
//         // ArrayList<Kingdome> allies = new ArrayList<Kingdome>();

//         for(Input input : kingdomeMessage) {
//             ReciverKingdome kingdome = (ReciverKingdome)input.getKingdome();    
//             String secretMessage = input.getSecretMessage();
//             sender.send(kingdome, secretMessage);
//         }
//         alliance = sender.getAllianceArray();
//         if(alliance.size() < 3) {
//             // System.out.println("NONE");
//             return "NONE";
//         }
//         return alliance.toString();
        
//         // System.out.println();
//     }
// }