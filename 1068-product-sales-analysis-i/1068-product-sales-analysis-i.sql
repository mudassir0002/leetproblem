# Write your MySQL query statement bel
select p.product_name as product_name , s.year as year , s.price as price
from Sales s join Product p on  s.product_id = p.product_id;