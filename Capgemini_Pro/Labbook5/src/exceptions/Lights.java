package exceptions;
import java.util.Scanner;
class Lights{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		
		System.out.println("Please Enter your choice among Red, Yellow , Green");

		String choice =  scan.nextLine();

		switch(choice){
			case "Red":
			System.out.println("STOP");
			break;
			case "Yellow":
			System.out.println("READY");
			break;
			case "Green":
			System.out.println("GO");
			break;
			default:
			System.out.println("No Match Found");
		}
	}
}