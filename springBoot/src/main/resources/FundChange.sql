CREATE TABLE `fund_change` (
	`id` VARCHAR(50) NOT NULL COMMENT 'id' COLLATE 'utf8_bin',
	`change_money` DOUBLE NULL DEFAULT NULL COMMENT '变更金额',
	`change_type` VARCHAR(50) NULL DEFAULT NULL COMMENT '变更类型0、支出1、收入' COLLATE 'utf8_bin',
	`change_date` DATE NULL DEFAULT NULL COMMENT '变更时间',
	`sources_id` VARCHAR(50) NULL DEFAULT NULL COMMENT '资金来源表关联id' COLLATE 'utf8_bin'
)
COMMENT='资金变更表'
COLLATE='utf8_bin'
ENGINE=InnoDB
;
