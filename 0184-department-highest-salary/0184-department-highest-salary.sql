# Write your MySQL query statement below
Select d.name As Department,
e.name As Employee,
e.salary As Salary 
FROM Employee e 
JOIN Department d
ON e.DepartmentId =d.Id
WHERE (e.DepartmentId , e.salary ) IN (SELECT DepartmentId, max(Salary )FROM Employee Group By DepartmentId);

