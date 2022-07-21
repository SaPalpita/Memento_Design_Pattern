import java.util.Stack;

public class VehicleShop {

    Stack<Vehicle.VehicleMemento> history=new Stack<>();

    public void save(Vehicle vehicle){
        history.push(vehicle.save());
    }

    public void revert(Vehicle vehicle){
        if(!history.isEmpty())
            vehicle.revert(history.pop());
        else
            System.out.println("Cannot Undo");
    }
}
