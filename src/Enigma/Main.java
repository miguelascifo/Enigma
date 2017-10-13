package Enigma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.println("Escribe la clave pulsando la tecla Intro después de cada letra. Orden: Enigma.Rotor I, Enigma.Rotor II, Enigma.Rotor III. Ejemplo: C[Intro]H[Intro]S");
        String rI = sc.nextLine();
        String rII = sc.nextLine();
        String rIII = sc.nextLine();

        System.out.println("Escribe el texto que quieres cifrar");
        String texto = sc.nextLine();

        System.out.println("Escribe las etiquetas que quieres tener cambiadas. Dejalo en blanco si no las quieres cambiar. Ejemplo: AM;HE;QV");
        String etiquetas = sc.nextLine();

        if(etiquetas.equals("")){
            etiquetas = "AA";
        }

        rI = rI.toUpperCase();
        rII = rII.toUpperCase();
        rIII = rIII.toUpperCase();
        texto = texto.toUpperCase();
        etiquetas = etiquetas.toUpperCase();

        Enigma enigma = new Enigma(new Rotor(Constantes.rotorI, rI.charAt(0), Constantes.saltoI),
                new Rotor(Constantes.rotorII, rII.charAt(0), Constantes.saltoII),
                new Rotor(Constantes.rotorIII, rIII.charAt(0), Constantes.saltoIII),
                new Reflector(),
                new Etiquetas(etiquetas));

        for (int i = 0; i < texto.length(); i++) {
            resultado.append(enigma.caracterCifrado(texto.charAt(i)));
        }

        System.out.println("******** TEXTO CIFRADO ********");
        System.out.println(resultado);
        System.out.println("*******************************");
    }
}