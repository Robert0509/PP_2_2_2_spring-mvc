package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service

public class CarServiceImpl implements CarService{
    public List<Car> cars = new ArrayList<>();
    private static int count= 0;
    {
        cars.add(new Car(++count,"BMW","Gasoline", 111));
        cars.add(new Car(++count,"Mercedes-Benz","Diesel", 999));
        cars.add(new Car(++count,"Tesla", "Electro", 555));
        cars.add(new Car(++count,"Toyota","Hybrid",777));
        cars.add(new Car(++count,"Honda","Hydrogen",000));
    }


    @Override
    public List<Car> getCars(String id) {
        return cars.stream().limit(Long.parseLong(id)).toList();
    }
}
