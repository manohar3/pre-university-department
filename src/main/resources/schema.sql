DROP TABLE IF EXISTS APPLICATIONS;  
DROP TABLE IF EXISTS USERS;  

CREATE TABLE USERS(
ID INT AUTO_INCREMENT  PRIMARY KEY,  
username varchar not null,
password varchar not null,
emaild varchar not null,
mobilenumber varchar not null
);

CREATE TABLE APPLICATIONS (  
ID INT AUTO_INCREMENT  PRIMARY KEY,  
admissionNumber VARCHAR(50) NOT NULL,  
satsNumber VARCHAR(50) NOT NULL,  
languages VARCHAR(50) NOT NULL,  
medium VARCHAR(50) NOT NULL,  
section VARCHAR(50) NOT NULL,  
category VARCHAR(50) NOT NULL,
applicantName VARCHAR(50) NOT NULL,
dobDay VARCHAR(50) NOT NULL,
dobMonth VARCHAR(50) NOT NULL,
dobYear VARCHAR(50) NOT NULL,
gender VARCHAR(50) NOT NULL,
placeofBirth VARCHAR(50) NOT NULL,
stateofBirth VARCHAR(50) NOT NULL,
districtofBirth VARCHAR(50) NOT NULL,
talukofBirth VARCHAR(50) NOT NULL,
nationality VARCHAR(50) NOT NULL,
religion VARCHAR(50) NOT NULL,
caste VARCHAR(50) NOT NULL,
subCaste VARCHAR(50) NOT NULL,
permanentddress VARCHAR NOT NULL,
localAddress VARCHAR NOT NULL,
mobileno VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
nameoffather VARCHAR(50) NOT NULL,
nameofmother VARCHAR(50) NOT NULL,
addressofguardian VARCHAR NOT NULL,
annualIncome VARCHAR(50) NOT NULL,
isIncomeCertificateEnclosed VARCHAR(50) NOT NULL,
nameofschoolstudied VARCHAR(50) NOT NULL,
regNumber VARCHAR(50) NOT NULL,
monthofExamPassed VARCHAR(50) NOT NULL,
yearofExamPassed VARCHAR(50) NOT NULL,
lanugage1st VARCHAR(50) NOT NULL,
lanugage2nd VARCHAR(50) NOT NULL,
lanugage3rd VARCHAR(50) NOT NULL,
science VARCHAR(50) NOT NULL,
maths VARCHAR(50) NOT NULL,
social VARCHAR(50) NOT NULL,
marksLanugage1st VARCHAR(50) NOT NULL,
marksLanugage2nd VARCHAR(50) NOT NULL,
marksLanugage3rd VARCHAR(50) NOT NULL,
marksScience VARCHAR(50) NOT NULL,
marksMaths VARCHAR(50) NOT NULL,
marksSocial VARCHAR(50) NOT NULL,
result VARCHAR(50) NOT NULL,
percentage VARCHAR(50) NOT NULL,
extracurricular VARCHAR(50) NOT NULL,
expectedpulanguage1 VARCHAR(50) NOT NULL,
expectedpulanguage2 VARCHAR(50) NOT NULL,
expectedpusubject1 VARCHAR(50) NOT NULL,
expectedpusubject2 VARCHAR(50) NOT NULL,
expectedpusubject3 VARCHAR(50) NOT NULL,
expectedpusubject4 VARCHAR(50) NOT NULL,
expectedmedium VARCHAR(50) NOT NULL
);