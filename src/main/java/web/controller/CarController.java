package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carList(Model model, @RequestParam (value = "count", defaultValue = "5")int count){
        List<Car> cars = new ArrayList<>(carService.listCars(count));
        model.addAttribute("cars", cars);
        return "cars";
    }



}
