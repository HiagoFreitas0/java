
public class comparacaoAvancada {

	public static void main(String[] args) {
		String nome1="java";
		String nome2="java";
		
		System.out.println(nome1==nome2);
		String nome3=new String("java");
		System.out.println(nome1==nome3);
		String nome4=nome3;
		System.out.println(nome3==nome4);
		
		System.out.println(nome1.equals(nome2));
		System.out.println(nome2.equals(nome3));
		System.out.println(nome3.equals(nome4));

	}

}
