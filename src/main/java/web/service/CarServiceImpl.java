package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> countCar(int count) {
        if(count >= 5) {
            return carDao.carList();
        }
        return carDao.carList().stream().limit(count).collect(Collectors.toList());
    }
}
