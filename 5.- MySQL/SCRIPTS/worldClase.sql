USE world;
SELECT * FROM city;
SELECT 	Name,Population FROM country ORDER BY Population DESC;
SELECT 	Name,Population FROM country ORDER BY Population DESC;
SELECT 	Name,Population FROM country WHERE Name='Mexico';
SELECT 	* FROM country WHERE Name='Mexico';
-- Alias
SELECT 5+5;
SELECT Name AS Nombre_de_pais, Population AS poblacion_del_pais FROM country ORDER BY poblacion_del_pais DESC;
SELECT DISTINCT Continent FROM country;
SELECT DISTINCT Continent FROM country WHERE Name="Mexico";

-- WHERE Clausula
-- < > <= >= != =
SELECT * FROM country;
SELECT * FROM country WHERE LifeExpectancy < 50 ORDER BY LifeExpectancy ASC;
SELECT * FROM country WHERE Continent='North America';
SELECT * FROM country WHERE Continent!='North America' ORDER BY continent ASC;

-- Between
-- Se utiliza junto con WHERE
SELECT * FROM country WHERE Population BETWEEN 50000000 AND 70000000 ORDER BY Population DESC;
SELECT * FROM country WHERE Population NOT BETWEEN 50000000 AND 70000000 ORDER BY Population DESC;

-- OR / AND / "= --LÓDICOS
SELECT * FROM country WHERE Continent='Asia' OR Continent='Europe';
SELECT * FROM country WHERE Continent!='Asia' OR Continent!='Europe';
SELECT * FROM country WHERE Continent IN ('Asia','Europe','North America') ORDER BY Continent;
SELECT * FROM country WHERE Continent NOT IN ('Asia','Europe','North America') ORDER BY Continent;
SELECT * FROM country WHERE IndepYear IS NULL;

-- LIKE sirve para buscar un patrón en específico
-- '%' buscar cualquier cantidad de caracteres
-- '_' especifidcamos un caracter
-- la cantidad de guines bajos me indica cuántos carácteres debe haber de por medio
SELECT Name FROM country WHERE Name LIKE '%as';
SELECT Name FROM country WHERE Name LIKE '%e_a';