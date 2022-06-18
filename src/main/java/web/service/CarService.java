package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public interface CarService {
    public static List<Car> countCar(List<Car> listCar, Integer count) {
        if (count == null || count == 0 || count >= 5) return listCar;
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
