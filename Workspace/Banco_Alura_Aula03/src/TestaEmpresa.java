
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);
		empresa.setNome("Lopesah Tecnologia");
		empresa.setCnpj("11222333455");
		empresa.setTelefone("11 965522 55441");
		empresa.setEndereco("Rua dos Testes S/N");
		for (int i = 0; i < 10; i++){
			Funcionario f = new Funcionario();
			Data d = new Data();
			d.preencheData(i, 5, 2013);
			f.incluiFuncionario("Alexandre " + i, i + " TI", 10000.0 + 1000 * i, d,"R" + i + i + i + i + i);
			empresa.adiciona(f);
		}
		
		empresa.imprimeEmpresa();
	}

}
