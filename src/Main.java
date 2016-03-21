
import java.io.File;
import java.io.PrintWriter;

import org.linuxy.config.scanner;
import org.linuxy.etc.*;
public class Main {

	public static void main(String[] args) throws Exception {
        // Checking if config file exts
		File config = new File("OAUTH.conf");
		if(config.exists() && !config.isDirectory()) { 
		  System.out.println("Config File Exists! Skipping...");
		  
		}
		//if not create one
		else {
			
			System.out.println("Config file must be somewhere... aka Creating a new one!");
		}
		
		scanner.getClientId();
		scanner.getClientSec();

	}

}
