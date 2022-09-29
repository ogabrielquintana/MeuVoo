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

    @Override
	public Duration getDuracao() {
        Duration duration;
        double d = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
        double e = ((805 / d) + 30);
        long f = Double.valueOf(e).longValue();
        duration = Duration.ofMinutes(f);
        return duration;
    }
	
	public String toString() {
        return  getStatus() + " " + getDuracao() + " " + getDatahora() + getRota();  // (duracao): rota;
    }
    
}
