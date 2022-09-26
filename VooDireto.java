import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
	
	private Rota rota;
	
	
	public VooDireto(LocalDateTime datahora, Rota rota) {
        super(datahora);
        this.rota = rota;
	}

	
	public Rota getRota() {
        return rota;
    }

	public Duration getDuracao() {
        return null;
    }
	
	public String toString() {
        return  getStatus() + " " + getDatahora() + getRota();  // (duracao): rota;
    }
    
}
