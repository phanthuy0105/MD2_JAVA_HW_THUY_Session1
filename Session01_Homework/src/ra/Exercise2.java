package ra;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Input: USD
        // Process: VND = USD*rate
        // Output: VND

        // 1. Khai báo rate giữa usd - vnd (hằng số)
        float rate = 23.5F;
        // 2. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);
        // 3. Thông báo nhập vào usd
        System.out.println("Nhập vào usd");
        // 4. Lưu giá trị nhập vào biến usd
        float usd = Float.parseFloat(scanner.nextLine());
        // 5. Tính vnd theo tỷ giá
        float vnd = usd * rate;
        // 6. In ra vnd
        System.out.println("Tỷ giá vnd là: " + vnd);
    }
}
