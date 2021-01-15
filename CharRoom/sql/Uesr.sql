-----------------------------------------------------
-- Export file for user OPTS                       --
-- Created by Administrator on 2021/1/15, 17:15:49 --
-----------------------------------------------------

set define off
spool Uesr.log

prompt
prompt Creating table USERS
prompt ====================
prompt
create table OPTS.USERS
(
  id       VARCHAR2(32) not null,
  username VARCHAR2(10) not null,
  password VARCHAR2(50) not null,
  ip       VARCHAR2(20),
  port     NUMBER(5)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table OPTS.USERS
  add primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );


spool off
