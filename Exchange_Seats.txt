
SELECT CASE
         WHEN id % 2 =1 AND id + 1 <= (SELECT MAX(id) FROM SEAT)
         THEN id+1
         WHEN id%2 = 0 
         THEN id-1
         ELSE id
         END AS id,
         student
    FROM Seat
    ORDER BY id;