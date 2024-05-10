package ra;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Input: Toan, Van, Anh
        // Process: DTB = (Toan+Van+Anh)/3
        // Output: DTB
        // 1. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Thông báo nhập vào Toán
        System.out.println("Nhập vào điểm Toán: ");
        float mathScores = scanner.nextFloat();
        // 3. Lưu giá trị nhập vào biến Toán

        // Thông báo nhập vào Văn
        System.out.println("Nhập vào điểm Văn: ");
        // 3. Lưu giá trị nhập vào biến Văn
        float literatureScore = scanner.nextFloat();

        // Thông báo nhập vào Anh
        System.out.println("Nhập vào điểm Anh: ");
        // 3. Lưu giá trị nhập vào biến Anh
        float englishScore = scanner.nextFloat();

        // 4. Tính điểm trung bình 3 môn
        float avgMark = (mathScores + literatureScore + englishScore) / 3;
        // 5. In ra kết quả
        System.out.println("Điểm trung bình của 3 môn: " + avgMark);
    }
}
