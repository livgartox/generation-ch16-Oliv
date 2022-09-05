-- MySQL Script generated by MySQL Workbench
-- Mon Sep  5 13:32:18 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Escuela
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Escuela` ;

-- -----------------------------------------------------
-- Schema Escuela
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Escuela` DEFAULT CHARACTER SET utf8 ;
USE `Escuela` ;

-- -----------------------------------------------------
-- Table `Escuela`.`Profe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Profe` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Profe` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Escuela`.`Alumno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Alumno` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Alumno` (
  `idAlumno` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `curso` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAlumno`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Escuela`.`Materia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Materia` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Materia` (
  `idMateria` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `version` VARCHAR(45) NOT NULL,
  `grado` INT NOT NULL,
  `Materiacol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMateria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Escuela`.`Alumno_has_Profe`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Alumno_has_Profe` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Alumno_has_Profe` (
  `Alumno_idAlumno` INT NOT NULL,
  `Profe_id` INT NOT NULL,
  PRIMARY KEY (`Alumno_idAlumno`, `Profe_id`),
  INDEX `fk_Alumno_has_Profe_Profe1_idx` (`Profe_id` ASC) VISIBLE,
  INDEX `fk_Alumno_has_Profe_Alumno_idx` (`Alumno_idAlumno` ASC) VISIBLE,
  CONSTRAINT `fk_Alumno_has_Profe_Alumno`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `Escuela`.`Alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_has_Profe_Profe1`
    FOREIGN KEY (`Profe_id`)
    REFERENCES `Escuela`.`Profe` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Escuela`.`Alumno_has_Materia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Alumno_has_Materia` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Alumno_has_Materia` (
  `Alumno_idAlumno` INT NOT NULL,
  `Materia_idMateria` INT NOT NULL,
  PRIMARY KEY (`Alumno_idAlumno`, `Materia_idMateria`),
  INDEX `fk_Alumno_has_Materia_Materia1_idx` (`Materia_idMateria` ASC) VISIBLE,
  INDEX `fk_Alumno_has_Materia_Alumno1_idx` (`Alumno_idAlumno` ASC) VISIBLE,
  CONSTRAINT `fk_Alumno_has_Materia_Alumno1`
    FOREIGN KEY (`Alumno_idAlumno`)
    REFERENCES `Escuela`.`Alumno` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Alumno_has_Materia_Materia1`
    FOREIGN KEY (`Materia_idMateria`)
    REFERENCES `Escuela`.`Materia` (`idMateria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Escuela`.`Profe_has_Materia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Escuela`.`Profe_has_Materia` ;

CREATE TABLE IF NOT EXISTS `Escuela`.`Profe_has_Materia` (
  `Profe_id` INT NOT NULL,
  `Materia_idMateria` INT NOT NULL,
  PRIMARY KEY (`Profe_id`, `Materia_idMateria`),
  INDEX `fk_Profe_has_Materia_Materia1_idx` (`Materia_idMateria` ASC) VISIBLE,
  INDEX `fk_Profe_has_Materia_Profe1_idx` (`Profe_id` ASC) VISIBLE,
  CONSTRAINT `fk_Profe_has_Materia_Profe1`
    FOREIGN KEY (`Profe_id`)
    REFERENCES `Escuela`.`Profe` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profe_has_Materia_Materia1`
    FOREIGN KEY (`Materia_idMateria`)
    REFERENCES `Escuela`.`Materia` (`idMateria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
