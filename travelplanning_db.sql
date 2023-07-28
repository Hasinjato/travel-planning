-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 28 juil. 2023 à 14:06
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `travelplanning_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `accommodation`
--

CREATE TABLE `accommodation` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `amenities` varchar(255) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `reservation` datetime(6) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `accommodation_seq`
--

CREATE TABLE `accommodation_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `accommodation_seq`
--

INSERT INTO `accommodation_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `activity`
--

CREATE TABLE `activity` (
  `id` bigint(20) NOT NULL,
  `cost` double DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `need_reservation` bit(1) DEFAULT NULL,
  `time_opening` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `activity_seq`
--

CREATE TABLE `activity_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `activity_seq`
--

INSERT INTO `activity_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `date`
--

CREATE TABLE `date` (
  `id` bigint(20) NOT NULL,
  `departure_date` date DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `flexible_date` bit(1) DEFAULT NULL,
  `return_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `date_seq`
--

CREATE TABLE `date_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `date_seq`
--

INSERT INTO `date_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `destination`
--

CREATE TABLE `destination` (
  `id` bigint(20) NOT NULL,
  `attraction` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `duration` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `destination_seq`
--

CREATE TABLE `destination_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `destination_seq`
--

INSERT INTO `destination_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(1, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Structure de la table `transport`
--

CREATE TABLE `transport` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `transport`
--

INSERT INTO `transport` (`id`, `name`, `company`) VALUES
(1, 'testee', 'test'),
(2, 'Petit avion', 'Tsaradia'),
(152, 'SSV', 'Compagnie privée de CT Motors'),
(153, '4*4 toyota', 'MadaVoyageGo');

-- --------------------------------------------------------

--
-- Structure de la table `transport_seq`
--

CREATE TABLE `transport_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `transport_seq`
--

INSERT INTO `transport_seq` (`next_val`) VALUES
(251);

-- --------------------------------------------------------

--
-- Structure de la table `travel`
--

CREATE TABLE `travel` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `end_date` varchar(255) DEFAULT NULL,
  `start_date` varchar(255) DEFAULT NULL,
  `traveler_email` varchar(255) DEFAULT NULL,
  `traveler_name` varchar(255) DEFAULT NULL,
  `traveler_phone` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `transport` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `travel`
--

INSERT INTO `travel` (`id`, `description`, `destination`, `end_date`, `start_date`, `traveler_email`, `traveler_name`, `traveler_phone`, `first_name`, `transport`) VALUES
(202, 'Voyage de vacance', 'Tamatave', '2023-08-03', '2023-07-28', 'rakao@yahoo.fr', 'RAVATO', '+2613456476', NULL, 'Petit avion du Tsaradia'),
(252, 'desc', 'Mada', '2023-07-30', '2023-07-23', 'zeze@gmai.z', 'RAKKA ZHHZ', '+2618277282', NULL, 'SSV du Compagnie privée de CT Motors');

-- --------------------------------------------------------

--
-- Structure de la table `travel_seq`
--

CREATE TABLE `travel_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `travel_seq`
--

INSERT INTO `travel_seq` (`next_val`) VALUES
(351);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `full_name`, `password`, `username`) VALUES
(1, 'RAKOTO H', '$2a$10$STkb7o/pRXn51Xd4JFPXPuVgSnyn7gR38sZez.nGRY95du/KU8Yfu', 'Hasina'),
(3, 'RAKOTO Harimalala', '$2a$10$9EgypW.gnyfJFT/JryMFMeOWc5G3gqRV5YDP9t4qIHNvEYlEnKBcG', 'Hasinjato'),
(7, 'RAKOTO Harimalala', '$2a$10$d2oX31JGczpx6tzzOgqDhuGnK1Yf/13pzimctQN57CzoQskoxzh5G', 'Hasinjato1'),
(8, 'RAKOTO Harimalala', '$2a$10$68.A.Nyu3xDnBVMsXzpit.HK.i9P7kgSn6UptrOUtek61fXJj2tqy', 'za'),
(9, 'Hasina', '$2a$10$pTYCS1AFiJ7B4WjyMHQtxOmzJ4afEGIlB2tyE6j4ellMNGTXSLIJK', 'admin'),
(10, '', '$2a$10$9VR2CqoggPYgXul5mpqws.QaQ6Zd1MfAuIxB2IrppSlXthHHsDy0C', '');

-- --------------------------------------------------------

--
-- Structure de la table `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(3, 1),
(7, 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `accommodation`
--
ALTER TABLE `accommodation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `date`
--
ALTER TABLE `date`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `destination`
--
ALTER TABLE `destination`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_8sewwnpamngi6b1dwaa88askk` (`name`);

--
-- Index pour la table `transport`
--
ALTER TABLE `transport`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `travel`
--
ALTER TABLE `travel`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`),
  ADD UNIQUE KEY `UKsb8bbouer5wak8vyiiy4pf2bx` (`username`);

--
-- Index pour la table `users_roles`
--
ALTER TABLE `users_roles`
  ADD KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  ADD KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `transport`
--
ALTER TABLE `transport`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=154;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
