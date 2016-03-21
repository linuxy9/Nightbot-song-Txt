package org.linuxy.etc;
import java.util.Scanner;


public class scanner {

	private static Scanner API_input = new Scanner(System.in);

	public static void APIKEYINPUT() {
		System.out.print("- ( Enter API KEY )>>>>");
		info.CLIENT_ID = API_input.nextLine();
		System.out.println(info.CLIENT_ID);

	}
	
	
	public static void APISECKEYINPUT() {
		System.out.print("- ( Enter API SECRATE KEY )>>>>");
		info.CLIENT_SECRET = API_input.nextLine();
		System.out.println(info.CLIENT_SECRET);

	}


}
