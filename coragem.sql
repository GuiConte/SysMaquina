-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sys_coragem
-- ------------------------------------------------------
-- Server version	5.7.30-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cad_area`
--

DROP TABLE IF EXISTS `cad_area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_area` (
  `cod_area` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL DEFAULT '',
  `ativo` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_area`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_area`
--

LOCK TABLES `cad_area` WRITE;
/*!40000 ALTER TABLE `cad_area` DISABLE KEYS */;
INSERT INTO `cad_area` VALUES (1,'13 Ha','0'),(2,'13 Ha','1');
/*!40000 ALTER TABLE `cad_area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_camarafria`
--

DROP TABLE IF EXISTS `cad_camarafria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_camarafria` (
  `id_camarafria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_camarafria`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_camarafria`
--

LOCK TABLES `cad_camarafria` WRITE;
/*!40000 ALTER TABLE `cad_camarafria` DISABLE KEYS */;
INSERT INTO `cad_camarafria` VALUES (1,'teste');
/*!40000 ALTER TABLE `cad_camarafria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_estoque`
--

DROP TABLE IF EXISTS `cad_estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_estoque` (
  `cod_estoque` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `estoque` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_estoque`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_estoque`
--

LOCK TABLES `cad_estoque` WRITE;
/*!40000 ALTER TABLE `cad_estoque` DISABLE KEYS */;
INSERT INTO `cad_estoque` VALUES (1,'12');
/*!40000 ALTER TABLE `cad_estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_histdespesa`
--

DROP TABLE IF EXISTS `cad_histdespesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_histdespesa` (
  `cod_despesa` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL DEFAULT '',
  `ativo` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_despesa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_histdespesa`
--

LOCK TABLES `cad_histdespesa` WRITE;
/*!40000 ALTER TABLE `cad_histdespesa` DISABLE KEYS */;
INSERT INTO `cad_histdespesa` VALUES (1,'12','1'),(2,'12','0'),(3,'a','0');
/*!40000 ALTER TABLE `cad_histdespesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_produtor`
--

DROP TABLE IF EXISTS `cad_produtor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_produtor` (
  `cod_produto` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `produtor` varchar(45) NOT NULL DEFAULT '',
  `ativo` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_produtor`
--

LOCK TABLES `cad_produtor` WRITE;
/*!40000 ALTER TABLE `cad_produtor` DISABLE KEYS */;
INSERT INTO `cad_produtor` VALUES (1,'teste','0'),(2,'teste','1'),(3,'teste','1');
/*!40000 ALTER TABLE `cad_produtor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_veiculo`
--

DROP TABLE IF EXISTS `cad_veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_veiculo` (
  `cod_veiculo` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `placa` varchar(45) NOT NULL DEFAULT '',
  `descricao` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_veiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_veiculo`
--

LOCK TABLES `cad_veiculo` WRITE;
/*!40000 ALTER TABLE `cad_veiculo` DISABLE KEYS */;
INSERT INTO `cad_veiculo` VALUES (1,'abc-1234','teste');
/*!40000 ALTER TABLE `cad_veiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cad_vendedor`
--

DROP TABLE IF EXISTS `cad_vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cad_vendedor` (
  `cod_vendedor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vendedor` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_vendedor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cad_vendedor`
--

LOCK TABLES `cad_vendedor` WRITE;
/*!40000 ALTER TABLE `cad_vendedor` DISABLE KEYS */;
INSERT INTO `cad_vendedor` VALUES (1,'12');
/*!40000 ALTER TABLE `cad_vendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `cod_cidade` int(11) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(50) DEFAULT NULL,
  `cod_estado` int(11) DEFAULT NULL,
  `cod_IBGE` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_cidade`),
  KEY `fk_cidade_estado` (`cod_estado`),
  CONSTRAINT `fk_cidade_estado` FOREIGN KEY (`cod_estado`) REFERENCES `estado` (`cod_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'Divinolandia',1,1),(2,'Poços de \n\nCaldas',2,2),(3,'Niteroi',3,3),(4,'S.S.Grama',1,4),(5,'Andradas',2,5),(6,'S.J.Boa Vista',1,6);
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `cod_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `cod_cidade` int(11) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `rg_ie` varchar(15) DEFAULT NULL,
  `data_cadastro` date DEFAULT NULL,
  `obs` blob,
  `celular` varchar(15) DEFAULT NULL,
  `usuario` smallint(6) DEFAULT NULL,
  `bloqueado` char(1) DEFAULT 'F',
  `prazo` int(11) DEFAULT NULL,
  `email` varchar(90) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `bairro` varchar(20) DEFAULT NULL,
  `complemento` varchar(40) DEFAULT NULL,
  `cpf_cnpj` varchar(20) DEFAULT NULL,
  `tipo_pessoa` smallint(6) DEFAULT NULL,
  `limite_credito` float(13,2) DEFAULT '0.00',
  `fantasia` varchar(100) DEFAULT NULL,
  `nfe` varchar(1) DEFAULT NULL,
  `excluido` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cod_cliente`),
  KEY `fk_cliente_cidade` (`cod_cidade`),
  CONSTRAINT `fk_cliente_cidade` FOREIGN KEY (`cod_cidade`) REFERENCES `cidade` (`cod_cidade`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'a','',1,'     -   ','(  )    -    ','   .   .   .   ','2020-07-08','','(  )     -    ',1,'F',0,'','','','','  .   .   /    -  ',1,0.00,'','F',1),(2,'c','',1,'     -   ','(  )    -    ','   .   .   .   ','2020-07-08','','(  )     -    ',1,'F',0,'','','','','  .   .   /    -  ',1,0.00,'','F',0),(3,'b','',1,'     -   ','(  )    -    ','   .   .   .   ','2020-07-08','','(  )     -    ',1,'F',0,'','','','','  .   .   /    -  ',1,0.00,'','F',0),(4,'e','',1,'     -   ','(  )    -    ','   .   .   .   ','2020-07-08','','(  )     -    ',1,'F',0,'','','','','  .   .   /    -  ',1,0.00,'','F',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `cod_empresa` int(11) NOT NULL AUTO_INCREMENT,
  `empresa` varchar(50) DEFAULT NULL,
  `fantasia` varchar(50) DEFAULT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `ie` varchar(30) DEFAULT NULL,
  `endereco` varchar(35) DEFAULT NULL,
  `bairro` varchar(35) DEFAULT NULL,
  `cod_cidade` int(11) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `telefone` varchar(30) DEFAULT NULL,
  `mensagem` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_empresa`),
  KEY `fk_empresa_cidade` (`cod_cidade`),
  CONSTRAINT `fk_empresa_cidade` FOREIGN KEY (`cod_cidade`) REFERENCES `cidade` (`cod_cidade`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'teste','teste','11.111.111/111-11','111111111','teste','tste',2,'11111-111','(11)1111-1111','teste'),(2,'','','  .   .   /   -  ','','','',1,'     -   ','(  )    -    ',''),(3,'','','  .   .   /   -  ','','','',1,'     -   ','(  )    -    ',''),(4,'','','  .   .   /   -  ','','','',1,'     -   ','(  )    -    ',''),(5,'Coragem','','  .   .   /   -  ','','','',1,'     -   ','(  )    -    ',''),(6,'teste','','  .   .   /   -  ','','','',1,'     -   ','(  )    -    ','');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `cod_estado` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(50) DEFAULT NULL,
  `estado_abreviado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`cod_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'São Paulo','SP'),(2,'Minas \n\nGerais','MG'),(3,'Rio de Janeiro','RJ');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formapagamento`
--

DROP TABLE IF EXISTS `formapagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formapagamento` (
  `cod_pagamento` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `forma` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_pagamento`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formapagamento`
--

LOCK TABLES `formapagamento` WRITE;
/*!40000 ALTER TABLE `formapagamento` DISABLE KEYS */;
INSERT INTO `formapagamento` VALUES (1,'dinheiro');
/*!40000 ALTER TABLE `formapagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historicocheque`
--

DROP TABLE IF EXISTS `historicocheque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historicocheque` (
  `cod_cheque` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cheque` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_cheque`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historicocheque`
--

LOCK TABLES `historicocheque` WRITE;
/*!40000 ALTER TABLE `historicocheque` DISABLE KEYS */;
INSERT INTO `historicocheque` VALUES (1,'teste'),(2,'teste');
/*!40000 ALTER TABLE `historicocheque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maquinas`
--

DROP TABLE IF EXISTS `maquinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maquinas` (
  `cod_maquina` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `maquina` varchar(45) NOT NULL DEFAULT '',
  `excluido` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`cod_maquina`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maquinas`
--

LOCK TABLES `maquinas` WRITE;
/*!40000 ALTER TABLE `maquinas` DISABLE KEYS */;
INSERT INTO `maquinas` VALUES (1,'teste',1);
/*!40000 ALTER TABLE `maquinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtor`
--

DROP TABLE IF EXISTS `produtor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtor` (
  `cod_produtor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `fantasia` varchar(100) DEFAULT NULL,
  `tipo_pessoa` smallint(6) DEFAULT NULL,
  `endereco` varchar(60) DEFAULT NULL,
  `bairro` varchar(30) DEFAULT NULL,
  `cod_cidade` int(11) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cpf_cnpj` varchar(20) DEFAULT NULL,
  `rg_ie` varchar(15) DEFAULT NULL,
  `obs` blob,
  `usuario` smallint(6) DEFAULT NULL,
  `bloqueado` char(1) DEFAULT 'F',
  `excluido` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cod_produtor`),
  KEY `fk_produtor_cidade` (`cod_cidade`),
  CONSTRAINT `fk_produtor_cidade` FOREIGN KEY (`cod_cidade`) REFERENCES `cidade` (`cod_cidade`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtor`
--

LOCK TABLES `produtor` WRITE;
/*!40000 ALTER TABLE `produtor` DISABLE KEYS */;
INSERT INTO `produtor` VALUES (1,'q','',1,'','',1,'     -   ','(  )    -    ','  .   .   /    -  ','   .   .   .   ','',1,'F',0);
/*!40000 ALTER TABLE `produtor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtor_conta`
--

DROP TABLE IF EXISTS `produtor_conta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produtor_conta` (
  `cod_produtor_conta` int(11) NOT NULL AUTO_INCREMENT,
  `cod_produtor` int(11) DEFAULT NULL,
  `banco` varchar(40) DEFAULT NULL,
  `agencia` varchar(20) DEFAULT NULL,
  `conta_corrente` varchar(20) DEFAULT NULL,
  `titular` varchar(40) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_produtor_conta`),
  KEY `fk_produtor_conta` (`cod_produtor`),
  CONSTRAINT `fk_produtor_conta` FOREIGN KEY (`cod_produtor`) REFERENCES `produtor` (`cod_produtor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtor_conta`
--

LOCK TABLES `produtor_conta` WRITE;
/*!40000 ALTER TABLE `produtor_conta` DISABLE KEYS */;
/*!40000 ALTER TABLE `produtor_conta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setores`
--

DROP TABLE IF EXISTS `setores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `setores` (
  `cod_setor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `setor` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_setor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setores`
--

LOCK TABLES `setores` WRITE;
/*!40000 ALTER TABLE `setores` DISABLE KEYS */;
INSERT INTO `setores` VALUES (1,'1'),(2,'c'),(3,'12');
/*!40000 ALTER TABLE `setores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viagem_categoria`
--

DROP TABLE IF EXISTS `viagem_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viagem_categoria` (
  `cod_viagem` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_viagem`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viagem_categoria`
--

LOCK TABLES `viagem_categoria` WRITE;
/*!40000 ALTER TABLE `viagem_categoria` DISABLE KEYS */;
INSERT INTO `viagem_categoria` VALUES (1,'1');
/*!40000 ALTER TABLE `viagem_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viagem_subcategoria`
--

DROP TABLE IF EXISTS `viagem_subcategoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viagem_subcategoria` (
  `cod_viagemsub` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_viagemsub`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viagem_subcategoria`
--

LOCK TABLES `viagem_subcategoria` WRITE;
/*!40000 ALTER TABLE `viagem_subcategoria` DISABLE KEYS */;
INSERT INTO `viagem_subcategoria` VALUES (1,'1');
/*!40000 ALTER TABLE `viagem_subcategoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sys_coragem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-15 12:40:44
