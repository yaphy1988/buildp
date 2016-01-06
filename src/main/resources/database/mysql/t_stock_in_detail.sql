drop table t_stock_in_detail;

/*==============================================================*/
/* table: t_stock_in_detail                                     */
/*==============================================================*/
create table t_stock_in_detail 
(
   detail_id            bigint(16) auto_increment primary key not null	comment '详情id',
   stock_opt_id         bigint(16)										comment '库存量操作记录id',
   stock_id             bigint(16)           not null					comment '库存id',
   opt_type             varchar(2)										comment '操作类型',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人'
);

alter table `t_stock_in_detail`
comment = '单品进货详细,序列seq_stock_in_detail';