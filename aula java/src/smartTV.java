
public class smartTV {
	private boolean ligada;
    private int canal;
    private int volume;

    public smartTV() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 10;
    }

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("TV" + (ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("volume: " + volume);
        }
    }

    public void proximoCnal() {
        if (ligada) {
            canal++;
            System.out.println("canal: " + canal);
        }
    }

    public void canalAnterior() {
        if (ligada && canal > 1) {
            System.out.println("canal: " + canal);
        }
    }

    public void mudarCanal(int novaCanal) {
        if (ligada && novoCanal > 0) {
            canal = novoCanal;
            System.out.println("canal alterado para: " + canal);
        }
    }

    public void exibirStatus() {
        System.out.println("TV" + (ligado ? "ligada" : "desligada") + "canal: " + canal + "volume: " + volume);
    }

    public static void main(String[] args) {
        smartTV tv = new smartTV();
        tv.ligarDesligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.proximoCanal();
        tv.canalAnterior();
        tv.mudarCanal(5);
        tv.exibirStatus();
    }
}
