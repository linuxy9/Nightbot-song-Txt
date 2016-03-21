package org.linuxy.config;

import java.io.File;
import org.linuxy.config.scanner;
public class read {

	public static void CheckConfig()
	{
		File config = new File("OAUTH.conf");
		if (config.exists() && !config.isDirectory()) {
			System.out.println("Config File Exists! Skipping...");

		}
		// if not create one
		else {

			System.out.println("Config File Not Found... Creating One!");
		    scanner.getClientId();
		    scanner.getClientSec();
		    
			
		}

	}

}
