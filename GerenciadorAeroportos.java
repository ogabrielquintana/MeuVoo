import java.util.ArrayList;
import java.util.Collections;
public class GerenciadorAeroportos {
    private ArrayList <Aeroporto> listaA;
       
       public GerenciadorAeroportos() {
          listaA = new ArrayList<>();
      } 
       
    public void inserir(Aeroporto aeroporto) {
        listaA.add( aeroporto );
    }
    
       public Aeroporto pesquisar(String cod) { //pesquisa aeroporto pelo codigo 
          for (Aeroporto aeroporto: listaA) {
              if (aeroporto.getCodigo() == cod)
                  return aeroporto;
          }
          return null;
      }

      public void ordenaNome(){
         Collections.sort(listaA);
      }
    
       public void display(){ //lista todos os aeroportos
          for (int i=0; i<listaA.size(); i++){
             System.out.println(listaA.get(i));
          }
       }
    
}