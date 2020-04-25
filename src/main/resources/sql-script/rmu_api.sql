# Host: localhost  (Version 5.7.17-log)
# Date: 2020-04-26 01:02:29
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `S_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CITIZEN` varchar(13) DEFAULT NULL COMMENT 'รหัสบัตรประชาชน',
  `PREFIX` varchar(50) DEFAULT NULL COMMENT 'คำนำหน้า',
  `NAME` varchar(150) DEFAULT NULL COMMENT 'ชื่อ',
  `LNAME` varchar(150) DEFAULT NULL COMMENT 'สกุล',
  `NICK_NAME` varchar(100) DEFAULT NULL COMMENT 'ชื่อเล่น',
  `GENDER` varchar(10) DEFAULT NULL COMMENT 'เพศ',
  `PHONE` varchar(10) DEFAULT NULL COMMENT 'เบอรฺโทร',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT 'อีเมล์',
  `FACEBOOK` varchar(255) DEFAULT NULL COMMENT 'ชื่อเฟสบุ๊ค',
  `LINE` varchar(255) DEFAULT NULL COMMENT 'ไอดีไลน์',
  PRIMARY KEY (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1286 DEFAULT CHARSET=utf8 COMMENT='ตารางข้อมูลนักศึกษา ใช้สำหรับสอน';

#
# Data for table "student"
#

INSERT INTO `student` VALUES (1254,'/613170010225','นาย','พลวัฒน์','อัศวภูมิ','บอส','ชาย','0930755413','bos4877@gmail.com','phonlawat Assawapoom','123'),(1256,'613170010225','นาย','ภควัต','นามมุงคุณ','มาร์ค','ชาย','0951695242','pakawat40116@gmail.com','pakawat nammungkun','ckk0223'),(1262,'613170010117','นาย','ฉัตรดนัย','ภูครองพลอย','เคน','ชาย','0835103973','Kanenopert00@gmail.com','KaneChatdanai','Kane'),(1269,'613170010222','นาย','พรชัย','สุวรรณกูฏ','วาว','ชาย','0825415028','gta08654150282gmail.com','พรชัย สุวรรณกูฏ','0825415028'),(1270,'613170010123','นาย','พลวัฒน์','บุญหล้า','พอล','ชาย','097094xxxx','paulxxxx@gmail.com','ponlawat boonla','PaulAlan'),(1272,'603170010131','นาย','นฤเดช ','แสนพล','ตั๊ก','','0610432144','Photophoto1997@gmail.com','Narudet sanpon',''),(1274,'613170010103','นางสาว','จีรนันท์','สนิทประโคน','กุ้ง','หญิง','0621738011','่jeeranan3584@gmail.com','Kung Jeeranan','123'),(1277,'123','นางสาว','บัม','เบิลบี','บี','หญิง','0822','@gmail.com','bumblebee','bee'),(1278,'583170010223','เบีย','เบีย','เบีย','เบีย','','','','',''),(1279,'dcvdf','df','df','er','er','er','er','er','er',''),(1280,'ttt','ttt','ttt','ttt','ttt','ttt','tt','tt','tt','tt'),(1281,'กูจำบ่ได้แล้ว','ว่ากูกับเขา','คบกันวันแรกเป็นวันอาทิตย์','แต่กูเลือกคนผิด','','','','เค้าทำหัวใจกูพังเพ','',''),(1282,'กอดเสาเถียง','เพื่อนเอ๋ย','กูมีเรื่องจะปรึกษา','เรื่องมีอยู่ว่า','','','','แฟนเก่า','มาขอคืนดี',''),(1283,'1461300451867','string','string','slgj','string','NOOOO','string','sldfkjsdf@sdijfd.vom','eiei','string'),(1285,'1112233336548','string','UPDATE','slgj','string','NOOOO','string','sldfkjsdf@sdijfd.vom','eiei','string');
