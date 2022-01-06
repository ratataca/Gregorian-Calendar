package Gregorian;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Date d = new Date();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("년도를 입력하세요 : ");
			d.setYear(sc.nextInt()); 
			
			System.out.print("월을 입력하세요 : ");
			d.setMonth(sc.nextInt()); 
			
			System.out.print("일을 입력하세요 : ");
			d.setDay(sc.nextInt()); 
			
			char msg = d.getWeekDay();
			
			System.out.printf("%d년 %d월 %d일은 %s요일 입니다.\n", d.getYear(), d.getMonth(), d.getDay(), msg);
		}

	}

}
