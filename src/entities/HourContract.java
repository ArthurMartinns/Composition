package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {}

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double newValuePerHour) {
        valuePerHour = newValuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer newHours) {
        hours = newHours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

}
