drop table t_stock_opt;

/*==============================================================*/
/* table: t_stock_opt                                           */
/*==============================================================*/
create table t_stock_opt 
(
   stock_opt_id         bigint(16) auto_increment primary key not null	comment '库存操作id',
   stock_id             bigint(16)           not null					comment '库存id',
   supplier_id          bigint(16)										comment '供货商id',
   material_id          bigint(16)										comment '材料编码',
   opt_type             varchar(2)										comment '操作类型:01. 入库 02. 出库',
   count                bigint(16)										comment '操作数量',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人',
   remark               varchar(32)										comment '备注'
);

alter table `t_stock_opt`
comment = '单品库存操作记录表，序列seq_stock_opt';
