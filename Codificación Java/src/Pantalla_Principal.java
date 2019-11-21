
import java.util.ArrayList; // The ArrayList library
import java.util.Iterator; // The Iterator Library
import java.util.Arrays; // The Arrays Library
import java.util.Scanner;

public class Pantalla_Principal {

  // Declaracion de arreglos
  ArrayList<String> nombre_usuarios = new ArrayList<String>();
  ArrayList<int> puntaje = new ArrayList<int>();
  ArrayList<String> respuesta = new ArrayList<String>();
  ArrayList<String> pregunta = new ArrayList<String>();
  ArrayList<String> opciones = new ArrayList<String>();


  public static void imprimirPantalla() {
    System.out.println("Bienvenido a nuestro juego trivia");
    System.out.println("Inserte su nombre: ");
    System.out.println("1. Configuracion");
    System.out.println("2. Juegos");
    System.out.println("3. Consulta de Puntajes Obtenidos");
    System.out.println("4. Salir");
    leerRespuesta();
  }

  // lee la respuesta del usuario y procede a seleccionarmenu
  public static void leerRespuesta() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserte una opción: ");
    int respuesta = sc.nextInt();
    seleccionarMenu(respuesta);
  }


  // Es la funcion principal que permite escoger al usuario la opcion
  public static void seleccionarMenu(int respuesta) {
    while (respuesta != 4) {
      switch (respuesta) {
        case 1:
          Configuracion config = new Configuracion(); // Crea el objeto de la clase segun la opcion
          config.imprimirPantalla();
          imprimirPantalla();
          break;
        case 2:
          Juego juego = new Juego();
          juego.imprimirPuntaje();
          imprimirPantalla();
          break;
        case 3:
          Consulta_Puntajes consulta = new Consulta_Puntajes();
          consulta.imprimirPantalla();
          imprimirPantalla();
          break;
        default:
          System.out.println("Ha ingresado una opcion no establecida.");
          imprimirPantalla();
          break;
      }
    }
    System.out.println("¡Hasta luego!");
  }

  public static void main(String[] args) {
    imprimirPantalla();


  }
}
