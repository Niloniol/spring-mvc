package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String string,
                            ModelMap model) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CarService.class);
        int count;
        try {
            count = Integer.parseInt(string);
            if(count > 5){
                count = 5;
            }
        } catch (NumberFormatException e){
            count = 5;
        }
        model.addAttribute("car_brand_list", applicationContext.getBean(CarService.class).carList(count));
        return "cars";
    }
}