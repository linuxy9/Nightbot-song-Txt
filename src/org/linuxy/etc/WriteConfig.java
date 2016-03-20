package org.linuxy.etc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.linuxy.etc.info;
@SuppressWarnings("unused")
public class WriteConfig  {
	
	public static void WriteConfigVoid() throws IOException {
		    PrintWriter config1 = new PrintWriter("OAUTH.conf" , "UTF-8");
	        config1.println("#--------OAuth2.0 Client Configuration---------");
	        config1.println("grant_type=client_credentials");
	        config1.println("client_id=" + info.CLIENT_ID);
	        config1.println("client_secret=" + info.CLIENT_SECRET);
	        config1.println("access_token=");
	        config1.println("#===================================");
	        config1.println("# DO NOT CHANGE ANY VALUES BELOW!");
	        config1.println("#===================================");
	        config1.println("authentication_server_url=https://api.nightbot.tv/oauth2/authorize");
	        config1.println("resource_server_url=https://api.nightbot.tv/oauth2/token");
	        config1.println("#------------------------------------------------");
	        config1.close();
		}     
		
		
	}

