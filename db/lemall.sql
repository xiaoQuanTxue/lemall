-- MySQL dump 10.13  Distrib 5.7.29, for Win64 (x86_64)
--
-- Host: localhost    Database: lemall
-- ------------------------------------------------------
-- Server version	5.7.29-log

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
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  `cart_join_time` datetime DEFAULT NULL COMMENT '商品加入时间',
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,1,3,'2020-11-07 10:32:30');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商家商品类型',
  `category_name` varchar(255) NOT NULL COMMENT '商品类型名称',
  `super_id` int(10) DEFAULT '0' COMMENT '上级分类id',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'数码/设备',-1),(2,'电脑',1),(3,'笔记本电脑',2),(4,'平板电脑',2),(5,'整体一体机',2),(6,'鼠标键盘',2),(7,'显示器',2),(8,'数码配件',1),(9,'u盘',8),(10,'电脑周边',8),(11,'硬盘',8),(12,'支架',8),(13,'USB周边',8),(14,'手写笔',8),(15,'数码保护套',8),(16,'智能设备',1),(17,'智能手表',16),(18,'无人机',16),(19,'智能平衡车',16),(20,'儿童智能表',16),(21,'智能健康',16),(22,'推荐',0),(23,'三种松鼠',24),(24,'零食礼盒',-1),(25,'百草味',24),(26,'良品铺子',24),(27,'男装/户外运动',-1),(28,'上装',27),(29,'短外套',28),(30,'卫衣',28),(31,'T恤',28),(32,'衬衫',28),(33,'毛衣',28),(34,'风衣',28),(35,'羽绒服',28),(36,'棉衣',28),(37,'手机/数码',-1),(38,'手机',37),(39,'苹果手机',38),(40,'vivo手机',38),(41,'小米手机',38),(42,'oppo手机',38),(43,'三星手机',38),(44,'荣耀手机',38),(45,'魅族手机',38),(46,'手机配件',37),(47,'手机壳',46),(48,'耳机',46),(49,'充电宝',46),(50,'数据线',46),(51,'手机充电器',46),(52,'钢化膜',46),(53,'手机支架',46),(54,'图书影像/文具',-1),(55,'文具教具',54),(56,'笔记本',55),(57,'笔袋',55),(58,'钢笔',55),(59,'文具收纳',55),(60,'书法画材',55),(61,'台历挂历',55),(62,'图书',54),(63,'文学社科',62),(64,'教材教辅',62),(65,'生活艺术',62),(66,'经管励志',62),(67,'热门考试',62),(68,'科学技术',62),(69,'医药卫生',62),(70,'进口原版',62),(71,'核桃',23),(72,'夏威夷果',23),(73,'香瓜子',23),(74,'花生',23),(75,'大核桃',25),(76,'开心果',25),(77,'罗汉豆',25),(78,'坚果礼盒',26),(79,'鸭脖',26),(80,'鸡爪',26),(81,'安装/维修',-1),(82,'家电安装',81),(83,'办公安装',81),(84,'家居安装',81),(85,'家电维修',81),(86,'空调安装',82),(87,'电视安装',82),(88,'洗衣机安装',82),(89,'热水器安装',82),(90,'烟机/灶具安装',82),(91,'净水器安装',82),(92,'电脑安装',83),(93,'办公设备安装',83),(94,'家居安装',84),(95,'灯具安装',84),(96,'智能家居安装',84),(97,'五金卫浴安装',84),(98,'空调维修',85),(99,'电视维修',85),(100,'洗衣机维修',85),(101,'食品/酒类',-1),(102,'精选肉类',101),(103,'海鲜水产',101),(104,'猪肉',102),(105,'牛肉',102),(106,'羊肉',102),(107,'鸡肉',102),(108,'鸭肉',102),(109,'鱼类',103),(110,'虾类',103),(111,'蟹类',103),(112,'海参',103),(113,'箱包/功能包',-1),(114,'潮流女包',113),(115,'精品男包',113),(116,'功能箱包',113),(117,'真皮包',114),(118,'单肩包',114),(119,'手提包',114),(120,'斜挎包',114),(121,'双肩包',114),(122,'男士钱包',115),(123,'双肩包',115),(124,'商务公文包',115),(125,'钥匙包',115),(126,'拉杆箱',116),(127,'旅行包',116),(128,'电脑包',116),(129,'书包',116),(130,'登山包',116),(131,'精品/钟表',-1),(132,'钟表',131),(133,'珠宝',131),(134,'DW',132),(135,'浪琴',132),(136,'欧米茄',132),(137,'西铁城',132),(138,'肖邦',132),(139,'黄金',133),(140,'k金',133),(141,'时尚饰品',133),(142,'钻石',133),(143,'母婴/玩具乐器',-1),(144,'奶粉',143),(145,'喂养用品',143),(146,'洗护用品',143),(147,'1段',144),(148,'2段',144),(149,'3段',144),(150,'孕妈奶粉',144),(151,'奶瓶奶嘴',145),(152,'辅食料理机',145),(153,'儿童餐具',145),(154,'宝宝护肤',146),(155,'日常护理',146),(156,'洗澡用具',146),(157,'洗发沐浴',146);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collect`
--

DROP TABLE IF EXISTS `collect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collect` (
  `collect_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  `collect_date` datetime DEFAULT NULL COMMENT '收藏日期',
  PRIMARY KEY (`collect_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collect`
--

LOCK TABLES `collect` WRITE;
/*!40000 ALTER TABLE `collect` DISABLE KEYS */;
INSERT INTO `collect` VALUES (20,1,1,'2020-10-15 22:32:20'),(21,1,2,'2020-10-15 22:32:22');
/*!40000 ALTER TABLE `collect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_address`
--

DROP TABLE IF EXISTS `delivery_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery_address` (
  `delivery_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收件地址id',
  `delivery_postcode` varchar(20) DEFAULT NULL COMMENT '邮编',
  `delivery_phone` varchar(14) DEFAULT NULL COMMENT '电话',
  `delivery_receiver` varchar(255) DEFAULT NULL COMMENT '收件人',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `vendor_id` int(11) DEFAULT NULL COMMENT '商家id',
  `province` varchar(255) DEFAULT NULL COMMENT '省份',
  `city` varchar(255) DEFAULT NULL COMMENT '市',
  `districtt` varchar(255) DEFAULT NULL COMMENT '区',
  `delivery_address` varchar(255) DEFAULT NULL COMMENT '具体地址',
  `delivery_default` int(1) DEFAULT NULL COMMENT '1为默认默认，0不是默认',
  PRIMARY KEY (`delivery_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_address`
--

LOCK TABLES `delivery_address` WRITE;
/*!40000 ALTER TABLE `delivery_address` DISABLE KEYS */;
INSERT INTO `delivery_address` VALUES (1,'312000','15757585652','德玛西亚',0,NULL,'湖北省','武汉市','洪山区','雄楚大道666号(中南财经政法大学)',0),(2,'32415','15935748625','弗雷尔卓德',0,NULL,'天津市','天津市','西青区','精武镇宾水西道延长线399号天津工业大学',0),(3,'35415','15632456315','诺克萨斯',1,NULL,'北京市','北京市','海淀区','双清路30号清华大学',1),(4,NULL,'1234567891','祖安',0,NULL,'浙江省','杭州市','拱墅区','xxxxxx',0),(11,NULL,'1234567891','鬼谷',0,NULL,'湖北省','武汉市','洪山区','zxq19970820',0),(14,NULL,'1234567891','恕瑞玛',0,NULL,'湖北省','武汉市','洪山区','123',0),(15,NULL,'1231231231','三笠',0,NULL,'湖北省','武汉市','洪山区','123',0),(30,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(31,NULL,'12345678901','张三',0,NULL,'浙江省','洪山区','洪山区','完美化和四节',0),(32,NULL,'12345678901','张三',0,NULL,'浙江省','洪山区','洪山区','完美化和四节',0),(33,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(34,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(35,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(36,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(37,NULL,'','',0,NULL,'湖北省','洪山区','洪山区','',0),(38,NULL,'123','张三',0,NULL,'湖北省','洪山区','洪山区','天津第一号',0),(39,NULL,'12345667','艾迪',0,NULL,'湖北省','洪山区','洪山区','方法的发大幅度',0),(40,NULL,'12345678901','qqq',1,NULL,'湖北省','武汉市','洪山区','薛家湾镇南苑小区16号楼一单元201',0);
/*!40000 ALTER TABLE `delivery_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `good`
--

DROP TABLE IF EXISTS `good`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `good` (
  `good_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `good_name` varchar(255) NOT NULL COMMENT '商品名称',
  `good_current_price` decimal(10,2) DEFAULT NULL COMMENT '商品现价',
  `good_original_price` decimal(10,2) DEFAULT '0.00' COMMENT '商品原价',
  `good_describe` varchar(255) NOT NULL COMMENT '商品描述',
  `good_inventory` int(255) DEFAULT NULL COMMENT '商品库存',
  `good_sale` int(255) DEFAULT NULL COMMENT '商品销量',
  `good_state` varchar(10) DEFAULT NULL COMMENT '商品状态，上架，下架',
  `good_up_date` datetime DEFAULT NULL COMMENT '上架日期',
  `category_id` int(11) DEFAULT NULL COMMENT '所属类型id',
  `vendor_id` int(10) DEFAULT NULL COMMENT '商家id',
  `state` int(10) DEFAULT NULL COMMENT '0表示已删除，1表示未删除',
  PRIMARY KEY (`good_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `good`
--

LOCK TABLES `good` WRITE;
/*!40000 ALTER TABLE `good` DISABLE KEYS */;
INSERT INTO `good` VALUES (1,'MacBook  Pro',12999.00,13999.00,'2019x新款Apple/苹果<br>\r\n							MacBook Pro15寸i7独显',9989,254,'1','2020-08-20 09:05:25',3,1,NULL),(2,'轻薄纤巧笔记本',9945.00,9999.00,'轻薄纤巧笔记本<br>让商务办公更灵活',453,245,'0','2020-10-05 09:09:19',3,1,NULL),(3,'惠普 暗夜精灵6',9199.00,9399.00,'新品暗影6十代i7<br>2060HP/惠普 暗影',6556,182,'1','2020-10-14 09:12:20',3,1,NULL),(4,'神舟战神A7000锐龙',7745.00,7759.00,'【国庆狂欢】神舟战神<br>A7000锐龙台式R5-3600',545,182,'1','2020-10-15 09:12:24',3,1,NULL),(5,'超薄笔记本',4199.00,4599.00,'Thinkpad超薄笔记本<br>办公娱乐的好伴侣',455,127,'0','2020-10-14 09:13:24',3,1,NULL),(6,'戴尔超薄金属本灵越5485',4099.00,4899.00,'戴尔超薄金属本灵越5485<br>高性能锐龙R7商务本',6568,1727,'1','2020-10-29 09:14:44',3,1,NULL),(7,'Lenovo/联想 拯救者',6199.00,6599.00,'Lenovo/联想 拯救者<br>\r\n							Y7000P 2019新 i5/i7',4523,1785,'1','2020-10-14 09:15:26',3,1,NULL),(8,'华硕笔记本',5199.00,5599.00,'值哭了华硕笔记本<br>飞行堡垒游戏本新品',643,1875,'0','2020-09-29 09:16:13',3,1,NULL),(9,'新品暗影6十代i7',9455.00,9499.00,'新品暗影6十代i7<br>RTX2060HP/惠普',353,1772,'1','2020-09-08 09:16:57',3,1,NULL),(10,'2019x新款Apple/苹果',9999.00,10999.00,'2019x新款Apple/苹果<br>MacBook Pro15寸i7独显',2455,1557,'1','2020-09-16 08:18:06',3,1,NULL),(11,'影楼主题服装2020新款',298.00,328.00,'影楼主题服装2020新款<br>\r\n影楼主题服装2020新款<br>拖尾婚纱外景拍照',4228,15,'1','2020-10-15 09:44:34',22,1,NULL),(12,'出租韩版蕾丝修身显瘦',325.00,328.00,'出租韩版蕾丝修身显瘦<br>新娘年会主持礼服租赁',2534,158,'1','2020-10-13 09:45:21',22,1,NULL),(13,'安以轩同款秀禾服新娘2020',299.00,315.00,'安以轩同款秀禾服2020<br>明星同款中式礼服',9863,157,'1','2020-10-08 09:46:08',22,1,NULL),(14,'出租新款韩版婚纱',123.00,345.00,'出租新款韩版婚纱<br>新娘抹胸显瘦拖尾租赁',315,178,'1','2020-10-22 09:46:50',22,1,NULL),(15,'出租平口心形领美背浅香槟',354.00,543.00,'出租平口心形领美背浅香槟<br>细腰带飘逸网纱新娘拖尾',35,178,'1','2020-10-22 09:47:37',22,2,NULL),(16,'abs渔具包鱼竿包1.25米',159.00,169.00,'abs渔具包鱼竿包1.25米<br>加宽单肩包耐磨',354,18,'1','2020-10-21 09:48:33',22,2,NULL),(17,'JEBean杰特明',166.00,199.00,'JEBean杰特明<br>SEA01 130流明 笔形手电筒',34488,15,'1','2020-10-27 09:49:30',22,2,NULL),(18,'Edifier/漫步者',331.00,356.00,'Edifier/漫步者<br>真无线蓝牙耳机',453,18,'1','2020-10-13 09:50:09',22,2,NULL),(19,'臻米智能自动升降电火锅',321.00,339.00,'臻米智能自动升降电火锅<br>多功能一体锅插电4L',384,87,'1','2020-10-13 09:51:23',22,2,NULL),(20,'PUMA彪马夹克男',449.00,522.00,'PUMA彪马夹克男<br>反光短款休闲外套',450,8787,'1','2020-10-14 09:53:36',22,2,NULL),(21,'【进口】瑞士金宝利卷',39.00,45.00,'【进口】瑞士金宝利卷<br>轻薄脆片饼干',5434,1472,'1','2020-10-07 09:57:55',24,2,NULL),(22,'推荐【三只松鼠每日坚果】',169.00,199.00,'推荐【三只松鼠每日坚果】<br>孕妇健康零食干果',4525,127,'1','2020-10-21 10:00:44',24,2,NULL),(23,'良品铺子手剥松子',209.00,239.00,'良品铺子齐嗨聚<br>巨型零食大礼包整箱',209,131,'1','2020-10-14 10:01:38',24,2,NULL),(24,'【百草味-每日坚果750g】',169.00,189.00,'【百草味-每日坚果750g】<br>零食混合小包装礼盒',248,1368,'1','2020-10-21 10:02:29',24,2,NULL),(25,'抹茶绿豆饼',6.90,9.90,'抹茶绿豆饼<br>小吃肉松饼糕点休闲',565,199,'1','2020-10-15 10:03:36',24,2,NULL),(81,'p',12345.00,0.00,'分分',123,NULL,'1','2020-11-06 10:07:35',NULL,1,NULL);
/*!40000 ALTER TABLE `good` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `good_data`
--

DROP TABLE IF EXISTS `good_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `good_data` (
  `good_data_id` int(11) NOT NULL AUTO_INCREMENT,
  `good_data_img` varchar(255) DEFAULT NULL,
  `good_data_scale` text COMMENT '商品规格',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`good_data_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `good_data`
--

LOCK TABLES `good_data` WRITE;
/*!40000 ALTER TABLE `good_data` DISABLE KEYS */;
INSERT INTO `good_data` VALUES (1,'../images/introductionPicture/惠普展示图.jpg','<li title=\"\">品牌名称:&nbsp;HP/惠普</li>\r\n											<li title=\"\">证书编号:&nbsp;2018010902055598</li>\r\n											<li title=\"\">证书状态:&nbsp;有效</li>\r\n											<li title=\"\">产品名称:&nbsp;便携式计算机</li>\r\n											<li title=\"\">3C规格型号:&nbsp;见附件</li>\r\n											<li title=\"\">产品名称:&nbsp;HP/惠普 光影精灵6 惠普光</li>\r\n											<li title=\"\">品牌:&nbsp;HP/惠普</li>\r\n											<li title=\"\">型号：&nbsp;型号</li>\r\n											<li title=\"\">内存容量：&nbsp; 8GB 16G 32GB</li>\r\n											<li title=\"\">显存容量：&nbsp;4G</li>\r\n											<li title=\"\">显卡类型：&nbsp;NVIDIA GeForce GTX 1650 Ti</li>',3),(2,'../images/introductionPicture/01_mid.jpg','<li title=\"\">产品类型:&nbsp;烘炒类</li>\r\n											<li title=\"\">原料产地:&nbsp;巴基斯坦</li>\r\n											<li title=\"\">产地:&nbsp;湖北省武汉市</li>\r\n											<li title=\"\">配料表:&nbsp;进口松子、食用盐</li>\r\n											<li title=\"\">产品规格:&nbsp;210g</li>\r\n											<li title=\"\">保质期:&nbsp;180天</li>\r\n											<li title=\"\">产品标准号:&nbsp;GB/T 22165</li>\r\n											<li title=\"\">生产许可证编号：&nbsp;QS4201 1801 0226</li>\r\n											<li title=\"\">储存方法：&nbsp;请放置于常温、阴凉、通风、干燥处保存 </li>\r\n											<li title=\"\">食用方法：&nbsp;开袋去壳即食</li>',23);
/*!40000 ALTER TABLE `good_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `good_data_img`
--

DROP TABLE IF EXISTS `good_data_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `good_data_img` (
  `good_data_img_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `good_data_img_src` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `good_data_id` int(11) DEFAULT NULL COMMENT '商品资料id',
  PRIMARY KEY (`good_data_img_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `good_data_img`
--

LOCK TABLES `good_data_img` WRITE;
/*!40000 ALTER TABLE `good_data_img` DISABLE KEYS */;
INSERT INTO `good_data_img` VALUES (1,'../images/tw1.jpg',2),(2,'../images/tw2.jpg',2),(3,'../images/tw3.jpg',2),(4,'../images/tw4.jpg',2),(5,'../images/tw5.jpg',2),(6,'../images/tw6.jpg',2),(7,'../images/tw7.jpg',2),(8,'../images/picturea/pictureaa/暗影精灵大图1.jpg',1),(9,'../images/picturea/pictureaa/暗影精灵大图2.jpg',1),(10,'../images/picturea/pictureaa/暗影精灵大图3.jpg',1),(11,'../images/picturea/pictureaa/暗影精灵大图4.jpg',1),(12,'../images/picturea/pictureaa/暗影精灵大图5.jpg',1);
/*!40000 ALTER TABLE `good_data_img` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `good_details`
--

DROP TABLE IF EXISTS `good_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `good_details` (
  `good_details_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品详情图片id',
  `good_details_igm` varchar(255) DEFAULT NULL COMMENT '商品详情图片路径',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`good_details_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `good_details`
--

LOCK TABLES `good_details` WRITE;
/*!40000 ALTER TABLE `good_details` DISABLE KEYS */;
INSERT INTO `good_details` VALUES (1,'../images/picturea/单品1.webp',1),(2,'../images/picturea/单品2.webp',2),(3,'../images/picturea/单品3.webp',3),(4,'../images/picturea/单品4.webp',4),(5,'../images/picturea/单品5.webp',5),(6,'../images/picturea/单品6.webp',6),(7,'../images/picturea/单品7.webp',7),(8,'../images/picturea/单品8.webp',8),(9,'../images/picturea/单品9.webp',9),(10,'../images/picturea/单品10.webp',10),(11,'../images/picturea/为你推荐1.webp',11),(12,'../images/picturea/为你推荐2.webp',12),(13,'../images/picturea/为你推荐3.webp',13),(14,'../images/picturea/为你推荐4.webp',14),(15,'../images/picturea/为你推荐5.webp',15),(16,'../images/picturea/为你推荐6.webp',16),(17,'../images/picturea/为你推荐7.webp',17),(18,'../images/picturea/为你推荐8.webp',18),(19,'../images/picturea/为你推荐9.webp',19),(20,'../images/picturea/为你推荐10.webp',20),(21,'../images/picturea/零食1.webp',21),(22,'../images/picturea/零食2.webp',22),(23,'../images/picturea/零食3.webp',23),(24,'../images/picturea/零食4.webp',24),(25,'../images/picturea/零食5.webp',25),(26,'../images/ad1.jpg',0),(27,'../images/ad2.jpg',0),(28,'../images/ad3.jpg',0),(29,'../images/ad4.jpg',0),(30,'localImg/QQ图片20190927215439.jpg',81);
/*!40000 ALTER TABLE `good_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderitem`
--

DROP TABLE IF EXISTS `orderitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderitem` (
  `orderitem_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单项id',
  `orders_id` int(11) DEFAULT NULL COMMENT '订单id',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  `orderitem_number` int(11) DEFAULT NULL COMMENT '商品数量',
  PRIMARY KEY (`orderitem_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderitem`
--

LOCK TABLES `orderitem` WRITE;
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
INSERT INTO `orderitem` VALUES (1,1,3,4);
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `orders_number` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `orders_time` datetime DEFAULT NULL COMMENT '订单时间',
  `orders_total` decimal(20,2) DEFAULT NULL COMMENT '订单总价',
  `orders_state` varchar(10) DEFAULT NULL COMMENT '订单状态',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `orders_address` int(255) DEFAULT NULL COMMENT '收件地址id',
  PRIMARY KEY (`orders_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'dc1a653e8b8f41d9','2020-11-07 10:32:54',36796.00,'待发货',1,NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `property` (
  `prop_id` int(11) NOT NULL AUTO_INCREMENT,
  `prop_name` varchar(255) DEFAULT NULL COMMENT '商品属性名',
  `g_id` int(11) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`prop_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,'内存容量',3),(2,'硬盘容量',3),(3,'颜色分类',3),(4,'套餐类型',3),(5,'口味',23),(6,'包装',23);
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `review` (
  `review_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `review_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `review_reply` int(10) DEFAULT NULL COMMENT '回复id（评论id）',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  `review_date` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`review_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'满满一大箱子30袋…里面有核桃仁，葡萄干.腰果仁，蔓越莓干等等几种，分量不怎么多…就那么一点点。可以干吃还可以泡牛奶麦片一起吃！挺不错的！随身携带也挺方便的。放在包包里就好了。当零食也很好吃的，还不错吧！',NULL,1,23,'2020-10-10 20:25:20'),(2,'包装精美，良品铺子品牌质量就是有保证，打开是独立包装，很高大上，吃起来方便，另外腰果个头很大口感酥脆，很好吃，另外价钱真心实惠，且没有出现任何的坏果，质量有保证，快递也很迅速，包装到位上档次内含蓝莓干，提子干，开心果，蔓越莓干，榛子仁，核桃仁，腰果仁;科学搭配，营养丰富;新鲜十足，颗粒饱满，无碎果，无杂质，质量可靠;品种多，酸甜搭配，口感上乘;价格便宜，物超所值;果仁果干分离，新鲜不串味;包装结实，携带方便.',NULL,1,23,'2020-10-15 20:26:03'),(3,'买了好几种，良品是吃过最好吃的了。里面有蔓越莓干，核桃仁，开心果仁，南瓜子，碧根果仁，夏威夷果仁，腰果仁果实新鲜饱满酥脆。果干和果仁是分开的，吃的时候轻轻一撕就能混合在一起，果干新鲜，果仁酥脆，两者混合在一起，口感惊艳！！！',NULL,1,23,'2020-10-21 20:26:00'),(4,'\r\n每天一袋，营养搭配，有坚果和果干，坚果有腰果，核桃，开心果等，果干有蔓越莓和葡萄干等，都是很好吃的，7种美味搭配，有颜有料，出行携带也相当方便！！味道好，包装精美，价格实惠，非常划算！良品铺子经常买，品质保证，家里人都喜欢吃！零食就认良品铺子了！吃了停不下来，就怕长胖。',NULL,1,23,'2020-10-06 20:27:10'),(5,'我的暗影精灵6，已经到手整整10天啦，现在我使用的非常满意，很喜欢这一带新的外观，非常帅气，性能很强劲，散热非常棒，散热非常棒，散热非常棒，三遍哈，！！风扇有两档，平时他基本懒的动，很安静！这次惠普暗影精灵6，我非常喜欢！',NULL,1,3,'2020-10-22 21:55:48'),(6,'包装一如既往时尚大气，电脑非常精致，性价比很高，还送了暗影精灵游戏鼠标，笔记本很轻薄，简约大气',NULL,1,3,'2020-09-23 21:56:00'),(7,'运行速度：日常高性能跑分，轻松46万无压力，amdyes就行了<br>游戏效果：还没有测试，3a中等问题不大吧',NULL,1,3,'2020-10-07 21:56:45'),(8,'游戏效果：还没有测试，3a中等问题不大吧包装保护：原包装保护的挺好的\r\n跑分评测：几分忘了 但是记得显示击败全国百分九十以上的电脑',NULL,1,3,'2020-10-07 21:56:48');
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sizes`
--

DROP TABLE IF EXISTS `sizes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sizes` (
  `size_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '尺寸id',
  `prop_id` int(11) DEFAULT NULL COMMENT '属性id',
  `val_id` int(11) DEFAULT NULL COMMENT '值id',
  `cart_id` int(11) DEFAULT NULL,
  `orderitem_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`size_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sizes`
--

LOCK TABLES `sizes` WRITE;
/*!40000 ALTER TABLE `sizes` DISABLE KEYS */;
INSERT INTO `sizes` VALUES (1,1,2,1,1),(2,2,4,1,1),(3,3,9,1,1),(4,4,10,1,1);
/*!40000 ALTER TABLE `sizes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trace`
--

DROP TABLE IF EXISTS `trace`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trace` (
  `trace_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '足迹',
  `trace_date` datetime DEFAULT NULL COMMENT '浏览商品时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `good_id` int(11) DEFAULT NULL COMMENT '商品id',
  PRIMARY KEY (`trace_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trace`
--

LOCK TABLES `trace` WRITE;
/*!40000 ALTER TABLE `trace` DISABLE KEYS */;
/*!40000 ALTER TABLE `trace` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `user_nick` varchar(255) DEFAULT NULL COMMENT '用户网名',
  `user_password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `user_icon` varchar(255) DEFAULT '../images/leicon.jpg' COMMENT '用户头像',
  `user_birth` datetime DEFAULT NULL COMMENT '用户生日',
  `user_details` varchar(255) DEFAULT NULL COMMENT '用户详情',
  `user_phone` varchar(16) DEFAULT NULL COMMENT '用户联系方式',
  `user_adress` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `user_state` varchar(255) DEFAULT NULL COMMENT '用户状态',
  `user_mail` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'张三丰','吴彦祖','123','../images/leicon.jpg','1998-07-31 00:00:00','哈哈','18234343434','天津','1','wangyi@163.com'),(2,'freshmaan',NULL,'1234','../images/leicon.jpg','2020-11-06 10:04:16',NULL,'1',NULL,'1','673038225@qq.com'),(3,'freshmaan',NULL,'1234','../images/leicon.jpg','2020-11-06 14:41:05',NULL,'+8618247773390',NULL,'1','673038225@qq.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valuess`
--

DROP TABLE IF EXISTS `valuess`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `valuess` (
  `val_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '值id',
  `val_content` varchar(255) DEFAULT NULL COMMENT '属性值内容',
  `val_img` varchar(255) DEFAULT NULL COMMENT '值图片路径',
  `prop_id` int(11) DEFAULT NULL COMMENT '属性id',
  PRIMARY KEY (`val_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valuess`
--

LOCK TABLES `valuess` WRITE;
/*!40000 ALTER TABLE `valuess` DISABLE KEYS */;
INSERT INTO `valuess` VALUES (1,'8GB','',1),(2,'16GB',NULL,1),(3,'32GB',NULL,1),(4,'512GB固态硬盘',NULL,2),(5,'1T固态硬盘',NULL,2),(6,'1T机械硬盘+512固态',NULL,2),(7,'红色',NULL,3),(8,'蓝色',NULL,3),(9,'黑色',NULL,3),(10,'i5-10300H+GTX1650',NULL,4),(11,'i7-10870H+RTX2060',NULL,4),(12,'i7-10870H+RTX2070Mxq',NULL,4),(13,'i5-10300H+GTX1650Ti',NULL,NULL),(14,'原味',NULL,5),(15,'奶油',NULL,5),(16,'炭烧',NULL,5),(17,'咸香',NULL,5),(18,'手袋单人份',NULL,6),(19,'礼盒双人份',NULL,6),(20,'全家福礼包',NULL,6);
/*!40000 ALTER TABLE `valuess` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor` (
  `vendor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商家id',
  `vendor_name` varchar(255) NOT NULL COMMENT '商家名称',
  `vendor_address` varchar(255) NOT NULL COMMENT '商家地址',
  `vendor_phone` varchar(15) DEFAULT NULL COMMENT '商家联系方式',
  `vendor_password` varchar(255) NOT NULL COMMENT '商家密码',
  `vendor_describe` varchar(255) DEFAULT NULL COMMENT '商家描述',
  `vendor_banner` varchar(255) NOT NULL COMMENT '图片路径',
  `vendor_icon` varchar(255) DEFAULT NULL COMMENT '商家头像路径',
  `vendor_gnum` int(11) DEFAULT NULL COMMENT '商品种类数量',
  PRIMARY KEY (`vendor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-07 14:18:41
