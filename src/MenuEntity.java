<<<<<<< HEAD

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Menu")
public class MenuEntity implements JpaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portata")
	private int idPortata;
	
	private int id;
	private String nome;
	private String tipo;
	
	@OneToMany(mappedBy = "menuEntity")
	private Set<AntipastiEntity> antipasti;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void addAntipasto(AntipastiEntity antipastiEntity) {
		if (this.antipasti == null) {
			this.antipasti = new HashSet<AntipastiEntity>();
		}

		this.antipasti.add(antipastiEntity);
	}
=======
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Primi")
public class MenuEntity {

	
	@OneToMany(mappedBy = "id_menu")
	private Set<MenuEntity> menu;
>>>>>>> Sviluppo-Primi
}
