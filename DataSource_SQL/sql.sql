create database sample;

show databases;

use sample;

create table users(
	userid int auto_increment,
    name varchar(25),
    age int,
    phone varchar(25),
    email varchar(50),
    works varchar(100),
    designation varchar(100),
    primary key(userid)
);

insert into users (name, age, phone, email, works, designation) values(
	'Girish', 
	26, 
    '402-973-4086', 
    'gsrinivas@oriental.com', 
    'Oriental Trading Company',
    'Programmer Analyst-Java'
);

select * from users;

insert into users (name, age, phone, email, works, designation) values(
	'Shirish', 
	23, 
    '402-222-2345', 
    'ssrinivas@gmail.com', 
    'IBN Cloud Solutions',
    'Cloud Engineer'
);

insert into users (name, age, phone, email, works, designation) values(
	'Goutham', 
	27, 
    '402-111-1234', 
    'gpchar@gmail.com', 
    'Netapp',
    'Software Developer'
);

insert into users (name, age, phone, email, works, designation) values(
	'Kavya', 
	27, 
    '402-333-3456', 
    'kkrishnappa@gmail.com', 
    'Modies Analytics',
    'Automation Lead'
);

insert into users (name, age, phone, email, works, designation) values(
	'Arjun', 
	26, 
    '402-444-4567', 
    'reddy.arjun.t@gmail.com', 
    'Oriental Trading Company',
    'Programmer Analyst-Java'
);

insert into users (name, age, phone, email, works, designation) values(
	'Roopa', 
	26, 
    '402-555-5678', 
    'rsubramani@gmail.com', 
    'Modies Analytics',
    'Automation Lead'
);

update users
set works = "Crowd Analytics", designation = "Data Scientist"
where userid = 5;