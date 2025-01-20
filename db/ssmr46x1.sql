-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmr46x1
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmr46x1`
--

/*!40000 DROP DATABASE IF EXISTS `ssmr46x1`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmr46x1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmr46x1`;

--
-- Table structure for table `anquanjianchatixing`
--

DROP TABLE IF EXISTS `anquanjianchatixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anquanjianchatixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirongxiangqing` longtext COMMENT '内容详情',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='安全检查提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anquanjianchatixing`
--

LOCK TABLES `anquanjianchatixing` WRITE;
/*!40000 ALTER TABLE `anquanjianchatixing` DISABLE KEYS */;
INSERT INTO `anquanjianchatixing` VALUES (51,'2022-05-14 02:48:43','标题1','upload/anquanjianchatixing_fengmian1.jpg','内容详情1','2022-05-14','用户账号1','用户姓名1'),(52,'2022-05-14 02:48:43','标题2','upload/anquanjianchatixing_fengmian2.jpg','内容详情2','2022-05-14','用户账号2','用户姓名2'),(53,'2022-05-14 02:48:43','标题3','upload/anquanjianchatixing_fengmian3.jpg','内容详情3','2022-05-14','用户账号3','用户姓名3'),(54,'2022-05-14 02:48:43','标题4','upload/anquanjianchatixing_fengmian4.jpg','内容详情4','2022-05-14','用户账号4','用户姓名4'),(55,'2022-05-14 02:48:43','标题5','upload/anquanjianchatixing_fengmian5.jpg','内容详情5','2022-05-14','用户账号5','用户姓名5'),(56,'2022-05-14 02:48:43','标题6','upload/anquanjianchatixing_fengmian6.jpg','内容详情6','2022-05-14','用户账号6','用户姓名6');
/*!40000 ALTER TABLE `anquanjianchatixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baojingtongzhi`
--

DROP TABLE IF EXISTS `baojingtongzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baojingtongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirongxiangqing` longtext COMMENT '内容详情',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='报警通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baojingtongzhi`
--

LOCK TABLES `baojingtongzhi` WRITE;
/*!40000 ALTER TABLE `baojingtongzhi` DISABLE KEYS */;
INSERT INTO `baojingtongzhi` VALUES (41,'2022-05-14 02:48:43','标题1','upload/baojingtongzhi_fengmian1.jpg','内容详情1','2022-05-14','用户账号1','用户姓名1'),(42,'2022-05-14 02:48:43','标题2','upload/baojingtongzhi_fengmian2.jpg','内容详情2','2022-05-14','用户账号2','用户姓名2'),(43,'2022-05-14 02:48:43','标题3','upload/baojingtongzhi_fengmian3.jpg','内容详情3','2022-05-14','用户账号3','用户姓名3'),(44,'2022-05-14 02:48:43','标题4','upload/baojingtongzhi_fengmian4.jpg','内容详情4','2022-05-14','用户账号4','用户姓名4'),(45,'2022-05-14 02:48:43','标题5','upload/baojingtongzhi_fengmian5.jpg','内容详情5','2022-05-14','用户账号5','用户姓名5'),(46,'2022-05-14 02:48:43','标题6','upload/baojingtongzhi_fengmian6.jpg','内容详情6','2022-05-14','用户账号6','用户姓名6');
/*!40000 ALTER TABLE `baojingtongzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cangku`
--

DROP TABLE IF EXISTS `cangku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cangkumingcheng` varchar(200) DEFAULT NULL COMMENT '仓库名称',
  `cangkuleixing` varchar(200) DEFAULT NULL COMMENT '仓库类型',
  `cangkuweizhi` varchar(200) DEFAULT NULL COMMENT '仓库位置',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='仓库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangku`
--

LOCK TABLES `cangku` WRITE;
/*!40000 ALTER TABLE `cangku` DISABLE KEYS */;
INSERT INTO `cangku` VALUES (71,'2022-05-14 02:48:43','仓库名称1','灭火类','仓库位置1',1,'upload/cangku_tupian1.jpg'),(72,'2022-05-14 02:48:43','仓库名称2','灭火类','仓库位置2',2,'upload/cangku_tupian2.jpg'),(73,'2022-05-14 02:48:43','仓库名称3','灭火类','仓库位置3',3,'upload/cangku_tupian3.jpg'),(74,'2022-05-14 02:48:43','仓库名称4','灭火类','仓库位置4',4,'upload/cangku_tupian4.jpg'),(75,'2022-05-14 02:48:43','仓库名称5','灭火类','仓库位置5',5,'upload/cangku_tupian5.jpg'),(76,'2022-05-14 02:48:43','仓库名称6','灭火类','仓库位置6',6,'upload/cangku_tupian6.jpg');
/*!40000 ALTER TABLE `cangku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cangwei`
--

DROP TABLE IF EXISTS `cangwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuliehao` varchar(200) NOT NULL COMMENT '序列号',
  `wuzibianhao` varchar(200) DEFAULT NULL COMMENT '物资编号',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `duiyingcangkuhao` varchar(200) DEFAULT NULL COMMENT '对应仓库号',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `zhangdu` varchar(200) DEFAULT NULL COMMENT '长度',
  `cangweixiangqing` longtext COMMENT '仓位详情',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuliehao` (`xuliehao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='仓位';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangwei`
--

LOCK TABLES `cangwei` WRITE;
/*!40000 ALTER TABLE `cangwei` DISABLE KEYS */;
INSERT INTO `cangwei` VALUES (21,'2022-05-14 02:48:43','1111111111','物资编号1','物资名称1','对应仓库号1','已占用','长度1','仓位详情1'),(22,'2022-05-14 02:48:43','2222222222','物资编号2','物资名称2','对应仓库号2','已占用','长度2','仓位详情2'),(23,'2022-05-14 02:48:43','3333333333','物资编号3','物资名称3','对应仓库号3','已占用','长度3','仓位详情3'),(24,'2022-05-14 02:48:43','4444444444','物资编号4','物资名称4','对应仓库号4','已占用','长度4','仓位详情4'),(25,'2022-05-14 02:48:43','5555555555','物资编号5','物资名称5','对应仓库号5','已占用','长度5','仓位详情5'),(26,'2022-05-14 02:48:43','6666666666','物资编号6','物资名称6','对应仓库号6','已占用','长度6','仓位详情6');
/*!40000 ALTER TABLE `cangwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chukuxinxi`
--

DROP TABLE IF EXISTS `chukuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chukuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chukuxinxi` varchar(200) DEFAULT NULL COMMENT '出库信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='出库信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chukuxinxi`
--

LOCK TABLES `chukuxinxi` WRITE;
/*!40000 ALTER TABLE `chukuxinxi` DISABLE KEYS */;
INSERT INTO `chukuxinxi` VALUES (61,'2022-05-14 02:48:43',''),(62,'2022-05-14 02:48:43',''),(63,'2022-05-14 02:48:43',''),(64,'2022-05-14 02:48:43',''),(65,'2022-05-14 02:48:43',''),(66,'2022-05-14 02:48:43','');
/*!40000 ALTER TABLE `chukuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rukuxinxi`
--

DROP TABLE IF EXISTS `rukuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rukuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `rukuxinxi` varchar(200) DEFAULT NULL COMMENT '入库信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='入库信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rukuxinxi`
--

LOCK TABLES `rukuxinxi` WRITE;
/*!40000 ALTER TABLE `rukuxinxi` DISABLE KEYS */;
INSERT INTO `rukuxinxi` VALUES (81,'2022-05-14 02:48:43',''),(82,'2022-05-14 02:48:43',''),(83,'2022-05-14 02:48:43',''),(84,'2022-05-14 02:48:43',''),(85,'2022-05-14 02:48:43',''),(86,'2022-05-14 02:48:43','');
/*!40000 ALTER TABLE `rukuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,11,'用户账号1','yonghu','用户','08djb0w2fp78eu8o8ttgmf0joz1gbigs','2022-05-14 02:49:39','2022-05-14 03:49:39');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-05-14 02:48:43');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wuzixiangqing`
--

DROP TABLE IF EXISTS `wuzixiangqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wuzixiangqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wuzibianhao` varchar(200) NOT NULL COMMENT '物资编号',
  `wuzimingcheng` varchar(200) DEFAULT NULL COMMENT '物资名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `cangweixinxi` longtext COMMENT '仓位信息',
  `tiji` varchar(200) DEFAULT NULL COMMENT '体积',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `rukushijian` date DEFAULT NULL COMMENT '入库时间',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `cunfangwendu` varchar(200) DEFAULT NULL COMMENT '存放温度',
  `shengchanriqi` datetime DEFAULT NULL COMMENT '生产日期',
  `baozhiqi` varchar(200) DEFAULT NULL COMMENT '保质期',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wuzibianhao` (`wuzibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='物资详情';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wuzixiangqing`
--

LOCK TABLES `wuzixiangqing` WRITE;
/*!40000 ALTER TABLE `wuzixiangqing` DISABLE KEYS */;
INSERT INTO `wuzixiangqing` VALUES (31,'2022-05-14 02:48:43','1111111111','物资名称1','upload/wuzixiangqing_tupian1.jpg','仓位信息1','体积1',1,'2022-05-14','状态1','位置1','存放温度1','2022-05-14 10:48:43','保质期1','备注1'),(32,'2022-05-14 02:48:43','2222222222','物资名称2','upload/wuzixiangqing_tupian2.jpg','仓位信息2','体积2',2,'2022-05-14','状态2','位置2','存放温度2','2022-05-14 10:48:43','保质期2','备注2'),(33,'2022-05-14 02:48:43','3333333333','物资名称3','upload/wuzixiangqing_tupian3.jpg','仓位信息3','体积3',3,'2022-05-14','状态3','位置3','存放温度3','2022-05-14 10:48:43','保质期3','备注3'),(34,'2022-05-14 02:48:43','4444444444','物资名称4','upload/wuzixiangqing_tupian4.jpg','仓位信息4','体积4',4,'2022-05-14','状态4','位置4','存放温度4','2022-05-14 10:48:43','保质期4','备注4'),(35,'2022-05-14 02:48:43','5555555555','物资名称5','upload/wuzixiangqing_tupian5.jpg','仓位信息5','体积5',5,'2022-05-14','状态5','位置5','存放温度5','2022-05-14 10:48:43','保质期5','备注5'),(36,'2022-05-14 02:48:43','6666666666','物资名称6','upload/wuzixiangqing_tupian6.jpg','仓位信息6','体积6',6,'2022-05-14','状态6','位置6','存放温度6','2022-05-14 10:48:43','保质期6','备注6');
/*!40000 ALTER TABLE `wuzixiangqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-05-14 02:48:42','用户账号1','用户姓名1','123456','男','13823888881','upload/yonghu_touxiang1.jpg'),(12,'2022-05-14 02:48:42','用户账号2','用户姓名2','123456','男','13823888882','upload/yonghu_touxiang2.jpg'),(13,'2022-05-14 02:48:42','用户账号3','用户姓名3','123456','男','13823888883','upload/yonghu_touxiang3.jpg'),(14,'2022-05-14 02:48:42','用户账号4','用户姓名4','123456','男','13823888884','upload/yonghu_touxiang4.jpg'),(15,'2022-05-14 02:48:42','用户账号5','用户姓名5','123456','男','13823888885','upload/yonghu_touxiang5.jpg'),(16,'2022-05-14 02:48:42','用户账号6','用户姓名6','123456','男','13823888886','upload/yonghu_touxiang6.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-14 15:24:13
