/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100136
 Source Host           : localhost:3306
 Source Schema         : my_demo

 Target Server Type    : MySQL
 Target Server Version : 100136
 File Encoding         : 65001

 Date: 22/04/2020 11:07:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dm_user
-- ----------------------------
DROP TABLE IF EXISTS `dm_user`;
CREATE TABLE `dm_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dm_user
-- ----------------------------
BEGIN;
INSERT INTO `dm_user` VALUES (1, '张三', 'test@qq.com', '13456728913');
INSERT INTO `dm_user` VALUES (2, '李思', 'lisi@qq.com', '15251780978');
INSERT INTO `dm_user` VALUES (3, 'admin', 'admin@qq.com', '15251780970');
INSERT INTO `dm_user` VALUES (4, 'test', 'test@qq.com', '15251780971');
INSERT INTO `dm_user` VALUES (5, '王健林', 'wangjianlin@qq.com', '15251780972');
INSERT INTO `dm_user` VALUES (6, '马云', 'mayun@qq.com', '15251780973');
INSERT INTO `dm_user` VALUES (7, '王思聪', 'wangsicong@qq.com', '15251780974');
INSERT INTO `dm_user` VALUES (8, '刘强东', 'liuqiangdong@qq.com', '15251780975');
INSERT INTO `dm_user` VALUES (9, '任正非', 'renzhengfei@qq.com', '15251780976');
INSERT INTO `dm_user` VALUES (10, '马化腾', 'mahuateng@qq.com', '15251780977');
INSERT INTO `dm_user` VALUES (11, '沈腾', 'shenteng@qq.com', '15251780979');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
