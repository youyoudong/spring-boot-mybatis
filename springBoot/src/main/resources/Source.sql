CREATE TABLE `source` (
    `id` VARCHAR (50) NOT NULL COMMENT '主键id',
    `name` VARCHAR (50) NOT NULL COMMENT '名称',
    `source_type` INTEGER COMMENT '来源类型',
    `status` INTEGER COMMENT '状态',
    `user_id` VARCHAR (50) NOT NULL COMMENT '关联用户'
)
COMMENT = '来源表'
COLLATE = 'utf8_bin'
ENGINE = InnoDB
;