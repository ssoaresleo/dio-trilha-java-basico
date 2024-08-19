public class SmartTv {
    boolean ligada;
    int canal = 1;
    int volume = 10;

    public void ligarTv() {
        this.ligada = true;

        System.out.println("Ligando tv...");
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Aumentando volume...");
    }

    public void diminuirVolume() {
        if(this.volume == 0) {
            return;
        }
        this.volume--;

        System.out.println("diminuindo volume...");
    }

    public void mudarCanal() {
        this.canal++;

        System.out.println("Apenas mudando o canal...");
    }

    public void escolherCanal(int canal) {
        this.canal = canal;

        System.out.println("Mudando canal para escolhido...");
    }
}
