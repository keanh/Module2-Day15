import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác");
        try {
            float a = Float.parseFloat(scanner.nextLine());
            float b = Float.parseFloat(scanner.nextLine());
            float c = Float.parseFloat(scanner.nextLine());
            if (a + b >= c && a + c >= b && b + c >= a && a > 0 && b > 0 && c > 0) {
                System.out.println("Đây là 3 cạnh của 1 tam giác");
            } else {
                System.out.println("Không phải 3 cạnh của 1 tam giác");
            }
        } catch (NumberFormatException e) {
            System.out.println("Đây không phải là số");
        }
    }
}
