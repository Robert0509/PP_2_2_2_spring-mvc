package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service

public class CarServiceImpl implements CarService{
    public List<Car> cars;
    private static int count= -10;
    {
        cars.add(new Car(++count,"BMW","Gasoline", 111));
        cars.add(new Car(++count,"Mercedes-Benz","Diesel", 999));
        cars.add(new Car(++count,"Tesla", "Electro", 555));
        cars.add(new Car(++count,"Toyota","Hybrid",777));
        cars.add(new Car(++count,"Honda","hydrogen",000));
    }


    @Override
    public List<Car> show(String id) {
        return cars.stream().limit(Long.parseLong(id)).toList();
    }
}
