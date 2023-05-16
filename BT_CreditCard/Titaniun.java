package Day6.BT_CreditCard;

public class Titaniun implements Card{
    @Override
    public String getCardType() {
        return "Titaniun";
    }

    @Override
    public int getCreditlimit() {
        return 1000000;
    }

    @Override
    public int getAnnualCharge() {
        return 1000;
    }

    @Override
    public void payment() {
        System.out.println("Trien khai cua Titaniun");
    }
}
