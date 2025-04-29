package pre_prova;

public class Telegram extends ServicoMensagemInstatanea{

	@Override
	public void enviarMensagem() {
		System.out.println("enviando mensagem pelo Telegram");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("recebendo mensagem pelo Telegram");
		
	}
	
	

}
