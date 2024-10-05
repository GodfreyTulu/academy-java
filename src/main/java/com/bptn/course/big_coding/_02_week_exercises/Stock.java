package com.bptn.course.big_coding._02_week_exercises;


public class Stock {

    // Create instance variables 
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShare;
    long marketCap;

    // Parameterized Constructor 
    public Stock (String tickerSymbol, String companyName, int price, int totalShare){

        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.price = price;
        this.totalShare = totalShare;
        this.percentChange = 0;
        this.marketCap = totalShare * price;
    }
    
    // Create the methods 
    public void adjustPrice(int change){

        price = price + change;
        percentChange = ((double)change/price) * 100;
        marketCap = totalShare * price;
    }

    public String toString(){

        // Codes before return help us specify the percentChange for 0% to non zero percentChange 
        //and roundoff accordingly to the given instruction.

        String formattedPercentChange;

        // If percentChange is zero (first instance), format to 1 decimal place
        if (percentChange == 0) {
        formattedPercentChange = String.format("%.1f", percentChange);
        } 

        else {
        // For non-zero percentChange (after price adjustment), format to 16 decimal places
        formattedPercentChange = String.format("%.16f", percentChange);
        }

        return "Ticker Symbol: " + "GOOG" + "\n" + "Company: " + "Google, Inc." + "\n" + "Current Price: $" + price + " (" + formattedPercentChange + "%)" + "\n" + "Market Cap: $" + marketCap;
    }

    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

