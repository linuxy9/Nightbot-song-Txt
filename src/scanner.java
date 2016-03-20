import java.util.Scanner;


class scanner {

	private static Scanner API_input = new Scanner(System.in);

	public static void APIKEYINPUT() {
		System.out.print("- ( Enter API KEY )>>>>");
		info.APIKey = API_input.nextLine();
		System.out.println(info.APIKey);

	}
	
	
	public static void APISECKEYINPUT() {
		System.out.print("- ( Enter API SECRATE KEY )>>>>");
		info.APIsecret = API_input.nextLine();
		System.out.println(info.APIsecret);

	}


}
