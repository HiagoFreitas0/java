package pre_prova;

public abstract class ServicoMensagemInstatanea {
	
		public abstract void enviarMensagem ();
		public abstract void receberMensagem();
		

		private void validarConectarInternet() {
		
		System.out.println("validando conectar internet");
		
		}

		private void salvarHistoricoMensagem() {
		System.out.println("salvar historico das mensagem");
		}

}
