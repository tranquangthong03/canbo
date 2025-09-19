import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int chon = sc.nextInt();
            sc.nextLine(); // Bỏ dòng trống

            switch (chon) {
                case 1 -> qlcb.nhapCanBo(sc);
                case 2 -> {
                    System.out.print("Nhập họ tên cần tìm: ");
                    String ten = sc.nextLine();
                    qlcb.timKiemTheoTen(ten);
                }
                case 3 -> qlcb.hienThiTatCa();
                case 4 -> {
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                }
                default -> System.out.println("❗ Lựa chọn không hợp lệ!");
            }
        }
    }
}
