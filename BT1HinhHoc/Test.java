package Day8.BT1HinhHoc;

class Test {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(5);
        HinhTron hinhTron = new HinhTron(10);
        Drawable drawable = new Drawable();

        drawable.draw(hinhVuong);
        drawable.draw(hinhTron);
    }
}
