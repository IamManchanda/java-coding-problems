/**
 * Problem: Enter cost of 3 items from the user (using float data
 * type) - a pencil,a pen and an eraser. You have to output the total cost of
 * the items back to the user as their bill. (Add on : You can also try adding
 * 18% gst tax to the items in the bill as an advanced problem)
 */

public class Solution {
    public float calculateBill(float pencilPrice, float penPrice, float eraserPrice) {
        return pencilPrice + penPrice + eraserPrice;
    }

    public float calculateBillWithGst(float bill) {
        return bill + (bill * 0.18f);
    }
}

/*
 * Enter the price of pencil:
 * 20
 * 
 * Enter the price of pen:
 * 10
 * 
 * Enter the price of eraser:
 * 12
 * 
 * Total bill:
 * 42.0
 * 
 * Total bill with GST:
 * 49.56
 */