public class KySu extends CanBo {
    private String nganhDaoTao_141;

    public KySu(String hoTen_141, String ngaySinh_141, String gioiTinh_141,
                String diaChi_141, String nganhDaoTao_141) {
        super(hoTen_141, ngaySinh_141, gioiTinh_141, diaChi_141);
        this.nganhDaoTao_141 = nganhDaoTao_141;
    }

    @Override
    public void hienThiThongTin_141() {
        super.hienThiThongTin_141();
        System.out.println("Ngành đào tạo: " + nganhDaoTao_141);
    }
}
