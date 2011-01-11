
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

INSERT INTO `boradtable` VALUES (1 , '杂谈','zatan.png'),(2 , '娱乐','yule.png'),(3 , '生活','shenghuo.png'),(4 , '时尚','shishang.png'),(5 , '情感','qinggan.png');

/*小板块表*/

INSERT INTO `sonborad` VALUES (NULL , '文化漫谈', 1,default), (NULL , '三军论坛', 1,default), (NULL , '大话教育', 1,default);

INSERT INTO `sonborad` VALUES (NULL , '娱乐八卦', 2,default), (NULL , '体育沙龙', 2,default), (NULL , '影行天下', 2,default), (NULL , '星座论坛', 2,default);

INSERT INTO `sonborad` VALUES (NULL , '休闲生活', 3,default), (NULL , '驴行天下', 3,default);

INSERT INTO `sonborad` VALUES (NULL , '时尚先锋', 4,default), (NULL , '美容护肤', 4,default), (NULL , '潮流服饰', 4,default), (NULL , '窈窕身姿', 4,default);



/*主题表*/

INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '非2好看不？', '非2不好看，很不好看，记得不去看', '2011-01-02 11:00:07', 1, NULL , 1, 1,0,0);

INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '盗梦空间好看不？', '盗梦空间好看，很好看，记得去看', '2011-01-02 11:00:07', 1, NULL , 2, 1,0,0);

INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 1, NULL , 3, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 2, NULL , 3, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '陈奕迅的歌好听不？', '陈奕迅的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 2, NULL , 3, 1,0,0);

INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 3, NULL , 4, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 3, NULL , 4, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '罗志祥的歌好听不？', '罗志祥的歌好听，很好听，记得去好听', '2011-01-02 11:00:07', 4, NULL , 4, 1,0,0);

INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 2, NULL , 5, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 2, NULL , 5, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '油价贵不？', '油价下降，下降，下降', '2011-01-02 11:00:07', 4, NULL , 5, 1,0,0);

INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 4, NULL , 6, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1,0,0);
INSERT INTO `maintitle` VALUES (NULL , '菜价贵不？', '菜价下降，下降，下降', '2011-01-02 11:00:07', 5, NULL , 6, 1,0,0);

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




