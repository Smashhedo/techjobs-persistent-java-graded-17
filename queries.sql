--Part 1

/*
id int
name varchar
*/

--Part 2

SELECT name
FROM employer
WHERE location IN ('St. Louis City');

--Part 3

DELETE FROM job;

--Part 4

SELECT COUNT (employerId), name
FROM skills
WHERE EXISTS skills
ORDER BY VARCHAR name;