/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class ServiciosCadena {

    public void pedirFrase(Cadena f1) {
        //scanner con useDelimite para que lea espacios en blanco
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //solicito la frase al usuario
        System.out.println("Ingrese la frase: ");
        //con el set le atribuyo un valor al atributo "frase", que es la lectura de lo ingresado
        f1.setFrase(leer.nextLine());
        //con el set le atribuyo un valor al atributo "longitud", que es la lectura de la longitud de la frase
        //que ya se encuentra en "frase", por eso es get.
        f1.setLongitud(f1.getFrase().length());

        //impresión para corroborar dela frase y de la longitud
        System.out.println(f1.toString());

    }

    public void mostrarVocales(Cadena f1) {
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
        int cont = 0; //contador de vocales
        for (int i = 0; i < f1.getLongitud(); i++) { //recorrer la frase
            String fraseseparada = f1.getFrase().substring(i, i + 1); //para avanzar caracter x caracter
            if (fraseseparada.equalsIgnoreCase("a") || fraseseparada.equalsIgnoreCase("e")
                    || fraseseparada.equalsIgnoreCase("i") || fraseseparada.equalsIgnoreCase("o")
                    || fraseseparada.equalsIgnoreCase("u")) {
                cont++; //incrementador de contador
            }
        }
        System.out.println("La frase tiene " + cont + " vocal/es"); //impresión de cantidad de vocales
    }

    public void invertirFrase(Cadena f1) {
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
//Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        String invertir = f1.getFrase();
        StringBuilder fraseinvertida = new StringBuilder(invertir);
        invertir = fraseinvertida.reverse().toString();
        System.out.println("La frase invertida es: " + invertir);
    }

    public void vecesRepetido(Cadena f1) {
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter para contar repetidos");
        String caracter = leer.next();
        int repet = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            String fraseseparada = f1.getFrase().substring(i, i + 1);
            if (fraseseparada.equalsIgnoreCase(caracter)) {
                repet++;
            }
        }
        System.out.println("El caracter -" + caracter + "- se repite " + repet + " vez/veces");
    }

    public void compararLongitud(Cadena f1) {
//Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la nueva frase para comparar longitudes");
        String nuevafrase = leer.nextLine();
        int nuevalongitud = nuevafrase.length();
        System.out.println("La longitud de la frase nueva es: " + nuevalongitud);
        if (f1.getLongitud() < nuevalongitud) {
            System.out.println("La frase original es más pequeña");
        } else if (f1.getLongitud() > nuevalongitud) {
            System.out.println("La frase nueva es más pequeña");
        } else {
            System.out.println("Las frases tienen la misma longitud");
        }

    }

    public void unirFrases(Cadena f1) {
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la nueva frase para unir");
        String nuevafrase = leer.nextLine();
        System.out.println("Las frases unidas quedaría: " + f1.getFrase().concat(" " + nuevafrase));
    }

    public void reemplazar(Cadena f1) {
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter para reemplzar");
        String caracter = leer.next();
        String nuevafrase = f1.getFrase().replace("a", caracter);
        System.out.println("La frase con caractere reemplazados queda: " + nuevafrase);
    }

    public void contiene(Cadena f1) {
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
        boolean contiene = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter para comprobar si lo contiene");
        String caracter = leer.next();
        int repet=0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            String fraseseparada = f1.getFrase().substring(i, i + 1);
            if (fraseseparada.equalsIgnoreCase(caracter)) {
                repet++;
            }
        }
        if (repet>=1) {
            contiene=true;
            System.out.println("¿La frase contiene el caracter? "+contiene);
        }  else {
            contiene=false;
            System.out.println("¿La frase contiene el caracter? "+contiene);
        }
        
    }

}
