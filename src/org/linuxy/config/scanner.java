package org.linuxy.config;
import org.linuxy.etc.AuthPW;

import java.util.Scanner;

public class scanner {
	static Scanner client = new Scanner(System.in);
	
	public static void getClientId() {
		System.out.println("Please Type in ClientID>>");
		AuthPW.CLIENT_ID = client.nextLine();
		
		if (AuthPW.CLIENT_ID == null) {
			System.out.println("ERROR: NO INPUT");
			System.exit(0);
			
		}
		else {
			
		    System.out.println("Succfully verifyed CLIENT_ID");
		}
		
	}
	
	public static void getClientSec() {
		System.out.println("Please Input Client Secrate>>");
		AuthPW.Client_SEC = client.nextLine();
		if (AuthPW.Client_SEC == null) {
			System.out.println("ERROR: NO INPUT");
			System.exit(0);
			
		}
		else {
			System.out.println("Succfully Verifyed CLIENT_SEC");
			
		}
	}

}
