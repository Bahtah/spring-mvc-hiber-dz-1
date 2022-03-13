package peaksoft.cardao;

import org.springframework.stereotype.Repository;
import peaksoft.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private static List<Car> cars;
    static {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Mers", "black", "Sport"));
        cars.add(new Car(2, "BMW", "green", "Sport"));
        cars.add(new Car(3, "Mazda", "white", "Vagen"));
        cars.add(new Car(4, "Jaguar", "yellow", "Sport"));
        cars.add(new Car(5, "Tractor", "blue", "Track"));
    }

    public List<Car> getCar(int count) {
        List<Car> carList1 = new ArrayList<>();
        for (int i = 0; i <count; i++) {
            if(count >= 5){
                return cars;
            }else {
                carList1.add(cars.get(i));
            }
        }
        return carList1;
    }
}
