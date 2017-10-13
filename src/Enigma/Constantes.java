package Enigma;

abstract class Constantes {

    static final String alfabeto = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static final String rotorI = " EKMFLGDQVZNTOWYHXUSPAIBRCJ";
    static final char saltoI = 'Q';

    static final String rotorII = " AJDKSIRUXBLHWTMCQGZNPYFVOE";
    static final char saltoII = 'E';

    static final String rotorIII = " BDFHJLCPRTXVZNYEIWGAKMUSQO";
    static final char saltoIII = 'V';

    static final String reflector = " YRUHQSLDPXNGOKMIEBFZCWVJAT";

    // Devuelve el índice del caracter introducido. Se compara con alfabeto.
    static int indiceCaracter(char caracter) {
        return alfabeto.indexOf(caracter);
    }
}
