package Gregorian;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) 	{ 	this.year  = year;	}
	public void setMonth(int month) { 	this.month = month;	}
	public void setDay(int day) 	{ 	this.day   = day;	}
	
	
	public int getYear() 			{	return this.year;	}
	public int getMonth() 			{	return this.month; 	}
	public int getDay() 			{	return this.day; 	}
	

	// 1. �������� �Ǵ�
	public boolean isLeapYear(int y) {
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)  
			return true;
		return false;
	}
	
	// 2. �� ���� ���� ã��
	public int getMonthLastDay(int y, int m) {

		if(m == 2)						
			return isLeapYear(y) ? 29 : 28;
	
		int[] month31 = {1, 3, 5, 7, 8, 10, 12};
		for(int num: month31) {
			if(m == num)
				return 31;
		}
		
		int[] month30 = {4, 6, 9, 11};
		for(int num: month30) {
			if(m == num)
				return 30;
		}
		
		return 0;
		
	}
	
	// 3. ��¥ �Է½� �ش� ���� ã��
	public char getWeekDay() {
		int totalDay = 0;
		int tmpYear = 1;
		int tmpMonth = 1;
		
		// ���⵵������ �� ��
		for(int i=1; i < this.year; i++) {
			for(int j=1; j<=12; j++) {
				totalDay += getMonthLastDay(i, j);
			}
		}
		
		// ���� �����ޱ����� �� ��
		for(int j=1; j < this.month; j++) 
			totalDay += getMonthLastDay(this.year, j);
				
		// �̹��� ��¥ �� ��
		totalDay += (this.day - 1);
		
		// ���� ���ϱ�
		char[] wd = {'��', 'ȭ', '��', '��', '��', '��', '��'};
		int week = totalDay % 7;
		
		return wd[week];
	}
}