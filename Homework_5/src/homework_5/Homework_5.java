/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author valera
 */
public class Homework_5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Работу выполнил Гринченко Валерий, РИБО-01-21, Вариант №1" + "\n");

        String marka, color;
        int price, vmestimost, maxspeed;
        
        System.out.println("\n" + "Введите марку автомобиля:");
        marka = scan();
        System.out.println("\n" + "Введите цвет автомобиля:");
        color = scan();
        System.out.println("\n" + "Введите цену автомобиля (руб):");
        price = Integer.parseInt(scan());
        System.out.println("\n" + "Введите вместимость автомобиля (чел):");
        vmestimost = Integer.parseInt(scan());
        System.out.println("\n" + "Введите максимальную скорость автомобиля (в км/ч):");
        maxspeed = Integer.parseInt(scan());

        Car car = new Car(marka, color, price, vmestimost, maxspeed);

        System.out.println("\n" + "Автомобиль создан!" + "\n");
        System.out.println(car + "\n");
        
        
        
        File file = new File("C:\\Ivanov\\Final.txt");
        SaverRunnable saver = new SaverRunnable(car, "C:\\Ivanov\\Final.txt");
        Thread thread = new Thread(saver);
        thread.start();
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }
}