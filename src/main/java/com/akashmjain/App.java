package com.akashmjain;
import com.akashmjain.core.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;



public class App {
    public static void main(String []args) {
        try {
            String fileName = args[0]; 
            Universe universe = populateUniverseWithKingdomes(); 
            ArrayList<Input> kingdomeMessage = getInputsFromFile(fileName, universe);


            SenderKingdome sender =  (SenderKingdome) universe.getKingdomeByName("SPACE");
            ArrayList<Kingdome> allies = new ArrayList<Kingdome>();

            for(Input input : kingdomeMessage) {
                ReciverKingdome kingdome = (ReciverKingdome)input.getKingdome();    
                String secretMessage = input.getSecretMessage();
                sender.send(kingdome, secretMessage);
                if(allies.contains(kingdome));
                else if(kingdome.isAllied(sender)) {
                    allies.add(kingdome);
                }

            }
            if(allies.size() < 3) {
                System.out.println("NONE");
                return;
            }
            System.out.print(sender.getName());
            for(Kingdome kingdome : allies) {
                System.out.print(" "+kingdome.getName());
            }
            System.out.println();

        } catch(Exception e) {
            System.out.println("GIVE PROPER FILENAME AS AN INPUT");
        }
    }
    public static Universe populateUniverseWithKingdomes() {
        Universe universeOfSoutheros = new Universe(); 
        universeOfSoutheros.addKingdome(new SenderKingdome("SPACE", "GORILLA")); 
        universeOfSoutheros.addKingdome(new ReciverKingdome("LAND", "PANDA"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("WATER", "OCTOPUS"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("ICE", "MAMMOTH"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("AIR", "OWL"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("FIRE", "DRAGON"));
        return universeOfSoutheros;
    }

    
    public static ArrayList<Input> getInputsFromFile(String fileName, Universe universe) throws Exception {
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
}
