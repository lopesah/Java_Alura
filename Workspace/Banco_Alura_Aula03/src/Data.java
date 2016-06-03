
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		if (! ehDataViavel(dia, mes, ano)){
			System.out.println("Data inválida: " + this.getFormatada());
		}
	}
	
	public String getFormatada(){
		return (this.dia + "/" + this.mes + "/" + this.ano);
	}
	
	private Boolean ehDataViavel(int dia, int mes, int ano){
		if (mes <= 0 || mes > 12 || dia <= 0 || ano <= 0){
			return false;
		}
		
		int ultimoDia = 31;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
			ultimoDia = 30;
		}
		if (mes == 2){
			ultimoDia = 28;
			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
				ultimoDia = 29;
			}
		}
		if (dia > ultimoDia){
			return false;
		}
		return true;
	}
}
