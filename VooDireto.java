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
        double e = (d / 805) * 60;
        long f = Double.valueOf(e).longValue();
        duration = Duration.ofMinutes(f + 30);
        return duration;
    }
	
	public String toString() {
        return  super.toString(); // (duracao): rota;
    }
    
}
