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
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `id` bigint NOT NULL,
  `amount` bigint DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `account_no` varchar(255) DEFAULT NULL,
  `transaction_type` varchar(255) DEFAULT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqwv7rmvc8va8rep7piikrojds` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES (39,500,'2021-11-27','19:42:12','113023561084','deposit',6),(40,200,'2021-11-27','19:53:28','113023561084','withdrawal',6),(41,300,'2021-11-29','17:17:16','113023561085','deposit',6),(42,300,'2021-11-29','17:17:34','113127890378','deposit',31),(43,100,'2021-11-29','17:21:11','113127890378','withdrawal',31),(60,200,'2021-12-06','15:19:42','113023561085','withdrawal',6),(61,200,'2021-12-06','15:19:42','113023561086','deposit',5),(63,100,'2021-12-06','15:25:47','113023561085','withdrawal',6),(64,100,'2021-12-06','15:25:47','113023561086','deposit',5),(66,100,'2021-12-06','15:41:37','113127890378','withdrawal',31),(67,100,'2021-12-06','15:41:38','113023561086','deposit',5),(69,100,'2021-12-06','15:44:16','113127890378','withdrawal',31),(70,100,'2021-12-06','15:44:16','113023561086','deposit',5),(72,100,'2021-12-06','15:46:13','113127890378','withdrawal',31),(73,100,'2021-12-06','15:46:13','113023561086','deposit',5),(75,100,'2021-12-06','15:47:08','113127890378','withdrawal',31),(76,100,'2021-12-06','15:47:08','113023561086','deposit',5),(78,100,'2021-12-06','15:48:36','113127890378','withdrawal',31),(79,100,'2021-12-06','15:48:36','113023561086','deposit',5),(81,100,'2021-12-06','15:49:55','113127890378','withdrawal',31),(82,100,'2021-12-06','15:49:55','113023561086','deposit',5),(84,100,'2021-12-06','15:52:20','113127890378','withdrawal',31),(85,100,'2021-12-06','15:52:20','113023561086','deposit',5),(87,100,'2021-12-06','15:53:45','113127890378','withdrawal',31),(88,100,'2021-12-06','15:53:45','113023561086','deposit',5),(90,100,'2021-12-06','15:59:19','113127890379','withdrawal',31),(91,100,'2021-12-06','15:59:19','113023561086','deposit',5),(93,100,'2021-12-06','16:04:47','113127890378','withdrawal',31),(94,100,'2021-12-06','16:04:47','113023561087','deposit',5),(96,100,'2021-12-06','16:13:57','113127890379','withdrawal',31),(97,100,'2021-12-06','16:13:57','113023561087','deposit',5),(99,400,'2021-12-08','01:46:44','113023561084','deposit',6),(100,300,'2021-12-08','01:47:13','113023561085','deposit',6),(101,200,'2021-12-08','01:50:58','1130235610851259','deposit',6),(102,200,'2021-12-08','01:50:58','113023561084','withdrawal',6),(104,300,'2021-12-08','01:51:24','113023561084','withdrawal',6);
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
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
