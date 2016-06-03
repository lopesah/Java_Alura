
public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private static int proximoFuncionario = 0;
	private int identificador;
	

	public Funcionario(String nome) {
		this.nome = nome;
		this.identificador = proximoFuncionario++;
	}
	
	public Funcionario() {
		this.identificador = proximoFuncionario++;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}

	public void recebeAumento (double valor){
		double novoSalario = this.salario + valor;
		this.salario = novoSalario;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("*********************************************************");
		System.out.println("Funcion�rio: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Sal�rio: " + this.salario);
		System.out.println("Data de Admiss�o: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("*********************************************************");
	}
	
	public void incluiFuncionario(String nome, String departamento, double salario, Data dataEntrada, String rg){
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
