public class Application {
    public static void main(String[] args) {
        VehicleShop vehicleShop=new VehicleShop();
        Vehicle vehicle=new Vehicle();
        vehicle.addCar(new Car("BMW"));
        vehicle.addCar(new Car("Sports Car"));

        vehicleShop.save(vehicle);
        System.out.println(vehicle);

        vehicle.addCar(new Car("Mini Van"));
        vehicle.addCar(new Car("Luxury Car"));

        vehicleShop.save(vehicle);
        System.out.println(vehicle);

        vehicleShop.revert(vehicle);
        System.out.println(vehicle);
        vehicleShop.revert(vehicle);
        System.out.println(vehicle);
        vehicleShop.revert(vehicle);
        System.out.println(vehicle);
        vehicleShop.revert(vehicle);
        System.out.println(vehicle);

    }
}
