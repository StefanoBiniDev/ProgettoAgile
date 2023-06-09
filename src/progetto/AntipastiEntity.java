package progetto;

import javax.persistence.*;

@Entity
@Table(name = "Antipasti")
public class AntipastiEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portata")
	private int id_portata;
	
	private String nome;
	private Double prezzo;
	private String descrizione;
	
	
	@ManyToOne
	@JoinColumn(name = "id_menu")
	private MenuEntity menuEntity;

	public void setMenuEntity(MenuEntity menuEntity) {
		this.menuEntity = menuEntity;
	}
	// getters, setters, equals, hashcode

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
