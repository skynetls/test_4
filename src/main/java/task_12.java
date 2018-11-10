import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s1 = scanner.nextLine();
        System.out.println("Введите строку: ");
        String s2 = scanner.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2){
            System.out.println("Строка с наибольшей длинной: "+s1);
        }
        else {
            System.out.println("Строка с наибольшей длинной: "+s2);
        }
        scanner.close();
    }
}
