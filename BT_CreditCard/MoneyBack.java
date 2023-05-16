package Day6.BT_CreditCard;

public class MoneyBack implements Card{
    @Override
    public String getCardType(){
        return "MoneyBank";
    }

    @Override
    public int getCreditlimit() {
        return 1000;
    }

    @Override
    public int getAnnualCharge() {
        return 10;
    }
    @Override
    public void payment(){
        System.out.println("Trien khai rieng cua MoneyBank");
    }
}
