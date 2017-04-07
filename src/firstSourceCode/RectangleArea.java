package firstSourceCode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short a = Short.parseShort(scanner.nextLine());
        short b = Short.parseShort(scanner.nextLine());

        int result = a * b;

        System.out.println(result);
    }
}
