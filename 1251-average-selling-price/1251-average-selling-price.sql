# Write your MySQL query statement below
select p.product_id , IFNULL(ROUND(SUM(units*price)/SUM(units),2),0) as average_price 
from Prices p LEFT JOIN UnitsSold u 
ON p.product_id = u.product_id AND 
u.purchase_date BETWEEN start_date AND end_date
group by product_id

