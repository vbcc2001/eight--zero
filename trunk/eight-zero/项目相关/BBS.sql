/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2011-1-4 12:36:12                            */
/*==============================================================*/

drop database if exists EightZeroBBS;
create database EightZeroBBS;
use EightZeroBBS;
/*   mySQL修改库字符编码   */
alter database EightZeroBBS CHARACTER SET = utf8; 

drop table if exists Admin;

drop table if exists BoradTable;

drop table if exists Friend;

drop table if exists Grade;

drop table if exists MainTitle;

drop table if exists Replay;

drop table if exists SonBorad;

drop table if exists UserTable;

drop table if exists Userinfo;

drop table if exists outbox;

/*==============================================================*/
/* Table: Admin                                                 */
/*==============================================================*/
create table Admin
(
   aid                  int not null auto_increment,
   aname                varchar(20),
   apwd                 varchar(20),
   alasttime            datetime,
   aip                  varchar(20),
   alevel               int,
   primary key (aid)
);

/*==============================================================*/
/* Table: BoradTable                                            */
/*==============================================================*/
create table BoradTable
(
   bid                  int not null auto_increment,
   boradName            varchar(30),
   bphoto               varchar(100),
   primary key (bid)
);

/*==============================================================*/
/* Table: Friend                                                */
/*==============================================================*/
create table Friend
(
   friendid             int not null auto_increment,
   fuid                 int not null,
   uid                  int not null,
   primary key (friendid)
);

/*==============================================================*/
/* Table: Grade                                                 */
/*==============================================================*/
create table Grade
(
   gid                  int not null auto_increment,
   gradeName            varchar(20),
   onlineTimelow        int,
   ontlineTimehigh      int,
   primary key (gid)
);

/*==============================================================*/
/* Table: MainTitle                                             */
/*==============================================================*/
create table MainTitle
(
   mid                  int not null auto_increment,
   mtitle               varchar(50),
   mcontent             varchar(500),
   mtime                datetime,
   muid                 int,
   mThing               varchar(100),
   sid                  int,
   mstatus              int,
   primary key (mid)
);

/*==============================================================*/
/* Table: Replay                                                */
/*==============================================================*/
create table Replay
(
   rid                  int not null auto_increment,
   rcontent             varchar(500),
   Mid                  int,
   rtime                datetime,
   ruid                 int,
   rstatus              int,
   primary key (rid)
);

/*==============================================================*/
/* Table: SonBorad                                              */
/*==============================================================*/
create table SonBorad
(
   sid                  int not null auto_increment,
   sonName              varchar(30),
   Bid                  int,
   sphoto               varchar(100),
   primary key (sid)
);

/*==============================================================*/
/* Table: UserTable                                             */
/*==============================================================*/
create table UserTable
(
   uid                  int not null auto_increment,
   uname                varchar(20),
   upwd                 varchar(20),
   uemail               varchar(30),
   sex                  int,
   RegTime              date,
   ustatus              int,
   primary key (uid)
);

/*==============================================================*/
/* Table: Userinfo                                              */
/*==============================================================*/
create table Userinfo
(
   uid                  int not null,
   nickname             varchar(20),
   signature            varchar(100),
   addr                 varchar(30),
   tel                  varchar(11),
   uphoto               varchar(100),
   uhobby               varchar(200),
   uscore               int,
   BBScurrency          int,
   onlineTime           int,
   onlineStatus         int,
   ulevel               int,
   primary key (uid)
);

/*==============================================================*/
/* Table: outbox                                                */
/*==============================================================*/
create table outbox
(
   outboxid             int not null auto_increment,
   fromuid              int,
   otitle               varchar(80),
   sendtime             datetime,
   ocontent             varchar(500),
   touid                int,
   readStatus           int,
   sendThing            varchar(100),
   fromuidDel           int,
   touidDel             int,
   primary key (outboxid)
);

alter table Friend add constraint FK_Reference_9 foreign key (uid)
      references Userinfo (uid) on delete restrict on update restrict;

alter table MainTitle add constraint FK_Reference_5 foreign key (sid)
      references SonBorad (sid) on delete restrict on update restrict;

alter table MainTitle add constraint FK_Reference_6 foreign key (muid)
      references Userinfo (uid) on delete restrict on update restrict;

alter table Replay add constraint FK_Reference_7 foreign key (Mid)
      references MainTitle (mid) on delete restrict on update restrict;

alter table Replay add constraint FK_Reference_8 foreign key (ruid)
      references Userinfo (uid) on delete restrict on update restrict;

alter table SonBorad add constraint FK_Reference_4 foreign key (Bid)
      references BoradTable (bid) on delete restrict on update restrict;

alter table Userinfo add constraint FK_Reference_1 foreign key (uid)
      references UserTable (uid) on delete restrict on update restrict;

alter table outbox add constraint FK_Reference_3 foreign key (fromuid)
      references Userinfo (uid) on delete restrict on update restrict;

/*   mySQL修改表字符编码  */
/*   alter table Replay CONVERT TO CHARACTER SET utf8;  */

/*  超级管理员表;  */

INSERT INTO `admin` VALUES (NULL , 'admin', 'admin', '2011-01-01 10:07:44', NULL , NULL );
INSERT INTO `admin` VALUES (NULL , 'usermg', 'usermg', '2011-01-01 10:07:44', NULL , NULL);

/*用户表*/

INSERT INTO `usertable` VALUES (NULL, 'xiaochang', '123456', '1682235@163.com', 1, '2011-01-04', 1);
INSERT INTO `usertable` VALUES (NULL, 'liubo', '123456', '1682235@163.com', 1, '2011-01-04', 1);
INSERT INTO `usertable` VALUES (NULL, 'xiaoyang', '123456', '1682235@163.com', 1, '2011-01-04', 1);
INSERT INTO `usertable` VALUES (NULL, 'laomen', '123456', '1682235@163.com', 1, '2011-01-04', 1);
INSERT INTO `usertable` VALUES (NULL, 'xiaoli', '123456', '1682235@163.com', 1, '2011-01-04', 1);

/*用户信息表*/

INSERT INTO `userinfo` VALUES (1, '刘晓昌', '身体健康', '深圳', '13630182480', NULL, 'IT软件', 288, 200, 100, 0, 1);
INSERT INTO `userinfo` VALUES (2, '刘波', '身体健康', '深圳', '13445123564', NULL, 'IT软件', 288, 200, 100, 0, 1);
INSERT INTO `userinfo` VALUES (3, '杨新辉', '身体健康', '深圳', '13445123564', NULL, 'IT软件', 288, 200, 100, 0, 1);
INSERT INTO `userinfo` VALUES (4, '老门', '身体健康', '深圳', '13445123564', NULL, 'IT软件', 288, 200, 100, 0, 1);
INSERT INTO `userinfo` VALUES (5, '李广继', '身体健康', '深圳', '13445123564', NULL, 'IT软件', 288, 200, 100, 0, 1);

/*好友表*/

INSERT INTO `friend` VALUES (NULL , '2', '1'), (NULL , '1', '3'),(NULL , '4', '1'), (NULL , '5', '1'), (NULL , '5', '3');

/*发件箱*/

INSERT INTO `outbox` VALUES (NULL , 1, '第一封', '2011-01-28 10:35:11', '第一封从LXC发到小杨', 3, 0, NULL , 1, 0);
INSERT INTO `outbox` VALUES (NULL , 1, '第二封', '2011-01-28 10:35:11', '第二封从LXC发到小杨', 3, 0, NULL , 1, 0);
INSERT INTO `outbox` VALUES (NULL , 1, '第三封', '2011-01-28 10:35:11', '第三封从LXC发到刘波', 2, 1, NULL , 1, 1);
INSERT INTO `outbox` VALUES (NULL , 2, '第一封', '2011-01-28 10:35:11', '第一封从刘波发到老门', 4, 1, NULL , 0, 0);
INSERT INTO `outbox` VALUES (NULL , 2, '第二封', '2011-01-28 10:35:11', '第二封从刘波发到李广继', 5, 1, NULL , 0, 1);
INSERT INTO `outbox` VALUES (NULL , 3, '第一封', '2011-01-28 10:35:11', '第一封从小杨发到李广继', 5, 1, NULL , 0, 1);
INSERT INTO `outbox` VALUES (NULL , 5, '第一封', '2011-01-28 10:35:11', '第一封从李广继发到老门', 4, 1, NULL , 0, 1);

/*等级表*/

INSERT INTO `grade` VALUES (NULL , '小兵', 0, 10), (NULL , '中兵', 11, 20),(NULL , '老兵', 21, 30);

/*大板块表*/

INSERT INTO `boradtable` VALUES (NULL , '电影',NULL),(NULL , '娱乐',NULL),(NULL , '生活',NULL),(NULL , '军事',NULL),(NULL , '奇人奇事',NULL);

/*小板块表*/

INSERT INTO `sonborad` VALUES (NULL , '非2', 1,NULL), (NULL , '盗梦空间', 1,NULL);
INSERT INTO `sonborad` VALUES (NULL , '陈奕迅', 2,NULL), (NULL , '罗志祥', 2,NULL);
INSERT INTO `sonborad` VALUES (NULL , '油价', 3,NULL), (NULL , '菜价', 3,NULL);

/*主题表*/

INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1);
INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1);
INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1);

INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1);
INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1);
INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1);

INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 1, NULL , 3, 1);
INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 2, NULL , 3, 1);
INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 2, NULL , 3, 1);

INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 3, NULL , 4, 1);
INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 3, NULL , 4, 1);
INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 4, NULL , 4, 1);

INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 2, NULL , 5, 1);
INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 2, NULL , 5, 1);
INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 4, NULL , 5, 1);

INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 4, NULL , 6, 1);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1);

/*回复表*/

INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 1, '2011-01-02 11:15:21', 4, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 2, '2011-01-02 11:15:21', 4, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 1, '2011-01-02 11:15:21', 2, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 3, '2011-01-02 11:15:21', 2, 1);

INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 4, '2011-01-02 11:15:21', 3, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 5, '2011-01-02 11:15:21', 3, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 4, '2011-01-02 11:15:21', 5, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 6, '2011-01-02 11:15:21', 5, 1);
INSERT INTO `replay` VALUES (NULL , '真的吗，很好看，我去看了！', 6, '2011-01-02 11:15:21', 5, 1);

INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌,听听一听，真的吗，很好听，我去听了！', 7, '2011-01-02 11:15:21', 2, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 7, '2011-01-02 11:15:21', 1, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 8, '2011-01-02 11:15:21', 5, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 8, '2011-01-02 11:15:21', 4, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 9, '2011-01-02 11:15:21', 3, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 9, '2011-01-02 11:15:21', 3, 1);
INSERT INTO `replay` VALUES (NULL , '陈奕迅的歌听听一听，真的吗，很好听，我去听了！', 8, '2011-01-02 11:15:21', 4, 1);
INSERT INTO `replay` VALUES (NULL , '罗志祥的歌听听一听，真的吗，很好听，我去听了！', 10, '2011-01-02 11:15:21', 1, 1);
INSERT INTO `replay` VALUES (NULL , '罗志祥的歌听听一听，真的吗，很好听，我去听了！', 10, '2011-01-02 11:15:21', 1, 1);
INSERT INTO `replay` VALUES (NULL , '罗志祥的歌听听一听，真的吗，很好听，我去听了！', 12, '2011-01-02 11:15:21', 1, 1);
INSERT INTO `replay` VALUES (NULL , '罗志祥的歌听听一听，真的吗，很好听，我去听了！', 12, '2011-01-02 11:15:21', 4, 1);

