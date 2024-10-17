package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;



   public Car(String brand, String model, String fuel) {
       this.brand = brand;
       this.model = model;
       this.fuel = fuel;
   }

   public Car(){

   }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }


    public void start(){
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }

    }

    public void stop(){
        if (this.speedometer == 0 && this.tachometer > 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate(){
//           if (this.speedometer < 120){
//                   this.speedometer++;
//                   System.out.println("El coche está acelerando");
//           } else {
//               System.out.println("El coche va a la velocidad máxima permitida");
//           }

            while (this.speedometer < 120){
                this.speedometer += 10;
                System.out.println("El coche va a " + speedometer + " km por hora");
            }
    }

   public void brake(){
       while (this.speedometer > 0){
           this.speedometer -= 10;
           System.out.println("El coche va a " + speedometer + " km por hora");
       }
   }

   public void turnAngleOfWheels(int angle){
        if(this.wheelsAngle <= 45 && this.wheelsAngle >= -45){
            if(this.wheelsAngle + angle <= 45 && this.wheelsAngle + angle >= -45){
                this.wheelsAngle = this.wheelsAngle + angle;
                System.out.println("El volante se ha girado " + this.wheelsAngle + " grados");
            } else {
                if (angle > 0){
                    this.wheelsAngle = 45;
                } else {
                    this.wheelsAngle = -45;
                }
                System.out.println("No se puede girar más de 45 grados");
            }

        }
   }

//   public String showSteeringWheelDetail(){

//   }

   public boolean isReverse() {
        if (this.speedometer == 0) {
            System.out.println("Ahora es posible seleccionar marcha atrás");
        } else {
            System.out.println("No es posible seleccionar la marcha atrás");
        }
       return true;
   }

   public void setReverse(boolean reverse) {
       if (this.speedometer == 0){
       this.reverse = true;
       this.gear = "R";
           System.out.println("Has seleccionado la marcha atrás correctamente");
       } else {
           System.out.println("Debes estar totalmente detenido para poder seleccionar la marcha atrás");
       }
   }

//   public void shownDetails(){

//   }


}
