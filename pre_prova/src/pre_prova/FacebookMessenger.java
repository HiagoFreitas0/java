package pre_prova;

public class FacebookMessenger extends ServicoMensagemInstatanea{

	@Override
	public void enviarMensagem() {
		System.out.println("enviando mensagem pelo FacebookMessenger");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("recebendo mensagem pelo FacebookMessenger");
		
	}
	
	

}
