USE escuela;
SHOW tables;
SELECT * FROM alumno;
SELECT * FROM alumno_has_materia;
SELECT alumno.idAlumno,alumno.nombre,alumno.apellido,materia.idMateria,materia.nombre
FROM alumno
INNER JOIN alumno_has_materia
ON alumno.idAlumno=alumno_has_materia.Alumno_idAlumno
INNER JOIN materia
ON materia.idMateria=alumno_has_materia.Materia_idMateria
;
SELECT * FROM materia;
SELECT * FROM alumno_has_materia;
SELECT * FROM profe_has_materia;
SELECT *FROM profe;