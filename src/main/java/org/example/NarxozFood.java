package org.example;

public class Courier {
    private int id;
    private String name;
    private String number;
    private String vehicle;

    public Courier() {
    }

    public Courier(int id, String name, String number, String vehicle) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.vehicle = vehicle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", vehicle='" + vehicle + '\'' +
                '}';
    }
}
