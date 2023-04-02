import java.util.Scanner;

public class computeBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your BMI data：");
		int bmi = input.nextInt();
		if(bmi >= 30)
			System.out.println("Too Fat~");
		else if(bmi>=25)
			System.out.println("FAT!");
		else if(bmi>=18.5)
			System.out.println("OK~~~");
		else
			System.out.println("Too Sin");
			
		

	}

}
