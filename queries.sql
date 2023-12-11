--Part 1
CREATE TABLE job (
   id INT,
   name VARCHAR(100),
   location VARCHAR(100),
);
--Part 2
INSERT INTO employer (id, name, location)
VALUES (1, "Wells Fargo", "St. Louis City");

SELECT name
FROM employer
WHERE (location = "St. Louis City");

--Part 3

--Part 4
