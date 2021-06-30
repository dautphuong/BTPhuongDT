create database Final_Test;
use Final_Test;
drop database Final_Test
create table Student(
	id int identity(1,1) primary key ,
	fullName nvarchar(100),
	doB date,
	sex nvarchar(15),
	phoneNumber nvarchar(15),
	universityName nvarchar(100),
	gradeLevel nvarchar(10),
	gpa float,
	bestRewardName nvarchar(100),
	englishScore float,
	entryTestScore float
);

insert into Student(fullname,sex,phoneNumber,universityName,gradeLevel,englishScore,entryTestScore)values('a','nam','0123','abac','abc',3.0,3.0)

