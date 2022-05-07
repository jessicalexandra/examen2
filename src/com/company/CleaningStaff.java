package com.company;

public class CleaningStaff extends Person {
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }
    public String mostrarCleaningStaff() {
        return "Nombre: " + this.getName() + "\n" +
                "Identificación: " + this.getIdentification() + "\n" +
                "Edad: " + this.getAge() + "\n" +
                "Dia de descanso: " + this.getDayOff();
    }
}
