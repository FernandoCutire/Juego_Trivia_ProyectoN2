import java.util.ArrayList; // The ArrayList library
import java.util.Scanner; // La libreria del Scanner
public class Pantalla_Principal {
  // Declaracion de variables
  public static Object preguntass[] = new Object[15];


  // Declaracion de arreglos
  public ArrayList<String> preguntas = new ArrayList<String>();
  public ArrayList<String> mensajes = new ArrayList<String>();
  public ArrayList<Integer> puntajeresp = new ArrayList<Integer>();

  // Imprime la pantalla principal
  public static void ImprimirPantalla(){
    System.out.println("1. Configuracion");
    System.out.println("2. Juegos");
    System.out.println("3. Consulta de Puntajes Obtenidos");
    System.out.println("4. Salir");
  }

  // lee la respuesta del usuario y procede a seleccionarmenu
  public static int LeerRespuesta() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nInserte una opción: ");
    int respuesta = sc.nextInt();
    return respuesta;
  }

  public static void EscogerRespuesta(int respuesta) {
    // Bucle que permite iterar en la pantalla principal
    while(respuesta != 4) {
      switch (respuesta) {
        case 1:
          int puente;
          Configuracion config = new Configuracion(); // Crea el objeto de la clase segun la opcion
          puente = config.MostrarOpciones();
          preguntass = config.EvaluarOpciones(puente);
          //ask = preguntas[1].getEnunciado;
          break;
        case 2:
          Juego juego = new Juego();
          juego.ImprimirPantalla();
          break;
        case 3:
          Consulta_Puntajes consulta = new Consulta_Puntajes();
          consulta.imprimirPantalla();
          break;
        default:
          System.out.println("\n(!) Seleccione una opción válida");
      }
      ImprimirPantalla();
      respuesta = LeerRespuesta();
    }
    System.out.println("Hasta luego, gracias por jugar");

  }


  public static void main(String[] args) {
    //Declaracion de variables
    Scanner sc = new Scanner(System.in);
    int opcionPrincipal;
    //Llamado a los metodos
    ImprimirPantalla();
    opcionPrincipal =  LeerRespuesta();
    EscogerRespuesta(opcionPrincipal);

  }
}