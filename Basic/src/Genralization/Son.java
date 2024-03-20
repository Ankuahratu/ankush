package Genralization;

public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();

        System.out.println("Son's properties:");
        System.out.println("Money: " + son.money);
        System.out.println("Bike: " + son.getBike());  
        System.out.println("Car: " + son.getCar());  
        System.out.println("Scooter: " + son.scooter);

       
}
}

	