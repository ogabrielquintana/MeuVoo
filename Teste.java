/**
 * Teste
 */

import java.time.Duration;
import java.time.LocalDateTime;
public class Teste {
    
    public static void main(String[] args) {
        
        LocalDateTime data  = LocalDateTime.of(2022, 9, 23, 12, 00);
        
        //GEREN DE AEROPORTOS:
        GerenciadorAeroportos gerenAero = new GerenciadorAeroportos();
        //GEREN DE AERONAVES:
        GerenciadorAeronaves geren = new GerenciadorAeronaves();
        //GEREN DE ROTAS:
        GerenciadorRotas gr = new GerenciadorRotas();
        //GEREN DE VOOS:
        GerenciadorVoos gerVoos = new GerenciadorVoos();

        //AERONAVES:
        Aeronave a1 = new Aeronave("733", "Boeing 737-300");
        Aeronave a2 = new Aeronave("100", "Boeing 100-300");
        Aeronave a3 = new Aeronave("50", "Avião 50-300");

        //CIAS AEREAS:
        CiaAerea c1 = new CiaAerea("123456", "Marina Emirates");
        CiaAerea c2 = new CiaAerea("4567", "Quintana's Airline");

        //GEOS:
        Geo g1 = new Geo(-23.4327776, -46.4796442);
        Geo g2 = new Geo(-29.9934732, -51.1775698);
        Geo g3 = new Geo(40.6379072, -73.7823313);
        Geo g4  = new Geo(-22.8086568, -43.273241);

        //AEROPORTOS
        Aeroporto galeao = new Aeroporto("GIG", "galgal", g4);
        Aeroporto aero = new Aeroporto("JFK", "John F Kennedy", g3);
        Aeroporto aero1 = new Aeroporto("GRU", "Guarulhos", g1);
        Aeroporto aero2 = new Aeroporto("POA", "Salgado FIlho", g2);
        
        //ROTAS:
        Rota rota = new Rota(c1, galeao, aero1, a1);
        Rota rota2 = new Rota(c1, aero2, galeao, a3);
        Rota rota3 = new Rota(c2, aero1, aero2, a2);
        Rota rota4 = new Rota(c2, galeao, aero, a1);

        //VOOS:
        VooEscalas ve = new VooEscalas(data, rota2, rota3);
        Voo vd = new VooDireto(data, rota);
        Voo vd1 = new VooDireto(data, rota4);
        
        //INSERIR / ADD:        
        geren.inserir(a1);
        geren.inserir(a2);
        geren.inserir(a3);
        
        gr.inserir(rota2);
        gr.inserir(rota3);

        ve.adicionaRota(rota);
        
        gerenAero.inserir(aero1);
        gerenAero.inserir(aero2);

        gerVoos.inserir(ve);
        gerVoos.inserir(vd);
        gerVoos.inserir(vd1);
        
        //ORDENA AERONAVES:
        geren.ordenaDescricao();
        
        //TESTES DE PRINT:
        gerVoos.display();
        System.out.println();
        System.out.println(vd.toString());
        System.out.println();
        gerenAero.display();
        System.out.println();
        System.out.println(Geo.distancia(g3, g4));
        System.out.println();
        System.out.println(ve.getDuracao());
          
    }
}
