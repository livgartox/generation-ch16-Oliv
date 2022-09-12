USE sakila;

-- SUM(), AVG(), COUNT()
SELECT customer_id, amount FROM payment;
-- COUNT() cuenta las filas de una tabla
SELECT COUNT(*) FROM payment;
SELECT COUNT(*) AS 'Cantidad de filas' FROM payment;
SELECT COUNT(*) AS 'Cantidad de filas' FROM world.country;
-- Cantidad de ventas que tuvo el trabajador 2 y 1
SELECT COUNT(*) AS 'RentasUser1' FROM payment WHERE staff_id=2;
SELECT COUNT(*) AS 'RentasUser2' FROM payment WHERE staff_id=1;

-- Cantidad de clientes distintos
SELECT COUNT(DISTINCT customer_id) FROM payment;

/* 
SUM()
*/
SELECT SUM(amount) AS 'Total de rentas' FROM payment;
SELECT SUM(amount) AS 'Total de rentas' FROM payment WHERE staff_id=2;
SELECT SUM(payment_date) AS 'Total de rentas' FROM payment;
SELECT * FROM payment;

-- ¿Cuál cliente realizó más ventas?
SELECT customer_id, COUNT(*) FROM payment GROUP BY customer_id ORDER BY COUNT(*) DESC;
SELECT customer_id, SUM(amount) FROM payment GROUP BY customer_id ORDER BY SUM(amount) DESC;
-- GROUP BY - Agrupa solo si se usa con SUM, AVG, COUNT, pero omite los valores repetidos
-- ORDER BY - ordena según la columna o función que le indiuemos ASC DESC
SELECT * FROM payment ORDER BY staff_id;
SELECT * FROM payment GROUP BY staff_id;


-- AVG - regla el promedio
SELECT AVG(amount) AS Promedio FROM payment;
SELECT customer_id,AVG(amount) AS Promedio FROM payment GROUP BY customer_id ORDER BY AVG(amount) DESC;
