CREATE TABLE `publicblog`.`rtffile` (
  `RtfId` INT NOT NULL AUTO_INCREMENT,
  `RtfName` VARCHAR(45) NOT NULL DEFAULT 'default',
  `RtfPath` VARCHAR(256) NOT NULL DEFAULT 'default',
  `RtfCreator` VARCHAR(45) NOT NULL DEFAULT 'default',
  `RtfCreateTime` DATETIME NOT NULL DEFAULT now(),
  PRIMARY KEY (`RtfId`));
