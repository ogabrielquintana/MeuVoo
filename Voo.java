import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo implements Contavel{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private static int totalVoos;	
	private LocalDateTime datahora;
	private Status status;
	
	public Voo(LocalDateTime datahora) {
		totalVoos++;
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo() { //exercicio 1
		totalVoos++;
		datahora = LocalDateTime.of(2016, 8, 12, 12, 00);
		this.status = Status.CONFIRMADO; 
	}
	
	public abstract Rota getRota();

	public abstract Duration getDuracao();
	
	public LocalDateTime getDatahora() {
		return datahora;
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
        return  getStatus() + "\nDuração prevista: " + getDuracao() + "\n" + getDatahora() + "\n" + getRota();  // (duracao): rota;
    }
}
