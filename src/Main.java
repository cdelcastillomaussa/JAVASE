import views.ventana;

import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Llamamos a nuestra ventana principal como objeto
        ventana obj=new ventana();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        Doctor my_doct=new Doctor();
        Scanner sc=new Scanner(System.in);
        System.out.println("***************DATOS DEL DOCTOR****************\n\t");

        System.out.println("Ingrese id: ");
        int id = sc.nextInt();
        my_doct.setId(id);

        sc.nextLine();

        System.out.println("Ingrese nombre completo: ");
        String name = sc.nextLine();
        my_doct.setName(name);


        System.out.println("Ingrese su especialidad: ");
        String especiality = sc.nextLine();
        my_doct.setEspeciality(especiality);

        System.out.println("Ingrese email: ");
        String email = sc.nextLine();
        my_doct.setEmail(email);

        System.out.println("######[DOCTOR REGISTER]######\n"+"Id: "+my_doct.getId()
                +"\nNombre: "+ my_doct.getName() +"\nEspecialidad: "
                + my_doct.getEspeciality()+"\nEmail: "+my_doct.getEmail());




    }
}
