package Day6.BT_CreditCard;

public class CardFactory {
    private CardFactory() {
    }

    public static Card getCard(String Card) {
        switch (Card) {
            case "MoneyBack":
                return new MoneyBack();
            case "Platinun":
                return new Platinun("1234");
            case "Titaniun":
                return new Titaniun();
            default:
                return null;
        }
    }
}
