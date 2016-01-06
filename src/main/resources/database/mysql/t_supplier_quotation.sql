drop table t_supplier_quotation;

/*==============================================================*/
/* table: t_supplier_quotation                                  */
/*==============================================================*/
create table t_supplier_quotation 
(
   quotation_id         bigint(16) auto_increment primary key not null	comment '报价合同id',
   project_id           varchar(32)										comment '项目id',
   quotation_batch      bigint(16)										comment '报价批次',
   supplier_id          bigint(16)										comment '供应商id',
   material_id          bigint(16)										comment '材料id',
   unit_price           bigint(16)										comment '单位价格',
   amount               bigint(8)										comment '数量',
   measure_code         varchar(8)										comment '度量单位',
   total_price          bigint(16)										comment '总价',
   create_time          datetime										comment '创建时间',
   create_user          bigint(16)										comment '创建人',
   update_time          datetime										comment '更新时间',
   update_user          bigint(16)										comment '更新人'
);

alter table `t_supplier_quotation`
comment = 't_supplier_quotation-供货商报价单';
