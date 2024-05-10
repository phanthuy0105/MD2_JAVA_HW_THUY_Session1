package ra;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);
        // 2. Thông báo nhập vào tên
        System.out.println("Nhập vào tên: ");
        // 3. Lưu giá trị nhập vào biến tên
        String nameHello = scanner.nextLine();
        // 4.In ra xin chào
        System.out.println("Hello: " + nameHello);
    }
}
