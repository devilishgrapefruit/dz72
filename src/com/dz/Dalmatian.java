package com.dz;

public class Dalmatian extends Dog{
    int numberofspot;

    public Dalmatian(int weight, int numberofspot) {
        this.speed = "high";
        this.weight = weight;
        this.size = "big";
        this.purpose= "companion";
        this.numberofspot = numberofspot;
    }

    public int getNumberofspot() {
        return numberofspot;
    }

    public void setNumberofspot(int numberofspot) {
        this.numberofspot = numberofspot;
    }

    @Override
    public String getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(String speed) {
        super.setSpeed(speed);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public String getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    @Override
    public String getPurpose() {
        return super.getPurpose();
    }

    @Override
    public void setPurpose(String purpose) {
        super.setPurpose(purpose);
    }

    @Override
    public void bark() {
        super.bark();
    }

    @Override
    public void wagging_tail() {
        super.wagging_tail();
    }

    @Override
    public String toString() {
        return "Dalmatian{" +
                "numberofspot=" + numberofspot +
                ", speed='" + speed + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
