import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		 boolean isLeapYear =(year % 4==0&&year % 100!=0)||(year%400==0);
		System.out.println("year"+year+"is lear year?"+isLeapYear);

	}

}
