import java.util.ArrayList; // The ArrayList library
import java.util.Iterator; // The Iterator Library
import java.util.Arrays; // The Arrays Library
import java.util.Scanner;

public class Configuracion {

  // Declaracion de arreglos
  ArrayList<String> preguntas = new ArrayList<String>();
  ArrayList<String> mensajes = new ArrayList<String>();
  ArrayList<Integer> puntajeresp = new ArrayList<Integer>();

  // Declaracion de variables para almacenar
  int numpreg, puntaje, nrep;
  String pregunta, opcion1, opcion2, opcion3,opcion4, resp = "nada lol", mensaje;

  // Declaracion de variables
  private int opcionPrimeraConfiguracion;
  private String enunciado, posible1, posible2, posible3, correcta;
  private int puntos;

  public int MostrarOpciones(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n1 - Añadir pregunta");
    System.out.println("2 - Modificar pregunta");
    System.out.println("3 - Eliminar pregunta");
    System.out.println("4 - Regresar");
    System.out.print("Ingrese su opción: ");
    opcionPrimeraConfiguracion = sc.nextInt();
    return opcionPrimeraConfiguracion;

  }
  public Configuracion(){
    enunciado = "";
    posible1 = "";
    posible2 = "";
    posible3 = "";
    correcta = "";
    puntos = 0;
  }

  public Configuracion(String enun, String pos1, String pos2, String pos3, String corr, int punt){
    enunciado = enun;
    posible1 = pos1;
    posible2 = pos2;
    posible3 = pos3;
    correcta = corr;
    puntos = punt;
  }

  public String getEnunciado(){
    return enunciado;
  }

  public String getPosible1(){
    return posible1;
  }

  public String getPosible2(){
    return posible2;
  }

  public String getPosible3(){
    return posible3;
  }

  public String getCorrecta(){
    return correcta;
  }

  public int getPuntos(){
    return puntos;
  }



  public void seleccionar_R_Correcta(int nrep){
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
  }


  public Object[] EvaluarOpciones(int opcionPrimeraConfiguracion) {
    int posib, espacio;
    Configuracion preg[] = new Configuracion[15];
    String enun, pos1, pos2, pos3, corr;
    int punt;
    Scanner sc = new Scanner(System.in);
    posib = opcionPrimeraConfiguracion;
    while(posib != 4){
      switch(posib) {
        case 1:
          /*System.out.print("\nIngrese el numero de la pregunta: ");
          espacio = sc.nextInt();
           sc.nextLine();*/
          ArrayList<String> opciones = new ArrayList<String>();
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

          // Aqui imprime todas las opciones
          System.out.println("Sus opciones");
          for(int i = 0; i <opciones.size(); i++ ){
            System.out.println(i+1 + " " + opciones.get(i));
          }

          // Seleccionando la respuesta correcta
          nrep = sc.nextInt();
          seleccionar_R_Correcta(nrep);

          System.out.println("Su respuesta correcta es: " + resp);

          System.out.println("Seleccione el puntaje");
          puntaje = sc.nextInt();
          puntajeresp.add(puntaje);
          sc.nextLine();

          // Añade un mensaje
          System.out.print("Añada un mensaje ");
          mensaje = sc.nextLine();
          mensajes.add(mensaje);

          // Imprime un preview de la respuesta
          System.out.println("--------------------------------------------------------------");
          System.out.println("Su pregunta queda asi");
          System.out.println(" " + pregunta);
          System.out.println("Sus opciones");
          for(int i = 0; i <opciones.size(); i++ ){
            System.out.println("   " + (i+1) + " " + opciones.get(i));
          }
          System.out.println("Su respuesta es " + resp);
          System.out.println("Su puntaje es de " + puntaje);
          System.out.println("Su mensaje es " + mensaje);
          System.out.println("--------------------------------------------------------------");
          // Termina el preview
          break;
        case 2:
          System.out.println("Seleccione la pregunta que desea modificar: ");
          // Loopea entre todas las preguntas
          for(int i = 0; i < preguntas.size(); i++){
            System.out.println(i + " " + preguntas.get(i));
          }
          break;
        case 3:
          System.out.println("\nIngrese la pregunta para eliminar ");
          // Loopea entre todas las preguntas
          for(int i = 0; i < preguntas.size(); i++){
            System.out.println(i + " " + preguntas.get(i));
          }
          int pregEliminada = sc.nextInt();
          preguntas.remove(pregEliminada);
          System.out.println("Listo, la pregunta fue eliminada");
          // Loopea entre todas las preguntas
          break;
        default:
          System.out.println("\n(!) Seleccione una opción válida");
      }
      posib = MostrarOpciones();
    }
    return preg;
  }


}
