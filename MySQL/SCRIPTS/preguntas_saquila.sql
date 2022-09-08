USE sakila;
-- Titulo de las películas con el idioma que tienen
-- No se puede hacer porque falta ver el inner
SELECT title,original_language_id FROM film;
-- Qué actores han trabajado en peliculas francesas son las que tienen en language_id=5
SELECT * FROM film;
SELECT * FROM actor;
SELECT * FROM country;
SELECT * FROM category;
SELECT * FROM payment;
SELECT * FROM rental;
SELECT * FROM film_category;
SELECT * FROM inventory;
SELECT * FROM film_actor;
-- La peli que generó más dinero
-- Cuántas peliculas están hechas en un mismo idioma
SELECT language_id,COUNT(*) AS 'Cantidad de pelis en un idioma' FROM film GROUP BY language_id ORDER BY COUNT(*) DESC;
-- Los actores que hacen películas de una cierta categoríalter
SELECT film_id,actor_id FROM film_actor GROUP BY film_id,actor_id ORDER BY film_id DESC;
-- Total por día
SELECT customer_id, SUM(amount) AS total_dia FROM payment WHERE payment_date BETWEEN '2005-06-15 00:00:00' AND '2005-06-15 23:59:59' GROUP BY customer_id ORDER BY total_dia DESC;

SELECT * FROM film_actor WHERE film_id=3;

-- RESPUESTAS
-- El titulo de las peliculas con el idioma que tienen
SELECT title, name FROM film, language; 


