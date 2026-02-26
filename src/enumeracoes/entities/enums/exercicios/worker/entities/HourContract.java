package enumeracoes.entities.enums.exercicios.worker.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HourContract {

    private Date date;
    private double valuePerHour;
    private Integer hours;


    public HourContract() {

    }
    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

}

