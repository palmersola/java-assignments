package exceptions.sensorsAndTemp;



import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Integer> readings;
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor add) {
        this.sensors.add(add);
    }

    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public void setOn() {
        for (Sensor s: sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s: sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Wrong!");
        }
        int average = this.sensors.stream().map(s -> s.read()).reduce(0, (prev, curr) -> prev + curr) / this.sensors.size();
        this.readings.add(average);
        return average;
    }
}