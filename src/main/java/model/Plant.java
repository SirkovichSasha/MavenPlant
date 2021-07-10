package model;

import java.util.Objects;

public class Plant {
    private String name;
    private String color;
    private int petalCount;
    private int lifeTime;
    private double price;
    private Size size;

    public Plant() {
        this.name = "";
        this.color = "";
        this.size = new Size();
    }

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
        this.size = new Size();
    }

    public Plant(String name, String color, int petalCount, int lifeTime, double price) {
        this(name, color);
        this.petalCount = petalCount;
        this.lifeTime = lifeTime;
        this.price = price;
    }

    public Plant(String name, String color, int petalCount, int lifeTime, double price, Size size) {
        this.name = name;
        this.color = color;
        this.petalCount = petalCount;
        this.lifeTime = lifeTime;
        this.price = price;
        this.size = size;
    }

    public Plant(Plant p) {
        this.name = p.name;
        this.color = p.color;
        this.petalCount = p.petalCount;
        this.lifeTime = p.lifeTime;
        this.price = p.price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double addPrice(double add) {
        this.price += add;
        return this.price;
    }

    //=======================Method 2=========================

    public String getPlantColor() {
        return this.getColor();
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", stebel=" + petalCount +
                ", lifeTime=" + lifeTime +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return getPetalCount() == plant.getPetalCount() &&
                getLifeTime() == plant.getLifeTime() &&
                Double.compare(plant.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), plant.getName()) &&
                Objects.equals(getColor(), plant.getColor()) &&
                Objects.equals(size, plant.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getPetalCount(), getLifeTime(), getPrice(), size);
    }
}
