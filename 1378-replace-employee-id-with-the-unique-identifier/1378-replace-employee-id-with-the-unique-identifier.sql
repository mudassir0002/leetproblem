# Write your MySQL query statement below
select E.unique_id as unique_id,  EP.name as name
from Employees EP left join EmployeeUNI E on E.id = EP.id;