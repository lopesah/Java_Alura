
public class Empresa {
	
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private String endereco;
	private String telefone;
	
	private int livre = 0;
	
	public Empresa(int quantidadeFuncionarios){
		this.funcionarios = new Funcionario[quantidadeFuncionarios];
	}
	
	public void adiciona(Funcionario f){
		this.funcionarios[livre] = f;
		livre++;
	}
	
	public void imprimeEmpresa(){
		System.out.println("**************************************************");
		System.out.println("Empresa: " + this.nome);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Endere�o: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("**************************************************");
		System.out.println("*******************FUNCIONARIOS*******************");
		for (int i = 0; i < this.funcionarios.length; i++){
			this.funcionarios[i].mostra();
		}
	}
	
	public boolean contem(Funcionario f){
		for (int i = 0; i < this.funcionarios.length; i++){
			if (f == this.funcionarios[i]){
				return true;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
