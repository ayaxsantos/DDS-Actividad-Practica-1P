CREATE DATABASE registrosoka;

USE registrosoka;

CREATE TABLE `destinatario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `destino` (
  `id` int NOT NULL AUTO_INCREMENT,
  `calle` varchar(50) NOT NULL,
  `localidad` varchar(100) NOT NULL,
  `numero` int NOT NULL,
  `destinatario_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_dihwcbhtxh66p801xm3x712oo` (`destinatario_id`),
  CONSTRAINT `FK_dihwcbhtxh66p801xm3x712oo` FOREIGN KEY (`destinatario_id`) REFERENCES `destinatario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `envio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fechaDevolucion` tinyblob,
  `pesoTotal` int DEFAULT NULL,
  `destinatario_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_jdo33lvhxfpkqqprc3aoh3vjt` (`destinatario_id`),
  CONSTRAINT `FK_jdo33lvhxfpkqqprc3aoh3vjt` FOREIGN KEY (`destinatario_id`) REFERENCES `destinatario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
