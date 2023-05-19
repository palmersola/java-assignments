package exceptions.sensorsAndTemp;



public class Main {
    public static void main(String[] args) {

        Sensor roseville = new TemperatureSensor();
        roseville.setOn();
        System.out.println("Temperature in Roseville is: " + roseville.read() + " degrees Celsius.");

        Sensor shoreview = new TemperatureSensor();
        AverageSensor stPaulRegion = new AverageSensor();

        stPaulRegion.addSensor(roseville);
        stPaulRegion.addSensor(shoreview);
        stPaulRegion.setOn();

        System.out.println("Temperature in the St. Paul region is: " + stPaulRegion.read() + " degrees Celsius.");

    }
}