public class Aplicativos {
    public class ReprodutorMusical extends Aplicativos{

        String musica;

        public void tocarMusica(){
            System.out.println("A musica esta sendo tocada...");
        }

        public void pausarMusica(){
            System.out.println("Musica pausada...");
        }

        public void setMusica() {
            this.musica = musica;
        }

        public String getMusica() {
            return musica;
        }
    }

    public class AparelhoTelefonico extends Aplicativos{

    }


}
