CREATE TABLE `bill_type` (
	`id` VARCHAR(50) NOT NULL COMMENT 'id',
	`name` VARCHAR(50) NULL COMMENT '账单分类名称',
	`parent_id` VARCHAR(50) NULL COMMENT '上级id'
)
COMMENT='账单分类表'
COLLATE='utf8_bin'
ENGINE=InnoDB
;
