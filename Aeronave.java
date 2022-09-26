public class Aeronave implements Contavel, Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private static int totalAeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		totalAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public static int getTotalAeronaves(){
		return totalAeronaves;
	}

	public void imprimir(){
		System.out.println(totalAeronaves);
	}

	public int compareTo(Aeronave outra){
		return descricao.compareTo(outra.descricao);
	}

	public String toString(){
		return descricao+"";
	}
}