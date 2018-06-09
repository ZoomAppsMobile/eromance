# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.16)
# Database: eromance
# Generation Time: 2017-04-03 10:17:53 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table conversation_message_statuses
# ------------------------------------------------------------

DROP TABLE IF EXISTS `conversation_message_statuses`;

CREATE TABLE `conversation_message_statuses` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `conversation_message_statuses_key_unique` (`key`),
  UNIQUE KEY `conversation_message_statuses_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `conversation_message_statuses` WRITE;
/*!40000 ALTER TABLE `conversation_message_statuses` DISABLE KEYS */;

INSERT INTO `conversation_message_statuses` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'sended','/storage/icon/conversation-message-status/sended.png',NULL,NULL),
	(2,'deliveries','/storage/icon/conversation-message-status/deliveries.png',NULL,NULL),
	(3,'readed','/storage/icon/conversation-message-status/readed.png',NULL,NULL);

/*!40000 ALTER TABLE `conversation_message_statuses` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table conversation_messages
# ------------------------------------------------------------

DROP TABLE IF EXISTS `conversation_messages`;

CREATE TABLE `conversation_messages` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `conversation_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `status_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `conversation_messages_conversation_id_index` (`conversation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table conversations
# ------------------------------------------------------------

DROP TABLE IF EXISTS `conversations`;

CREATE TABLE `conversations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `owner_user_id` int(10) unsigned NOT NULL,
  `joined_user_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `conversations_owner_user_id_index` (`owner_user_id`),
  KEY `conversations_joined_user_id_index` (`joined_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table entities
# ------------------------------------------------------------

DROP TABLE IF EXISTS `entities`;

CREATE TABLE `entities` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `class` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `table` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `entities_class_unique` (`class`),
  UNIQUE KEY `entities_table_unique` (`table`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table evening_payments
# ------------------------------------------------------------

DROP TABLE IF EXISTS `evening_payments`;

CREATE TABLE `evening_payments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `evening_payments_key_unique` (`key`),
  UNIQUE KEY `evening_payments_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `evening_payments` WRITE;
/*!40000 ALTER TABLE `evening_payments` DISABLE KEYS */;

INSERT INTO `evening_payments` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'fifty-fifty','/storage/icon/evening-paymnet/fifty-fifty.png',NULL,NULL),
	(2,'for-me','/storage/icon/evening-paymnet/for-me.png',NULL,NULL),
	(3,'for-you','/storage/icon/evening-paymnet/for-you.png',NULL,NULL),
	(4,'with-somebody','/storage/icon/evening-paymnet/with-somebody.png',NULL,NULL);

/*!40000 ALTER TABLE `evening_payments` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table evening_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `evening_types`;

CREATE TABLE `evening_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `evening_types_key_unique` (`key`),
  UNIQUE KEY `evening_types_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `evening_types` WRITE;
/*!40000 ALTER TABLE `evening_types` DISABLE KEYS */;

INSERT INTO `evening_types` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'nature','/storage/icon/evening-paymnet/nature.png',NULL,NULL),
	(2,'sport','/storage/icon/evening-paymnet/sport.png',NULL,NULL),
	(3,'cinema','/storage/icon/evening-paymnet/cinema.png',NULL,NULL),
	(4,'walk','/storage/icon/evening-paymnet/walk.png',NULL,NULL),
	(5,'drink','/storage/icon/evening-paymnet/drink.png',NULL,NULL),
	(6,'travel','/storage/icon/evening-paymnet/travel.png',NULL,NULL);

/*!40000 ALTER TABLE `evening_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table evenings
# ------------------------------------------------------------

DROP TABLE IF EXISTS `evenings`;

CREATE TABLE `evenings` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_id` int(10) unsigned NOT NULL,
  `payment_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `joined_user_id` int(11) DEFAULT NULL,
  `started_at` datetime NOT NULL,
  `finished_at` datetime NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table game_bets
# ------------------------------------------------------------

DROP TABLE IF EXISTS `game_bets`;

CREATE TABLE `game_bets` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `thing_id` int(10) unsigned NOT NULL,
  `bet` double(8,2) unsigned NOT NULL,
  `is_win` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `game_bets_game_id_index` (`game_id`),
  KEY `game_bets_user_id_index` (`user_id`),
  KEY `game_bets_thing_id_index` (`thing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table game_statuses
# ------------------------------------------------------------

DROP TABLE IF EXISTS `game_statuses`;

CREATE TABLE `game_statuses` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `game_statuses_key_unique` (`key`),
  UNIQUE KEY `game_statuses_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `game_statuses` WRITE;
/*!40000 ALTER TABLE `game_statuses` DISABLE KEYS */;

INSERT INTO `game_statuses` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'wait','/storage/icon/game-status/wait.png',NULL,NULL),
	(2,'win','/storage/icon/game-status/win.png',NULL,NULL),
	(3,'lose','/storage/icon/game-status/lose.png',NULL,NULL),
	(4,'draw','/storage/icon/game-status/draw.png',NULL,NULL);

/*!40000 ALTER TABLE `game_statuses` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table game_things
# ------------------------------------------------------------

DROP TABLE IF EXISTS `game_things`;

CREATE TABLE `game_things` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `game_things_key_unique` (`key`),
  UNIQUE KEY `game_things_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `game_things` WRITE;
/*!40000 ALTER TABLE `game_things` DISABLE KEYS */;

INSERT INTO `game_things` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'rock','/storage/icon/game-thing/rock.png',NULL,NULL),
	(2,'scissors','/storage/icon/game-thing/scissors.png',NULL,NULL),
	(3,'paper','/storage/icon/game-thing/paper.png',NULL,NULL);

/*!40000 ALTER TABLE `game_things` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table games
# ------------------------------------------------------------

DROP TABLE IF EXISTS `games`;

CREATE TABLE `games` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `status_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `games_status_id_index` (`status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table gift_groups
# ------------------------------------------------------------

DROP TABLE IF EXISTS `gift_groups`;

CREATE TABLE `gift_groups` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `gift_groups_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table gifts
# ------------------------------------------------------------

DROP TABLE IF EXISTS `gifts`;

CREATE TABLE `gifts` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `group_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `gifts_key_unique` (`key`),
  KEY `gifts_group_id_index` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table languages
# ------------------------------------------------------------

DROP TABLE IF EXISTS `languages`;

CREATE TABLE `languages` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `abbr` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `languages_name_unique` (`name`),
  UNIQUE KEY `languages_abbr_unique` (`abbr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `languages` WRITE;
/*!40000 ALTER TABLE `languages` DISABLE KEYS */;

INSERT INTO `languages` (`id`, `name`, `abbr`, `created_at`, `updated_at`)
VALUES
	(1,'Русский','ru',NULL,NULL),
	(2,'Қазақша','kz',NULL,NULL),
	(3,'English','en',NULL,NULL);

/*!40000 ALTER TABLE `languages` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table location_cities
# ------------------------------------------------------------

DROP TABLE IF EXISTS `location_cities`;

CREATE TABLE `location_cities` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `country_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `location_cities_country_id_index` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `location_cities` WRITE;
/*!40000 ALTER TABLE `location_cities` DISABLE KEYS */;

INSERT INTO `location_cities` (`id`, `key`, `country_id`, `created_at`, `updated_at`)
VALUES
	(1,'almaty',1,NULL,NULL),
	(2,'astana',1,NULL,NULL);

/*!40000 ALTER TABLE `location_cities` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table location_countries
# ------------------------------------------------------------

DROP TABLE IF EXISTS `location_countries`;

CREATE TABLE `location_countries` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `location_countries_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `location_countries` WRITE;
/*!40000 ALTER TABLE `location_countries` DISABLE KEYS */;

INSERT INTO `location_countries` (`id`, `key`, `created_at`, `updated_at`)
VALUES
	(1,'kazakhstan',NULL,NULL);

/*!40000 ALTER TABLE `location_countries` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table meet_payments
# ------------------------------------------------------------

DROP TABLE IF EXISTS `meet_payments`;

CREATE TABLE `meet_payments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `meet_payments_key_unique` (`key`),
  UNIQUE KEY `meet_payments_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `meet_payments` WRITE;
/*!40000 ALTER TABLE `meet_payments` DISABLE KEYS */;

INSERT INTO `meet_payments` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'fifty-fifty','/storage/icon/meet-payment/fifty-fifty.png',NULL,NULL),
	(2,'for-me','/storage/icon/meet-payment/for-me.png',NULL,NULL),
	(3,'for-you','/storage/icon/meet-payment/for-you.png',NULL,NULL),
	(4,'with-somebody','/storage/icon/meet-payment/with-somebody.png',NULL,NULL);

/*!40000 ALTER TABLE `meet_payments` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table meet_times
# ------------------------------------------------------------

DROP TABLE IF EXISTS `meet_times`;

CREATE TABLE `meet_times` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `meet_times_key_unique` (`key`),
  UNIQUE KEY `meet_times_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `meet_times` WRITE;
/*!40000 ALTER TABLE `meet_times` DISABLE KEYS */;

INSERT INTO `meet_times` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'1-hour','/storage/icon/meet-time/1-hour.png',NULL,NULL),
	(2,'2-hours','/storage/icon/meet-time/2-hours.png',NULL,NULL);

/*!40000 ALTER TABLE `meet_times` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table meet_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `meet_types`;

CREATE TABLE `meet_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `meet_types_key_unique` (`key`),
  UNIQUE KEY `meet_types_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `meet_types` WRITE;
/*!40000 ALTER TABLE `meet_types` DISABLE KEYS */;

INSERT INTO `meet_types` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'phone','/storage/icon/meet-type/phone.png',NULL,NULL),
	(2,'sport','/storage/icon/meet-type/sport.png',NULL,NULL),
	(3,'movie','/storage/icon/meet-type/movie.png',NULL,NULL),
	(4,'walk','/storage/icon/meet-type/walk.png',NULL,NULL),
	(5,'drink','/storage/icon/meet-type/drink.png',NULL,NULL);

/*!40000 ALTER TABLE `meet_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table meets
# ------------------------------------------------------------

DROP TABLE IF EXISTS `meets`;

CREATE TABLE `meets` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_id` int(10) unsigned NOT NULL,
  `time_id` int(10) unsigned NOT NULL,
  `payment_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `joined_user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table migrations
# ------------------------------------------------------------

DROP TABLE IF EXISTS `migrations`;

CREATE TABLE `migrations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;

INSERT INTO `migrations` (`id`, `migration`, `batch`)
VALUES
	(1,'2017_03_29_100002_create_translations_table',1),
	(2,'2017_03_29_100003_create_location_countries_table',1),
	(3,'2017_03_29_100004_create_location_cities_table',1),
	(4,'2017_03_29_100005_create_questionnaire_groups_table',1),
	(5,'2017_03_29_100006_create_questionnaires_table',1),
	(6,'2017_03_29_111001_create_languages_table',1),
	(7,'2017_03_29_200001_create_users_table',1),
	(8,'2017_03_29_200002_create_user_social_types_table',1),
	(9,'2017_03_29_200003_create_user_socials_table',1),
	(10,'2017_03_29_200004_create_user_profile_sexes_table',1),
	(11,'2017_03_29_200005_create_user_profiles_table',1),
	(12,'2017_03_29_200006_create_user_photos_table',1),
	(13,'2017_03_29_200007_create_user_ratings_table',1),
	(14,'2017_03_29_200008_create_user_questionnaires_table',1),
	(15,'2017_03_29_200009_create_gift_groups_table',1),
	(16,'2017_03_29_200010_create_gifts_table',1),
	(17,'2017_03_29_200011_create_user_gifts_table',1),
	(18,'2017_03_29_200012_create_user_favorites_table',1),
	(19,'2017_03_29_200013_create_user_location_types_table',1),
	(20,'2017_03_29_200014_create_user_locations_table',1),
	(21,'2017_03_29_200015_create_user_statuses_table',1),
	(22,'2017_03_29_200016_create_service_types_table',1),
	(23,'2017_03_29_200017_create_user_services_table',1),
	(24,'2017_03_29_300001_create_conversations_table',1),
	(25,'2017_03_29_300002_create_conversation_message_statuses_table',1),
	(26,'2017_03_29_300003_create_conversation_messages_table',1),
	(27,'2017_03_29_400001_create_meet_types_table',1),
	(28,'2017_03_29_400002_create_meet_times_table',1),
	(29,'2017_03_29_400003_create_meet_payments_table',1),
	(30,'2017_03_29_400004_create_meets_table',1),
	(31,'2017_03_29_500001_create_evening_payments_table',1),
	(32,'2017_03_29_500002_create_evening_types_table',1),
	(33,'2017_03_29_500003_create_evenings_table',1),
	(34,'2017_03_29_600001_create_reviews_table',1),
	(35,'2017_03_29_700001_create_payment_types_table',1),
	(36,'2017_03_29_700002_create_payments_table',1),
	(37,'2017_03_29_800001_create_game_statuses_table',1),
	(38,'2017_03_29_800002_create_game_things_table',1),
	(39,'2017_03_29_800003_create_games_table',1),
	(40,'2017_03_29_800004_create_game_bets_table',1),
	(41,'2017_03_29_900001_create_place_types_table',1),
	(42,'2017_03_29_900002_create_places_table',1),
	(43,'2017_03_29_900003_create_place_photos_table',1),
	(44,'2017_04_03_161309_create_entities_table',1);

/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table payment_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `payment_types`;

CREATE TABLE `payment_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `is_income` tinyint(1) NOT NULL COMMENT 'Начисление или списание?',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `payment_types_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `payment_types` WRITE;
/*!40000 ALTER TABLE `payment_types` DISABLE KEYS */;

INSERT INTO `payment_types` (`id`, `key`, `is_income`, `created_at`, `updated_at`)
VALUES
	(1,'payment',1,NULL,NULL),
	(2,'game_win',1,NULL,NULL),
	(3,'game_lose',0,NULL,NULL),
	(4,'profile_vip',0,NULL,NULL),
	(5,'plasce',0,NULL,NULL),
	(6,'place_vip',0,NULL,NULL);

/*!40000 ALTER TABLE `payment_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table payments
# ------------------------------------------------------------

DROP TABLE IF EXISTS `payments`;

CREATE TABLE `payments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `amount` double(8,2) NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `type_id` int(10) unsigned NOT NULL,
  `is_income` tinyint(1) NOT NULL COMMENT 'Начисление или списание?',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `payments_user_id_index` (`user_id`),
  KEY `payments_type_id_index` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table place_photos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `place_photos`;

CREATE TABLE `place_photos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `place_id` int(10) unsigned NOT NULL,
  `image` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `position` int(11) NOT NULL DEFAULT '0',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `place_photos_place_id_index` (`place_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table place_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `place_types`;

CREATE TABLE `place_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `place_types_key_unique` (`key`),
  UNIQUE KEY `place_types_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `place_types` WRITE;
/*!40000 ALTER TABLE `place_types` DISABLE KEYS */;

INSERT INTO `place_types` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'hotel','/storage/icon/place-type/hotel.png',NULL,NULL),
	(2,'restaurant','/storage/icon/place-type/restaurant.png',NULL,NULL),
	(3,'cafe','/storage/icon/place-type/cafe.png',NULL,NULL),
	(4,'cinema','/storage/icon/place-type/cinema.png',NULL,NULL),
	(5,'bar','/storage/icon/place-type/bar.png',NULL,NULL),
	(6,'club','/storage/icon/place-type/club.png',NULL,NULL),
	(7,'karaoke','/storage/icon/place-type/karaoke.png',NULL,NULL),
	(8,'sauna','/storage/icon/place-type/sauna.png',NULL,NULL),
	(9,'billiards','/storage/icon/place-type/billiards.png',NULL,NULL),
	(10,'bowling','/storage/icon/place-type/bowling.png',NULL,NULL),
	(11,'other','/storage/icon/place-type/other.png',NULL,NULL);

/*!40000 ALTER TABLE `place_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table places
# ------------------------------------------------------------

DROP TABLE IF EXISTS `places`;

CREATE TABLE `places` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `longitude` double(11,8) NOT NULL,
  `latitude` double(11,8) NOT NULL,
  `food` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `avereg_price` int(11) NOT NULL,
  `hour_from` int(11) NOT NULL,
  `hour_to` int(11) NOT NULL,
  `site` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `type_id` int(10) unsigned NOT NULL,
  `country_id` int(10) unsigned NOT NULL,
  `city_id` int(10) unsigned NOT NULL,
  `is_vip` tinyint(1) NOT NULL DEFAULT '0',
  `vip_at` datetime NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `places_name_unique` (`name`),
  KEY `places_address_index` (`address`),
  KEY `places_food_index` (`food`),
  KEY `places_avereg_price_index` (`avereg_price`),
  KEY `places_hour_from_index` (`hour_from`),
  KEY `places_hour_to_index` (`hour_to`),
  KEY `places_user_id_index` (`user_id`),
  KEY `places_type_id_index` (`type_id`),
  KEY `places_country_id_index` (`country_id`),
  KEY `places_city_id_index` (`city_id`),
  KEY `places_is_vip_index` (`is_vip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table profiles
# ------------------------------------------------------------

DROP TABLE IF EXISTS `profiles`;

CREATE TABLE `profiles` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `about_person` text COLLATE utf8_unicode_ci,
  `about_interests` text COLLATE utf8_unicode_ci,
  `born_at` date NOT NULL,
  `avatar` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status_at` datetime DEFAULT NULL,
  `rating` double(8,2) NOT NULL DEFAULT '0.00',
  `is_vip` tinyint(1) NOT NULL DEFAULT '0',
  `vip_at` datetime NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `sex_id` int(10) unsigned NOT NULL,
  `country_id` int(10) unsigned NOT NULL,
  `city_id` int(10) unsigned NOT NULL,
  `language_id` int(10) unsigned NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `profiles_born_at_index` (`born_at`),
  KEY `profiles_rating_index` (`rating`),
  KEY `profiles_is_vip_index` (`is_vip`),
  KEY `profiles_user_id_index` (`user_id`),
  KEY `profiles_sex_id_index` (`sex_id`),
  KEY `profiles_country_id_index` (`country_id`),
  KEY `profiles_city_id_index` (`city_id`),
  KEY `profiles_language_id_index` (`language_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table questionnaire_groups
# ------------------------------------------------------------

DROP TABLE IF EXISTS `questionnaire_groups`;

CREATE TABLE `questionnaire_groups` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `questionnaire_groups_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `questionnaire_groups` WRITE;
/*!40000 ALTER TABLE `questionnaire_groups` DISABLE KEYS */;

INSERT INTO `questionnaire_groups` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'languages','/storage/icon/questionnaries-group/languages.png',NULL,NULL),
	(2,'family','/storage/icon/questionnaries-group/family.png',NULL,NULL),
	(3,'childs','/storage/icon/questionnaries-group/childs.png',NULL,NULL),
	(4,'сharacter','/storage/icon/questionnaries-group/сharacter.png',NULL,NULL),
	(5,'complection','/storage/icon/questionnaries-group/complection.png',NULL,NULL),
	(6,'smoking','/storage/icon/questionnaries-group/smoking.png',NULL,NULL),
	(7,'drinking','/storage/icon/questionnaries-group/drinking.png',NULL,NULL),
	(8,'activity','/storage/icon/questionnaries-group/activity.png',NULL,NULL),
	(9,'car','/storage/icon/questionnaries-group/car.png',NULL,NULL),
	(10,'hair_color','/storage/icon/questionnaries-group/hair_color.png',NULL,NULL),
	(11,'weight','/storage/icon/questionnaries-group/weight.png',NULL,NULL),
	(12,'height','/storage/icon/questionnaries-group/height.png',NULL,NULL);

/*!40000 ALTER TABLE `questionnaire_groups` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table questionnaires
# ------------------------------------------------------------

DROP TABLE IF EXISTS `questionnaires`;

CREATE TABLE `questionnaires` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `questionnaires_key_unique` (`key`),
  KEY `questionnaires_group_id_index` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table reviews
# ------------------------------------------------------------

DROP TABLE IF EXISTS `reviews`;

CREATE TABLE `reviews` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `entity_class` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `entity_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table service_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `service_types`;

CREATE TABLE `service_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `service_types_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `service_types` WRITE;
/*!40000 ALTER TABLE `service_types` DISABLE KEYS */;

INSERT INTO `service_types` (`id`, `key`, `created_at`, `updated_at`)
VALUES
	(1,'adult-call',NULL,NULL),
	(2,'strip-dance',NULL,NULL),
	(3,'escort',NULL,NULL),
	(4,'massage',NULL,NULL);

/*!40000 ALTER TABLE `service_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table translations
# ------------------------------------------------------------

DROP TABLE IF EXISTS `translations`;

CREATE TABLE `translations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `language_id` int(10) unsigned NOT NULL,
  `entity_class` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `entity_id` int(10) unsigned NOT NULL,
  `value` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `translations_language_id_index` (`language_id`),
  KEY `translations_entity_class_index` (`entity_class`),
  KEY `translations_entity_id_index` (`entity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_favorites
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_favorites`;

CREATE TABLE `user_favorites` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `owner_user_id` int(11) NOT NULL,
  `acted_user_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_favorites_owner_user_id_index` (`owner_user_id`),
  KEY `user_favorites_acted_user_id_index` (`acted_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_gifts
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_gifts`;

CREATE TABLE `user_gifts` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `owner_user_id` int(11) NOT NULL,
  `acted_user_id` int(10) unsigned NOT NULL,
  `gift_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_gifts_owner_user_id_index` (`owner_user_id`),
  KEY `user_gifts_acted_user_id_index` (`acted_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_location
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_location`;

CREATE TABLE `user_location` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `longitude` double(11,8) NOT NULL,
  `latitude` double(11,8) NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `type_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_location_type_id_index` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_location_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_location_types`;

CREATE TABLE `user_location_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_location_types_key_unique` (`key`),
  UNIQUE KEY `user_location_types_icon_unique` (`icon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `user_location_types` WRITE;
/*!40000 ALTER TABLE `user_location_types` DISABLE KEYS */;

INSERT INTO `user_location_types` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'walking','/storage/icon/user-location-type/walking.png',NULL,NULL),
	(2,'dancing','/storage/icon/user-location-type/dancing.png',NULL,NULL),
	(3,'riding','/storage/icon/user-location-type/riding.png',NULL,NULL),
	(4,'watching','/storage/icon/user-location-type/watching.png',NULL,NULL),
	(5,'chilling','/storage/icon/user-location-type/chilling.png',NULL,NULL),
	(6,'missing','/storage/icon/user-location-type/missing.png',NULL,NULL);

/*!40000 ALTER TABLE `user_location_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_photos
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_photos`;

CREATE TABLE `user_photos` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `image` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `position` int(11) NOT NULL DEFAULT '0',
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_photos_user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_profile_sexes
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_profile_sexes`;

CREATE TABLE `user_profile_sexes` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_profile_sexes_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `user_profile_sexes` WRITE;
/*!40000 ALTER TABLE `user_profile_sexes` DISABLE KEYS */;

INSERT INTO `user_profile_sexes` (`id`, `key`, `created_at`, `updated_at`)
VALUES
	(1,'man',NULL,NULL),
	(2,'woman',NULL,NULL),
	(3,'trans',NULL,NULL);

/*!40000 ALTER TABLE `user_profile_sexes` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_questionnaires
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_questionnaires`;

CREATE TABLE `user_questionnaires` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `group_id` int(10) unsigned NOT NULL,
  `questionnaire_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_questionnaires_user_id_index` (`user_id`),
  KEY `user_questionnaires_group_id_index` (`group_id`),
  KEY `user_questionnaires_questionnaire_id_index` (`questionnaire_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_ratings
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_ratings`;

CREATE TABLE `user_ratings` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `owner_user_id` int(10) unsigned NOT NULL,
  `acted_user_id` int(10) unsigned NOT NULL,
  `is_liked` tinyint(1) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_ratings_owner_user_id_index` (`owner_user_id`),
  KEY `user_ratings_acted_user_id_index` (`acted_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_services
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_services`;

CREATE TABLE `user_services` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_services_type_id_index` (`type_id`),
  KEY `user_services_user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_social_types
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_social_types`;

CREATE TABLE `user_social_types` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `key` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `icon` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_social_types_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

LOCK TABLES `user_social_types` WRITE;
/*!40000 ALTER TABLE `user_social_types` DISABLE KEYS */;

INSERT INTO `user_social_types` (`id`, `key`, `icon`, `created_at`, `updated_at`)
VALUES
	(1,'vkontakte','/storage/icon/user-social-type/vkontakte.png',NULL,NULL),
	(2,'facebook','/storage/icon/user-social-type/facebook.png',NULL,NULL),
	(3,'google-plus','/storage/icon/user-social-type/google-plus.png',NULL,NULL),
	(4,'mail-ru','/storage/icon/user-social-type/mail-ru.png',NULL,NULL),
	(5,'odnoklassniki','/storage/icon/user-social-type/odnoklassniki.png',NULL,NULL);

/*!40000 ALTER TABLE `user_social_types` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user_socials
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_socials`;

CREATE TABLE `user_socials` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `type_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_socials_type_id_index` (`type_id`),
  KEY `user_socials_user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table user_statuses
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_statuses`;

CREATE TABLE `user_statuses` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` text COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;



# Dump of table users
# ------------------------------------------------------------

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '0',
  `amount` double(8,2) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_username_unique` (`username`),
  UNIQUE KEY `users_email_unique` (`email`),
  UNIQUE KEY `users_phone_unique` (`phone`),
  KEY `users_is_active_index` (`is_active`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
