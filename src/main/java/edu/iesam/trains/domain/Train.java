package edu.iesam.trains.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String capacity;
    private String speed;
    private String station;

    public Train(String id, String capacity, String speed, String station) {
        this.id = id;
        this.capacity = capacity;
        this.speed = speed;
        this.station = station;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", capacity='" + capacity + '\'' +
                ", speed='" + speed + '\'' +
                ", station='" + station + '\'' +
                '}';
    }
}
