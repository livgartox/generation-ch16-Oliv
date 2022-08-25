package MetPrincipal;

import EjemploResumen.Animal;
import MenuP.MenuOp;
import MiEjemploJava.Persona;
import MiFecha.Fecha;
import MiSaludo.Saludo;

import java.util.Scanner;

public class MenuSwitch {
    public void seleccionar(){
        //Menu para ejecutar los ejercicios que se han hecho
        MenuOp menuOp=new MenuOp();
        //menuOp.menu();
        Scanner sc=new Scanner(System.in);
        int op;
        do{
            menuOp.menu();
            System.out.print("Elija --> ");
            op=sc.nextInt();
            //int op=2;


            //De aquí estoy quitando el switch
            switch (op){
                case 1:
                    Saludo s=new Saludo();
                    s.saludar();
                    //con la función que retorna
                    //System.out.println(s.saludar0());
                    break;
                case 2:
                    Persona p=new Persona();
                    System.out.print("Ingrese el nombre ");
                    String nombre1=sc.next();
                    //p.setNombre("Adriana");
                    System.out.println(p.getNombre());
                    break;
                case 3:
                    System.out.print("Ingrese el día ");
                    int dia1=sc.nextInt();
                    System.out.print("Ingrese el mes ");
                    int mes1=sc.nextInt();
                    System.out.print("Ingrese el año ");
                    int anio1=sc.nextInt();
                    Fecha fecha=new Fecha(dia1,mes1,anio1);
                    //fecha.setDia(dia1);
                    //fecha.setMes(mes1);
                    //fecha.setAnio(anio1);

                    System.out.println(fecha.formatoC());
                    break;
                case 4:
                    System.out.print("Ingrese la raza ");
                    String raza1=sc.next();
                    Animal animal1=new Animal();
                    animal1.setRaza(raza1);
                    System.out.println(animal1.getRaza());
                    break;
                default:
                    if(op==0){
                        System.out.println("Salida exitosa");
                    }else{
                        System.out.println("OPCIÓN NO VALIDA, INTENTE DE NUEVO");
                    }
                    break;
            }

        }while (op!=0);
    }


}
