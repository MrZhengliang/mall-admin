/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : online-class

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-07-27 11:22:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `os_acc_acount`
-- ----------------------------
DROP TABLE IF EXISTS `os_acc_acount`;
CREATE TABLE `os_acc_acount` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(16) DEFAULT NULL COMMENT '密码',
  `nick_name` varchar(16) DEFAULT NULL COMMENT '昵称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT NULL,
  `state` int(2) DEFAULT NULL COMMENT '0：初始化；1：有效；2：禁用',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of os_acc_acount
-- ----------------------------
