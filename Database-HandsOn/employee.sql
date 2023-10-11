
use employee;
create table employee
(emp_id int,
emp_name varchar(100),
job_name varchar(100),
manager_id int,
hire_date varchar(100),
salary int,
commission int, 
dep_id int );
show tables;
INSERT INTO employee (emp_id, emp_name, job_name, manager_id, hire_date, salary, commission, dep_id)
VALUES
    (68319, 'KAYLING', 'PRESIDENT', NULL, '1991-11-18', 6000.00, NULL, 1001),
    (66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00, NULL, 3001),
    (67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, NULL, 1001),
    (65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, NULL, 2001),
    (67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, NULL, 2001),
    (69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, NULL, 2001),
    (63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, NULL, 2001),
    (64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001),
    (65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001),
    (66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001),
    (68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001),
    (68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, NULL, 2001),
    (69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, NULL, 3001),
    (69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, NULL, 1001);
    
/*1.From the following table return complete information about the employees.*/   
select * from employee;

/*2.From the following table, write a SQL query to find the salaries of all employees. Return salary.*/
select emp_name, salary from employee;

/*3.From the following table, write a SQL query to find the unique designations of the employees. Return job name.*/
select distinct job_name from employee;

/*4.From the following table, write a SQL query to list the employees’ name, 
increased their salary by 15%, and expressed as number of Dollars.*/
SELECT emp_name,
       (1.15*salary) AS "Salary"
FROM employee;

/*5.From the following table, write a SQL query to list the employee's name and job name as a format of "Employee & Job".*/
select emp_name,job_name from employee;

/*6.Write a query in SQL to produce the output of employees as follows.
Employee
*/
SELECT concat(emp_name,'(',lower(job_name),')') AS "Employee" 
from employee;
  
/*7.From the following table, write a SQL query to find those employees with hire date in the format like February 22, 1991.
 Return employee ID, employee name, salary, hire date.*/
 select emp_id,
        emp_name,
        salary,
        date_format(hire_date,"%M %d %Y") 
        from employee;

        
  /*8.	From the following table, write a SQL query to count the number of characters except the spaces for each employee name.
  Return employee name length.*/
select length(emp_name)
from employee;

 /*9.From the following table, write a SQL query to find the employee ID, salary, and commission of all the employees.*/
select emp_id, salary,commission
from employee;
 
/*10.From the following table, write a SQL query to find the unique department with jobs. Return department ID, Job name.*/
 select distinct dep_id,job_name
 from employee;

/*11.From the following table, write a SQL query to find those employees who do not belong to the department 2001.
 Return complete information about the employees.*/
 select * 
 from employee where dep_id!=2001;
 
 /*12.From the following table, write a SQL query to find those employees who joined before 1991. 
 Return complete information about the employees.*/
 select * from employee
 where (hire_date<1991);
 
/*13.From the following table, write a SQL query to calculate the average salary of employees who work as analysts.
 Return average salary.*/
 select avg(salary)
 from employee
 where job_name = 'Analyst';

/*14.From the following table, write a SQL query to find the details of the employee ‘BLAZE’.*/
select * from employee
where emp_name = 'BLAZE';

/*15.From the following table, write a SQL query to identify employees whose commissions exceed their salaries.
 Return complete information about the employees.*/
 select * from employee
 where commission>salary;
 
 /*16.	From the following table, write a SQL query to identify those employees whose salaries exceed 3000 after receiving a 25% salary increase.
 Return complete information about the employees.*/
 select * 
 from employee
 where(1.25*salary)>3000;
 
/*17.From the following table, write a SQL query to find the names of the employees whose length is six. Return employee name.*/
select emp_name
from employee where length(emp_name)=6;

/*18.From the following table, write a SQL query to find out which employees joined in the month of January. 
Return complete information about the employees.*/
select * from employee
where date_format(hire_date,'%m') = '01';

/*19.From the following table, write a SQL query to separate the names of employees and their managers by the string 'works for'.*/
select concat(t1.emp_name, ' Works for ',t2.emp_name)
from employee as t1
join employee as t2
on t1.manager_id = t2.emp_id;
/*20.From the following table, write a SQL query to find those employees whose designation is ‘CLERK’. 
Return complete information about the employees.*/   
SELECT * FROM employee
where job_name='CLERK';
