package prac1;

class Car {
    private String carName;
    private String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;
        String cartype;
        void setEngine() {

            // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }

            cartype = Car.this.carType;
        }
        String getEngineType(){
            return this.engineType;
        }
    }

    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}

public class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        Car.Engine c1eng = car1.new Engine();
        c1eng.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());
        System.out.println("Engine Type for 8WD= " + c1eng.getEngineType());
        System.out.println(c1eng.cartype);



        Car.USB usb = new Car.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}
