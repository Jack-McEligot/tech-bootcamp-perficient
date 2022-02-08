CREATE TABLE Person(pid INT NOT NULL, firstname VARCHAR(255), lastname VARCHAR(255), PRIMARY KEY (pid));
CREATE TABLE IncomeComponents(iid INT NOT NULL, title VARCHAR(255), amount INT, pid INT NOT NULL, FOREIGN KEY (pid) REFERENCES person(pid), PRIMARY KEY (iid));

INSERT INTO person(pid, firstname, lastname) VALUES 
	(1, 'Greg', 'Smith'),
	(2, 'Vanessa', 'Chunley'),
    (3, 'Steven', 'Strange'),
    (4, 'Matt', 'Holmes');
INSERT INTO IncomeComponents(iid, title, amount, pid) VALUES
	(100, 'Rent', -1320, 1),
    (101, 'Salary', 2000, 1),
    (102, 'Food', -150, 1),
    (103, 'gift', 50, 1),
    (104, 'Rent', -950, 2),
    (105, 'Salary', 1566, 2),
    (106, 'Food', -100, 2),
    (107, 'couch', -850, 2),
    (108, 'Rent', -1677, 3),
    (109, 'Food', -178, 3),
    (110, 'Salary', 1100, 3),
    (111, 'Rent', -800, 4),
    (112, 'Salary', 3400, 4),
    (113, 'Food', 500, 4),
    (114, 'Gaming', 1000, 4);
SELECT * FROM person;
SELECT * FROM IncomeComponents;

SELECT lastname, title, amount FROM person p, IncomeComponents ic WHERE p.pid = ic.pid AND LOWER(ic.title) = 'salary'; 

UPDATE person SET firstname = 'Gregory' WHERE pid = 1;

DELETE FROM IncomeComponents WHERE iid = 103;

CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON bootcampbudgettool.* TO 'user'@'localhost';
FLUSH PRIVILEGES;