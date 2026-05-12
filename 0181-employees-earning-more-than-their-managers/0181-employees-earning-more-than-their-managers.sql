# Write your MySQL query statement below
With ManagerSalary As(
    Select e1.name As Employee
    FROM employee e1
    join employee e2
    on e1.managerId =e2.id
    WHERE e1.salary > e2.salary
)
Select * FROM ManagerSalary;
