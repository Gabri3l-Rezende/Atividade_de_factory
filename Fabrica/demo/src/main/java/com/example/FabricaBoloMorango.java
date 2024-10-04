package com.example;

public class FabricaBoloMorango extends FabricaDeBolo{

    @Override
    public Bolo criarBolo(){
        return new BoloDeMorango();
    }
    
}
