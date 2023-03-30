import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Primi")
public class MenuEntity {

	
	@OneToMany(mappedBy = "id_menu")
	private Set<MenuEntity> menu;
}
