package com.iphone.reprodutorMusical;

public class AppMusic implements ReprodutorMusical{
    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando a musica: " + musica.getNome());
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Você selecionou a musica: " + musica.getNome() +  " do artista: " + musica.getArtista());
        tocar(musica);
    }

}
