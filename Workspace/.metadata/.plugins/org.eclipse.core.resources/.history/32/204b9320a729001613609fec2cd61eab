
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;
	
	void recebeAumento (double valor){
		double novoSalario = this.salario + valor;
		this.salario = novoSalario;
	}
	
	double calculaGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("*********************************************************");
		System.out.println("Funcionário: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		System.out.println("Data de Admissão: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("*********************************************************");
	}
	
}
