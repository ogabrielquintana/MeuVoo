import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {

    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private Status status;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
       super(rota, datahora, duracao); 
       this.rotaFinal = rotaFinal;
    }

    

    public Rota getRotaFinal() {
        return rotaFinal;
    }



    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }

}