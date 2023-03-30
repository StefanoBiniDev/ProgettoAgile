import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bevande")
public class BevandeEntity {
	@Id
	@Column(name = "id_portata")
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "prezzo")
	private double prezzo;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "id_menu")
	private int idMenu;
	@Column(name = "alcolico")
	private Boolean alcolico;
	@Column(name= "quantita")
	private Double quantita;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public Boolean getAlcolico() {
		return alcolico;
	}

	public void setAlcolico(Boolean alcolico) {
		this.alcolico = alcolico;
	}

	public Double getQuantita() {
		return quantita;
	}

	public void setQuantita(Double quantita) {
		this.quantita = quantita;
	}

}
