CREATE TABLE if NOT EXISTS USER (

    id long NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userName varchar(20),
    email varchar(50),
    jobTitle varchar(50),
    address varchar(50)
    )