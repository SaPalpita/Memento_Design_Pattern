import java.util.ArrayList;

public class Vehicle {

    ArrayList<Car> cars=new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public VehicleMemento save(){
        return new VehicleMemento(getCars());
    }

    public void revert(VehicleMemento vehicleMemento){
        cars=vehicleMemento.getCars();
    }

    static class VehicleMemento{
        ArrayList<Car> cars;

        public VehicleMemento(ArrayList<Car> cars){
            this.cars=cars;
        }

        public ArrayList<Car> getCars() {
            return cars;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cars=" + cars +
                '}';
    }
}
