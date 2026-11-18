/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Store {
    public static boolean saveContent(PasswordDto pass) {
        try {
          trySaveContent(pass);
          return true;
        } catch (IOException e) {
            System.out.println("Hiba! A kiírás sikertelen");
            e.printStackTrace();
            return false;
        }
    }
    
    public static void trySaveContent(PasswordDto pass) throws IOException{
        FileWriter fileWriter = new FileWriter(
            "pass.txt", 
            Charset.forName("UTF-8"), 
            true
        );
        String line = pass.username + ":" + 
        pass.password + ":" + 
        pass.place + "\n";
        fileWriter.write(line);
        fileWriter.close();
    }
}
