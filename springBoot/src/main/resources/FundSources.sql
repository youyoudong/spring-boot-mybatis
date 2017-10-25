CREATE TABLE `fund_sources` (
	`id` VARCHAR(50) NOT NULL COMMENT 'id' COLLATE 'utf8_bin',
	`source_name` VARCHAR(50) NULL DEFAULT NULL COMMENT '来源名称' COLLATE 'utf8_bin',
	`init_money` DOUBLE NULL DEFAULT NULL COMMENT '初始金额',
	`currnet_money` DOUBLE NULL DEFAULT NULL COMMENT '当前金额',
	`update_date` DATE NULL DEFAULT NULL COMMENT '更新时间'
)
COMMENT='资金来源表'
COLLATE='utf8_bin'
ENGINE=InnoDB
;
