package com.sample;

/**
 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 *
 * class extends class.
 * class implements interface.
 * interface extends interface
 *
 * Variables
 *      brand color and type
 * Methods
 *      speed, brakes and gear_state
 * */

public interface Vehicle_Interface {
    static String brand = null;
    static String color = null;
    static String type = null;

    public void speed();
    public void brakes();
    public void gear_state();
}
