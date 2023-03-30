package progetto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "contorni")
public class ContornoEntity implements JPAEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_contorno")
	private Integer id;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name= "prezzo")
	private Double prezzo;
	
	
	@ManyToOne
	@JoinColumn(name = "id_menù")
	private MenuEntity menuEntity;
	

	public void addContorno(ContornoEntity contornoEntity) {
		
	}

	public void removeContorno(ContornoEntity contornoEntity) {
		;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name ="descrizione")
	private String descrizione;
	
	@Column(name ="tipo")
	private String tipo;

}
