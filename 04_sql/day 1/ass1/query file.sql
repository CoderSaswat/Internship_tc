create database COMPANY;
use COMPANY;

create table DEVELOPER (
developer_id int NOT NULL,
name varchar(255),
designation varchar(255),
email varchar(255),
phone varchar(20),
PRIMARY KEY (developer_id),
UNIQUE (email),
UNIQUE (phone)
);

create table TESTER (
tester_id int NOT NULL,
name varchar(255),
designation varchar(255),
email varchar(255),
phone varchar(20),
PRIMARY KEY (tester_id),
UNIQUE (email),
UNIQUE (phone)
);

create table MANAGER (
manager_id int NOT NULL,
name varchar(255),
designation varchar(255),
email varchar(255),
phone varchar(20),
PRIMARY KEY (manager_id),
UNIQUE (email),
UNIQUE (phone)
);

show tables;

insert into DEVELOPER (developer_id,name,designation,email,phone)
values(1,'saswat','java developer','saswat@gmail.com','9636028747');
insert into DEVELOPER (developer_id,name,designation,email,phone)
values(2,'kanha','python developer','kanha@gmail.com','5863883586');
insert into DEVELOPER (developer_id,name,designation,email,phone)
values(3,'babu','react developer','babu@gmail.com','6785868483');
insert into DEVELOPER (developer_id,name,designation,email,phone)
values(4,'lubun','spring developer','lubun@gmail.com','5637884285');
insert into DEVELOPER (developer_id,name,designation,email,phone)
values(5,'muna','nodejs developer','muna@gmail.com','4707373895');

select * from DEVELOPER;

insert into TESTER (tester_id,name,designation,email,phone)
values(1,'soumya','mannual tester','soumya@gmail.com','6427963795');
insert into TESTER (tester_id,name,designation,email,phone)
values(2,'rajesh','automation tester','rajesh@gmail.com','6438786478');
insert into TESTER (tester_id,name,designation,email,phone)
values(3,'subransu','QA analyst','subransu@gmail.com','7867567858');
insert into TESTER (tester_id,name,designation,email,phone)
values(4,'bimal','mannual tester','bimalgmail.com','6586746756');
insert into TESTER (tester_id,name,designation,email,phone)
values(5,'bubuna','automation tester','bubuna@gmail.com','5364576474');

select * from TESTER;

insert into MANAGER (manager_id,name,designation,email,phone)
values(1,'malaya','project manager','malaya@gmail.com','5657795687');
insert into MANAGER (manager_id,name,designation,email,phone)
values(2,'guru','financial manager','guru@gmail.com','365356344');
insert into MANAGER (manager_id,name,designation,email,phone)
values(3,'aditya','hr manager','adityau@gmail.com','3645356773');
insert into MANAGER (manager_id,name,designation,email,phone)
values(4,'sunil','project manager','sunil@gmail.com','356363137');
insert into MANAGER (manager_id,name,designation,email,phone)
values(5,'batu','financial manager','batu@gmail.com','4523656456');

select * from MANAGER;

UPDATE DEVELOPER
SET EMAIL = 'saswatkumarpanda999@gmail.com'
WHERE developer_id = 1;
select * from DEVELOPER;

UPDATE TESTER
SET phone = '9999999999'
WHERE tester_id = 2;
select * from TESTER;

UPDATE MANAGER
SET designation = 'financial manager'
WHERE manager_id = 3;
select * from MANAGER;


select * from DEVELOPER;
select * from TESTER;
select * from MANAGER;

DELETE FROM DEVELOPER WHERE developer_id > 3;
select * from DEVELOPER;

DELETE FROM TESTER WHERE phone IN ('7867567858','5364576474');
select * from TESTER;

DELETE FROM MANAGER WHERE email IN ('malaya@gmail.com','batu@gmail.com');
select * from MANAGER;




