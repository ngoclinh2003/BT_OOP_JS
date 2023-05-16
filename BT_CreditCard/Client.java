package Day6.BT_CreditCard;

public class Client {
    public static void main(String[] args) {
        Card card = CardFactory.getCard("Platinun");
        if(card !=null){
            System.out.println(card.getCardType());
            System.out.println(card.getCreditlimit());
            System.out.println(card.getAnnualCharge());
            card.payment();
        }
    }
}
