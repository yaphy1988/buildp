drop table t_stock_info;

/*==============================================================*/
/* table: t_stock_info                                          */
/*==============================================================*/
create table t_stock_info 
(
   stock_id             bigint(16) auto_increment primary key not null	comment '库存id',
   material_id          bigint(16)           not null					comment '材料id',
   supplier_id          bigint(16)										comment '供货商id',
   count                int(10)											comment '实际库存数量',
   avail_count          int(10)											comment '可用库存数量',
   create_time          datetime										comment '创建时间',
   create_user          varchar(32)										comment '创建人',
   update_time          datetime										comment '更新时间',
   update_user          varchar(32)										comment '更新人'
);

alter table `t_stock_info`
comment = '材料单品库存量，序列seq_stock_info';

alter table `t_stock_info`
add unique (`material_id`);