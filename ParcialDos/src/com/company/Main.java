package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Accountant> coun= new ArrayList<>();
        ArrayList<Watchman> man= new ArrayList<>();
        ArrayList<CleaningStaff> staff= new ArrayList<>();
        ArrayList<Admin> adm= new ArrayList<>();


        while(     true    ) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("1. Ingresar Accountant ");
            System.out.println("2. Ingresar Watchman ");
            System.out.println("3. Ingresar CleaningStaff ");
            System.out.println("4. Ingresar Admin ");
            System.out.println("5. Mostrar Accountant");
            System.out.println("6. Mostrar Watchman");
            System.out.println("7. Mostrar CleaningStaff");
            System.out.println("8. Mostrar Admin");
            System.out.println("9. Salir");
            System.out.println(" ");
            System.out.println("Seleccione una opcion: ");

            String read = myObj.nextLine();

            System.out.println("Su opcion es: " + read);

            if (read.equals("1")) {

                System.out.println("Ingresando Accountant.... ");
                System.out.print("Ingrese nombre: ");
                String name = myObj.nextLine();
                System.out.print("Ingrese Identification: ");
                String Identi = myObj.nextLine();
                System.out.print("Ingrese Age: ");
                int age = Integer.parseInt(myObj.nextLine());
                System.out.print("Ingrese Leader: ");
                String le = myObj.nextLine();
                System.out.print("Ingrese Parking: ");
                String par = myObj.nextLine();

                Accountant a = new Accountant();
                a.setName(name);
                a.setIdentification(Identi);
                a.setAge(age);
                a.setLeader(le);
                a.setParking(par);

                coun.add(a);

            }
            if (read.equals("2")) {

                System.out.println("Ingresando Watchman.... ");
                System.out.print("Ingrese nombre: ");
                String name = myObj.nextLine();
                System.out.print("Ingrese Identification: ");
                String Identi = myObj.nextLine();
                System.out.print("Ingrese Age: ");
                int age = Integer.parseInt(myObj.nextLine());
                System.out.print("Ingrese weapon: ");
                String pon = myObj.nextLine();
                System.out.print("Ingrese workday: ");
                String workday = myObj.nextLine();

                Watchman a = new Watchman();
                a.setName(name);
                a.setIdentification(Identi);
                a.setAge(age);
                a.setWeapon(pon);
                a.setWorkday(workday);

                man.add(a);

            }
            if (read.equals("3")) {

                System.out.println("Ingresando CleaningStaff.... ");
                System.out.print("Ingrese nombre: ");
                String name = myObj.nextLine();
                System.out.print("Ingrese Identification: ");
                String Identi = myObj.nextLine();
                System.out.print("Ingrese Age: ");
                int age = Integer.parseInt(myObj.nextLine());
                System.out.print("Ingrese dayOff: ");
                String day = myObj.nextLine();


                CleaningStaff a = new CleaningStaff();
                a.setName(name);
                a.setIdentification(Identi);
                a.setAge(age);
                a.setDayOff(day);


                staff.add(a);

            }
            if (read.equals("4")) {

                System.out.println("Ingresando Admin.... ");
                System.out.print("Ingrese nombre: ");
                String name = myObj.nextLine();
                System.out.print("Ingrese Identification: ");
                String Identi = myObj.nextLine();
                System.out.print("Ingrese Age: ");
                int age = Integer.parseInt(myObj.nextLine());
                System.out.print("Ingrese Leader: ");
                String le = myObj.nextLine();
                System.out.print("Ingrese Parking: ");
                String par = myObj.nextLine();

                Admin a = new Admin();
                a.setName(name);
                a.setIdentification(Identi);
                a.setAge(age);
                a.setLeader(le);
                a.setParking(par);

                adm.add(a);

            }
            if (read.equals("5")) {

                System.out.println("Mostrando " + coun.size() + " Accountants...  ");

                for (int i = 0; i < coun.size(); i++) {
                    Accountant ac = coun.get(i);
                    System.out.println("Name: " + ac.getName());
                    System.out.println("Identification: " + ac.getIdentification());
                    System.out.println("Age: " + ac.getAge());
                    System.out.println("Leader: " + ac.getLeader());
                    System.out.println("Parking: " + ac.getParking());
                }


            }
            if (read.equals("6")) {

                System.out.println("Mostrando " + man.size() + " Accountants...  ");

                for (int i = 0; i < man.size(); i++) {
                    Watchman ac = man.get(i);
                    System.out.println("Name: " + ac.getName());
                    System.out.println("Identification: " + ac.getIdentification());
                    System.out.println("Age: " + ac.getAge());
                    System.out.println("Weapon: " + ac.getWeapon());
                    System.out.println("Workday: " + ac.getWorkday());
                }
            }
            if (read.equals("7")) {

                System.out.println("Mostrando " + staff.size() + " CleaningStaff...  ");

                for (int i = 0; i < staff.size(); i++) {
                    CleaningStaff ac = staff.get(i);
                    System.out.println("Name: " + ac.getName());
                    System.out.println("Identification: " + ac.getIdentification());
                    System.out.println("Age: " + ac.getAge());
                    System.out.println("DayOff: " + ac.getDayOff());

                }


            }
            if (read.equals("8")) {

                System.out.println("Mostrando " + adm.size() + " Accountants...  ");

                for (int i = 0; i < adm.size(); i++) {
                    Admin ac = adm.get(i);
                    System.out.println("Name: " + ac.getName());
                    System.out.println("Identification: " + ac.getIdentification());
                    System.out.println("Age: " + ac.getAge());
                    System.out.println("Leader: " + ac.getLeader());
                    System.out.println("Parking: " + ac.getParking());
                }


            }

            if (read.equals("9")) {

                System.out.println("Saliendo del sistema... ");
                break;

            }


        }


    }
}
