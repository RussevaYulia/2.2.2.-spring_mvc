package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(Integer count) {

        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car("Citroen", 5, 2300000));
        carsList.add(new Car("AUDI", 5, 5800000));
        carsList.add(new Car("BMW", 5, 4000000));
        carsList.add(new Car("Volkswagen", 3, 2500000));
        carsList.add(new Car("YAZ", 3303, 750000));

        if (count == null) {
            return carsList;
        } else {
            return carsList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
