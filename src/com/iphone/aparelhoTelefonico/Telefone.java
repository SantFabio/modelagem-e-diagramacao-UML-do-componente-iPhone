package com.iphone.aparelhoTelefonico;

public class Telefone implements  AparelhoTelefonico{
    @Override
    public void ligar(Contato numero) {
        System.out.println("Ligando para o número: " + numero.getDDD() + numero.getNumero());
        System.out.println(numero.getDonoNumero() + " Atendeu...");
    }

    @Override
    public void atender() {
        System.out.println("Recebendo ligação");
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        System.out.println("Gravando...");
        System.out.println("Enviando");
    }
}
