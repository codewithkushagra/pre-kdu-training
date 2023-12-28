CREATE DATABASE employee;

\c employee;

CREATE TABLE department (
    department_id SERIAL PRIMARY KEY,
    department_name VARCHAR(255) NOT NULL
);

CREATE TABLE employee (
    employee_id SERIAL PRIMARY KEY,
    employee_name VARCHAR(255) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    department_id INTEGER REFERENCES department(department_id)
);

INSERT INTO department (department_name) VALUES 
    ('HR'),
    ('IT'),
    ('Finance');

INSERT INTO employee (employee_name, salary, department_id) VALUES
    ('John Doe', 50000.00, 1),
    ('Jane Smith', 60000.00, 2),
    ('Bob Johnson', 75000.00, 1),
    ('Alice Brown', 70000.00, 3);
