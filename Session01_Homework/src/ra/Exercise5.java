package ra;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Input: r
        // Process: P = 2 * pi * r, S = pi * r * r
        // Output: P và S

        // 1. Khai báo pi (hằng số)
        final double pi = 3.1415926535897;
        // 2. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);
        // 3. Thông báo nhập vào bán kính đường tròn
        System.out.println("Nhập vào bán kính đường tròn: ");
        // 4. Lưu giá trị nhập vào bán kính hình tròn
        int circleRadius = scanner.nextInt();
        // 5. Tính chu vi của đường tròn
        double perimeter = 2 * pi * circleRadius;
        // Tính diện tích của đường tròn
        double acreage = pi * circleRadius * circleRadius;
        // 6. In ra kết quả
        System.out.println("Chu vi của đường tròn là: " + perimeter);
        System.out.println("Diện tích của đường tròn là: " + acreage);
    }
}
