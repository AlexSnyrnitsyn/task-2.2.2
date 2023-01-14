package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1L, "Lada1", 1));
        cars.add(new Car(2L, "Lada2", 2));
        cars.add(new Car(3L, "Lada3", 3));
        cars.add(new Car(4L, "Lada4", 4));
        cars.add(new Car(5L, "Lada5", 5));
    }

    public static List<Car> getAllCars() {
        return cars;
    }
}
