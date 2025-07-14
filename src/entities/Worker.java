package entities;

import enums.WorkerLevelEnum;

public class Worker {
    private String name;
    private WorkerLevelEnum level;
    private Double baseSalary;

    public Worker(){}

    public Worker(String name, WorkerLevelEnum level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double newBaseSalary) {
        baseSalary = newBaseSalary;
    }

    public WorkerLevelEnum getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelEnum newLevel) {
        level = newLevel;
    }

    public void addContract(HourContract contract) {}

    public void removeContract(HourContract contact){}

    public Double income(Integer year, Integer month) {
        return 0.0;
    }
}