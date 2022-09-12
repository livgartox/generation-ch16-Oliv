CREATE DATABASE Generation;
USE Generation;
CREATE TABLE cohorte_16(
alumno_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre CHAR(50) NOT NULL,
apellido CHAR(50) NOT NULL,
compañeros INT NOT NULL,
direccion VARCHAR(150) NOT NULL,
proyecto VARCHAR(150) NOT NULL
);

INSERT INTO cohorte_16(nombre,apellido,compañeros,direccion,proyecto)
VALUES("Olivia","Toxqui",7,"Xico 13","Arte"),
("Pilar","Heznandez",6,"Lázaro Cardenas","Arte"),
("Fabi","Benitez",7,"Av Neza","Videojuegos"),
("Brandon","Guzman",6,"C 18, Av Toluca","Mueblería"),
("Cynthia","García",7,"Calle Atzayacatl","Maquillaje");

SELECT * FROM cohorte_16;
-- DESCRIBE cohorte_16;
DELETE FROM cohorte_16 WHERE alumno_id=3;
DELETE FROM cohorte_16 WHERE nombre="Olivia";

UPDATE cohorte_16
SET nombre="Jonathan",
apellido="Juarez"
WHERE alumno_id=5;

SELECT nombre,apellido FROM cohorte_16
ORDER BY apellido ASC;

