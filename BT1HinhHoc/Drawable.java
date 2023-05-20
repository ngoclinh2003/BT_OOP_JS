package Day8.BT1HinhHoc;

public class Drawable {
    public void draw(IHinhHoc hinhHoc) {
        if (hinhHoc instanceof HinhVuong) {
            System.out.println("Vẽ ra HinhVuong[cạnh = " + ((HinhVuong) hinhHoc).canh() + "]");
        } else if (hinhHoc instanceof HinhTron) {
            System.out.println("Vẽ ra HinhTron[bán kính = " + ((HinhTron) hinhHoc).banKinh()+ "]");
        }
    }
}