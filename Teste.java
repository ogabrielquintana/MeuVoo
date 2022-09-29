/**
 * Teste
 */

import java.time.Duration;
import java.time.LocalDateTime;
public class Teste {

    public static void main(String[] args) {

        //GEREN DE AEROPORTOS:
        GerenciadorAeroportos gerenAero = new GerenciadorAeroportos();

        Aeronave a1 = new Aeronave("733", "Boeing 737-300");
        Aeronave a2 = new Aeronave("100", "Boeing 100-300");
        Aeronave a3 = new Aeronave("50", "Avião 50-300");

        GerenciadorAeronaves geren = new GerenciadorAeronaves();

        Geo g1 = new Geo(-23.4327776, -46.4796442);
        Geo g2 = new Geo(-29.9934732, -51.1775698);
        CiaAerea c1 = new CiaAerea("123456", "Marina Emirates");
        CiaAerea c2 = new CiaAerea("4567", "Quintana's Airline");

        Geo g3 = new Geo(-22.9035, -43.2096);
        Geo g4  = new Geo(-22.8086568, -43.273241);

        Aeroporto galeao = new Aeroporto("GIG", "galgal", g4);
        Aeroporto salgadoFilho = new Aeroporto("salgadinho", "nomeSalga", g3);

        
        
        
        Aeroporto aero1 = new Aeroporto("GRU", "Guarulhos", g1);
        Aeroporto aero2 = new Aeroporto("POA", "Salgado FIlho", g2);
        
        Rota rota = new Rota(c1, galeao, aero1, a1);
                
        geren.inserir(a1);
        geren.inserir(a2);
        geren.inserir(a3);

        //System.out.println(geren.pesquisar("50").toString());

        geren.ordenaDescricao();
        //geren.display();

        Rota r1 = new Rota(c1, aero2, galeao, a3);

        Rota r2 = new Rota(c2, aero1, aero2, a2);



        GerenciadorRotas gr = new GerenciadorRotas();

        gr.inserir(r1);
        gr.inserir(r2);

        LocalDateTime data  = LocalDateTime.of(2022, 9, 23, 12, 00);

        Duration d = Duration.ofMinutes(240);

        GerenciadorVoos gerVoos = new GerenciadorVoos();
        
        VooEscalas ve = new VooEscalas(data, r1, r2);
        ve.adicionaRota(rota);
        
        Voo vd = new VooDireto(data, rota);

        gerenAero.inserir(aero1);
        gerenAero.inserir(aero2);

        gerenAero.display();

        System.out.println(Geo.distancia(g3, g4));

        System.out.println(ve.getDuracao());


        
    }
}
