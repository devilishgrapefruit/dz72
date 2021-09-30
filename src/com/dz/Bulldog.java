package com.dz;

public class Bulldog extends Dog{
    protected String kind;
    public Bulldog(int weight, String kind) {
        this.speed = "medium";
        this.size = "big";
        this.weight = weight;
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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
        return "Bulldog{" +
                "kind='" + kind + '\'' +
                ", speed='" + speed + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
