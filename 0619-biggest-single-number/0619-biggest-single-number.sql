# Write your MySQL query statement below
select max(num) as num from (select num from MyNumbers group by num having COUNT(num)=1) NEW;
