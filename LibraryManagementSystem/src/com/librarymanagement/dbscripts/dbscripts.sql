--Creation of Database
create database LibraryManagementSystem;

--Creation of UserCredential Table
create table UserCredential(name varchar(30),password varchar(30),role varchar(30));
insert into UserCredential values('Neha','rose','Student');
insert into UserCredential values('Sikha','lotus','Admin');

--Creation of User Table
create table User(name varchar(20),rollNo varchar(20),mobileNo varchar(20),bloodGroup varchar(5),dob Date,branch varchar(10),session varchar(20),sex varchar(10));
