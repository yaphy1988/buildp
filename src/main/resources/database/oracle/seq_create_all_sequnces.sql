drop sequence SEQ_AUTH_PERMISSION;

create sequence SEQ_AUTH_PERMISSION
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_AUTH_ROLE;

create sequence SEQ_AUTH_ROLE
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_AUTH_USER;

create sequence SEQ_AUTH_USER
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_MATERIAL_INFO;

create sequence SEQ_MATERIAL_INFO
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_MATERIAL_TYPE;

create sequence SEQ_MATERIAL_TYPE
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_SUPPLIER_INFO;

create sequence SEQ_SUPPLIER_INFO
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;

drop sequence SEQ_SUPPLIER_QUOTATION;

create sequence SEQ_SUPPLIER_QUOTATION
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 -- 库存SEQ
 drop sequence SEQ_STOCK_IN_DETAIL;

create sequence SEQ_STOCK_IN_DETAIL
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 drop sequence SEQ_STOCK_INFO;

create sequence SEQ_STOCK_INFO
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 drop sequence SEQ_STOCK_OPT;

create sequence SEQ_STOCK_OPT
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 drop sequence SEQ_STOCK_OUT_DETAIL;

create sequence SEQ_STOCK_OUT_DETAIL
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 -- 项目工程
 
 drop sequence SEQ_PROJ_INFO;

create sequence SEQ_PROJ_INFO
increment by 1
start with 1
 maxvalue 9999999999999999
 minvalue 1
 cache 20;
 
 
