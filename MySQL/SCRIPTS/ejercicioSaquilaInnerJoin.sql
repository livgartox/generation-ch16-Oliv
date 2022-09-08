-- ejercicio
-- actores que hacen peliculas de cierta categoría
/*Se va a unir el nombre del actor con su la pelicula que hizo 
Se va a unir la pelicula con la categoría
Se va a unir el id categoria con la categoria
*/
SELECT 
actor.first_name,
actor.last_name,
category.name
FROM actor
INNER JOIN film_actor
ON actor.actor_id=film_actor.actor_id
INNER JOIN film_category
ON film_actor.film_id=film_category.film_id
INNER JOIN category
ON category.category_id=film_category.category_id;