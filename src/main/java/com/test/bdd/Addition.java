package com.test.bdd;

/**
 * Created by chandan on 12/7/2015.
 */
public class Addition {

    private int num1;
    private int num2;
    private int sum;

    public int getSum() {
        System.out.println("Printing maven -DPlatform parameter if supplied. "+System.getProperty("Platform"));
        return sum;
    }

    public void add(){
        sum=num1+num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


}
