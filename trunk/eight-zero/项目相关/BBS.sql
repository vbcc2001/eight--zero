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
   bphoto               varchar(100) default 'null.png',
   primary key (bid),
   unique key AK_Key_2 (boradName)
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
   topstatus            int,
   checkcount           int,
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
   sphoto               varchar(100) default 'null.png',
   primary key (sid),
   unique key AK_Key_2 (sonName)
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
    
/*alter table UserTable add constraint FK_Reference_10 foreign key (uid)
	references Userinfo (uid) on delete restrict on update restrict;*/

alter table outbox add constraint FK_Reference_3 foreign key (fromuid)
      references Userinfo (uid) on delete restrict on update restrict;

