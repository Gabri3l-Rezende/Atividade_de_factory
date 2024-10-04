// Alunos: Gabriel Henrique Nascimento Ribeiro Rezende; RA: 42210808
//         Eric Dias Lemos; RA: 42124121


package com.example;

public class Main {
    public static void main(String[] args) {
        FabricaDeBolo fabricaBolo;

        // Fabrica de Bolo de Chocolate
        fabricaBolo = new FabricaBoloChocolate();
        fabricaBolo.fazerBolo();

        // Fabrica de Bolo de Morango
        fabricaBolo = new FabricaBoloMorango();
        fabricaBolo.fazerBolo();

        // Fabrica de Bolo de Cenoura
        fabricaBolo = new FabricaBoloCenoura();
        fabricaBolo.fazerBolo();

        // Fabrica de Bolo de Abacaxi
        fabricaBolo = new FabricaBoloAbacaxi();
        fabricaBolo.fazerBolo();
    }
}
