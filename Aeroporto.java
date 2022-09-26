public class Aeroporto implements Contavel, Comparable<Aeroporto>{
    private String codigo;
	private String nome;
	private Geo loc;
	private static int totalAeroportos = 0;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		totalAeroportos++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public static int getTotalAeroportos(){
		return totalAeroportos;
	}


	public void imprimir(){
		System.out.println(totalAeroportos);
	}

	@Override
	public int compareTo(Aeroporto outra) {
		return nome.compareTo(outra.nome);
	}

	public String toString(){
		return "Aeroporto: "+ nome;
	}
}