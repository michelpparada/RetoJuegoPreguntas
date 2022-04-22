CREATE TABLE respuestas (
  `id_respuesta` INT NOT NULL AUTO_INCREMENT,
  `id_pregunta` INT NOT NULL,
  `respuesta` VARCHAR(100) NOT NULL,
  `respuesta_correcta` BIT NOT NULL,
  `puntuacion_respuesta` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id_respuesta`),
  CONSTRAINT `FK_id_pregunta`
    FOREIGN KEY (`id_pregunta`)
    REFERENCES preguntas (`id_pregunta`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);