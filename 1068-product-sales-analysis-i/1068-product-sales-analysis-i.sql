# Write your MySQL query statement bel
select p.product_name , s.year , s.price
from Product p 
join Sales s on p.product_id = s.product_id;