# Write your MySQL query statement below
select 
person.firstName,
person.lastName,
address.state,
address.city
from Person
left join Address
on person.personid=Address.personid;