package Gregorian;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Date d = new Date();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�⵵�� �Է��ϼ��� : ");
			d.setYear(sc.nextInt()); 
			
			System.out.print("���� �Է��ϼ��� : ");
			d.setMonth(sc.nextInt()); 
			
			System.out.print("���� �Է��ϼ��� : ");
			d.setDay(sc.nextInt()); 
			
			char msg = d.getWeekDay();
			
			System.out.printf("%d�� %d�� %d���� %s���� �Դϴ�.\n", d.getYear(), d.getMonth(), d.getDay(), msg);
		}

	}

}
