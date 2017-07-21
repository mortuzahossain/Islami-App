CREATE TABLE IF NOT EXISTS `ayahs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ayah` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `translate` varchar(1000) CHARACTER SET utf8 NOT NULL,
  `location` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `ayahs`
--

INSERT INTO `ayahs` (`id`, `ayah`, `translate`, `location`) VALUES
(1, 'الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ', 'যাবতীয় প্রশংসা আল্লাহ তাআলার যিনি সকল সৃষ্টি জগতের পালনকর্তা।', 'Quran 1:1'),
(2, 'الرَّحْمَنِ الرَّحِيمِ', 'যিনি নিতান্ত মেহেরবান ও দয়ালু।', 'Quran 1:2'),
(3, 'مَالِكِ يَوْمِ الدِّينِ', 'যিনি বিচার দিনের মালিক।', 'Quran 1:3');