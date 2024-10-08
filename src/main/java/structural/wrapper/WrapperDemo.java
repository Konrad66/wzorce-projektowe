package structural.wrapper;

import java.util.Comparator;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
        RegularCar regularCar1 = new RegularCar("audi", 70000, 120);
        RegularCar regularCar2 = new RegularCar("bmw", 300000, 220);
        RegularCar winner = raceStream(List.of(regularCar1, regularCar2), 100);
        System.out.println("Winner is " + winner);


        System.out.println(findBiggestDistance(List.of(1000, 1500, 800)));
    }


    static double findBiggestDistance(List<Integer> distances) {
        int maxDistance = 0;
        for (Integer distance : distances) {
            if (maxDistance < distance) {
                maxDistance = distance;
            }
        }
        return maxDistance;
    }

    public static RegularCar race(List<RegularCar> cars, int hours) {
        double higherDistance = 0;
        RegularCar ourWinner = null;
        for (RegularCar car : cars) {
            double startingMilAge = car.getMileage();
            car.drive(hours);
            double distance = car.getMileage() - startingMilAge;
            if (higherDistance < distance) {
                higherDistance = distance;
                ourWinner = car;
            }
        }
        return ourWinner;
    }

    public static RegularCar raceStream(List<RegularCar> cars, int hours){
        //.sorted(Comparator.comparingDouble(car -> drive(car, hours)))
        return cars.stream()
                .max((car1, car2) -> Double.compare(drive(car1, hours), drive(car2, hours)))
                .orElse(null);
    }

    private static double drive(RegularCar car,int hours){
        double startingMilAge = car.getMileage();
        car.drive(hours);
        return car.getMileage() - startingMilAge;
    }
}