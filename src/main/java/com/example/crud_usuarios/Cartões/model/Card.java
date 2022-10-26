package com.example.crud_usuarios.Cartões.model;


public class Card {
    private long id;
    private long cardNumber;
    private int validThru;
    private String cardholderName;
    private int securityCode;
    private int memberSince;
    private String bank;
    private String cardName;
    private int limit;
    private String typeCard; //credit or debit

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getValidThru() {
        return validThru;
    }

    public void setValidThru(int validThru) {
        this.validThru = validThru;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(int memberSince) {
        this.memberSince = memberSince;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }
}

