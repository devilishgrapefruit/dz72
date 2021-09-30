package com.dz;

public class Pug extends Dog{
    protected String color;
    public Pug(int weight, String color) {
        this.speed = "low";
        this.weight = 7;
        this.size = "medium";
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Pug{" +
                "speed='" + speed + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", purpose='" + purpose + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
