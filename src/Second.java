
import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv det som du vill ha bakl�nges");
		String str = sc.nextLine();
		String backwards = reverse(str);
		System.out.println("Det blir " + "'" + backwards + "'" + " bakl�nges");
	}
	
	public static String reverse(String str) {
		if(str.isEmpty())
			return str;

		return reverse(str.substring(1)) + str.charAt(0);
	}


}