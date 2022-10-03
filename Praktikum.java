package first_project;
import java.util.Scanner;

public class Praktikum {

   public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите год:");
			int year = scanner.nextInt();

			if (isLeapYear(year)) {
			    System.out.println("Leap year");
			}
			else {
				System.out.println("Not leap year");
			}
		}
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0) {
        	return true;
        }
        else if(year % 100 == 0) {
        	return false;
        }
        else if(year % 4 == 0) {
        	return true;
        }
        else {
        	return false;
        }
    } 
}
