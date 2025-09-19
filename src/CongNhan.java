public class CongNhan extends CanBo {
    private String bac_141;

    public CongNhan(String hoTen_141, String ngaySinh_141, String gioiTinh_141,
                    String diaChi_141, String bac_141) {
        super(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141);
        this.bac_141 = bac_141;
    }

    @Override
    public void hienThiThongTin_141() {
        super.hienThiThongTin_141();
        System.out.println("Bậc: " + bac_141);
    }
}
