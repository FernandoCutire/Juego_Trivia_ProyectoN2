import java.util.Scanner;
public class Pantalla_Principal {
  // Declaracion de variables
    public String usuarios[];
    public int puntaje[];
    public String pregunta[];
    public String respuesta[];
    public String opciones[];
    
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
        while(respuesta != 4) {
            switch (respuesta) {
                case 1:
                    Configuracion config = new Configuracion(); // Crea el objeto de la clase segun la opcion
                    config.MostrarOpciones();
                    break;
                case 2:
                    Juego juego = new Juego();
                    juego.imprimirHola();
                    break;
                case 3:
                    Consulta_Puntajes consulta = new Consulta_Puntajes();
                    consulta.imprimirPantalla();
                    break;
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
