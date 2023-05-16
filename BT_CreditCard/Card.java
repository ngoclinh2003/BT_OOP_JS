package Day6.BT_CreditCard;

public interface Card {
    String getCardType();
    int getCreditlimit();
    int getAnnualCharge();

    void payment();

}
