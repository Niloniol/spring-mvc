package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean(name = "list")
    @Scope("singleton")
    public List<Car> carListBean() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ghibli","Maserati","2021"));
        cars.add(new Car("TrailBlazer","Chevrolet","2021"));
        cars.add(new Car("Silverado 2500", "Chevrolet","2021"));
        cars.add(new Car("Model X","Tesla", "2017"));
        cars.add(new Car("Vantage","Aston Martin","2021"));
        return cars;
    }
}
