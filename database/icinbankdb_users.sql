-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: icinbankdb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (7,'piyushpranjal27@gmail.com','Piyush','Pranjal','$2a$10$26R9p6kogO.IN.oC//fkquOWXB0DEKkhJcA.fS9MQ14oU6CZaA./2','8240960660','ADMIN',_binary ''),(6,'amitkr123@gmail.com','Amit','Kumar','$2a$10$yYhCw9escyuPrNNsxf7LQe/57b1xprCZZaobGtDXu6zsM2U.UkaHS','8704758596','USER',_binary ''),(5,'rahulkumar123@gmail.com','Rahul','Kumar','$2a$10$nhR7TUz9EL8Ku/ksERyH2OLxZ5JOUm8rqHDCBV94Upn6bO/QirL3K','9823048588','USER',_binary ''),(31,'amankumar123@gmail.com','Aman','Kumar','$2a$10$liL8Dqjt7u18awv1lH0pH./Nt99DHHNc83c.qACLkn82/f8aM22Pe','7765903892','USER',_binary ''),(32,'mohitpandit123@gmail.com','Mohit','Pandit','$2a$10$Qu4Pz8jtqpHCV8IWgGynIe.dF0Nkf6g4kh9tJnd2Aaf/L1eiQLgIa','7768903491','USER',_binary '\0'),(33,'dollykumari123@gmail.com','Dolly','Kumari','$2a$10$wT5N7pGlsI39JF9viI8KsuvvrjyR/EVf619HUuhj03S95pFLJFj.y','8765142390','USER',_binary '\0'),(48,'sonukumar123@gmail.com','Sonu','Kumar','$2a$10$qhvZWGGqAd/iin8RYe32tez3oOifQFj.THqaoMYHKoupYLNwgKwrC','8790612344','USER',_binary ''),(55,'rocky123@gmail.com','Rocky','Balboa','$2a$10$KPm1Aqyqru3.j.FgcwLfteJvpCFCPZ4qOzUJmDEUJWLvYpX2nCyYK','8638291990','USER',_binary ''),(105,'amankr123@gmail.com','Aman','Mohit','$2a$10$cVuD/tiiQCH94w1F0Y3z6O632srdhWV9dc1OiE/qV7jmvXEf/Cn0u','8974775858','USER',_binary '');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-08  9:26:02
