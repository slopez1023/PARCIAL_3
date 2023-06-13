package com.java.parcial;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainInmueble {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc ="1";
        InmuebleRepository inmuebleRepository = new InmuebleRepositoryImpl();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc){
                case "1"{
                    System.out.println("Id inmueble");
                    Integer Id = s.nextInt();
                    System.out.println("Propietario");
                    String Prop = s.next();
                    System.out.println("Direccion");
                    String Dire = s.next();
                    System.out.println("Cantidad de baños");
                    Integer Cwc = s.nextInt();
                    System.out.println("Numero de habitaciones");
                    Integer numh = s.nextInt();
                    System.out.println("Ciudad");
                    String cd = s.next();
                    inmuebleRepository.guardar(new Inmueble(Id,Prop,Dire,Cwc,numh,cd));
                    break;
                }
                case "2"{
                    List<Inmueble>inmuebles = inmuebleRepository.findAll();
                    inmuebles.forEach(System.out::println);
                    break;
                }
                case "3"{
                    System.out.println("===== editar ====");
                    System.out.println("Id inmueble");
                    Integer Idp = s.nextInt();
                    System.out.println("Nombre propietario");
                    String Prp = s.next();
                    System.out.println("Dirección");
                    String Dcc = s.next();
                    System.out.println("Cantidad de baños");
                    Integer Wc = s.nextInt();
                    System.out.println("Numero de habitaciones");
                    Integer Hb = s.nextInt();
                    System.out.println("Ciudad");
                    String Cid = s.next();
                    inmuebleRepository.modificar(new Inmueble(Idp,Prp,Dcc,Wc,Hb,Cid));

                }
                case"4"{
                    System.out.println("===== eliminar ======");
                    System.out.println("Ingrese el ID");


                }
            }
        }

    }
}
