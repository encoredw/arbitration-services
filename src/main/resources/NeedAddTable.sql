/**token 认证信息表**/
CREATE TABLE t_authentication(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
  type VARCHAR(255) NOT NULL COMMENT '业务区分',
  sid VARCHAR(255) NOT NULL COMMENT '第三方系统编号',
  password VARCHAR(255) NOT NULL COMMENT '第三方登陆密码'
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/**token 存放表**/
CREATE TABLE `t_arb_token` (
`id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`auth_id` int NULL COMMENT '认证用户ID',
`auth_token` char NULL COMMENT '认证用户有效token',
`auth_token_expir_time` timestamp NULL COMMENT'token过期时间',
`cratetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

