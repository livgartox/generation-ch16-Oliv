USE generetion070920221;
SELECT Students.*, idtypes.name
FROM Students
INNER JOIN idtypes
ON Students.IdType_id=idtypes.id_idTypes;

SELECT Students.idStudent,Students.name,Students.last_name, idtypes.name, courses_has_students.* 
FROM Students 
INNER JOIN idtypes 
ON Students.IdType_id = idtypes.id_idtypes
INNER JOIN courses_has_students 
ON Students.idStudent = courses_has_students.students_id_student;

SELECT * FROM generetion070920221.courses_has_students;

SELECT courses_has_students.course_code, courses.name,courses_has_students.students_id_student
FROM courses_has_students
INNER JOIN courses
ON courses_has_students.course_code=courses.code;
