public class CiaAerea implements Contavel, Comparable<CiaAerea> {
	private static int totalCias = 0;
    private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		totalCias++;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}	

	public static int getTotalCias(){
		return totalCias;
	}

	public int compareTo(CiaAerea outra){
		return nome.compareTo(outra.nome);
	}

	public void imprimir(){
		System.out.println(totalCias);
	}

	public String toString(){
		return "Cia: " + nome;
	}
}