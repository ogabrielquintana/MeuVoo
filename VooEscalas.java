import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo{

    private ArrayList<Rota> escalas; 
    private Rota rota;
    private Rota rotaFinal;

    public VooEscalas(LocalDateTime datahora, Rota rota, Rota rotaFinal) {
        super(datahora);
        this.rota = rota;
        this.rotaFinal = rotaFinal;
        escalas = new ArrayList<>();
    }

     public void adicionaROta(Rota rota) { //
        escalas.add( rota );
    }
  
    public Rota pesquisar(Aeroporto destino) { //pesquisa rota pelo aeroporto de destino 
        for (Rota rota: escalas) {
            if (rota.getDestino() == destino)
                return rota;
        }
        return null;
    }

    
    public void display(){ //lista todos as aeronaves
        System.out.println("Escalas: ");
        int cont=1;
        for (int i=0; i<escalas.size(); i++){
            System.out.println("[" + cont + "] "+ escalas.get(i));
            cont++;
        }
    }

    @Override
    public Rota getRota() {
        return rota;
    }

    public ArrayList<Rota> getRotas(){
        return escalas;
    }

    @Override
    public Duration getDuracao() {
        Duration duration = Duration.ofMinutes(0);
        long f = 0;
        for(Rota r : escalas){
            double d = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
            double e = ((805 / d) + 30);
            f += Double.valueOf(e).longValue();
            duration = duration.plusMinutes(f);
        }
        double d = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal()) - Geo.distancia(rotaFinal.getOrigem().getLocal(), rotaFinal.getDestino().getLocal());
        double e = ((805 / d) + 30);
        long g = Double.valueOf(e).longValue();
        duration = duration.plusMinutes(g);
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscalas: " + escalas +" -> " + rotaFinal;
    }

    

}
