# Write your MySQL query statement below
-- Write your PostgreSQL query statement below
SELECT * FROM Cinema 
WHERE (id%2) <> 0 AND description <> 'boring' 
ORDER BY rating DESC ; 