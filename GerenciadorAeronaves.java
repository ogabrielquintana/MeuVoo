import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> listaA;

    public GerenciadorAeronaves() {
        listaA = new ArrayList<>();
    }
  
    public void inserir(Aeronave aeronave) {
        listaA.add( aeronave );
    }

    public ArrayList<Aeronave> getLista(){
        return listaA;
    }
  
    public Aeronave pesquisar(String cod) { //pesquisa aeronave pelo codigo 
        for (Aeronave aeronave: listaA) {
            if (aeronave.getCodigo() == cod)
                return aeronave;
        }
        return null;
    }

    public void ordenaDescricao(){
        Collections.sort(listaA);
    }
  
    public void display(){ //lista todos as aeronaves
        for (int i=0; i<listaA.size(); i++){
            System.out.println(listaA.get(i));
        }
    }
}