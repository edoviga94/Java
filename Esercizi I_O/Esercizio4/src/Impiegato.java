import java.io.Serializable;
import java.util.Date;

public class Impiegato implements Serializable {

	private String nome;
	private int salary;
	private Date dataAssunzione;

	public Impiegato(String nome, int salary, Date dataAssunzione) {
		super();
		this.nome = nome;
		this.salary = salary;
		this.dataAssunzione = dataAssunzione;
	}

	@Override
	public String toString() {
		String s = "<Nome: " + nome + ", Stipendio: " + salary + ", Data assunzione: " + dataAssunzione + ">\n";
		return s;
	}

}
