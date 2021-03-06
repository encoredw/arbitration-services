/**token 认证信息表**/
CREATE TABLE t_authentication(
  ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
  ORGANIZATION_CODE varchar(30) DEFAULT NULL COMMENT '企业统一社会信用代码证',
  COMPANY_NAME varchar(100) DEFAULT NULL COMMENT '企业名称',
  SID VARCHAR(255) NOT NULL COMMENT '企业系统编号',
  PASSWORD VARCHAR(255) NOT NULL COMMENT '企业系统登陆密码'
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/**token 存放表**/
CREATE TABLE t_arb_token (
id int NOT NULL AUTO_INCREMENT COMMENT '主键',
auth_id int NULL COMMENT '认证用户ID',
auth_token char NULL COMMENT '认证用户有效token',
auth_token_expir_time timestamp NULL COMMENT'token过期时间',
cratetime timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/**借款人合同**/
CREATE TABLE t_notarial_Certificate_Sum (

id int NOT NULL AUTO_INCREMENT COMMENT '主键',

businessCode01 varchar(255) NOT NULL COMMENT '第三方业务编号1',

businessCode02 varchar(255) NOT NULL COMMENT '第三方业务编号2',

businessCode03 varchar(255) NOT NULL COMMENT '第三方业务编号3',

borrowerName varchar(255) NOT NULL COMMENT '借款人姓名',

borrowerGender varchar(255) NOT NULL COMMENT '借款人性别0：男1：女',

borrowerBirthday varchar(255) NOT NULL COMMENT '借款人出生年月，格式：yyyyMMdd',

borrowerEnName varchar(255) NULL COMMENT '借款人英文名称',

borrowerCardType varchar(255) NULL COMMENT '借款人证件类型（‘0’代表身份证）',

borrowerCardPeriod date NULL COMMENT '借款人证件有效期 格式：yyyyMMdd',

borrowerCardNo varchar(255) NULL COMMENT '借款人证件号码',

borrowerMobile varchar(255) NULL COMMENT '借款人手机号',

borrowerBank varchar(255) NULL COMMENT '借款人绑定卡开户行',

borrowerBankCardNo varchar(255) NULL COMMENT '借款人绑定卡卡号',

borrowerAddress varchar(255) NULL COMMENT '借款人联系地址',

borrowerPostCode varchar(255) NULL COMMENT '借款人邮编',

borrowerEmail varchar(255) NULL COMMENT '借款人电子邮箱',

contractSignTime date NULL COMMENT '借款合同签订时间，格式：yyyyMMdd',

borrowDeadLine int NULL COMMENT '借款期限，只传数字即可',

borrowDeadLineUnit varchar(255) NULL COMMENT '借款期限单位 0：年、1：月、2：日',

borrowStartTime date NULL COMMENT '借款开始时间，格式：yyyyMMdd',

borrowEndTime date NULL COMMENT '借款截至时间，格式：yyyyMMdd',

borrowRate float NULL COMMENT '借款合同利率，单位：%，只传数字即可',

productName varchar(255) NULL COMMENT '产品名称',

lenderActualOrganizationName varchar(255) NULL COMMENT '放款机构',

lenderActualOrganizationCode varchar(255) NULL COMMENT '放款机构统一社会信用代码证',

contractAmount float NULL COMMENT '合同金额',

repaymentType varchar(255) NULL COMMENT '还款方式 0：等额本息 1：先息后本 ',

updatetime timestamp NULL,

createtime timestamp NULL,

PRIMARY KEY (id)

)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;



CREATE TABLE t_lender_info (

id int NOT NULL AUTO_INCREMENT,

lenderType char NULL COMMENT '出借人类型 0：自然人 1：企业',

lenderName varchar(255) NULL COMMENT 'lenderName',

lenderGender char NULL COMMENT '出借人性别，0：男，1：女 ',

lenderBirthday date NULL COMMENT '出借人出生年月，格式：yyyyMMdd',

lenderCardType char NULL COMMENT '出借人证件类型（数字，‘0’代表身份证）',

lenderCardNo varchar(255) NULL COMMENT '出借人证件号码',

lenderMobile varchar(255) NULL COMMENT '出借人手机号',

lenderBankEmail varchar(255) NULL COMMENT '出借人电子邮箱',

lenderOrganizationName varchar(255) NULL COMMENT '出借企业全称',

lenderOrganizationCode varchar(255) NULL COMMENT '出借企业统一社会信用代码证',

lenderOrganizationAdd varchar(255) NULL COMMENT '出借企业联系地址',

lenderOrganizationContact varchar(255) NULL COMMENT '出借企业联系人',

lenderOrganizationEmail varchar(255) NULL COMMENT '出借企业邮箱',

lenderLegalName varchar(255) NULL COMMENT '法人姓名',

lenderLegalCardType varchar(255) NULL COMMENT '法人证件类型 （数字，‘0’代表身份证）',

lenderLegalCardNo varchar(255) NULL COMMENT '法人证件号码',

lenderBank varchar(255) NULL COMMENT '出借人绑定卡开户行',

lenderBankCardNo varchar(255) NULL COMMENT '出借人绑定卡卡号',

updatetime timestamp NULL,

cratetime timestamp NULL,

PRIMARY KEY (id)

)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;



CREATE TABLE t_contractInitData (

id int NOT NULL AUTO_INCREMENT COMMENT '主键',

type varchar(255) NULL COMMENT '业务区分',

sign varchar(255) NULL,

fileBody longblob NULL,

fileBodyMd5 varchar(255) NULL,

fileBodyHash varchar(255) NULL,

notarialCertificateApplicatSumJson int NULL,

lenderInfos int NULL,

updatetime timestamp NULL,

createtime timestamp NULL,

PRIMARY KEY (id)

)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/** 放款流水表 **/
DROP TABLE IF EXISTS `t_loan_statement`;
CREATE TABLE `t_loan_statement` (
	`ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
	`ACCOUNT_STATEMENT_CODE` varchar(30) NOT NULL COMMENT '业务交易流水号',
	`ACCOUNT_STATEMENT_RETURN` varchar(30) NOT NULL COMMENT '银行流水号',
	`LENDER_ACCOUNT_NO` varchar(30) NOT NULL COMMENT '放款账户',
	`LENDER_BANK` varchar(50) NOT NULL COMMENT '放款银行',
	`RECEIVE_ACCOUNT_NO` varchar(30) NOT NULL COMMENT '到款账户',
	`STATEMENT_AMOUNT` decimal(11,2) DEFAULT '0.00' COMMENT '金额',
	`TRADE_DATE` date DEFAULT NULL COMMENT '交易日期',
	`BUSINESS_CODE01` varchar(30) DEFAULT '' COMMENT '业务编号01',
  `BUSINESS_CODE02` varchar(30) DEFAULT NULL COMMENT '业务编号02',
  `BUSINESS_CODE03` varchar(30) DEFAULT NULL COMMENT '业务编号03',
	`IMPORT_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '导入时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/** 还款流水表 **/
DROP TABLE IF EXISTS `t_repayment_statement`;
CREATE TABLE `t_repayment_statement` (
	`ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
	`ACCOUNT_STATEMENT_CODE` varchar(30) NOT NULL COMMENT '业务交易流水号',
	`REPAYMENT_SERIAL_NUMBER` varchar(30) NOT NULL COMMENT '还款银行流水号',
	`REPAY_ACCOUNT_NO` varchar(30) NOT NULL COMMENT '还款账户',
	`REPAYMENT_BANK` varchar(100) NOT NULL COMMENT '还款银行',
	`RECEIVE_ACCOUNT_NO` varchar(30) NOT NULL COMMENT '到款账户',
	`REPAYMENT_AMOUNT` decimal(11,2) DEFAULT '0.00' COMMENT '还款金额',
	`REPAYMENT_TIME` date DEFAULT NULL COMMENT '还款时间',
	`BUSINESS_CODE01` varchar(30) DEFAULT '' COMMENT '业务编号01',
  `BUSINESS_CODE02` varchar(30) DEFAULT NULL COMMENT '业务编号02',
  `BUSINESS_CODE03` varchar(30) DEFAULT NULL COMMENT '业务编号03',
	`IMPORT_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '导入时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/** 网络仲裁案件收费标准**/
DROP TABLE IF EXISTS `t_arbitration_fee_std`;
CREATE TABLE `t_arbitration_fee_std` (
`ID` int NOT NULL AUTO_INCREMENT COMMENT '主键',
`OWE_AMOUNT` decimal(11,2) NOT NULL COMMENT '争议金额（单位：元，“1元”为1.00）',
`ARBITRATION_FEE` decimal(11,2) NOT NULL COMMENT '仲裁收费',
`ARB_PASSAGE_FEE` decimal(11,2) NOT NULL COMMENT '仲裁通道费',
`SMS_FEE` decimal(3,2) NOT NULL COMMENT '短息服务费',
`PRE_ENFORCE_CONS_FEE` decimal(11,2) NOT NULL COMMENT '执行前期咨询费用',
`ENFORCE_FEE` decimal(3,2) NOT NULL COMMENT '执行后期收费,百分比转为小数',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table structure for t_arbitration_user
-- ----------------------------
DROP TABLE IF EXISTS `t_arbitration_user`;
CREATE TABLE `t_arbitration_user` (
  `USER_ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `ORGANIZATION_CODE` varchar(30) DEFAULT NULL COMMENT '企业统一社会信用代码证',
  `IS_USED` int(11) NOT NULL DEFAULT '1' COMMENT '启用区分 0-禁用 1-启用',
  `USER_CODE` varchar(11) NOT NULL COMMENT '用户编码',
  `MOBILE_NUMBER` varchar(11) NOT NULL COMMENT '用户手机号',
  `USER_NAME` varchar(100) NOT NULL COMMENT '真实姓名',
  `PASSWORD` varchar(100) NOT NULL COMMENT '用户密码',
  `ID_NUMBER` varchar(18) NOT NULL COMMENT '身份证号码',
  `DEPARTMENT_CODE` varchar(20) DEFAULT NULL COMMENT '所属部门编码',
  `POSITION_DESC` varchar(20) DEFAULT NULL COMMENT '职位',
  `ROLE_CODE` varchar(11) DEFAULT '' COMMENT '角色编码 0-仲裁委管理员 1-仲裁员 2-仲裁秘书',
  `CREATE_USER` varchar(50) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '修改人',
  `UPDATE_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

-- Table structure for t_net_fin_user
-- ----------------------------
DROP TABLE IF EXISTS `t_net_fin_user`;
CREATE TABLE `t_net_fin_user` (
  `USER_ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `ORGANIZATION_CODE` varchar(30) DEFAULT NULL COMMENT '企业统一社会信用代码证',
  `IS_USED` int(11) NOT NULL DEFAULT '1' COMMENT '启用区分 0-禁用 1-启用',
  `USER_CODE` varchar(11) NOT NULL COMMENT '用户编码',
  `MOBILE_NUMBER` varchar(11) NOT NULL COMMENT '用户手机号',
  `USER_NAME` varchar(100) NOT NULL COMMENT '真实姓名',
  `PASSWORD` varchar(100) NOT NULL COMMENT '用户密码',
  `ID_NUMBER` varchar(18) NOT NULL COMMENT '身份证号码',
  `DEPARTMENT_CODE` varchar(20) DEFAULT NULL COMMENT '所属部门编码',
  `POSITION_DESC` varchar(20) DEFAULT NULL COMMENT '职位',
  `ROLE_CODE` varchar(11) DEFAULT '' COMMENT '角色编码 0-互金公司管理员 1-互金公司管理层 2-互金公司普通职员',
  `CREATE_USER` varchar(50) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_USER` varchar(50) DEFAULT NULL COMMENT '修改人',
  `UPDATE_TIME` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

