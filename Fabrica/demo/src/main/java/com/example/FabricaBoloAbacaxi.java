package com.example;

public class FabricaBoloAbacaxi extends FabricaDeBolo{

    @Override
    public Bolo criarBolo(){
        return new BoloDeAbacaxi();
    }
    
}