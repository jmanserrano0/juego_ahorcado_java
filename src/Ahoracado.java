import java.util.Scanner;

public class Ahoracado {
    public static void main(String[] args) {

        //para escribir en consola
        Scanner scanner = new Scanner(System.in);
        

        // declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arrays
        char [] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
           // System.out.print(letrasAdivinadas[i]);
        }

        //esctructura de controla: Iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {

            // ESTO SE USA CUANDO TENEMOS UNA PALABRA DE CHARS
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");

            //usamos la clase escanner para pedir una letra
            char letra =  Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;

            //esctructura de controla: Iterativa (bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto!, te quedan " + (intentosMaximos - intentos + " intentos."));
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, haz adivinado la palabra secreta!: " + palabraSecreta);
            }

        }

        if (!palabraAdivinada) {
            System.out.println("¡Que pena tre has quedado sin intentos! GAME OVER");
        }
    }
}



