/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author valera
 */
public class SaverRunnable implements Runnable{

    private Car car;
    private String path;

    public SaverRunnable(Car car, String path) {
        this.car = car;
        this.path = path;
    }

    @Override
    public void run(){
        if (car != null && path != null) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(car);
                oos.close();
                System.out.println("Машина успешно сериализована!");
            } catch (IOException e) {
                System.out.println("Ошибка! Не удалось сохранить машину в файл!");
            }
        }
    }

    public Car getCar() {
        return car;
    }

    public String getPath() {
        return path;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
}