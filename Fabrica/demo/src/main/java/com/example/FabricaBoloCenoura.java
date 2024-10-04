package com.example;

public class FabricaBoloCenoura extends FabricaDeBolo{

    @Override
    public Bolo criarBolo(){
        return new BoloDeCenoura();
    }
    
}