
use registration;

create table register(student_id int(100) primary key not null auto_increment, firstName varchar(255), lastName varchar(255), username varchar(255),
password varchar(255), city varchar(255), mail_id varchar(255) , mobile_Number varchar(255));

select student_id, username, password from register where student_id = 3;

select password from register where username = "Ratna726728" and student_id = 1;


create table answer(student_id int(10) primary key not null auto_increment,  que1 varchar(255),que2 varchar(255),que3 varchar(255),
que4 varchar(255),que5 varchar(255),que6 varchar(255),que7 varchar(255),que8 varchar(255),que9 varchar(255),
que10 varchar(255), result int(255));   

insert into answer(que1, que2, que3, que4, que5, que6, que7, que8, que9, que10) values(1,1,2,3,4,6,7,8,8,9); 

create table questiontable(que_num int(50) primary key not null auto_increment, question varchar(255), option1 varchar(255),
option2 varchar(255), option3 varchar(255), option4 varchar(255), answer varchar(255));

insert into questiontable (question, option1,option2, option3, option4, answer) 
values("Inventor of java programming", "Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Strotrups","2")
,("Which component is used to compile, debug and execute the java programs?","JRE","JIT","JDK","JVM","3")
,("Which one of the following is not a Java feature?","Object-oriented","Use of pointers","Portable"," Dynamic and Extensible","2")
,("Which of these cannot be used for a variable name in Java?","identifier & keyword","identifier","keyword","none of the mentioned","3")
,("What is the extension of java code files?",".js",".txt",".class",".java","4")
,("Which environment variable is used to set the java path?","MAVEN_Path","JavaPATH","JAVA"," JAVA_HOME","4")
,("Which of the following is not an OOPS concept in Java?","Polymorphism","Inheritance","compilation","Encapsulation","3")
,("Which of the following is a type of polymorphism in Java Programming?","Multiple polymorphism","Compile time polymorphism","Multilevel polymorphism","Execution time polymorphism","2")
,("What is the extension of compiled java classes?",".class",".txt",".js",".java","1")
,("Which of these are selection statements in Java?","break","continue","for()","if()","4");


create table studentdetails(student_id int(10) primary key not null auto_increment, score int(10));


create table studentdetails(student_id int(100) primary key not null auto_increment, score int(255));


INSERT INTO studentdetails (mail_id,score)  VALUES (1, 5) ;