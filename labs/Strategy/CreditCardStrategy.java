/**
 * Credit card payment class.
 * Lab Assignment: Strategy
 * @author Rifa Safeer Shah and Michael Zaragoza
 * 12/04/19
 */
package StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {
    /** The name of the card user */
    private String name;
    /** The card number of the card */
    private String cardNumber;
    /** The security code of the card */
    private String cvv;
    /** The date of expiration of the card */
    private String dateOfExpiry;

    /**
     * Creates a new credit card.
     * @param name The name of the card user.
     * @param cardNumber The card number.
     * @param cvv The security code for the card.
     * @param dateOfExpiry The date of expiration of the card.
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    /**
     * Returns amount paid with buyer's info.
     * @param amount The amount paid.
     */
    @Override
    public void pay(double amount) {
        System.out.println("You have paid $" + amount + " with your credit card with Name: " + this.name + " and with Card Number: " + this.cardNumber);
    }
}
