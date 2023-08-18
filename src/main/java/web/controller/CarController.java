package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false, defaultValue = "5") int count) {
        List<Car> listOfCars = carService.getSomeCars(count);
        model.addAttribute("cars", listOfCars);
        return "cars";
    }
}
