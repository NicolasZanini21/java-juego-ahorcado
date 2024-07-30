import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in);

       
       List<String> palabras = new ArrayList<>();
        palabras.add("messi");
        palabras.add("copa");
        palabras.add("america");
        palabras.add("argentina");
        palabras.add("mundial");
        palabras.add("qatar");
        palabras.add("bicampeon");
        palabras.add("depaul");
        palabras.add("uruguay");
        palabras.add("seleccion");


        Random random = new Random();
        String palabraSecreta = palabras.get(random.nextInt(palabras.size()));
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

       char[] letrasAdivinadas = new char[palabraSecreta.length()];

       for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';  
       }

       while (!palabraAdivinada && intentos < intentosMaximos) {
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length() + " letras)clea");

        System.out.println("Introduce una letra, por favor");
        
        char letra = Character.toLowerCase(scanner.next().charAt(0));

        boolean letraCorrecta = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if(palabraSecreta.charAt(i) == letra){
                letrasAdivinadas[i] = letra;
                letraCorrecta = true;
            }
            
        }

        if (!letraCorrecta) {
            intentos++;
            System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos") ;            
        }

        if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            palabraAdivinada = true;
            System.out.println("Felicidades! has adivinado la palabra secreta: " + palabraSecreta);
        }

       }
       if (!palabraAdivinada) {
        System.out.println("Que pena! te has quedados sin intentos GAME OVER");
        
       }
       scanner.close();
    }
}
