import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas(){
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod){
		for(CiaAerea cia : empresas){
			if (cia.getCodigo() == cod){
				return cia;
			}
		}
		return null;
	}
}