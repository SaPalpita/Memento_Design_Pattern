public class Car {
    String type;

    public Car(String type){
        this.type=type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }
}
