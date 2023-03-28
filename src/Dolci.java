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
	private int id_menu;

}
