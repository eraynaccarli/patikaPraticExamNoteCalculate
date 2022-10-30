package patikaNotOrtalamasý;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Math grade: ");
		int math = sc.nextInt();
		
		System.out.println("Physics grade: ");
		int physics = sc.nextInt();
		
		System.out.println("Chemical grade: ");
		int chemical = sc.nextInt();
		
		System.out.println("Turkish grade: ");
		int turkish = sc.nextInt();
		
		System.out.println("History grade: ");
		int history = sc.nextInt();
		
		System.out.println("Music grade: ");
		int music = sc.nextInt();
		
		double overall = (math + physics + chemical + turkish + history + music) / 6;
		System.out.println("overall avarage: " + overall);

	}

}
