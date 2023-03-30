import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dolci")

public class Dolci {


	@Id
	@Column(name = "id_portata")
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "prezzo")
	private double prezzo;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "id_menu")
	private int idMenu;
	
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

	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id_menu) {
		this.id = id_menu;
	}
	
}