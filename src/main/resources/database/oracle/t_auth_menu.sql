drop table T_AUTH_MENU cascade constraints;

/*==============================================================*/
/* Table: T_AUTH_MENU                                           */
/*==============================================================*/
create table T_AUTH_MENU 
(
   MENU_ID              NUMBER(16)           not null,
   PARENT_MENU          NUMBER(16),
   MENU_NAME            VARCHAR2(64),
   MENU_URL             VARCHAR2(128),
   MENU_LEVEL           VARCHAR2(1),
   ORDER_NUM            NUMBER(16),
   REMARK               VARCHAR2(256),
   CREATE_TIME          DATE,
   constraint PK_T_AUTH_MENU primary key (MENU_ID)
);

comment on table T_AUTH_MENU is
'T_AUTH_MENU-系统菜单表';

comment on column T_AUTH_MENU.MENU_ID is
'菜单ID，开始时预定义';

comment on column T_AUTH_MENU.PARENT_MENU is
'父菜单ID';

comment on column T_AUTH_MENU.MENU_NAME is
'菜单名称';

comment on column T_AUTH_MENU.MENU_URL is
'菜单URL';

comment on column T_AUTH_MENU.MENU_LEAF is
'是否叶子菜单';

comment on column T_AUTH_MENU.ORDER_NUM is
'菜单排序';

comment on column T_AUTH_MENU.REMARK is
'备注';

comment on column T_AUTH_MENU.CREATE_TIME is
'创建时间';
