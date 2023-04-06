CREATE TABLE menu (
  id_menu int NOT NULL AUTO_INCREMENT,
  nome varchar(100) not null,
  tipo varchar(100) not null,
  PRIMARY KEY (id_menu)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE antipasti (
id_portata int NOT NULL AUTO_INCREMENT, 
nome varchar(100) not null, 
prezzo decimal(5,2) NOT NULL, 
descrizione varchar(100),
id_menu int not null,

PRIMARY KEY (id_portata),
foreign key (id_menu) references menu(id_menu)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;