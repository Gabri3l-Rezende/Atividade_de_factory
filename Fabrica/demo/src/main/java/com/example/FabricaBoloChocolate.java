package com.example;

public class FabricaBoloChocolate extends FabricaDeBolo{

    @Override
    public Bolo criarBolo(){
        return new BoloDeChocolate();
    }
    
}