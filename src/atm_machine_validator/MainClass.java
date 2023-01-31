package atm_machine_validator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the card Details ");


        // Enter Card Number

        System.out.println("Please Enter the card Number ");
        String card = sc.next();
        if(! isValidCard(card)) {
            try {
                throw new CardNotValidException();
            }
            catch(CardNotValidException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }

        // Enter Pin

        System.out.println("Please Enter the card  Pin");
        String pin = sc.next();
        if(! isValidPin(pin)) {
            try {
                throw new CardPinNotValidException();
            }
            catch(CardPinNotValidException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }


        // Enter Amount

        System.out.println("Please Enter the Amount ");
        int amount = 0;
        try {
            amount = sc.nextInt();
            if(!isValidAmount(amount)) {
                try {
                    throw new AmountNotValidException();
                }
                catch(AmountNotValidException e) {
                    System.out.println(e.getMessage());
                    System.exit(1);
                }
            }


        }catch(InputMismatchException e) {
            System.out.println("Invalid Amount"+ amount);
            System.out.println("Amount must be in integer");

            System.exit(1);
        }

        System.out.println("Amount withdraw succefully");

    }

    public static boolean isValidCard(String card) {
        int len = card.length();
        if(len != 12) return false;
        for(int i = 0; i < len; i++) {
            char c = card.charAt(i);
            if(c < 0 && c > 9) return false;
        }
        return true;
    }

    public static boolean isValidPin(String pin) {
        int len = pin.length();
        if(len != 4) return false;
        for(int i = 0; i < len; i++) {
            char c = pin.charAt(i);
            if(c < 0 && c > 9) return false;
        }
        return true;
    }
    public static boolean isValidAmount(int amount) {
        if(amount < 500 || amount > 25000) return false;
        return true;
    }



}
class CardPinNotValidException extends Exception {

    public CardPinNotValidException(){
        super("invalid pin");
    }
            CardPinNotValidException(String message)
            {
                super(message);
            }

}
class CardNotValidException extends Exception {

    public CardNotValidException() {
        super("length of card is invalid");
    }
    CardNotValidException(String message)
    {
        super(message);
    }

}
class AmountNotValidException extends Exception {


    public AmountNotValidException(){
        super("please enter valid amount");
    }

        AmountNotValidException(String message)
        {
            super(message);
        }

}