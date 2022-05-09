package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Accountant> Accountants = new ArrayList<>();
        ArrayList<Watchman> Watchmans = new ArrayList<>();
        ArrayList<CleaningStaff> CleaningStaffs = new ArrayList<>();
        ArrayList<Admin> Admins = new ArrayList<>();


        String respuesta = "s";
        while (respuesta.equals("s")) {
            System.out.println(" ingrese al perfil que desea 1=Accountant,2=Watchman,3=CleaningStaff,4=Admin\n  5=mostrarAdmin,6=MostrarcleaminigStaff,7=mostrarwhatchman,8=mostrar Accountant");

            int option = Integer.parseInt(entrada.nextLine());

            if (option == 1) {
                Accountant accountant = new Accountant();
                System.out.println("ingrese el nombre ");
                accountant.setName(entrada.nextLine());
                System.out.println("ingrese la identificacion");
                accountant.setIdentification(entrada.nextLine());
                System.out.println("ingrese la edad ");
                accountant.setAge(Integer.parseInt(entrada.nextLine()));
                System.out.println("ingrese leader");
                accountant.setLeader(entrada.nextLine());
                System.out.println("ingrese el parking");
                accountant.setParking(entrada.nextLine());
                Accountants.add(accountant);


            } else if (option == 2) {
                Watchman watchman = new Watchman();
                System.out.println("ingrese el nombre ");
                watchman.setName(entrada.nextLine());
                System.out.println("ingrese la identificacion");
                watchman.setIdentification(entrada.nextLine());
                System.out.println("ingrese la edad ");
                watchman.setAge(Integer.parseInt(entrada.nextLine()));
                System.out.println("ingrese la weapon");
                watchman.setWeapon(entrada.nextLine());
                System.out.println("ingrese el workday");
                watchman.setWorkday(entrada.nextLine());
                Watchmans.add(watchman);

            } else if (option == 3) {
                CleaningStaff cleaningStaff = new CleaningStaff();
                System.out.println("ingrese el nombre ");
                cleaningStaff.setName(entrada.nextLine());
                System.out.println("ingrese la identificacion");
                cleaningStaff.setIdentification(entrada.nextLine());
                System.out.println("ingrese la edad ");
                cleaningStaff.setAge(Integer.parseInt(entrada.nextLine()));
                System.out.println("ingrese los dayoff");
                cleaningStaff.setDayOff(entrada.nextLine());
                CleaningStaffs.add(cleaningStaff);


            } else if (option == 4) {

                Admin admin = new Admin();
                System.out.println("ingrese el nombre ");
                admin.setName(entrada.nextLine());
                System.out.println("ingrese la identificacion");
                admin.setIdentification(entrada.nextLine());
                System.out.println("ingrese la edad ");
                admin.setAge(Integer.parseInt(entrada.nextLine()));
                System.out.println("ingrese leader");
                admin.setLeader(entrada.nextLine());
                System.out.println("ingrese el parking");
                admin.setParking(entrada.nextLine());
                Admins.add(admin);

            }else if (option==5){
                for (int i=0;i < Admins.size();i++){
                    System.out.println("el perfil de admin son "+ Admins.get(i).mostrarAdmin()+"\n");
                }
            }else if (option==6){
                for (int i=0;i < CleaningStaffs.size();i++ ){
                    System.out.println("el perfil de CleaningStaff son "+ CleaningStaffs.get(i).mostrarCleaningStaff()+"\n");
                }

            }else if (option==7){
                for (int i=0;i < Watchmans.size();i++){
                    System.out.println("el perfil de Watchmans son "+ Watchmans.get(i).mostrarWachman()+"\n");
                }
            }else if (option==8){
                for (int i=0;i <Accountants.size();i++ ){
                    System.out.println("El perfil de Accountants es "+Accountants.get(i).mostrarAccountant()+"\n");

                }
            }

            System.out.println("Digite s para ingresar mas datos");
            respuesta = entrada.nextLine();
        }
    }
}
