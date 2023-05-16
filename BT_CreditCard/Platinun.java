package Day6.BT_CreditCard;

public class Platinun implements Card{

    private String privateKey;

    public Platinun(String privateKey) {
        this.privateKey = privateKey;
    }
    @Override
    public String getCardType() {
        return "Platinun";
    }

    @Override
    public int getCreditlimit() {
        return 10000;
    }

    @Override
    public int getAnnualCharge() {
        return 100;
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua Platinun");
    }
}
