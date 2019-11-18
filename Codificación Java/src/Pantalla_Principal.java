import java.util.Scanner;
public class Pantalla_Principal {
  // Declaracion de variables
public String usuarios[];
public int puntaje[];
public String pregunta[];
public String respuesta[];
public String opciones[];



  public static void  imprimirPantalla(){
    System.out.println("1. Configuracion");
    System.out.println("2. Juegos");
    System.out.println("3. Consulta de Puntajes Obtenidos");
    System.out.println("4. Salir");
  }

  // lee la respuesta del usuario y procede a seleccionarmenu
  public static void leerRespuesta() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserte una opción: ");
    String respuesta = sc.nextLine();
    seleccionarMenu(respuesta);
  }
  // Es la funcion principal que permite escoger al usuario la opcion
  public static void seleccionarMenu(String respuesta){
    switch (respuesta){ // Necesito hacer que esta funcion se itere
      case "1":
        Configuracion config = new Configuracion(); // Crea el objeto de la clase segun la opcion
        config.imprimirPantalla();
        break;
      case "2":
        Juego juego = new Juego();
        juego.imprimirHola();
        break;
      case "3":
        Consulta_Puntajes consulta = new Consulta_Puntajes();
        consulta.imprimirPantalla();
        break;
      case "4":
        System.out.println("Hasta luego ");
        break;
    }
  }


  public static void main(String[] args) {
    imprimirPantalla();
    leerRespuesta();


  }
}
