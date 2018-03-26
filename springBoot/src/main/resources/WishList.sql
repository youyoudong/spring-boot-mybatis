CREATE TABLE `wish_list` (
    `id` VARCHAR (50) NOT NULL COMMENT '主键id',
    `name` VARCHAR (50) NOT NULL COMMENT '名称',
    `source` VARCHAR (50) NULL COMMENT '来源',
    `create_time` TIMESTAMP COMMENT '生成时间',
    `create_price` DOUBLE COMMENT '生成时的价格',
    `update_time` TIMESTAMP COMMENT '更新时间',
    `update_price` DOUBLE COMMENT '更新价格',
    `status` INTEGER COMMENT '状态0关闭1进行中2已完成',
    `is_delete` INTEGER COMMENT '是否有效0有效1已失效',
    `user_id` VARCHAR (50) NOT NULL COMMENT '用户id'
)
COMMENT = '愿望清单表'
COLLATE = 'utf8_bin'
ENGINE = InnoDB
;