-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 18 Ağu 2017, 14:15:13
-- Sunucu sürümü: 5.7.14
-- PHP Sürümü: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `cozum_masasivt`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `problems`
--

CREATE TABLE `problems` (
  `ProbID` int(11) NOT NULL,
  `problem` text COLLATE utf8_turkish_ci,
  `date` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `problems`
--

INSERT INTO `problems` (`ProbID`, `problem`, `date`) VALUES
(6, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque et turpis sed enim congue gravida. Vestibulum suscipit ligula eget luctus eleifend. Donec lobortis eleifend lacus, ac faucibus nunc faucibus vitae. Aliquam eget consectetur lectus.', '2017-08-15 10:35:40'),
(5, 'Phasellus blandit placerat ante ut interdum. Vestibulum tempus enim nisi, eget sagittis lacus maximus nec. Donec ac finibus ligula. Integer posuere velit at orci ornare, ut iaculis sem elementum. Ut eu elementum nisl, sit amet convallis arcu.', '2017-08-15 10:30:32'),
(8, 'Donec lectus arcu, accumsan vel nunc ut, dapibus vulputate turpis. Mauris ultricies convallis enim quis bibendum. Fusce viverra eros sit amet porta pulvinar. Donec porttitor neque accumsan tortor placerat egestas. Morbi a elit egestas, faucibus mi sed, condimentum augue. Aenean ut nulla volutpat, dignissim erat id, tempus sapien. Vestibulum euismod tellus finibus leo laoreet tempus.', '2017-08-15 10:43:30'),
(9, 'Maecenas eu eleifend eros, porta cursus massa. Vivamus facilisis diam magna, vel faucibus diam consequat ac. Vestibulum malesuada leo urna, ac porta orci vestibulum et. Fusce id arcu justo. Morbi arcu mi, placerat sit amet consequat quis, pretium at metus. ', '2017-08-15 10:44:41'),
(10, 'Fusce ut nisi sit amet quam eleifend pellentesque sit amet a dolor. Sed et euismod orci. Pellentesque mollis dolor sit amet orci ullamcorper tristique.', '2017-08-15 10:59:38'),
(11, 'Aliquam elementum purus ac commodo sodales. Sed condimentum rutrum massa, ac lacinia nunc dapibus a. Ut quis dolor quis tortor interdum elementum id ac diam.', '2017-08-15 11:14:53'),
(14, 'Ut quis dolor quis tortor interdum elementum id ac diam.', '2017-08-03 08:41:48'),
(12, 'unc dapibus a. Ut quis dolor quis tortor interdum elementum id ac diam.', '2017-08-23 08:41:42'),
(13, 'Sed condimentum rutrum massa, ac lacinia nunc dapibus a. Ut quis dolor quis tortor interdum elementum id ac diam.', '2017-08-11 08:41:45');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `remarks`
--

CREATE TABLE `remarks` (
  `RemarkID` int(11) NOT NULL,
  `remark` text COLLATE utf8_turkish_ci,
  `probID` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `remarks`
--

INSERT INTO `remarks` (`RemarkID`, `remark`, `probID`) VALUES
(1, 'bir not', 10),
(2, 'yeni', 10),
(3, 'bir not2', 2);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `solutions`
--

CREATE TABLE `solutions` (
  `SolutionID` int(11) NOT NULL,
  `solution` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `probID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `solutions`
--

INSERT INTO `solutions` (`SolutionID`, `solution`, `probID`) VALUES
(1, 'asdasdasdadasdadasdasdasd', 10),
(2, 'qweqwe', 10),
(3, 'asdasdsasd', 10),
(4, 'asdasdas', 6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tagproblems`
--

CREATE TABLE `tagproblems` (
  `TagProbID` int(11) NOT NULL,
  `TagID` int(11) DEFAULT NULL,
  `ProbID` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `tagproblems`
--

INSERT INTO `tagproblems` (`TagProbID`, `TagID`, `ProbID`) VALUES
(1, 6, 9);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tags`
--

CREATE TABLE `tags` (
  `TagID` int(11) NOT NULL,
  `tag` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `tags`
--

INSERT INTO `tags` (`TagID`, `tag`) VALUES
(1, 'denem'),
(5, 'deneme2'),
(4, 'deneme'),
(6, 'deneme3');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `problems`
--
ALTER TABLE `problems`
  ADD PRIMARY KEY (`ProbID`);

--
-- Tablo için indeksler `remarks`
--
ALTER TABLE `remarks`
  ADD PRIMARY KEY (`RemarkID`) USING BTREE;

--
-- Tablo için indeksler `solutions`
--
ALTER TABLE `solutions`
  ADD PRIMARY KEY (`SolutionID`);

--
-- Tablo için indeksler `tagproblems`
--
ALTER TABLE `tagproblems`
  ADD PRIMARY KEY (`TagProbID`) USING BTREE;

--
-- Tablo için indeksler `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`TagID`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `problems`
--
ALTER TABLE `problems`
  MODIFY `ProbID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- Tablo için AUTO_INCREMENT değeri `remarks`
--
ALTER TABLE `remarks`
  MODIFY `RemarkID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Tablo için AUTO_INCREMENT değeri `solutions`
--
ALTER TABLE `solutions`
  MODIFY `SolutionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Tablo için AUTO_INCREMENT değeri `tagproblems`
--
ALTER TABLE `tagproblems`
  MODIFY `TagProbID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Tablo için AUTO_INCREMENT değeri `tags`
--
ALTER TABLE `tags`
  MODIFY `TagID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
