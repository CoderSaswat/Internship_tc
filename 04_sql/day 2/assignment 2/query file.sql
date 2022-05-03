create database COMPANY;
use COMPANY;

-- COMPANY table creation
create table EMPLOYEE (
emp_id int,
name varchar(255) NOT NULL,
age int,
degree varchar(255) DEFAULT 'BTech',
phone varchar(20),
PRIMARY KEY (emp_id),
CHECK (age > 18),
UNIQUE (phone)
);
select * from employee;

-- ADDRESS table creation
create table ADDRESS (
address_id int NOT NULL,
emp_id int,
PRIMARY KEY (address_id),
FOREIGN KEY (emp_id) REFERENCES EMPLOYEE(emp_id)
);
select * from ADDRESS;