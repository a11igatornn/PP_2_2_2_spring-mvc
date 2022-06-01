package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao {

    private final List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("model1","Black", 2020));
        listCar.add(new Car("model2","Red", 2022));
        listCar.add(new Car("model3","White", 2021));
        listCar.add(new Car("model4","Blue", 2020));
        listCar.add(new Car("model5","Grey", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= listCar.size()) {
            return listCar;
        }
        return listCar.subList(0, count);
    }
}
