CREATE DATABASE registrosoka;

USE registrosoka;

CREATE TABLE `envio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fechaDevolucion` tinyblob,
  `pesoTotal` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `paquete` (
  `id` int NOT NULL AUTO_INCREMENT,
  `peso` int NOT NULL,
  `tamanio` int DEFAULT NULL,
  `envio_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_anqqmqswlq1970wt3g6wty8ko` (`envio_id`),
  CONSTRAINT `FK_anqqmqswlq1970wt3g6wty8ko` FOREIGN KEY (`envio_id`) REFERENCES `envio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
