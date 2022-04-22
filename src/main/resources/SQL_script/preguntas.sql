CREATE TABLE preguntas (
  `id_pregunta` INT NOT NULL AUTO_INCREMENT,
  `categoria_pregunta` INT NOT NULL,
  `pregunta` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id_pregunta`));