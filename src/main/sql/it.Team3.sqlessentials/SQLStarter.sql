--creazione ed utilizzo del database
CREATE DATABASE IF NOT EXISTS ProjectTeam3;
USE ProjectTeam3;
GRANT ALL PRIVILEGES ON `ProjectTeam3` . * TO 'developer'@'localhost';
--Creazione user list
CREATE TABLE IF NOT EXISTS user(
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(255) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
--creazione tabella finale
CREATE TABLE IF NOT EXISTS final_result (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    User VARCHAR(255),
    Cpu VARCHAR(255),
    Cpucooler VARCHAR(255),
    Motherboard VARCHAR(255),
    Memory VARCHAR(255),
    Storage VARCHAR(255),
    Gpu VARCHAR(255),
    Casepc VARCHAR(255),
    Power_supply VARCHAR(255),
    FOREIGN KEY (User) REFERENCES user (Username)
);
