CREATE TABLE `publicblog`.`image` (
  `ImageId` INT NOT NULL AUTO_INCREMENT,
  `ImageName` VARCHAR(45) NOT NULL DEFAULT 'default',
  `ImagePath` VARCHAR(256) NOT NULL DEFAULT 'default',
  `ImageCreator` VARCHAR(45) NOT NULL DEFAULT 'default',
  `ImageCreateTime` DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (`ImageId`));