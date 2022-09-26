import java.time.Duration;
import java.time.LocalDateTime;

public class Voo implements Contavel{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private static int totalVoos;	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		totalVoos++;
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(Rota rota, Duration duracao) { //exercicio 1
		totalVoos++;
		this.rota = rota;
		this.duracao = duracao;
		datahora = LocalDateTime.of(2016, 8, 12, 12, 00);
		this.status = Status.CONFIRMADO; 
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public static int getTotalVoos(){
		return totalVoos;
	}

	public void imprimir(){
		System.out.println(totalVoos);
	}

	public String toString() {
        return  getStatus() + " " + getDatahora() + "("+getDuracao()+"): " + getRota();
    }
}