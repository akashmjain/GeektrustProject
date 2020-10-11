# GeektrustProject
This is akashmjain in this repository i am working on [Tame Of Thrones](https://www.geektrust.in/coding-problem/backend/tame-of-thrones), a problem by Geektrust.in 
### get the code working
To execute the following project simply go to the project directory and execute the following commands.
```bash
# to run java using gradle 
./gradlew run --args="path to output file"
OR
# to generate jar file in ./build/libs/  
# jar file will be named geektrust.jar
./gradlew build 
```
### Working of a project 
this project consist of 3 parts,
* core
* input_files
* api_user (that is outer java files)

#### core 
In this module there are Multiple classes Kingdom, Universe, ReciverKingdom, SenderKingdom, Cipher.<br>
both sender and reciver Kingdom, extends the Kingdome class, both have there spcial traits.<br>
Cipher class is responsible for encryption and decryption services.<br>
Universe class is responsible for holding all the Kingdoms together<br>

#### input_files
here only Input class is present it's job is to hold user input properly in format.
#### api_user
this are the outer files in com.akashmjain package namely App and Resolve class. <br>
App is a place where main method is executed.
Resolve class is used to lower the complexity of App class.


