package web.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import web.config.AppConfig;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    @SuppressWarnings("unchecked")
    public List<Car> carList(Integer count){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        return ((List<Car>) applicationContext.getBean("list")).subList(0, count);
    }
}
