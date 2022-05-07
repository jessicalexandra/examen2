package com.company;

public class Watchman extends Person{

    private String weapon;
    private String workday;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }
    public String mostrarWachman() {
        return "Nombre: " + this.getName() + "\n" +
                "Identificación: " + this.getIdentification() + "\n" +
                "Edad: " + this.getAge() + "\n" +
                "Arma"+this.getWeapon()+ "\n"+
                "Dia de trabajo: " + this.getWorkday();
    }
}
