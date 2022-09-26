import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends Voo{

    private ArrayList<Rota> escalas; 
    private Rota rotaFinal;

    public VooVariasEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao); 
        this.rotaFinal = rotaFinal;
        escalas = new ArrayList<>();
     }

     public void inserir(Rota rota) { //
        escalas.add( rota );
    }

    public ArrayList<Rota> getLista(){
        return escalas;
    }
  
    public Rota pesquisar(Aeroporto destino) { //pesquisa rota pelo aeroporto de destino 
        for (Rota rota: escalas) {
            if (rota.getDestino() == destino)
                return rota;
        }
        return null;
    }

    
    public void display(){ //lista todos as aeronaves
        for (int i=0; i<escalas.size(); i++){
            System.out.println(escalas.get(i));
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Escalas: " + escalas +" -> " + rotaFinal;
    }

}
