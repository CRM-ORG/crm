/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-12-08 17:50:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for access
-- ----------------------------
DROP TABLE IF EXISTS `access`;
CREATE TABLE `access` (
  `id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `urls` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  `created_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of access
-- ----------------------------

-- ----------------------------
-- Table structure for building_ring
-- ----------------------------
DROP TABLE IF EXISTS `building_ring`;
CREATE TABLE `building_ring` (
  `ring_id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '工作圈表',
  `content` text,
  PRIMARY KEY (`ring_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of building_ring
-- ----------------------------

-- ----------------------------
-- Table structure for chance
-- ----------------------------
DROP TABLE IF EXISTS `chance`;
CREATE TABLE `chance` (
  `chance_id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '销售机会id',
  `emp_id` bigint(10) DEFAULT NULL COMMENT '员工id',
  `customer_id` bigint(10) DEFAULT NULL COMMENT '客户id',
  `product_id` bigint(10) DEFAULT NULL COMMENT '产品id',
  `chance_status` varchar(8) DEFAULT NULL COMMENT '销售机会状态',
  `chance_name` varchar(60) DEFAULT NULL COMMENT '销售机会名称',
  `gmt_create` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '销售机会id',
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '销售机会修改时间',
  PRIMARY KEY (`chance_id`),
  UNIQUE KEY `uk_emp` (`emp_id`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chance
-- ----------------------------

-- ----------------------------
-- Table structure for cont
-- ----------------------------
DROP TABLE IF EXISTS `cont`;
CREATE TABLE `cont` (
  `cont_id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '合同id',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `emp_id` bigint(10) DEFAULT NULL COMMENT '员工id',
  `cont_name` varchar(0) DEFAULT NULL COMMENT '合同名称',
  `theme` varchar(0) DEFAULT NULL COMMENT '合同主题',
  `cont_status` varchar(8) DEFAULT NULL,
  `transaction_money` decimal(10,0) DEFAULT NULL COMMENT '销售金额',
  `gmt_create` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '合同创建时间',
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '合同修改时间',
  PRIMARY KEY (`cont_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cont
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `customer_name` varchar(15) DEFAULT NULL COMMENT '客户名称',
  `customer_mobile` varchar(13) DEFAULT NULL COMMENT '客户手机号码',
  `gmt_create` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '客户创建时间',
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '客户修改时间',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `emp_id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `emp_name` varchar(15) DEFAULT NULL COMMENT '员工姓名',
  `emp_password` varchar(15) DEFAULT NULL COMMENT '员工密码',
  `emp_email` varchar(18) DEFAULT NULL COMMENT '员工邮箱',
  `emp_moblie` varchar(13) DEFAULT NULL COMMENT '员工手机号码',
  `last_login` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '员工最后一次登录时间',
  `gmt_create` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '员工创建时间',
  `gmt_update` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '员工修改时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否删除',
  `real_name` varchar(15) DEFAULT NULL COMMENT '登录名称',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别',
  `adress` varchar(255) DEFAULT NULL COMMENT '地址',
  `native_place` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(25) DEFAULT NULL,
  `product_describe` varchar(25) DEFAULT NULL,
  `product_type` varchar(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '总经理');
INSERT INTO `role` VALUES ('2', '销售');
INSERT INTO `role` VALUES ('3', '客服');

-- ----------------------------
-- Table structure for role_access
-- ----------------------------
DROP TABLE IF EXISTS `role_access`;
CREATE TABLE `role_access` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `access_id` int(11) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_access
-- ----------------------------

-- ----------------------------
-- Table structure for role_employee
-- ----------------------------
DROP TABLE IF EXISTS `role_employee`;
CREATE TABLE `role_employee` (
  `emp_id` bigint(10) DEFAULT NULL,
  `role_id` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_employee
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
