
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int speed;
        int cars = 3;
        for (int i = 0; i<cars; i++){
            Car car = new Car ();
            System.out.println("Введите название "+ (i+1) + " автомобиля");
            name = sc.nextLine();
            car.name = name;
            while (true){
                System.out.println("Введите скорость от 0 до 250 км в ч "+ (i+1) + " автомобиля");
                try {speed = Integer.parseInt(sc.nextLine());
                } catch (Exception e){
                    System.out.println("Не верное значение, попробуйте еще раз");
                    continue;
                }
                if (speed>0 && speed<= 250){
                    break;
                } else {
                    System.out.println("Не верное значение, попробуйте еще раз");
                }
            }
            car.name =name;
            car.speed = speed;

            Race.raceLeader(car.name, car.speed);
        }
        System.out.println("Самая быстрая машина: "+Race.nameLeader);
        sc.close();
    }


}


class Car {
    String name;
    int speed;
}
class Race {
    static String nameLeader;
    static int  distance = 0;
    public static void raceLeader (String name1, int speed1){
        if (speed1*24> distance){
            distance = speed1*24;
            nameLeader = name1;
        }
    }
}