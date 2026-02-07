CREATE TABLE DEPARTMENT (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(30),
    location VARCHAR(30)
);
INSERT INTO DEPARTMENT VALUES (1, 'Computer Science', 'Botesshor');
INSERT INTO DEPARTMENT VALUES (2, 'EEE', 'Sylhet');
SELECT * FROM DEPARTMENT;
CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    dept_id INT,
    marks INT,
    age INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);
INSERT INTO Student VALUES (01, 'Ahsan', 1, 70, 23);
INSERT INTO Student VALUES (02, 'Mehedi', 1, 80, 22);
INSERT INTO Student VALUES (03, 'Tuhin', 2, 80, 23);
INSERT INTO Student VALUES (04, 'AM Naim', 2, 75, 24);
SELECT * FROM Student;
SELECT MIN(marks)  FROM Student;
SELECT MAX(marks) FROM Student;
SELECT COUNT(*) FROM Student;
SELECT dept_id, COUNT(*)FROM Student GROUP BY dept_id ;
SELECT * FROM Student ORDER BY marks ASC;
SELECT student_name, marks FROM Student ORDER BY marks DESC;
SELECT * FROM Student ORDER BY age ASC;
SELECT * FROM Student WHERE marks = (SELECT MAX(marks) FROM Student);
SELECT * FROM Student WHERE marks > (SELECT AVG(marks) FROM Student);



