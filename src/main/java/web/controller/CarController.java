package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class  CarController {

    @GetMapping(value = "/cars")
    public String carList(Model model, @RequestParam(value = "count", defaultValue = "5")int count){
        List<Car>carList = new ArrayList<>();
        carList.add(new Car("Kia",11,"black"));
        carList.add(new Car("Toyota",22,"white"));
        carList.add(new Car("bmw",44,"green"));
        carList.add(new Car("Merc",33,"grey"));
        carList.add(new Car("honda",55,"blue"));
        model.addAttribute("carList",CarService.countCar(carList,count));
        return "cars";
    }
}
