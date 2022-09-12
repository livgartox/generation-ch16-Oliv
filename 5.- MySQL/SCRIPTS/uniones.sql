Use tienda;

-- iner join
-- Explicita

SELECT * 
FROM clientes
INNER JOIN compra
ON clientes.cliente_id = compra.cliente_id;
-- Columnas específicas
SELECT clientes.cliente_id,
clientes.nombre,
compra.*
FROM clientes
INNER JOIN compra
ON clientes.cliente_id = compra.cliente_id;

SELECT clientes.cliente_id AS 'Número de cliente',
clientes.nombre,
compra.*
FROM clientes
INNER JOIN compra
ON clientes.cliente_id = compra.cliente_id;
-- Inner Join
-- Unión implicita
SELECT *
FROM clientes, compra
WHERE clientes.cliente_id=compra.cliente_id;

-- Left Join
SELECT * 
FROM clientes
LEFT JOIN compra
ON clientes.cliente_id = compra.cliente_id;

-- Righ
-- Left Join
SELECT * 
FROM clientes
RIGHT JOIN compra
ON clientes.cliente_id = compra.cliente_id;

-- Mostrar las direcciones de cada país
USE sakila;
/*
address - city-id / address
city - city_id/city/country

country - country_id/
*/
SELECT
address.address,
city.city,
city.country_id
FROM address
INNER JOIN city
ON address.city_id=city.city_id;


SELECT
country.country AS 'País',
city.city AS 'Ciudad',
address.address
FROM address
INNER JOIN city
ON address.city_id=city.city_id
INNER JOIN country
ON city.country_id=country.country_id;

