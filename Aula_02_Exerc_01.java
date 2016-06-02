class BalancoTrimestral{

	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos do Trimestre: " + gastosTrimestre);
		
		double mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Media Mensal: " + mediaMensal);
		
	}
	
}