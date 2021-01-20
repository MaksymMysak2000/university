INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (1, 'Nick', 'Green', 'ASSISTANT', '2000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (2, 'Ivan', 'Ivanov', 'ASSOCIATE_PROFESSOR', '5000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (3, 'Semen', 'Shpak', 'PROFESSOR', '10000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (4, 'Mykola', 'Tsymbal', 'ASSISTANT', '2000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (5, 'Petro', 'Petrov', 'ASSOCIATE_PROFESSOR', '5000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (6, 'Maksym', 'Mysak', 'PROFESSOR', '10000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (7, 'Oleg', 'Vivtar', 'ASSISTANT', '2000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (8, 'Nazar', 'Bekh', 'ASSOCIATE_PROFESSOR', '5000.0');
INSERT INTO lectors (id, first_name, last_name, degree, salary) VALUES (9, 'Olena', 'Kvitka', 'PROFESSOR', '10000.0');


INSERT INTO departments (id, name, header_id) VALUES (1, 'Computer Science', 3);
INSERT INTO departments (id, name, header_id) VALUES (2, 'Software Development', 6);
INSERT INTO departments (id, name, header_id) VALUES (3, 'System Analysis', 9);



INSERT INTO department_lector (department_id, lector_id) VALUES (1, 4);
INSERT INTO department_lector (department_id, lector_id) VALUES (1, 3);
INSERT INTO department_lector (department_id, lector_id) VALUES (2, 4);
INSERT INTO department_lector (department_id, lector_id) VALUES (2, 8);
INSERT INTO department_lector (department_id, lector_id) VALUES (3, 2);
INSERT INTO department_lector (department_id, lector_id) VALUES (3, 3);
INSERT INTO department_lector (department_id, lector_id) VALUES (3, 5);
INSERT INTO department_lector (department_id, lector_id) VALUES (3, 8);
INSERT INTO department_lector (department_id, lector_id) VALUES (3, 4);