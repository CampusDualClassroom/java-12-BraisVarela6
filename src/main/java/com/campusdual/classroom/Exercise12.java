package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara", "Diésel");
        Car myCar2 = new Car("Renault", "Laguna","Diésel");

        myCar.isTachometerEqualToZero();
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(200);
        myCar.isReverse();
        myCar.setReverse(true);
    }

}