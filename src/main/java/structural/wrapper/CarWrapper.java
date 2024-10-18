package structural.wrapper;

public class CarWrapper implements Car{
    
    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void drive(int hours) {
        car.drive(hours);
    }

    @Override
    public double getMileage() {
        return car.getMileage();
    }
}