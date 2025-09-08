package poo1;

public class Televisor {
    int canal;
    int volume;

    public Televisor(int canalInicial, int volumeInicial) {
        if (canalInicial >= 1 && canalInicial <= 100) {
            this.canal = canalInicial;
        } else {
            this.canal = 1; 
        }

        if (volumeInicial >= 0 && volumeInicial <= 50) {
            this.volume = volumeInicial;
        } else {
            this.volume = 10; 
        }
    }

    public void setCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido! Digite entre 1 e 100.");
        }
    }

    public void aumentarVolume() {
        if (volume < 50) {
            volume++;
        } else {
            System.out.println("Volume no máximo!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume no mínimo!");
        }
    }

    public void mostrarStatus() {
        System.out.println("Canal atual: " + canal + " | Volume: " + volume);
    }
}