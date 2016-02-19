import java.io.*;
import java.util.Scanner;
public class Trik_method {
public static void main(String args[]){
	String input ;
	byte a=1,b=0,c=0,d=0;
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter (ABC) :");
	input = scan.nextLine().toUpperCase();
	swap(input, a, b, c, d);
}
public static void swap(String input , byte a, byte b, byte c, byte d){
	while(d!=input.length()){
	byte  temp = 0;
		if(input.charAt(d)=='A'){
			temp=a;
			a=b;
			b=temp;
		}
		else if (input.charAt(d)=='B'){
			temp=b;
			b=c;
			c=temp;
		}
		else if (input.charAt(d)=='C'){
			temp=a;
			a=c;
			c=temp;
		}
		d++;
	}
	print(a, b, c);
}
public static void print(byte a, byte b, byte c){
	if(a==1){
		System.out.println("ball in glass 1");
	}
	else if (b==1){
		System.out.println("ball in glass 2");
	}
	else if (c==1){
		System.out.println("ball in glass 3");
	}
}
}
