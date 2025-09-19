public class CanBo {
    private String hoTen_141;
    private String ngaySinh_141;
    private String gioiTinh_141;
    private String diaChi_141;

    public CanBo(String hoTen_141, String ngaySinh_141, String gioiTinh_141, String diaChi_141) {
        this.hoTen_141 = hoTen_141;
        this.ngaySinh_141 = ngaySinh_141;
        this.gioiTinh_141 = gioiTinh_141;
        this.diaChi_141 = diaChi_141;
    }

    public String getHoTen_141() { return hoTen_141; }
    public void setHoTen_141(String hoTen_141) { this.hoTen_141 = hoTen_141; }

    public void hienThiThongTin_141() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, Giới tính: %s, Địa chỉ: %s%n",
                hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141);
    }
}
