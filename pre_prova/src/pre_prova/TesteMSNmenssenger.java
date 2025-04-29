package pre_prova;

public class TesteMSNmenssenger {

	public static void main(String[] args) {
		
		MSNmessenger msg = new MSNmessenger();
		
		msg.enviarMensagem();
		msg.receberMensagem();
		
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();
		
		FacebookMessenger fac = new FacebookMessenger();
		
		fac.enviarMensagem();
		fac.receberMensagem();

	}

}
