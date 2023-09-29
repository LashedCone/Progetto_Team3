CREATE TABLE final_result (
	ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	userName VARCHAR(255) NOT NULL UNIQUE ,
	cpu VARCHAR(255) NULL DEFAULT ,
	cpucooler VARCHAR(255) NULL ,
	motherboard VARCHAR(255) NULL ,
	memory VARCHAR(255) NULL ,
	storage VARCHAR(255) NULL ,
	gpu VARCHAR(255) NULL ,
	case VARCHAR(255) NULL ,
	power_supply VARCHAR(255) NULL ,
)
COMMENT='risultato finale dei componenti scelti '