<<<<<<< HEAD

import java.io.File;
import java.io.PrintWriter;

import org.linuxy.config.scanner;
import org.linuxy.etc.*;
public class Main {

	public static void main(String[] args) throws Exception {
        // Checking if config file exts
=======
import org.linuxy.etc.WriteConfig;
import java.io.File;
import java.io.PrintWriter;

import org.linuxy.etc.info;
import org.linuxy.etc.scanner;
import com.ibm.oauth.*;
public class Main {

	public static void main(String[] args) throws Exception {
		
		// Checking if config file exts
>>>>>>> e4dfb5ffe29c63437c689961e74619392207050f
		File config = new File("OAUTH.conf");
		if(config.exists() && !config.isDirectory()) { 
		  System.out.println("Config File Exists! Skipping...");
		  
		}
		//if not create one
		else {
			
			System.out.println("Config file must be somewhere... aka Creating a new one!");
<<<<<<< HEAD
		}
		
		scanner.getClientId();
		scanner.getClientSec();
=======
			scanner.APIKEYINPUT();
			
			scanner.APISECKEYINPUT();
			WriteConfig.WriteConfigVoid();
		}
		//Making A OAUTH to the Nightbot AUTH Server
		OAuth2Client.AUTH_2();
>>>>>>> e4dfb5ffe29c63437c689961e74619392207050f

	}

}
