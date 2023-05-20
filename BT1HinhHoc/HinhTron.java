package Day8.BT1HinhHoc;

public class HinhTron implements IHinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double canh() {
        return canh();
    }
    @Override
    public double banKinh() {
        return banKinh;
    }
}
