package web.service;

import web.Dao.CarDao;
import web.Dao.CarDaoImp;
import web.model.Car;

import java.util.List;



public class CarServiceImp implements CarService {

    private CarDao carDao = new CarDaoImp();
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
