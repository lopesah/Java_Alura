class Fatoriais{
	public static void main(String[] args){
		long fatorial = 1;
		for (long i = 1; i <= 100; i++){
			fatorial = fatorial * i;
			System.out.println("O Fatorial de " + i + " eh " + fatorial);
		}
		
		
	}
}