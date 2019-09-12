

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        int total = okand(sc);
        System.out.println("Det totala är " + total);

    }

    public static int okand(Scanner sc) {
        int total = 0;
        int i=0;
        int random = (int)(Math.random() * 10);
        while(i < random) {
            System.out.println("Skriv in ett heltal");
            int in = sc.nextInt();
            total += in;
            i++;

        }

        return total;
    }


	}