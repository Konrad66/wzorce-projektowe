package structural.adapter.eu_cars;

import structural.adapter.american_module.CarUS;

public class USCarAdapter implements CarEU{

    private CarUS car;

    public USCarAdapter(CarUS car) {
        this.car = car;
    }

    @Override
    public double getMileageInKm() {
        return car.getMileageInMiles() * 1.6;
    }

    @Override
    public String getName() {
        return car.getName();
    }
}