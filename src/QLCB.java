import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSach = new ArrayList<>();

    // Nhập thông tin cán bộ mới
    public void nhapCanBo(Scanner sc) {
        System.out.println("Chọn loại cán bộ: 1-Công nhân, 2-Kỹ sư, 3-Nhân viên");
        int loai = sc.nextInt();
        sc.nextLine(); // bỏ dòng trống

        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();

        switch (loai) {
            case 1 -> {
                System.out.print("Bậc công nhân: ");
                int bac = sc.nextInt();
                danhSach.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
            }
            case 2 -> {
                System.out.print("Ngành đào tạo: ");
                String nganh = sc.nextLine();
                danhSach.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
            }
            case 3 -> {
                System.out.print("Công việc: ");
                String congViec = sc.nextLine();
                danhSach.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, congViec));
            }
            default -> System.out.println("Loại không hợp lệ!");
        }
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoTen(String ten) {
        boolean found = false;
        for (CanBo cb : danhSach) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                cb.hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("❗ Không tìm thấy cán bộ có tên: " + ten);
        }
    }

    // Hiển thị tất cả cán bộ
    public void hienThiTatCa() {
        for (CanBo cb : danhSach) {
            cb.hienThiThongTin();
            System.out.println("-----------------");
        }
    }
}
