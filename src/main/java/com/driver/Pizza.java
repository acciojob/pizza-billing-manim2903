package com.driver;

public class Pizza {

    private int price; // calculate the final price
    private Boolean isVeg;
    private String bill; //price of each item
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheesePrice=80;
        this.takeAwayPrice=20;

        if(isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }

        else {
            this.price=400;
            this.toppingsPrice=120;
        }
        // your code goes here

        this.isCheeseAdded=false; // to prevent being called multiple times
        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n"; // first line of the final bill
    }


    public int getPrice(){
        
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){ // to prevent adding extra cheese multiple times
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price=this.price+this.toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){ // to prevent generating the bill multiple times
            //to maintain the sequence in the bill
            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
//    Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470