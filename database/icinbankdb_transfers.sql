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
-- Table structure for table `transfers`
--

DROP TABLE IF EXISTS `transfers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transfers` (
  `id` bigint NOT NULL,
  `amount` bigint DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `receiver_account_no` varchar(255) DEFAULT NULL,
  `receiver_username` varchar(255) DEFAULT NULL,
  `sender_account_no` varchar(255) DEFAULT NULL,
  `sender_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transfers`
--

LOCK TABLES `transfers` WRITE;
/*!40000 ALTER TABLE `transfers` DISABLE KEYS */;
INSERT INTO `transfers` VALUES (62,200,'2021-12-06','15:19:42','113023561087','rahulkumar123@gmail.com','113023561085','amitkumar123@gmail.com'),(65,100,'2021-12-06','15:25:47','113023561086','rahulkumar123@gmail.com','113023561085','amitkumar123@gmail.com'),(68,100,'2021-12-06','15:41:38','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(71,100,'2021-12-06','15:44:16','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(74,100,'2021-12-06','15:46:13','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(77,100,'2021-12-06','15:47:08','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(80,100,'2021-12-06','15:48:36','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(83,100,'2021-12-06','15:49:55','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(86,100,'2021-12-06','15:52:20','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(89,100,'2021-12-06','15:53:45','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(92,100,'2021-12-06','15:59:19','113023561087','rahulkumar123@gmail.com','113127890379','amankumar123@gmail.com'),(95,100,'2021-12-06','16:04:47','113023561087','rahulkumar123@gmail.com','113127890378','amankumar123@gmail.com'),(98,100,'2021-12-06','16:13:57','113023561087','rahulkumar123@gmail.com','113127890379','amankumar123@gmail.com'),(103,200,'2021-12-08','01:50:58','1130235610851259','amitkr123@gmail.com','113023561084','amitkr123@gmail.com');
/*!40000 ALTER TABLE `transfers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-08  9:26:03
