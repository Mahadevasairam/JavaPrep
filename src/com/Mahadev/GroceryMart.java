package com.Mahadev;

public class GroceryMart{
    private String CustomerName;
    private String CustomerID;
    private long PhoneNumber;
    private int CustomerACbalance;
    private String CustomerAddress;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getCustomerACbalance() {
        return CustomerACbalance;
    }

    public void setCustomerACbalance(int customerACbalance) {
        CustomerACbalance = customerACbalance;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public void shop(double amount){
        if (CustomerACbalance >= amount){
            double remainBal = CustomerACbalance - amount;
            System.out.println("thanks for Shopping. Your Remaining balance is: "+remainBal);
            CustomerACbalance = (int) remainBal;
        }else{
            double lowamount = amount - CustomerACbalance;
            System.out.println("Insufficient amount.Please Recharge RS.:"+lowamount);
        }
    }
    public void RecAcc(double recharge){
        CustomerACbalance += recharge;
        System.out.println("Your new AccBal :"+CustomerACbalance);

    }
    public static void main(String[] args) {
        GroceryMart gm = new GroceryMart();
        gm.setCustomerName("Mahadev");
        gm.setCustomerACbalance(1000);
        gm.setCustomerID("0001");
        gm.setPhoneNumber(807490738);
        gm.setCustomerAddress("Kashmeergadda");
        gm.RecAcc(1);
        gm.shop(1001);



    }


}
