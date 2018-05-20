/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  sam
 * Created: May 18, 2018
 */

Create Table book (
id INTEGER NOT NULL PRIMARY KEY GENERATED always 
    AS IDENTITY (START WITH 1, INCREMENT BY 1),
title varchar(255),
author varchar(255),
price real,
pubyear integer
);

insert into book (title, author, price, pubyear) values (
'Intro to Java 1', 'Matt', 19.95, 1871);
insert into book (title, author, price, pubyear) values (
'Intro to Java 2', 'Mark', 20.95, 1872);
insert into book (title, author, price, pubyear) values (
'Intro to Java 3', 'John', 21.95, 1873);
insert into book (title, author, price, pubyear) values (
'Intro to Java 4', 'Luke', 22.95, 1874);
insert into book (title, author, price, pubyear) values (
'Intro to Java 5', 'Paul', 23.95, 1875);

