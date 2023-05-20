package Day8.BT1HinhHoc;

public class HinhVuong implements IHinhHoc {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double tinhChuVi() {
        return 4 * canh;
    }

    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public double canh() {
        return canh;
    }

    @Override
    public double banKinh() {
        return banKinh();
    }
}

