import java.util.ArrayList;
import java.util.Scanner;

public class Juegos_con_preguntas {


  public static void main(String[] args) {
    // Declaracion de arreglos
    ArrayList<String> preguntas = new ArrayList<String>();
    ArrayList<String> opciones = new ArrayList<String>();
    ArrayList<String> opciones2 = new ArrayList<String>();
    ArrayList<String> mensajes = new ArrayList<String>();
    ArrayList<Integer> puntajeresp = new ArrayList<Integer>();

    // Declaracion de variables para almacenar
    int puntaje, nrep, nrep2;
    String pregunta, opcion1, opcion2, opcion3,opcion4, resp = "nada lol", mensaje, resp2="nada tampoco";

    /* // Menu principal
    System.out.println("\n1 - Añadir pregunta");
    System.out.println("2 - Modificar pregunta");
    System.out.println("3 - Eliminar pregunta");
    System.out.println("4 - Regresar");
    System.out.print("Ingrese su opción: ");
    opcionPrimeraConfiguracion = sc.nextInt();
    return opcionPrimeraConfiguracion;*/

    Scanner sc = new Scanner(System.in);
    /*System.out.print("\nIngrese el numero de la pregunta: ");
    numpreg = sc.nextInt();*/

//    sc.nextLine();
    // preg[espacio] = new Configuracion();
    System.out.print("Ingrese la pregunta: ");
    pregunta = sc.nextLine();
    preguntas.add(pregunta);
    System.out.print("Ingrese la primera opcion: ");
    opcion1 = sc.nextLine();
    opciones.add(opcion1);
    System.out.print("Ingrese la segunda opcion: ");
    opcion2 = sc.nextLine();
    opciones.add(opcion2);
    System.out.print("Ingrese la tercera opcion: ");
    opcion3 = sc.nextLine();
    opciones.add(opcion3);
    System.out.print("Ingrese la cuarta opcion: ");
    opcion4 = sc.nextLine();
    opciones.add(opcion4);

    System.out.println("--------------------------------------------------------------");
    System.out.println("Seleccione la respuesta correcta para su pregunta");
    System.out.println("Sus opciones");
    for(int i = 0; i <opciones.size(); i++ ){
      System.out.println(i+1 + " " + opciones.get(i));
    }

    nrep = sc.nextInt();

    // Saber cual es la opcion correcta
    if(nrep == 1)
    {
      resp = opcion1;
    }
    else if(nrep == 2)
    {
      resp = opcion2;
    }
    else if(nrep == 3)
    {
      resp = opcion3;
    } else  if(nrep == 4)
    {
      resp = opcion4;
    }

    System.out.println("Su respuesta correcta es: " + resp);

    System.out.println("Seleccione el puntaje");
    puntaje = sc.nextInt();
    puntajeresp.add(puntaje);

    sc.nextLine();

    // Añade un mensaje
    System.out.print("Añada un mensaje ");
    mensaje = sc.nextLine();
    mensajes.add(mensaje);

    System.out.println("--------------------------------------------------------------");
    System.out.println("Su pregunta queda asi");
    System.out.println(1 + " " + pregunta);
    System.out.println("Sus opciones");
    for(int i = 0; i <opciones.size(); i++ ){
      System.out.println("   " + (i+1) + " " + opciones.get(i));
    }
    System.out.println("Su respuesta es " + resp);
    System.out.println("Su puntaje es de " + puntaje);
    System.out.println("Su mensaje es " + mensaje);
    System.out.println("--------------------------------------------------------------");

    // -------------------------------------------------------------------------------------- //
    // OTRA PREGUNTA
    // -------------------------------------------------------------------------------------- //

    System.out.print("Ingrese la pregunta: ");
    pregunta = sc.nextLine();
    preguntas.add(pregunta);
    System.out.print("Ingrese la primera opcion: ");
    opcion1 = sc.nextLine();
    opciones2.add(opcion1);
    System.out.print("Ingrese la segunda opcion: ");
    opcion2 = sc.nextLine();
    opciones2.add(opcion2);
    System.out.print("Ingrese la tercera opcion: ");
    opcion3 = sc.nextLine();
    opciones2.add(opcion3);
    System.out.print("Ingrese la cuarta opcion: ");
    opcion4 = sc.nextLine();
    opciones2.add(opcion4);

    System.out.println("--------------------------------------------------------------");
    System.out.println("Seleccione la respuesta correcta para su pregunta");
    System.out.println("Sus opciones");
    for(int i = 0; i <opciones2.size(); i++ ){
      System.out.println(i+1 + " " + opciones2.get(i));
    }

    nrep2 = sc.nextInt();

    // Saber cual es la opcion correcta
    if(nrep2 == 1)
    {
      resp2 = opcion1;
    }
    else if(nrep2 == 2)
    {
      resp2 = opcion2;
    }
    else if(nrep2 == 3)
    {
      resp2 = opcion3;
    } else  if(nrep2 == 4)
    {
      resp2 = opcion4;
    }

    System.out.println("Su respuesta correcta es: " + resp2);

    System.out.println("Seleccione el puntaje");
    puntaje = sc.nextInt();
    puntajeresp.add(puntaje);

    sc.nextLine();

    // Añade un mensaje
    System.out.print("Añada un mensaje ");
    mensaje = sc.nextLine();
    mensajes.add(mensaje);

    System.out.println("--------------------------------------------------------------");
    System.out.println("Su pregunta queda asi");
    System.out.println(2 + " " + pregunta);
    System.out.println("Sus opciones");
    for(int i = 0; i <opciones2.size(); i++ ){
      System.out.println("   " + (i+1) + " " + opciones2.get(i));
    }
    System.out.println("Su respuesta es " + resp2);
    System.out.println("Su puntaje es de " + puntaje);
    System.out.println("Su mensaje es " + mensaje);
    System.out.println("--------------------------------------------------------------");

    // Imprime las preguntas pasadas por el usuario

    System.out.println("Sus preguntas hasta el momento son: ");
    for(int i = 0; i < preguntas.size(); i++){
      System.out.println(i+1 + " " + preguntas.get(i));
    }





  }


}
