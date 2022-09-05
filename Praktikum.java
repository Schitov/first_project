package first_project;
import java.util.Scanner;

public class Praktikum {
    // Код отличный, названия переменных и методов понятные, потоки автоматически закрываются, поведение ожидаемое и реальное совпадают, проверка в отдельном методе.
    // Возможно ли модифицировать код, чтобы можно было проверить несколько годов и потом нажать выход.
    // Иными словами можно ли добавить мини меню с сохранением try-with-resources
    // 1 - Проверить год
    // 2 - Завершить работу программы
    // Всё это конечно только при наличии желания!
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
