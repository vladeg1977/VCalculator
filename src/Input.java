import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("Output:");
        System.out.println(Calculate.calculate(line));
    }
}
