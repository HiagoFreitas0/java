public class smartTVs {
    private boolean ligada;
    private int canal;
    private int volume;

    public smartTVs() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 10;
    }

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("TV " + (ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void proximoCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }

    public void canalAnterior() {
        if (ligada && canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }

    public void mudarCanal(int novaCanal) {
        if (ligada && novaCanal > 0) {
            canal = novaCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void exibirStatus() {
        System.out.println("TV " + (ligada ? "ligada" : "desligada") + 
                           " | Canal: " + canal + 
                           " | Volume: " + volume);
    }

    public static void main(String[] args) {
        smartTVs tv = new smartTVs();
        tv.ligarDesligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.proximoCanal();
        tv.canalAnterior();
        tv.mudarCanal(5);
        tv.exibirStatus();
    }
}
