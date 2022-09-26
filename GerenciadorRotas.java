import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList <Rota> listaR;
    private ArrayList <Rota> armazenaRota = new ArrayList<Rota>(); // ArrayDeCria
   
    public GerenciadorRotas() {
        listaR = new ArrayList<>();
    } 


    public void inserir(Rota rota) {
        listaR.add( rota );
    }

    public ArrayList<Rota> pesquisarO (Aeroporto origem) { //pesquisa rota pela origem
        for (Rota rota: listaR) {
            if (rota.getOrigem() == origem)
                armazenaRota.add(rota);
        }
        if (armazenaRota.isEmpty()){
            return null;
        }
        else{
            return armazenaRota;
        }
    }

    public ArrayList<Rota> pesquisarD (Aeroporto destino) { //pesquisa rota pelo destino
        for (Rota rota: listaR) {
            if (rota.getDestino() == destino){
                armazenaRota.add(rota); ;
            }
        }
         if (armazenaRota.isEmpty()){
            return null;
        }
        else{
            return armazenaRota;
        }
    }

    public void ordenaCia(){
        Collections.sort(listaR);
    }

   public void display(){ //lista todas as rotas
      for (int i=0; i<listaR.size(); i++){
         System.out.println(listaR.get(i));
      }
   }

}