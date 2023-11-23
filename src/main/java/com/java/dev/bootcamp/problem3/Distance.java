package com.java.dev.bootcamp.problem3;

import java.util.HashMap;

public class Distance {

    private double d1;

    public double getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }
    private String d2;

    public Distance(double d1,String d2)
    {
        if(d2.equalsIgnoreCase("Kilometer"))
        {
            this.d1=d1*100000;
        }
        else if(d2.equalsIgnoreCase("meters"))
        {
            this.d1=d1*100;
        }
        else
        {
            this.d1=d1;
        }

        this.d2=d2;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    @Override
    public boolean equals(Object obj) {
        Distance obj1=(Distance)obj;
    /*if(this.d1.contains("Kilometer"))
        {
            int index=this.d1.indexOf("Kilometer");
            String temp=this.d1.substring(0,index);
            int tempi=Integer.parseInt(temp);
            tempi=tempi*1000;
            this.d1=String.valueOf(tempi)+"Meters";

        }
        if(this.d2.contains("Kilometer"))
        {
            int index=this.d2.indexOf("Kilometer");
            String temp=this.d2.substring(0,index);
            int tempi=Integer.parseInt(temp);
            tempi=tempi*1000;
            this.d2=String.valueOf(tempi)+"Meters";

        }*/

        return (this.d1==obj1.getD1());
    }

    public Distance add(Distance D1, Distance D2){
        double a=D1.getD1()+D2.getD1();
        String FinalUnit="";
        if((D1.d2).equalsIgnoreCase("meters"))
        {
            FinalUnit="meters";
            a=a/100;

        }
        else if((D1.d2).equalsIgnoreCase("kilometer")){
            FinalUnit="kilometer";
            a=a/100000;
        }
        else {
            FinalUnit="centimeters";
        }
        return new Distance(a,D1.getD2());
    }

    public boolean UnitCheck (Distance D1,Distance D2){
        if(D1.d2.equalsIgnoreCase(D2.d2)){
            return true;
        }
        else {
            return  false;
        }
    }
}
