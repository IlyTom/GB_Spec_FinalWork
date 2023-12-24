-- MySQL dump 10.13  Distrib 8.0.35, for Linux (x86_64)
--
-- Host: localhost    Database: human_friends
-- ------------------------------------------------------
-- Server version	8.0.35-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Camels`
--

DROP TABLE IF EXISTS `Camels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Camels` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pack_animals_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pack_animals_ID` (`Pack_animals_ID`),
  CONSTRAINT `Camels_ibfk_1` FOREIGN KEY (`Pack_animals_ID`) REFERENCES `Pack_animals` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Camels`
--

LOCK TABLES `Camels` WRITE;
/*!40000 ALTER TABLE `Camels` DISABLE KEYS */;
/*!40000 ALTER TABLE `Camels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cats`
--

DROP TABLE IF EXISTS `Cats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cats` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pets_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pets_ID` (`Pets_ID`),
  CONSTRAINT `Cats_ibfk_1` FOREIGN KEY (`Pets_ID`) REFERENCES `Pets` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cats`
--

LOCK TABLES `Cats` WRITE;
/*!40000 ALTER TABLE `Cats` DISABLE KEYS */;
INSERT INTO `Cats` VALUES (1,'Мурзик',NULL,'Лежать','2019-05-05','Cat'),(2,'Molly',NULL,'Purr','2022-02-02','Cat'),(3,'Leo',NULL,'Scratch','2023-04-16','Cat'),(4,'Simba',NULL,'Jump','2023-06-11','Cat'),(5,'Lily',NULL,'Sleep','2021-07-21','Cat'),(6,'Oliver',NULL,'Hiss','2022-10-31','Cat');
/*!40000 ALTER TABLE `Cats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Dogs`
--

DROP TABLE IF EXISTS `Dogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Dogs` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pets_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pets_ID` (`Pets_ID`),
  CONSTRAINT `Dogs_ibfk_1` FOREIGN KEY (`Pets_ID`) REFERENCES `Pets` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Dogs`
--

LOCK TABLES `Dogs` WRITE;
/*!40000 ALTER TABLE `Dogs` DISABLE KEYS */;
INSERT INTO `Dogs` VALUES (1,'Бобик',NULL,'Сидеть','2020-01-01','Dog'),(2,'Rex',NULL,'Sit','2022-01-01','Dog'),(3,'Bella',NULL,'Meow','2023-03-15','Dog'),(4,'Max',NULL,'Run','2023-05-10','Dog'),(5,'Luna',NULL,'Gallop','2021-06-20','Dog'),(6,'Charlie',NULL,'Bray','2022-09-30','Dog');
/*!40000 ALTER TABLE `Dogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Donkeys`
--

DROP TABLE IF EXISTS `Donkeys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Donkeys` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pack_animals_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pack_animals_ID` (`Pack_animals_ID`),
  CONSTRAINT `Donkeys_ibfk_1` FOREIGN KEY (`Pack_animals_ID`) REFERENCES `Pack_animals` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Donkeys`
--

LOCK TABLES `Donkeys` WRITE;
/*!40000 ALTER TABLE `Donkeys` DISABLE KEYS */;
INSERT INTO `Donkeys` VALUES (1,'Иа',NULL,'Ходить','2016-06-06','Donkey'),(2,'Eeyore',NULL,'Bray','2022-05-05','Donkey'),(3,'Jack',NULL,'Carry','2023-07-19','Donkey'),(4,'Jenny',NULL,'Pull','2023-09-14','Donkey'),(5,'Donkey',NULL,'Shrek','2021-10-24','Donkey'),(6,'Burro',NULL,'Roam','2022-01-01','Donkey');
/*!40000 ALTER TABLE `Donkeys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hamsters`
--

DROP TABLE IF EXISTS `Hamsters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Hamsters` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pets_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pets_ID` (`Pets_ID`),
  CONSTRAINT `Hamsters_ibfk_1` FOREIGN KEY (`Pets_ID`) REFERENCES `Pets` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hamsters`
--

LOCK TABLES `Hamsters` WRITE;
/*!40000 ALTER TABLE `Hamsters` DISABLE KEYS */;
INSERT INTO `Hamsters` VALUES (1,'Чип',NULL,'Бегать','2021-03-03','Hamster'),(2,'Fuzz',NULL,'Nibble','2022-03-03','Hamster'),(3,'Coco',NULL,'Squeak','2023-05-17','Hamster'),(4,'Ginger',NULL,'Spin','2023-07-12','Hamster'),(5,'Snowy',NULL,'Hide','2021-08-22','Hamster'),(6,'Oreo',NULL,'Dig','2022-11-30','Hamster');
/*!40000 ALTER TABLE `Hamsters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Horses`
--

DROP TABLE IF EXISTS `Horses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Horses` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Pack_animals_ID` int DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Pack_animals_ID` (`Pack_animals_ID`),
  CONSTRAINT `Horses_ibfk_1` FOREIGN KEY (`Pack_animals_ID`) REFERENCES `Pack_animals` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Horses`
--

LOCK TABLES `Horses` WRITE;
/*!40000 ALTER TABLE `Horses` DISABLE KEYS */;
INSERT INTO `Horses` VALUES (1,'Буцефал',NULL,'Бегать','2018-04-04','Horse'),(2,'Star',NULL,'Neigh','2022-04-04','Horse'),(3,'Spirit',NULL,'Kick','2023-06-18','Horse'),(4,'Shadow',NULL,'Trot','2023-08-13','Horse'),(5,'Ruby',NULL,'Graze','2021-09-23','Horse'),(6,'Daisy',NULL,'Nuzzle','2022-12-31','Horse');
/*!40000 ALTER TABLE `Horses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pack_animals`
--

DROP TABLE IF EXISTS `Pack_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pack_animals` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pack_animals`
--

LOCK TABLES `Pack_animals` WRITE;
/*!40000 ALTER TABLE `Pack_animals` DISABLE KEYS */;
INSERT INTO `Pack_animals` VALUES (4,'Буцефал','Бегать','2018-04-04','Horse'),(5,'Star','Neigh','2022-04-04','Horse'),(6,'Spirit','Kick','2023-06-18','Horse'),(7,'Shadow','Trot','2023-08-13','Horse'),(8,'Ruby','Graze','2021-09-23','Horse'),(9,'Daisy','Nuzzle','2022-12-31','Horse'),(10,'Иа','Ходить','2016-06-06','Donkey'),(11,'Eeyore','Bray','2022-05-05','Donkey'),(12,'Jack','Carry','2023-07-19','Donkey'),(13,'Jenny','Pull','2023-09-14','Donkey'),(14,'Donkey','Shrek','2021-10-24','Donkey'),(15,'Burro','Roam','2022-01-01','Donkey');
/*!40000 ALTER TABLE `Pack_animals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pets`
--

DROP TABLE IF EXISTS `Pets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pets` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Command` varchar(255) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pets`
--

LOCK TABLES `Pets` WRITE;
/*!40000 ALTER TABLE `Pets` DISABLE KEYS */;
/*!40000 ALTER TABLE `Pets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Young_animals`
--

DROP TABLE IF EXISTS `Young_animals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Young_animals` (
  `Name` varchar(255) NOT NULL,
  `Type` varchar(255) NOT NULL,
  `Birthday` date NOT NULL,
  `Command` varchar(255) NOT NULL,
  `Age_in_months` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Young_animals`
--

LOCK TABLES `Young_animals` WRITE;
/*!40000 ALTER TABLE `Young_animals` DISABLE KEYS */;
INSERT INTO `Young_animals` VALUES ('Rex','Dog','2022-01-01','Sit',23),('Luna','Dog','2021-06-20','Gallop',30),('Charlie','Dog','2022-09-30','Bray',14),('Molly','Cat','2022-02-02','Purr',22),('Lily','Cat','2021-07-21','Sleep',29),('Oliver','Cat','2022-10-31','Hiss',13),('Чип','Hamster','2021-03-03','Бегать',33),('Fuzz','Hamster','2022-03-03','Nibble',21),('Snowy','Hamster','2021-08-22','Hide',28),('Oreo','Hamster','2022-11-30','Dig',12),('Star','Horse','2022-04-04','Neigh',20),('Ruby','Horse','2021-09-23','Graze',27),('Eeyore','Donkey','2022-05-05','Bray',19),('Donkey','Donkey','2021-10-24','Shrek',26),('Burro','Donkey','2022-01-01','Roam',23);
/*!40000 ALTER TABLE `Young_animals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-24 21:38:40
