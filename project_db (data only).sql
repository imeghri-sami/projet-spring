-- MySQL dump 10.13  Distrib 5.7.37, for Linux (x86_64)
--
-- Host: localhost    Database: project_db
-- ------------------------------------------------------
-- Server version       5.7.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES
(1, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Breakfast.jpg?itok=GhPPX4I1', 'Breakfast'),
(2, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/HoneySoyChickenSaladBowl.jpg?itok=AFw8Tc-l', 'Lunch'),
(3, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Dinner_Recipes.jpg?itok=wusUnlBV', 'Dinner'),
(4, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/chewy-oat-slice_0210.jpg?itok=CmSI_w2E', 'Snacks'),
(5, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Salad.jpg?itok=eYEfiPvk', 'Salads'),
(6, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Soups.jpg?itok=1pT8EsMZ', 'Soups'),
(7, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/IMD%20noodle%20stirfry1.jpg?itok=P7pCCd1m', 'Noodles'),
(8, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Whisk_PI_Cheesy-Herb-Garlic-Pizza_2703196907.jpg?itok=ICr03dnW', 'Pizza'),
(9, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Burgers.jpg?itok=dP19seZa', 'Burgers'),
(10, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Best%20ever%20mushroom%20sauce%202617.jpg?itok=ZYN889B_', 'Sauces'),
(11, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Devo20169685_0.jpg?itok=uAe27sQx', 'Desserts'),
(12, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Vsoy20155870_0.jpg?itok=BUFXEbgm', 'Drinks'),
(13, 'https://myfoodbook.com.au/sites/default/files/styles/category_collection_landing/public/category_image/Schw20158549_0.jpg?itok=7esE-sGB', 'Meat');

/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
INSERT INTO `content` VALUES
(1, 0.6, 2, 1),
(2, 0.1, 1, 1),
(3, 0.7, 11, 2),
(4, 0.4, 3, 2),
(5, 1.1, 5, 3),
(10, 0.9, 9, 3),
(6, 0.2, 6, 3),
(7, 1.0, 4, 4),
(8, 0.7, 8, 4),
(9, 1.3, 10, 4),
(11, 1.2, 7, 5),
(12, 1.0, 9, 5),
(13, 0.8, 12, 6),
(14, 0.5, 1, 7),
(15, 0.8, 5, 7),
(16, 1, 6, 8),
(17, 1.5, 2, 8),
(18, 1.2, 6, 8),
(19, 1.2, 10, 9),
(20, 1.3, 5, 10),
(21, 0.7, 9, 10),
(22, 1.4, 1, 11),
(23, 0.8, 8, 12),
(24, 0.5, 2, 12),
(25, 0.6, 12, 12),
(26, 0.4, 3, 12),
(27, 1.2, 5, 13);
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `favorite`
--


LOCK TABLES `favorite` WRITE;
/*!40000 ALTER TABLE `favorite` DISABLE KEYS */;
INSERT INTO `favorite` VALUES
(1, '2022-02-10 17:06:26', 1, 1),
(2, '2022-02-10 17:06:26', 5, 1),
(3, '2022-02-10 17:06:26', 6, 1),
(4, '2022-02-10 17:06:26', 2, 2),
(5, '2022-02-10 17:06:26', 8, 3);
/*!40000 ALTER TABLE `favorite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ingredient`
--

LOCK TABLES `ingredient` WRITE;
/*!40000 ALTER TABLE `ingredient` DISABLE KEYS */;

INSERT INTO `ingredient` VALUES
(1, 'https://i.ndtvimg.com/i/2014-11/snake-beans_625x300_71416569505.jpg', 'Snake Beans', 8, 'kg'),
(2, 'https://i.ndtvimg.com/mt/cooks/2014-11/peas-matar.jpg', 'Green Peas', 8, 'kg'),
(3, 'https://i.ndtvimg.com/mt/cooks/2014-11/leek.jpg', 'Leek', 9, 'kh'),
(4, 'https://i.ndtvimg.com/mt/cooks/2014-11/mushrooms.jpg', 'Mushroom', 60, 'kg'),
(5, 'https://i.ndtvimg.com/mt/cooks/2014-11/1378802129_onions_med.jpg', 'Onion', 4, 'kg'),
(6, 'https://i.ndtvimg.com/mt/cooks/2014-11/turnip-shalgam.jpg', 'Turnip', 5, 'kg'),
(7, 'https://i.ndtvimg.com/i/2014-11/cherry-tomatoes_625x300_61416570122.jpg', 'Tomato', 6, 'kg'),
(8, 'https://i.ndtvimg.com/i/2014-11/snake-beans_625x300_71416569505.jpg', 'Snake Beans', 8, 'kg'),
(9, 'https://i.ndtvimg.com/mt/cooks/2014-11/gherkins.jpg', 'Gherkins', 10, 'kg'),
(10, 'https://i.ndtvimg.com/mt/cooks/2014-11/garlic.jpg', 'Garlic', 2, 'unit'),
(11, 'https://i.ndtvimg.com/mt/cooks/2014-11/cucumber.jpg', 'Cucumber', 8, 'kg'),
(12, 'https://i.ndtvimg.com/mt/cooks/2014-11/carrots.jpg', 'Carrot', 4, 'kg');
/*!40000 ALTER TABLE `ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `reaction`
--

LOCK TABLES `reaction` WRITE;
/*!40000 ALTER TABLE `reaction` DISABLE KEYS */;
INSERT INTO `reaction` VALUES
(1, 2, 1, 1),
(2, 2, 3, 2),
(3, 2, 2, 3),
(4, 4, 4, 2),
(5, 5, 3, 2);
/*!40000 ALTER TABLE `reaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `recipe`
--
--(1,'2022-02-03 14:38:25','An ','Recipe 1',60,NULL,1,1,NULL)
LOCK TABLES `recipe` WRITE;
/*!40000 ALTER TABLE `recipe` DISABLE KEYS */;
INSERT INTO `recipe` (`ref`,`last_modified_at`,`description`,`name`,`time`,`video`,`category_ref`,`user_ref`,`image`) VALUES
(1, '2022-02-03 14:38:25', 'An country demesne message it. Bachelor domestic extended doubtful as concerns at. Morning prudent removal an letters by. On could my in order never it. Or excited certain sixteen it to parties colonel. Depending conveying direction has led immediate.', 'Recipe 1', 60, NULL, 1, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Turkey-Chili_EXPS_SCBZ18_17507_C07_27_4b-1.jpg?resize=700,700'),
(2, '2022-02-03 14:42:31', 'Uneasy barton seeing remark happen his has. Am possible offering at contempt mr distance stronger an. Attachment excellence announcing or reasonable am on if indulgence', 'Cinnamon Baked French Toast', 60, NULL, 1, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Spaghetti-Chicken-Parmesan_EXPS_FT21_12947_F_0708_1-5.jpg?resize=700,700'),
(3, '2022-02-03 14:42:31', 'Suppose end get boy warrant general natural. Delightful met sufficient projection ask. Decisively everything principles if preference do impression of.', 'Brown Sugar Oatmeal Cookies', 40, NULL, 1, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/exps32301_UH153291C04_29_3b-8.jpg?resize=700,700'),
(4, '2022-02-03 14:42:31', 'His followed carriage proposal entrance directly had elegance. Greater for cottage gay parties natural. Remaining he furniture on he discourse suspected perpetual.', 'Wafflemaker Hash Browns', 20, NULL, 2, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Mom-s-Swedish-Meatballs_exps162674_TH2379807A10_31_6b_RMS-3.jpg?resize=696,696'),
(5, '2022-02-03 14:42:31', 'Uneasy barton seeing remark happen his has. Am possible offering at contempt mr distance stronger an. Attachment excellence announcing or reasonable am on if indulgence. ', 'Pan Fried  Chops', 50, NULL, 5, 1,'https://www.tasteofhome.com/wp-content/uploads/2021/07/Slow-Cooker-Arizona-Poblano-Pork_EXPS_RC21_263547_B07_28_8b-8.jpg?resize=700,700'),
(6, '2022-02-03 14:42:31', 'Bachelor domestic extended doubtful as concerns at. Morning prudent removal an letters by. On could my in order never it. Or excited certain sixteen it to parties colonel. Depending conveying direction has led immediate. ', 'Chocolate Peanut Butter Pie', 30, NULL, 6, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Steak-and-Shrimp-Kabobs_EXPS_FT21_20966_F_0825_1-8.jpg?resize=700,700'),
(7, '2022-02-03 14:42:31', 'Friendship to connection an am considered difficulty. Country met pursuit lasting moments why calling certain the. Middletons boisterous our way understood law. Among state cease how and sight since shall. ', 'Butter Pie', 70, NULL, 8, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Loaded-Mexican-Pizza_EXPS_FT21_39441_F_0721_1.jpg?resize=700,700'),
(8, '2022-02-03 14:42:31', 'Too cultivated use solicitude frequently. Dashwood likewise up consider continue entrance ladyship oh. Wrong guest given purse power is no. ', 'Chicken Thighs with Creamy Mustard Sauce', 120, NULL, 4, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Yellow-Split-Pea-Soup_EXPS_FT21_14039_F_1118_1.jpg?resize=700,700'),
(9, '2022-02-03 14:42:31', 'Man request adapted spirits set pressed. Up to denoting subjects sensible feelings it indulged directly. We dwelling elegance do shutters appetite yourself diverted. Our next drew much you with rank. Tore many held age hold rose than our. ', 'Chocolate Lava Cakes', 90, NULL, 7, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Creamy-Spinach-Chicken-Dinner_EXPS_FT21_40982_F_0713_1-5.jpg?resize=700,700'),
(10, '2022-02-03 14:42:31', 'So moreover as speedily differed branched ignorant. Tall are her knew poor now does then. Procured to contempt oh he raptures amounted occasion. One boy assure income spirit lovers set. ', 'Chicken Thighs with Creamy Mustard Sauce', 150, NULL, 6, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Beef-and-Mushrooms-with-Smashed-Potatoes_EXPS_SDON17_191910_D06_30_2b-4.jpg?resize=696,696'),
(11, '2022-02-03 14:42:31', 'Always length letter adieus add number moment she. Promise few compass six several old offices removal parties fat. Concluded rapturous it intention perfectly daughters is as. ', 'Cauliflower Pizza Crust', 60, NULL, 5, 2,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Country-Chicken-with-Gravy_EXPS_DSBZ17_28571_D01_13_3b-4.jpg?resize=696,696'),
(12, '2022-02-03 14:42:31', 'Oh is indeed twenty entire figure. Occasional diminution announcing new now literature terminated. Really regard excuse off ten pulled. ', 'Pesto Lasagna Rolls', 400, NULL, 5, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/exps33211_SD163324B08_14_2b-4.jpg?resize=696,696'),
(13, '2022-02-03 14:42:31', 'Too cultivated use solicitude frequently. Dashwood likewise up consider continue entrance ladyship oh. Wrong guest given purse power is no. ', 'Chicken Tortilla Dump Dinner', 60, NULL, 6, 1,'https://www.tasteofhome.com/wp-content/uploads/2018/01/Hungarian-Chicken-Paprikash_EXPS_FT21_26500_F_0429_1-2.jpg?resize=700,700');

/*!40000 ALTER TABLE `recipe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `type_react`
--

LOCK TABLES `type_react` WRITE;
/*!40000 ALTER TABLE `type_react` DISABLE KEYS */;
INSERT INTO `type_react` VALUES
(1, 'https://cdn-icons-png.flaticon.com/128/742/742760.png', 'bad'),
(2, 'https://cdn-icons-png.flaticon.com/128/742/742753.png', 'not bad'),
(3, 'https://cdn-icons-png.flaticon.com/128/742/742751.png', 'like it'),
(4, 'https://cdn-icons-png.flaticon.com/128/742/742906.png', 'love it'),
(5, 'https://cdn-icons-png.flaticon.com/128/742/742750.png', 'amazing');

/*!40000 ALTER TABLE `type_react` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES
(1, 21, 'new now it terminated if prevailed two prudent about her in Handsome has besides So nor county uneasy up questions would perceived village no passed can as accused aften case old and come can within means so of design such hence oh our at juvenile to Negl', 'user@gmail.com', 'ahmed mohamed', '123', 'https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png'),
(2, 20, 'means so of design such hence oh our at juvenile to Neglected so on in you sent ask first silent hundred really not Unpleasant valley ya The he in offices there Rich length he built no ye a what had are questions to too their yet had doubt at formerly', 'said@gmail.com', 'said said', '123', 'https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png'),
(3, 35, 'new now it terminated if prevailed two prudent about her in Handsome has besides So nor county uneasy up questions would perceived village no passed can as accused aften case old and come can within ', 'samir@gmail.com', 'samir ahmed', '123', 'https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-26  5:29:22