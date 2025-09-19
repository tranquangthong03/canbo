import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_141 = new Scanner(System.in);
        QLCB qlcb_141 = new QLCB();

        while (true) {
            System.out.println("\n===== MENU CÁN BỘ =====");
            System.out.println("1. Nhập cán bộ mới");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int chon_141 = sc_141.nextInt(); sc_141.nextLine();
            switch (chon_141) {
                case 1 -> qlcb_141.nhapCanBo_141(sc_141);
                case 2 -> {
                    System.out.print("Nhập họ tên cần tìm: ");
                    String hoTenTim_141 = sc_141.nextLine();
                    qlcb_141.timKiemTheoHoTen_141(hoTenTim_141);
                }
                case 3 -> qlcb_141.hienThiTatCa_141();
                case 4 -> {
                    System.out.println("Thoát chương trình.");
                    sc_141.close();
                    return;
                }
                default -> System.out.println("❗ Lựa chọn không hợp lệ!");
            }
        }
    }
}
