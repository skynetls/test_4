import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();

        String noSpace = s.replaceAll(" ", "");

        System.out.println(noSpace);
    }
}