package ra;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Input: a
        // Process: P = a * 4, S = a * a
        // Output: P và S

        // 1. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);
        // 2. Thông báo nhập vào độ dài cạnh của hình vuông
        System.out.println("Nhập vào độ dài cạnh của hình vuông: ");
        // 3. Lưu giá trị nhập vào biến độ dài cạnh của hình vuông
        int squareSideLength = scanner.nextInt();
        // 4. Tính chu vi hình vuông
        int perimeter = squareSideLength * 4;
        // Tính diện tích hình vuông
        int acreage = squareSideLength*squareSideLength;
        // 5. In ra kết quả
        System.out.println("Chu vi hình vuông là: " + perimeter);
        System.out.println("Diện tích hình vuông là: " + acreage);
    }
}
