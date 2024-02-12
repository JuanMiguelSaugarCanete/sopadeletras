/**
 * Clase que implementa un juego de sopa de letras en consola.
 */
public class SopaDeLetras {

    /**
     * Método principal que inicia el juego de sopa de letras.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Inicialización de variables del juego
        int errores = 0;
        int aciertos = 0;
        boolean ganado = false;
        boolean perdido = false;
        Scanner palabra = new Scanner(System.in);
        String posicion = null;
        String aciertofallo;

        // Bucle principal del juego
        while (!ganado && !perdido) {
            sopaletras();
            System.out.println("Encuentra las palabras");
            posicion = palabra.nextLine();
            aciertofallo = aciertofallo(posicion);

            // Verifica si la posición ingresada corresponde a una palabra y actualiza el juego
            if ((aciertofallo.equals("Liron")) || (aciertofallo.equals("Perro")) ||
                    (aciertofallo.equals("Lobo")) || (aciertofallo.equals("Leon")) ||
                    (aciertofallo.equals("Mono"))) {
                aciertos++;
                System.out.println("");
                System.out.println("Has acertado la palabra " + aciertofallo + " te queda una menos!");
            } else {
                System.out.println("");
                System.out.println("Has fallado, intentalo de nuevo");
                errores++;
            }

            // Verifica si el jugador ha perdido o ganado
            if (errores == 5) {
                System.out.println("Has perdido");
                perdido = true;
            }
            if (aciertos == 5) {
                System.out.println("¡Has ganado!");
                ganado = true;
            }
        }
    }

    /**
     * Genera una letra aleatoria del alfabeto.
     * @return Una letra aleatoria en mayúscula.
     */
    public static char letraAleatoria() {
        return (char) (Math.random() * 26 + 'A');
    }

    /**
     * Determina si las posiciones ingresadas corresponden a una palabra en la sopa de letras.
     * @param posiciones Las posiciones ingresadas por el jugador.
     * @return La palabra correspondiente a las posiciones, o "fallo" si no coincide con ninguna palabra.
     */
    public static String aciertofallo(String posiciones) {
        String retorna = null;
        posiciones = posiciones.replace(" ", "").replace(",", "").replace("-", "");
        System.out.println(posiciones);

        // Asigna la palabra correspondiente a las posiciones ingresadas
        if (posiciones.equals("1151")) {
            retorna = "Liron";
        }
        if (posiciones.equals("2024")) {
            retorna = "Perro";
        }
        if (posiciones.equals("3033")) {
            retorna = "Lobo";
        }
        if (posiciones.equals("1141")) {
            retorna = "Leon";
        }
        if (posiciones.equals("5255")) {
            retorna = "Mono";
        }
        if (posiciones.equals(posiciones)) {
            retorna = "fallo";
        }
        return retorna;
    }

    /**
     * Imprime la sopa de letras en la consola.
     */
    public static void sopaletras() {
        String[][] sopa = new String[6][6];

        // Configuración de letras en la sopa de letras
        sopa[2][0] = "|P|";
        sopa[3][0] = "|L|";

        sopa[1][1] = "|L|";
        sopa[2][1] = "|E|";
        sopa[3][1] = "|O|";
        sopa[4][1] = "|N|";

        sopa[1][2] = "|I|";
        sopa[2][2] = "|R|";
        sopa[3][2] = "|B|";

        sopa[5][2] = "|M|";
        sopa[1][3] = "|R|";
        sopa[2][3] = "|R|";
        sopa[3][3] = "|O|";
        sopa[5][3] = "|O|";

        sopa[1][4] = "|O|";
        sopa[2][4] = "|O|";
        sopa[1][5] = "|N|";
        sopa[5][4] = "|N|";
        sopa[5][5] = "|O|";

        // Configuración de espacios vacíos/letras aleatorias
        sopa[0][0] = "|"+letraAleatoria()+"|";
        sopa[1][0] = "|"+letraAleatoria()+"|";
        sopa[0][1] = "|"+letraAleatoria()+"|";
        sopa[4][0] = "|"+letraAleatoria()+"|";
        sopa[5][0] = "|"+letraAleatoria()+"|";
        sopa[5][1] = "|"+letraAleatoria()+"|";
        sopa[0][2] = "|"+letraAleatoria()+"|";
        sopa[4][2] = "|"+letraAleatoria()+"|";
        sopa[0][3] = "|"+letraAleatoria()+"|";
        sopa[4][3] = "|"+letraAleatoria()+"|";
        sopa[0][4] = "|"+letraAleatoria()+"|";
        sopa[3][4] = "|"+letraAleatoria()+"|";
        sopa[4][4] = "|"+letraAleatoria()+"|";
        sopa[0][5] = "|"+letraAleatoria()+"|";
        sopa[2][5] = "|"+letraAleatoria()+"|";
        sopa[3][5] = "|"+letraAleatoria()+"|";
        sopa[4][5] = "|"+letraAleatoria()+"|";

        // Imprime la sopa de letras
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
    }
}
