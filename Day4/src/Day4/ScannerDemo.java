package Day4;

import java.util.Scanner;
import java.io.*;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int rno;
		String name;
		System.out.println("Enter your name :");
		name = br.readLine();
		System.out.println("Enter your roll number :");
		rno = sc.nextInt();
		System.out.println("your name: "+name );
		System.out.println("Roll number :"+rno);

	}

}
