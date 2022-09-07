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