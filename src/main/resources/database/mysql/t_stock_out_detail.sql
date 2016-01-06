drop table t_stock_out_detail;

/*==============================================================*/
/* table: t_stock_out_detail                                    */
/*==============================================================*/
create table t_stock_out_detail 
(
   detail_id            bigint(16) auto_increment primary key not null	comment '明细id',
   stock_opt_id         bigint(16)										comment '库存操作id',
   stock_id             bigint(16)           not null					comment '库存id',
   project_id           varchar(20)										comment '项目id',
   opt_type             varchar(2)										comment '操作类型： 01：库存调减 02：工程用料',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人'
);

alter table `t_stock_out_detail`
comment = '单品出库明细,序列seq_stock_out_detail';
