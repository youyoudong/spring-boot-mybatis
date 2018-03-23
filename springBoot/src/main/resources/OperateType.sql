CREATE TABLE `operate_type` (
	`id` VARCHAR(50) NOT NULL COMMENT '主键id',
	`user_id` VARCHAR(50) NULL COMMENT '操作人id',
	`operate_date` DATE NULL COMMENT '操作时间',
	`table_name` VARCHAR(50) NULL COMMENT '表名',
	`operate_type` VARCHAR(50) NULL COMMENT '操作类型',
	`remark` VARCHAR(500) NULL COMMENT '备注',
	`status` INTEGER NULL COMMENT '状态0正常1删除'
)
COMMENT='操作日志表'
COLLATE='utf8_bin'
ENGINE=InnoDB
;