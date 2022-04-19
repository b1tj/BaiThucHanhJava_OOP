package Car;

class TaxiCar implements Car{
    public void move(){
        System.out.println("Car moved.");
    }

    public void stop(){
        System.out.println("Car stopped.");
    }

    public void turnLeft(){
        System.out.println("Car turned left.");
    }

    public void turnRight(){
        System.out.println("Car turned right.");
    }

    public void reverse(){
        System.out.println("Car reversed.");
    }
}
