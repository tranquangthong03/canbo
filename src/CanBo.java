public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {}

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public void hienThiThongTin() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, Giới tính: %s, Địa chỉ: %s%n",
                hoTen, ngaySinh, gioiTinh, diaChi);
    }
}
