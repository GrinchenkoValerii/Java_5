/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author valera
 */
public class Car implements Externalizable{
    
    private String marka;
    private String color;
    private int price;
    private int vmestimost;
    private int maxspeed;

    public Car(String marka, String color, int price, int vmestimost, int maxspeed) {
        this.marka = marka;
        this.color = color;
        this.price = price;
        this.vmestimost = vmestimost;
        this.maxspeed = maxspeed;
    }

    public Car() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getMarka());
        out.writeObject(getColor());
        out.writeObject(getPrice());
        out.writeObject(getVmestimost());
        out.writeObject(getMaxspeed());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        marka = (String) in.readObject();
        color = (String) in.readObject();
        price = (Integer) in.readObject();
        vmestimost = (Integer) in.readObject();
        maxspeed = (Integer) in.readObject();
    }
    
    @Override
    public String toString() {
        return "Марка: " + marka + ", цвет: " + color + ", цена (руб): " + price + ", вместимость (чел): " + vmestimost + ", маквсимальная скорость (в км/ч): " + maxspeed;
    }

    public String getMarka() {
        return marka;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getVmestimost() {
        return vmestimost;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVmestimost(int vmestimost) {
        this.vmestimost = vmestimost;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }
}