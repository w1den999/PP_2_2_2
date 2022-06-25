package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Kia", 11, "black"));
        cars.add(new Car("Toyota", 22, "white"));
        cars.add(new Car("bmw", 44, "green"));
        cars.add(new Car("Merc", 33, "grey"));
        cars.add(new Car("honda", 55, "blue"));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= cars.size() || count < 0) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
