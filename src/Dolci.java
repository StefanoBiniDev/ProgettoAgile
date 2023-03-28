import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dolci")

public class Dolci {


	@Id
	@Column(name = "id_portata")
	private int id_portata;
	@Column(name = "nome")
	private String nome;
	@Column(name = "prezzo")
	private double prezzo;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "id_menu")
	private int id;

	
	public void Dolce(String nome, double prezzo, String descrizione, int id_menu) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.id = id_menu;
        
    }


	public int getId_portata() {
		return id_portata;
	}


	public void setId_portata(int id_portata) {
		this.id_portata = id_portata;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public int getId_menu() {
		return id_menu;
	}


	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	
}
