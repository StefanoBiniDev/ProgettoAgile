package progetto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Primi")
public class PrimiEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_primi")
	private int idPrimi;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "prezzo")
	private Double prezzo;

	@Column(name = "descrizione")
	private String descrizione;
	
	@ManyToOne
	@JoinColumn(name = "id_menu")
	private MenuEntity menuEntity;

	public PrimiEntity(int idPrimi, String nome, Double prezzo, String descrizione, MenuEntity menuEntity) {
		super();
		this.idPrimi = idPrimi;
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.menuEntity = menuEntity;
	}

	public PrimiEntity(String nome, Double prezzo, String descrizione, MenuEntity menuEntity) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.menuEntity = menuEntity;
		
	}

	public PrimiEntity() {
		super();
		
	}

	public int getIPrimi() {
		return idPrimi;
		
	}

	public void setIdPrimi(int id_primi) {
		this.idPrimi = id_primi;
		
	}

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

	public MenuEntity getMenuEntity() {
		return menuEntity;
	}

	public void setMenuEntity(MenuEntity menuEntity) {
		this.menuEntity = menuEntity;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimiEntity other = (PrimiEntity) obj;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (menuEntity != other.menuEntity)
			return false;
		if (idPrimi != other.idPrimi)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prezzo != other.prezzo)
			return false;
		return true;
		
	}

	@Override
	public String toString() {
		return "Primi [id_primi=" + idPrimi + ", nome=" + nome + ", prezzo=" + prezzo + ", descrizione=" + descrizione
				+ ", id_menu=" + menuEntity + "]";
	}
	
}
