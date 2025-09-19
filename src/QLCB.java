import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> danhSachCanBo_141 = new ArrayList<>();

    public void nhapCanBo_141(Scanner sc_141) {
        System.out.print("Nhập loại cán bộ (1-Công nhân, 2-Kỹ sư, 3-Nhân viên): ");
        int loai_141 = sc_141.nextInt(); sc_141.nextLine();

        System.out.print("Họ tên: ");
        String hoTen_141 = sc_141.nextLine();
        System.out.print("Ngày sinh: ");
        String ngaySinh_141 = sc_141.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh_141 = sc_141.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi_141 = sc_141.nextLine();

        switch (loai_141) {
            case 1 -> {
                System.out.print("Bậc công nhân: ");
                String bac_141 = sc_141.nextLine();
                danhSachCanBo_141.add(new CongNhan(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141, bac_141));
            }
            case 2 -> {
                System.out.print("Ngành đào tạo: ");
                String nganhDaoTao_141 = sc_141.nextLine();
                danhSachCanBo_141.add(new KySu(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141, nganhDaoTao_141));
            }
            case 3 -> {
                System.out.print("Công việc: ");
                String congViec_141 = sc_141.nextLine();
                danhSachCanBo_141.add(new NhanVien(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141, congViec_141));
            }
            default -> System.out.println("❗ Loại cán bộ không hợp lệ!");
        }
    }

    public void timKiemTheoHoTen_141(String hoTenTim_141) {
        boolean found_141 = false;
        for (CanBo cb_141 : danhSachCanBo_141) {
            if (cb_141.getHoTen_141().equalsIgnoreCase(hoTenTim_141)) {
                cb_141.hienThiThongTin_141();
                found_141 = true;
            }
        }
        if (!found_141) System.out.println("❗ Không tìm thấy cán bộ tên: " + hoTenTim_141);
    }

    public void hienThiTatCa_141() {
        for (CanBo cb_141 : danhSachCanBo_141) {
            cb_141.hienThiThongTin_141();
            System.out.println("-----------------");
        }
    }
}
