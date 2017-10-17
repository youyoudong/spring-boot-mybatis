CREATE TABLE `bill` (
	`id` VARCHAR(50) NOT NULL COMMENT 'id',
	`name` VARCHAR(50) NULL COMMENT '账单名称',
	`bill_money` DOUBLE NULL COMMENT '账单金额',
	`bill_date` DATE NULL COMMENT '账单时间',
	`bill_type_id` VARCHAR(50) NULL COMMENT '账单分类id',
	`user_id` VARCHAR(50) NULL COMMENT '用户id'
)
COMMENT='\r\nuser_id 用户id'
COLLATE='utf8_bin'
ENGINE=InnoDB
;