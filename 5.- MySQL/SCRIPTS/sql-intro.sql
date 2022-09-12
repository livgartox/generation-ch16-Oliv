-- show databases;
/*Se pueden crear bases de datos con database o schema
sólo aquí 
CREATE SCHEMA tienda;*/
CREATE DATABASE tienda;
USE tienda;
-- DROP DATABASE tienda;

CREATE TABLE clientes(
cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre CHAR(50) NOT NULL,
apellido CHAR(50) NOT NULL,
telefono CHAR(50) NOT NULL,
direccion VARCHAR(150) NOT NULL
);

INSERT INTO clientes(nombre,apellido,telefono,direccion)
VALUES(
'Adriana','García','5535671234','Xico 13 Ancón'),
('Lupita','García','5535671234','Xico 13 Ancón');
-- al parecer se puede usar como tienda.clientes
SELECT * FROM clientes;
SELECT nombre, apellido FROM clientes;

DELETE FROM clientes WHERE cliente_id=11 ;
DELETE FROM clientes WHERE nombre = 'Adriana';