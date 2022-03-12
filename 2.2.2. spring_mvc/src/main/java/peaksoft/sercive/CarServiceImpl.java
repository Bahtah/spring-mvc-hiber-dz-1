package peaksoft.sercive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.cardao.CarDao;
import peaksoft.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
