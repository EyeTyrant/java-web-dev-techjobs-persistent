## Part 1: Test it with SQL
EXPLAIN techjobs.job

## Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "Saint Louis";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT DISTINCT skill.name, skill.description
FROM skill
JOIN job_skills ON skill.id = skill.id
WHERE jobs_id IS NOT NULL;