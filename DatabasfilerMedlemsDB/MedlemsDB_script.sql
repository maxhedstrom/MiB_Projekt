/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
--  Create database
--
DROP DATABASE IF EXISTS MedlemsDBMySQL;
CREATE DATABASE MedlemsDBMySQL CHARACTER SET utf8mb4 COLLATE utf8mb4_sv_0900_ai_ci;
USE MedlemsDBMySQL;
/*This code is to create the database to enable the creation of a user for connecting to the database and the creation of the tables and example data*/
--
-- Create user for connecting to the database
--
DROP USER IF EXISTS 'MedlemsDBMySQL'@'localhost';
CREATE USER MedlemsDBMySQL@localhost IDENTIFIED BY 'medlemskey';
GRANT ALL PRIVILEGES ON MedlemsDBMySQL.* TO MedlemsDBMySQL@localhost;


--
-- Table structure for table `Medlem`
--
DROP TABLE IF EXISTS `Medlem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Medlem` (
  `Medlemsnummer` INT(10) NOT NULL,
  `Namn` varchar(6) ,
  `Telefon` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Medlemsnummer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Medlem`
--
INSERT INTO `Medlem` VALUES (2, 'Bo', '282677');
INSERT INTO `Medlem` VALUES (3, 'My', '260088');
INSERT INTO `Medlem` VALUES (4, 'Jian', '174590');
INSERT INTO `Medlem` VALUES (1, 'Lee', '260088');



--
-- Table structure for table `Sektion`
--
DROP TABLE IF EXISTS `Sektion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Sektion` (
  `Sektionskod` char(1) NOT NULL,
  `Namn` Varchar(10),
  `Ledare` INT(10),
  PRIMARY KEY (`Sektionskod`),
  KEY `Ledare` (Ledare),
  CONSTRAINT `Sektion_Ledare_Medlemnummer_FK` FOREIGN KEY (`Ledare`) REFERENCES `Medlem` (`Medlemsnummer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sektion`
--
INSERT INTO `Sektion` VALUES ('C','Simning',2);
INSERT INTO `Sektion` VALUES ('B','Kickboxning',4);
INSERT INTO `Sektion` VALUES ('A','Bowling',4);

--
-- Table structure for table `Deltar`
--
DROP TABLE IF EXISTS `Deltar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Deltar` (
  `Medlem` int(10) NOT NULL,
  `Sektion` Char(1) NOT NULL,
  KEY `Medlem` (`Medlem`),
  KEY `Sektion` (`Sektion`),
  CONSTRAINT `Deltar_Medlem_FK` FOREIGN KEY (`Medlem`) REFERENCES `Medlem` (`Medlemsnummer`),
  CONSTRAINT `Deltar_Sektion_FK` FOREIGN KEY (`Sektion`) REFERENCES `Sektion` (`Sektionskod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_sv_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `Faltagent`
--
INSERT INTO `Deltar` VALUES ('1','A');
INSERT INTO `Deltar` VALUES ('1','B');
INSERT INTO `Deltar` VALUES ('1','C');
INSERT INTO `Deltar` VALUES ('3','A');