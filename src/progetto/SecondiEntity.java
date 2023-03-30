package progetto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name= "Secondi")
	
public class SecondiEntity implements JPAEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portata")
	private Integer id_portata;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "prezzo")
	private Double prezzo;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "is_pesce")
	private Boolean isPesce;

	@Column(name = "is_carne")
	private Boolean isCarne;
	
	/*@OneToMany
	@Column(name = "id_menù")
	private String code;*/
	
	
	


}
