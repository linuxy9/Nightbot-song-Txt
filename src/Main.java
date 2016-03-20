import org.linuxy.etc.WriteConfig;
import java.io.File;
import java.io.PrintWriter;

import org.linuxy.etc.info;
import org.linuxy.etc.scanner;
import com.ibm.oauth.*;
public class Main {

	public static void main(String[] args) throws Exception {
		//Get the api Keys
		
		
		
		// Checking if config file exts
		File config = new File("OAUTH.conf");
		if(config.exists() && !config.isDirectory()) { 
		  System.out.println("Config File Exists! Skipping...");
		  
		}
		//if not create one
		else {
			
			System.out.println("Config file must be somewhere... aka Creating a new one!");
			scanner.APIKEYINPUT();
			if (info.CLIENT_ID == null) {
				System.out.println("Thats Not Vald. Exiting....");
				System.exit(0);
			}
			
			scanner.APISECKEYINPUT();
			
			if (info.CLIENT_SECRET == null) {
				System.out.println("Thats Not Vaid. Exiting...");
				System.exit(0);
			}
			WriteConfig.WriteConfigVoid();
		}
		//Making A OAUTH to the Nightbot AUTH Server
		OAuth2Client.AUTH_2();

	}

}
