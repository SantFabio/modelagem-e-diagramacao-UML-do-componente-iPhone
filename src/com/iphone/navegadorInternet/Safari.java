package com.iphone.navegadorInternet;

public class Safari implements Navegadorinternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Foi adicionado uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
        System.out.println("página atualizada");
    }
}
