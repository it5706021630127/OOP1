import java.util.Scanner;
import java.lang.*;

public class Trik {
	public static void main(String[] args) {
		String pattern=" ";
		byte g1=1,g2=0,g3=0;
		byte temp = 0;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter Pattern (A,B,C) : ");
			pattern = scan.nextLine();
			if(pattern.length() > 50){
				System.out.println("Invalid. Please input again!!!");
			}
		} while (pattern.length() > 50);
		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == 'A' || pattern.charAt(i) == 'a') {
				temp =g1;
				g1 = g2;
				g2 = temp;
			} else if (pattern.charAt(i) == 'B' || pattern.charAt(i) == 'b') {
				temp = g2;
				g2 = g3;
				g3 = temp;
			} else if (pattern.charAt(i) == 'C' || pattern.charAt(i) == 'c') {
				temp = g1;
				g1 = g3;
				g3 = temp;
			}
		}
		if (g1 == 1) {
			System.out.println("Ball in glass : 1");
		} else if (g2 == 1) {
			System.out.println("Ball in glass : 2");
		} else if (g3 == 1) {
			System.out.println("Ball in glass : 3");
		}
	}
}