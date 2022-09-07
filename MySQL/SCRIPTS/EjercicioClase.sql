CREATE DATABASE EjercicioClase;
USE EjercicioClase;
CREATE TABLE Cohorte(
cohorte12_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
alumnos_id INT NOT NULL,
instructor_id INT NOT NULL,
numero_alumnos INT NOT NULL,
horario VARCHAR(255) NOT NULL,
tipo_sesiones VARCHAR(255) NOT NULL,
ciudad VARCHAR(255) NOT NULL
);

CREATE TABLE Alumno (
alumno_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
CURP VARCHAR(255) NOT NULL,
RFC VARCHAR(255),
nivel_ingles VARCHAR(255) NOT NULL,
amonestaciones INT NOT NULL
);

CREATE TABLE Instructor(
instructor_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
cumpleanios DATE NOT NULL,
RFC VARCHAR(255) NOT NULL,
supervisor VARCHAR(255) NOT NULL,
sesiones VARCHAR(255) NOT NULL
);
CREATE TABLE direccion(
direccion_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
alumno_id INT NOT NULL,
calle VARCHAR(255) NOT NULL,
pais VARCHAR(255) NOT NULL,
cp INT NOT NULL
);
DROP TABLE direccion;

CREATE TABLE Equipo( 
equipo_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
alumno_id INT NOT NULL,
nombre VARCHAR(255) NOT NULL,
cantidad_intengrantes INT NOT NULL,
logo VARCHAR(255) NOT NULL  );


-- RELACIONES
ALTER TABLE Cohorte
ADD CONSTRAINT fk_cohorte_alumno
FOREIGN KEY (alumnos_id)
REFERENCES Alumno(alumno_id);

ALTER TABLE Cohorte
ADD CONSTRAINT fk_cohorte_profesor
FOREIGN KEY (instructor_id)
REFERENCES Instructor(instructor_id);

ALTER TABLE Equipo
ADD CONSTRAINT fk_equipo_alumno
FOREIGN KEY (alumno_id)
REFERENCES Alumno(alumno_id);

ALTER TABLE equipo
DROP FOREIGN KEY fk_equipo_alumno;


ALTER TABLE direccion
ADD CONSTRAINT fk_direccion_alumno
FOREIGN KEY (alumno_id)
REFERENCES Alumno(alumno_id);

ALTER TABLE direccion
DROP FOREIGN KEY fk_direccion_alumno;

-- Se le agregara info a las tablas que no tienen llavescity foraneas
-- Alumno e Instructor
INSERT INTO Alumno(nombre,edad,CURP,RFC,nivel_ingles,amonestaciones)
VALUES("Pepe",28,"TERU13928345","TERU1392","intermedio",1),
("Adriana",23,"GATO635483","GATO1234","básico",0);


INSERT INTO Instructor(nombre,edad,cumpleanios,RFC,supervisor,sesiones)
VALUES("Raúl",22,'2000-09-09',"SANS123","Maria",5),
("Victor",32,'1990-09-07',"VICS123","Marina",5);

INSERT INTO Cohorte(alumnos_id,instructor_id,numero_alumnos,horario,tipo_sesiones,ciudad)
VALUES(1,2,13,"Matutino","Sesiones1","CDMX"),
(2,1,12,"Matutino","Sesiones 1:1","GDL");

INSERT INTO Equipo(alumno_id,nombre,cantidad_intengrantes,logo)
VALUES(1,"Dinos",7,"Epimerch"),
(2,"Vaquitas",5,"Vaquitas");

INSERT INTO Direccion(alumno_id,calle,pais,cp)
VALUES(1,"C","México",1234);

SELECT * FROM Cohorte;
SELECT * FROM Alumno;
SELECT * FROM Instructor;
SELECT * FROM Equipo;
SELECT * FROM direccion;