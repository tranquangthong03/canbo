public class NhanVien extends CanBo {
    private String congViec_141;

    public NhanVien(String hoTen_141, String ngaySinh_141, String gioiTinh_141,
                    String diaChi_141, String congViec_141) {
        super(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141);
        this.congViec_141 = congViec_141;
    }

    @Override
    public void hienThiThongTin_141() {
        super.hienThiThongTin_141();
        System.out.println("Công việc: " + congViec_141);
    }
}
