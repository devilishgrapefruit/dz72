package com.dz;

public abstract class Dog {
    protected String speed;
    protected int weight;
    protected String size;
    protected String purpose = "simply";


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void bark(){
        System.out.println("*barking*");
    }
    public void wagging_tail(){
        System.out.println("*wagging tail*");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "speed='" + speed + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
