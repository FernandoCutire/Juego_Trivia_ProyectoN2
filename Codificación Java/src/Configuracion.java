import java.util.Scanner;
public class Configuracion {


  public void imprimirPantalla(){
    System.out.println("Bienvenido a la configuracion del juego");
    nuevaPregunta();
  }

  public void nuevaPregunta(){
    Scanner sc = new Scanner(System.in);
    String nuevaPregunta;
    System.out.println("Ingrese la pregunta");
    nuevaPregunta = sc.nextLine();


  }

  public void posiblesRespuestas() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese las posibles respuestas correctas");

  }

  public void respCorrecta(){
    System.out.println("Ingrese la respuesta correcta");

  }

  public void puntajeRespuesta(){
    System.out.println("Ingrese el puntaje de la respuesta correcta");

  }

}
