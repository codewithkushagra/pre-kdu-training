SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;

SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
LEFT JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;
