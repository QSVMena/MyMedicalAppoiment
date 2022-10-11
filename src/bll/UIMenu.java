package bll;

import java.util.Scanner;

public class UIMenu {
    public static String[] month = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "junio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
     static void ShowMenu(){
         System.out.println("Welcome to my Appointments");
         System.out.println("Selecciona la opcion desedada");
         int response = 0;
         do{
             System.out.println("1: Model.Doctor");
             System.out.println("2: doll.Patient");
             System.out.println("3: Salir");

             Scanner scan = new Scanner(System.in);
             response = Integer.valueOf(scan.nextInt());

             switch (response){
                 case 1:
                     System.out.println("Model.Doctor");
                     break;
                 case 2:
                     ShowPatientMenu();
                     response=0;

                     break;
                 case 3:
                     System.out.println("Thank you for visit us");
                     break;
                 default:
                     System.out.println("please  select a correct answer");
                     return;
             }

         }while (response!=0);




    }
    static void ShowPatientMenu(){
         int response= 0;
         do{
             System.out.println("\n\n");
             System.out.println("doll.Patient");
             System.out.println("1: Book an Appointment");
             System.out.println("2: My Appointment");
             System.out.println("3: return");

             Scanner scan = new Scanner(System.in);
             response = Integer.valueOf(scan.nextInt());


             switch (response=0){
                 case 1:
                     System.out.println(":: Book an Appointment");
                     for (int i = 1; i < 4; i++) {
                         System.out.println(i+". "+month[i]);
                     }
                     break;
                 case 2:
                     System.out.println("::My Appointments");
                     break;
                 case 3:
                     ShowMenu();
                     break;
             }
         }while (response!= 0);
    }
}
