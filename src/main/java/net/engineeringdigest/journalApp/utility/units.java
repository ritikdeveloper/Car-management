package net.engineeringdigest.journalApp.utility;

import org.springframework.stereotype.Component;

@Component
public class units {

    private  long id;
    private String car;
    private String car_number;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }
}
