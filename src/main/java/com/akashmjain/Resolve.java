// package com.akashmjain;

// import java.util.ArrayList;
// import java.io.*;

// class Resolve 
// {
// 	private UniverseOfSoutheros universeOfSoutheros;
// 	private ArrayList<UserInput> inputs; 


// 	public Resolve(ArrayList<UserInput> inputs) 
// 	{
// 		universeOfSoutheros = new UniverseOfSoutheros();
// 		this.inputs = inputs;

// 	}
// 	public ArrayList<Kingdome> getAllianceArray() 
//     {
//         ArrayList<Kingdome> alliance = new ArrayList<Kingdome>();
//         alliance.add(universeOfSoutheros.getKingdome("SPACE"));

//         for (UserInput input : inputs) 
//         {
//             Kingdome kingdome = universeOfSoutheros.getKingdome(input.getKingdomeName());
//             if(alliance.contains(kingdome));
            
//             else if(winOver(kingdome, input))
//             {
//                 alliance.add(kingdome);
//             }
            
//         }
//         return alliance;
//     }
//     private boolean winOver(Kingdome kingdome, UserInput input)
//     {
//         String secretMsg = input.getSecretMessage();
//         String encryptedEmblem = encrypt(kingdome.getKingdomeEmblem());

//         for(int i = 0; i < encryptedEmblem.length(); i++)
//         {
//             int index = secretMsg.indexOf(encryptedEmblem.charAt(i));
//             if(index == -1)
//             {   
//                 return false;
//             }
//             secretMsg = secretMsg.substring(0, index) + '$' + secretMsg.substring(index + 1); 
//         }
//         return true;
//     }



//     private String encrypt(String secret)
//     {   
//         String key = "";
//         int len = secret.length();

//         for (int i = 0; i < secret.length(); i++) {
//             if(secret.charAt(i) == ' ') {
//                 key = key + ' ';        
//             }
//             else {
//                 if ((secret.charAt(i) + len) > 90) {
//                     int t = (secret.charAt(i) + len) - 91;
//                     key = key + (char)(t + 'A');
//                 }
//                 else 
//                 {
//                     key = key + (char)(secret.charAt(i) + len);     
//                 }
//             }

//         }
//         return key;

//     }
// }