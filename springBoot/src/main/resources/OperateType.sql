CREATE TABLE `operate_type` (
	`id` VARCHAR(50) NOT NULL,
	`user_id` VARCHAR(50) NULL,
	`operate_date` DATE NULL,
	`table_name` VARCHAR(50) NULL,
	`operate_type` VARCHAR(50) NULL,
	`remark` VARCHAR(500) NULL
)
COMMENT='操作日志表'
COLLATE='utf8_bin'
ENGINE=InnoDB
;