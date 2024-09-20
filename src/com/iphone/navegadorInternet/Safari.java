package com.iphone.navegadorInternet;
import java.util.*;
public class Safari implements Navegadorinternet{
    private ArrayList<String> abasAbertas = new ArrayList<String>();
    @Override
    public void adicionarNovaAba(String url) {
        abasAbertas.add(url);
        System.out.println("Nova aba aberta: " + url);
    }

    @Override
    public void exibirPagina(String url) {
        abasAbertas.add(url);
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
        System.out.println("Página atualizada");
    }
}
