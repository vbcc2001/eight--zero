alter table SonBorad drop foreign key FK_Reference_4;
drop table if exists SonBorad;
drop table if exists BoradTable;


/*==============================================================*/
/* Table: BoradTable                                            */
/*==============================================================*/
create table BoradTable
(
   bid                  int not null auto_increment,
   boradName            varchar(30) unique,
   bphoto               varchar(100)default 'null.png',
   primary key (bid)
);

/*==============================================================*/
/* Table: SonBorad                                              */
/*==============================================================*/
create table SonBorad
(
   sid                  int not null auto_increment,
   sonName              varchar(30) unique,
   Bid                  int,
   sphoto               varchar(100) default 'null.png',
   primary key (sid)
);

alter table SonBorad add constraint FK_Reference_4 foreign key (Bid)
      references BoradTable (bid) on delete restrict on update restrict;  
INSERT INTO `boradtable` VALUES (1 , '杂谈','zatan.png'),(2 , '娱乐','yule.png'),(3 , '生活','shenghuo.png'),(4 , '时尚','shishang.png'),(5 , '情感','qinggan.png');

INSERT INTO `sonborad` VALUES (NULL , '文化漫谈', 1,default), (NULL , '三军论坛', 1,default), (NULL , '大话教育', 1,default);

INSERT INTO `sonborad` VALUES (NULL , '娱乐八卦', 2,default), (NULL , '体育沙龙', 2,default), (NULL , '影行天下', 2,default), (NULL , '星座论坛', 2,default);

INSERT INTO `sonborad` VALUES (NULL , '休闲生活', 3,default), (NULL , '驴行天下', 3,default);

INSERT INTO `sonborad` VALUES (NULL , '时尚先锋', 4,default), (NULL , '美容护肤', 4,default), (NULL , '潮流服饰', 4,default), (NULL , '窈窕身姿', 4,default);



