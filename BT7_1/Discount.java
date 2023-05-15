package OOP.BT7_1;

public class Discount{
    private double premiumDiscount;
    private double goldDiscount;
    private double silverDiscount;
    private double productDiscount;

    public Discount(double premiumDiscount, double goldDiscount, double silverDiscount, double productDiscount) {
        this.premiumDiscount = premiumDiscount;
        this.goldDiscount = goldDiscount;
        this.silverDiscount = silverDiscount;
        this.productDiscount = productDiscount;
    }

    public double getServiceDiscount(String memberType) {
        if (memberType.equals("Premium")) {
            return premiumDiscount;
        } else if (memberType.equals("Gold")) {
            return goldDiscount;
        } else if (memberType.equals("Silver")) {
            return silverDiscount;
        } else {
            return 0;
        }
    }

    public double getProductDiscount() {
        return productDiscount;
    }
}