import java.util.ArrayList;
//import java.time.Duration;
import java.time.LocalDateTime;

public class GerenciadorVoos {
   private ArrayList <Voo> listaV;
   
   public GerenciadorVoos() {
      listaV = new ArrayList<>();
  } 

   public void inserir(Voo voo) { //adiciona voo no gerenciador
      listaV.add( voo );
   }

   public Voo pesquisar(LocalDateTime cod) { //pesquisa voo pela data (local date time)
      for (Voo voo: listaV) {
          if (voo.getDatahora() == cod)
              return voo;
      }
      return null;
  }

   public void display(){ //lista todos os voos
      for (int i=0; i<listaV.size(); i++){
         System.out.println(listaV.get(i));
      }
   }

}