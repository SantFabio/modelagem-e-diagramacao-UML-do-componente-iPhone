package com.iphone;

import com.iphone.aparelhoTelefonico.Contato;
import com.iphone.aparelhoTelefonico.Telefone;
import com.iphone.navegadorInternet.Safari;
import com.iphone.reprodutorMusical.AppMusic;
import com.iphone.reprodutorMusical.Musica;

public class IPhone {
    public static void main(String[] args) {
        AppMusic appMusic = new AppMusic();
        Musica lady = new Musica("lady", "Mako Road", 4.49);
        appMusic.selecionarMusica(lady);
        appMusic.pausar();
        appMusic.tocar(lady);

        Safari safari = new Safari();
        safari.exibirPagina("https://github.com");
        safari.atualizarPagina();
        safari.adicionarNovaAba();

        Contato luiz = new Contato(91,980426870, "Luiz Fabio Santana");
        Telefone telefone = new Telefone();
        telefone.ligar(luiz);
    }
}
