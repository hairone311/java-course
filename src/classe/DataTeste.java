package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data nascimento = new Data(19, 9, 1998);
//		nascimento.dia = 19;
//		nascimento.mes = 9;
//		nascimento.ano = 1998;
		
		Data unix = new Data();
		
		String dataFormatada = nascimento.obterDataFormatada();
		System.out.println(dataFormatada);
		
		System.out.println(unix.obterDataFormatada());
		
		nascimento.imprimirDataFormatada();
		unix.imprimirDataFormatada();
	}
}
