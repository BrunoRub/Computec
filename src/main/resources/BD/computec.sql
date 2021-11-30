DROP DATABASE IF EXISTS COMPUTEC;
CREATE DATABASE  IF NOT EXISTS COMPUTEC;
USE COMPUTEC;

/*TABLAS*/
CREATE TABLE `computec`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(60) NOT NULL,
  `enabled` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

insert into usuario (username,password,enabled) values("user","$2a$10$JHwbmQfMgFWJQe.jqB/7z.jsFZSjDslOYmCRne1w30iyoh3B.4YBu",1);
insert into usuario (username,password,enabled) values("bruno","$2a$10$FE/YyE97NTYt20/CyXN.YOsHXFq9qrNNtFXjSMwvpTM/CxmUzq1S2",1);
insert into usuario (username,password,enabled) values("piero","$2a$10$PuXw7QUS4JGubcOUpFyeKu6ZkPjJXJ2iwIRAw9gQew.mBJLfdVI4y",1);
insert into usuario (username,password,enabled) values("jhonatan","$2a$10$D3bD8lnONY6bOrL5Ifok4emoDyUfDnUlZfze2eWGC2LbdfLs3wigC",1);

CREATE TABLE `computec`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario_id` INT NOT NULL,
  `rol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_id_rol` (`usuario_id` ASC, `rol` ASC) VISIBLE,
  CONSTRAINT `rolUsuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `computec`.`usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

insert into roles (usuario_id,rol) values("1","ROLE_USER");
insert into roles (usuario_id,rol) values("2","ROLE_ADMIN");
insert into roles (usuario_id,rol) values("2","ROLE_USER");
insert into roles (usuario_id,rol) values("3","ROLE_ADMIN");
insert into roles (usuario_id,rol) values("4","ROLE_ADMIN");

CREATE TABLE `computec`.`estado` (
  `idestado` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idestado`));

insert into estado (idestado,descripcion) values(1,"Activo");
insert into estado (idestado,descripcion) values(2,"Inactivo");

CREATE TABLE `computec`.`categoria` (
  `idcat` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `idestado` INT NOT NULL,
  PRIMARY KEY (`idcat`),
  INDEX `catEst_idx` (`idestado` ASC) VISIBLE,
  CONSTRAINT `catEst`
    FOREIGN KEY (`idestado`)
    REFERENCES `computec`.`estado` (`idestado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
  
CREATE TABLE `computec`.`producto` (
  `idpro` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `idcat` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  `stock` INT NOT NULL,
  `idestado` INT NOT NULL,
  PRIMARY KEY (`idpro`),
  INDEX `productoCat_idx` (`idcat` ASC) VISIBLE,
  INDEX `productoEst_idx` (`idestado` ASC) VISIBLE,
  CONSTRAINT `productoCat`
    FOREIGN KEY (`idcat`)
    REFERENCES `computec`.`categoria` (`idcat`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `productoEst`
    FOREIGN KEY (`idestado`)
    REFERENCES `computec`.`estado` (`idestado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `computec`.`cliente` (
  `idcli` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `dni` CHAR(8) NOT NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` CHAR(11) NULL,
  PRIMARY KEY (`idcli`));
  
CREATE TABLE `computec`.`trabajador` (
  `idtra` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `dni` CHAR(8) NOT NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` CHAR(11) NULL,
  PRIMARY KEY (`idtra`));

CREATE TABLE `computec`.`proveedor` (
  `idprov` INT NOT NULL AUTO_INCREMENT,
  `razons` VARCHAR(45) NOT NULL,
  `ruc` CHAR(11) NOT NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` CHAR(11) NULL,
  PRIMARY KEY (`idprov`));

CREATE TABLE `computec`.`ingreso` (
  `iding` INT NOT NULL AUTO_INCREMENT,
  `idpro` INT NOT NULL,
  `idprov` INT NOT NULL,
  `idtra` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`iding`),
  INDEX `ingresoPro_idx` (`idpro` ASC) VISIBLE,
  INDEX `ingresoProv_idx` (`idprov` ASC) VISIBLE,
  INDEX `ingresoTra_idx` (`idtra` ASC) VISIBLE,
  CONSTRAINT `ingresoPro`
    FOREIGN KEY (`idpro`)
    REFERENCES `computec`.`producto` (`idpro`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ingresoProv`
    FOREIGN KEY (`idprov`)
    REFERENCES `computec`.`proveedor` (`idprov`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ingresoTra`
    FOREIGN KEY (`idtra`)
    REFERENCES `computec`.`trabajador` (`idtra`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

CREATE TABLE `computec`.`venta` (
  `idven` INT NOT NULL AUTO_INCREMENT,
  `idcli` INT NOT NULL,
  `idtra` INT NOT NULL,
  `idpro` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `preciov` DOUBLE NOT NULL,
  `fecha` DATE NOT NULL,
  `tipocom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idven`),
  INDEX `ventaCli_idx` (`idcli` ASC) VISIBLE,
  INDEX `ventaTra_idx` (`idtra` ASC) VISIBLE,
  INDEX `ventaPro_idx` (`idpro` ASC) VISIBLE,
  CONSTRAINT `ventaCli`
    FOREIGN KEY (`idcli`)
    REFERENCES `computec`.`cliente` (`idcli`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ventaTra`
    FOREIGN KEY (`idtra`)
    REFERENCES `computec`.`trabajador` (`idtra`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `ventaPro`
    FOREIGN KEY (`idpro`)
    REFERENCES `computec`.`producto` (`idpro`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

