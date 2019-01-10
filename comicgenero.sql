-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 10-01-2019 a las 11:50:59
-- Versión del servidor: 5.7.23
-- Versión de PHP: 7.1.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `oncomic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comicgenero`
--

CREATE TABLE `comicgenero` (
  `id` int(11) NOT NULL,
  `id_genero` int(11) DEFAULT NULL,
  `id_comic` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `comicgenero`
--

INSERT INTO `comicgenero` (`id`, `id_genero`, `id_comic`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comicgenero`
--
ALTER TABLE `comicgenero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_comicgenero_genero1_idx` (`id_genero`),
  ADD KEY `fk_comicgenero_comic1_idx` (`id_comic`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comicgenero`
--
ALTER TABLE `comicgenero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comicgenero`
--
ALTER TABLE `comicgenero`
  ADD CONSTRAINT `fk_comicgenero_comic1` FOREIGN KEY (`id_comic`) REFERENCES `comic` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_comicgenero_genero1` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
