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

DROP TABLE job;

--Part 4

SELECT FROM skill
INNER JOIN job_skills ON (job_skills.skills_id = skill.id)
WHERE job_skills.jobs_id IS NOT NULL?
ORDER BY name ASC;