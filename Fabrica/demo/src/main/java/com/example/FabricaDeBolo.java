package com.example;

public abstract class FabricaDeBolo {
    public abstract Bolo criarBolo();
    
    public void fazerBolo(){
        System.out.println("Adicionando farinha");
        System.out.println("...");
        System.out.println("Adicionando ovo");
        System.out.println("...");
        System.out.println("Adicionando leite");
        System.out.println("...");
        System.out.println("Adicionando fermento");
        System.out.println("...");
        System.out.println("Concluido!!!");
        System.out.println("...");
        Bolo bolo = criarBolo();
        bolo.Preparar();
    };
   
}
