package br.com.bruno.playmusic.principal;

import br.com.bruno.playmusic.modelos.MinhasPreferidas;
import br.com.bruno.playmusic.modelos.Musica;
import br.com.bruno.playmusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Toxicity");
        minhaMusica.setArtista("System Of A Down");

        for (int i = 0; i < 1000; i++) { //simular reprodução de minhaMusica
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) { //simular curtidas de minhaMusica
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Hipsters");
        meuPodcast.setApresentador("Paulo Silveira");

        for (int i = 0; i < 5000; i++) { //simular reprodução de meuPodcast
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) { //simular curtidas de meuPodcast
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
