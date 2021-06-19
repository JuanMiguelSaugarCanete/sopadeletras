
package sopadeletras;

import java.util.Scanner;




public class sopadeletras {
    public static void main(String[] args) {
        int errores = 0;
        int aciertos = 0;
        boolean ganado = false;
        boolean perdido = false;
        Scanner palabra = new Scanner(System.in);
        String posicion = null;
        String aciertofallo;
        while(ganado != true && perdido != true ){
            sopaletras();
            System.out.println("Encuentra las palabras");
            posicion = palabra.nextLine();
            aciertofallo = aciertofallo(posicion);
            if((aciertofallo.equals("Liron")) || (aciertofallo.equals("Perro"))|| (aciertofallo.equals("Lobo"))|| (aciertofallo.equals("Leon"))|| (aciertofallo.equals("Mono"))){
                aciertos++;
                System.out.println("");
                System.out.println("Has acertado la palabra "+aciertofallo+" te queda una menos!");
            }else{
                System.out.println("");
                System.out.println("Has fallado, intentalo de nuevo");
                errores++;
            }
            if(errores == 5){
                System.out.println("Has perdido");
                perdido = true;
            }
            if(aciertos == 5){
                
                System.out.println("¡Has ganado!");
                ganado = true;
            }
        }
    
    }
        
    public static char letraaleatoria() {
        
        return (char) (Math.random()*26 + 'A');
        
    }
    public static String aciertofallo(String posiciones) {
        String retorna = null;
        posiciones = posiciones.replace(" ", "").replace(",", "").replace("-", "");
        System.out.println(posiciones);
        
        if(posiciones.equals("1151")){
            retorna = "Liron";
        }
        if(posiciones.equals("2024")){
            retorna = "Perro";
        }
        if(posiciones.equals("3033")){
            retorna = "Lobo";
        }
        if(posiciones.equals("1141")){
            retorna = "Leon";
        }
        if(posiciones.equals("5255")){
            retorna = "Mono";
        }
        if(posiciones.equals(posiciones)){
            retorna = "fallo";
        }
        return retorna;
    }
    public static void sopaletras() {
        String[][] sopa = new String[6][6];
        //Letras
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
        
        //Vacio/aleatorio
        
        sopa[0][0] = "|"+letraaleatoria()+"|";
        sopa[1][0] = "|"+letraaleatoria()+"|";
        sopa[0][1] = "|"+letraaleatoria()+"|";
        sopa[4][0] = "|"+letraaleatoria()+"|";
        sopa[5][0] = "|"+letraaleatoria()+"|";
        sopa[5][1] = "|"+letraaleatoria()+"|";        
        sopa[0][2] = "|"+letraaleatoria()+"|";        
        sopa[4][2] = "|"+letraaleatoria()+"|";
        sopa[0][3] = "|"+letraaleatoria()+"|";        
        sopa[4][3] = "|"+letraaleatoria()+"|";
        sopa[0][4] = "|"+letraaleatoria()+"|";        
        sopa[3][4] = "|"+letraaleatoria()+"|";
        sopa[4][4] = "|"+letraaleatoria()+"|";       
        sopa[0][5] = "|"+letraaleatoria()+"|";        
        sopa[2][5] = "|"+letraaleatoria()+"|";
        sopa[3][5] = "|"+letraaleatoria()+"|";
        sopa[4][5] = "|"+letraaleatoria()+"|";
        
        
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 6; j++) {
                
                System.out.print(sopa[i][j]); 
            }
            
            System.out.println(""); 
            
        }
    }
    
    
}
