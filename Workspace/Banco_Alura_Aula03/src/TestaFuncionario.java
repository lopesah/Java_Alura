
public class TestaFuncionario {
	
	public static void main (String[] args){
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Alexandre");
		f1.setSalario(10000);
		f1.recebeAumento(2000);
		f1.setDepartamento("Tecnologia da Informação");
		Data dataAdmissao = new Data();
		dataAdmissao.preencheData(2, 7, 2013);
		f1.setDataEntrada(dataAdmissao);
		f1.setRg("32.876.674-4");
		
		System.out.println(f1.getIdentificador());
		f1.mostra();

		Funcionario f2 = new Funcionario();
		
		f2.setNome("Alexandre2");
		f2.setSalario(100002);
		f2.recebeAumento(20002);
		f2.setDepartamento("2Tecnologia da Informação");
		Data dataAdmissao2 = new Data();
		dataAdmissao2.preencheData(7, 2, 2013);
		f2.setDataEntrada(dataAdmissao2);
		f2.setRg("22232.876.674-4");
		
		System.out.println(f2.getIdentificador());
		f2.mostra();
		

		if (f1 == f2){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
	}

}
