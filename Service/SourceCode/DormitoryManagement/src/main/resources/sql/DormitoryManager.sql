/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2017/6/6 15:54:02                            */
/*==============================================================*/


alter table "Dormitory"
   drop constraint FK_DORMITOR_REFERENCE_BUILDING;

alter table "Log"
   drop constraint FK_LOG_REFERENCE_STUDENT;

alter table "Log"
   drop constraint FK_LOG_REFERENCE_TEACHER;

alter table "OutRecode"
   drop constraint FK_OUTRECOD_REFERENCE_STUDENT;

alter table "Student"
   drop constraint FK_STUDENT_REFERENCE_DORMITOR;

alter table "TBManage"
   drop constraint FK_TBMANAGE_REFERENCE_DORMITOR;

alter table "TBManage"
   drop constraint FK_TBMANAGE_REFERENCE_TEACHER;

drop table "Admin" cascade constraints;

drop table "Buildings" cascade constraints;

drop table "Dormitory" cascade constraints;

drop table "Log" cascade constraints;

drop table "OutRecode" cascade constraints;

drop table "Student" cascade constraints;

drop table "TBManage" cascade constraints;

drop table TEACHER cascade constraints;

/*==============================================================*/
/* Table: Admin                                               */
/*==============================================================*/
create table Administrator 
(
   Admin_ID           INTEGER              NOT NULL,
   Admin_NO           VARCHAR2(20)         NOT NULL,
   Admin_Password     VARCHAR2(20)         NOT NULL,
   Admin_Name         VARCHAR2(20)         NOT NULL,
   Admin_Sex          INTEGER              NOT NULL,
   Admin_Tel          VARCHAR2(11)         NOT NULL,
   constraint PK_ADMINISTRATOR primary key (Admin_ID)
);

comment on column Administrator.Admin_NO is
'管理员登陆时使用的账号';

comment on column Administrator.Admin_Password is
'管理员登录时使用的密码';

/*==============================================================*/
/* Table: Buildings                                           */
/*==============================================================*/
create table Buildings 
(
   Buildings_ID       INTEGER              not null,
   Buildings_Name     VARCHAR2(20)         NOT NULL,
   Buildings_Desc     VARCHAR2(100)        NOT NULL,
   constraint PK_BUILDINGS primary key (Buildings_ID)
);

comment on column Buildings.Buildings_Name is
'楼群的名字';

comment on column Buildings.Buildings_Desc is
'楼群的描述';

/*==============================================================*/
/* Table: Dormitory                                           */
/*==============================================================*/
create table Dormitory 
(
   Dormitory_ID       INTEGER              not null,
   Buildings_ID       INTEGER              NOT NULL,
   Dormitory_Name     VARCHAR2(20)         NOT NULL,
   Dormitory_Type     INTEGER              NOT NULL,
   Dormitory_No       INTEGER              NOT NULL,
   Domitory_Tel       VARCHAR2(11)         NOT NULL,
   constraint PK_DORMITORY primary key (Dormitory_ID)
);

comment on column Dormitory.Dormitory_Name is
'宿舍的名字';

comment on column Dormitory.Dormitory_Type is
'教室宿舍或者学生宿舍';

comment on column Dormitory.Dormitory_No is
'宿舍编号';

comment on column Dormitory.Domitory_Tel is
'宿舍电话';

/*==============================================================*/
/* Table: Log                                                   */                                                 */
/*==============================================================*/
create table Log_Body 
(
   Log_ID             INTEGER              not null,
   Student_ID         INTEGER              NOT NULL,
   Teacher_ID         INTEGER              NOT NULL,
   Log_Date           DATE                 NOT NULL,
   Log_Content        VARCHAR2(255)        NOT NULL,
   constraint PK_LOG_BODY primary key (Log_ID)
);

comment on column LOG_Body."Log_Date" is
'日志生成的日期';

comment on column LOG_Body."Log_Content" is
'日志的内容';

/*==============================================================*/
/* Table: OutRecode                                           */
/*==============================================================*/
create table OutRecode 
(
   OutRecode_ID       INTEGER              not null,
   Student_ID         INTEGER              NOT NULL,
   OutRecode_Date     DATE                 NOT NULL,
   OutRecode_Reson    VARCHAR2(100)        NOT NULL,
   constraint PK_OUTRECODE primary key (OutRecode_ID)
);

comment on column "OutRecode"."OutRecode_Date" is
'该记录被记入的日期';

comment on column "OutRecode"."OutRecode_Reson" is
'外出原因';

/*==============================================================*/
/* Table: Student                                             */
/*==============================================================*/
create table Student 
(
   Student_ID         INTEGER              not null,
   Dormitory_ID       INTEGER              NOT NULL,
   Student_No         VARCHAR2(20)         NOT NULL,
   Student_Password   VARCHAR2(20)         NOT NULL,
   Student_Name       VARCHAR2(20)         NOT NULL,
   Student_Sex        INTEGER              NOT NULL,
   Student_State      INTEGER              NOT NULL,
   Student_Class      VARCHAR2(20)         NOT NULL,
   constraint PK_STUDENT primary key (Student_ID)
);

comment on column "Student"."Student_No" is
'学生登陆管理系统时使用的账号';

comment on column "Student"."Student_State" is
'入住或迁出';

comment on column "Student"."Student_Class" is
'学生所在年级';

/*==============================================================*/
/* Table: "TBManage"                                            */
/*==============================================================*/
create table TBManage 
(
   TBManage_ID        INTEGER              not null,
   Dormitory_ID       INTEGER              NOT NULL,
   Teacher_ID         INTEGER              NOT NULL,
   constraint PK_TBMANAGE primary key (TBManage_ID)
);

/*==============================================================*/
/* Table: TEACHER                                               */
/*==============================================================*/
create table TEACHER 
(
   Teacher_ID         INTEGER              not null,
   Teacher_Name       VARCHAR2(20)         NOT NULL,
   Teacher_Password   VARCHAR2(20)         NOT NULL,
   Teacher_No         VARCHAR2(20)         NOT NULL,
   Teacher_Sex        INTEGER              NOT NULL,
   Teacher_Tel        VARCHAR2(20)         NOT NULL,
   constraint PK_TEACHER primary key (Teacher_ID)
);

comment on column TEACHER."Teacher_No" is
'老师在登陆系统时所使用的账号';

alter table Dormitory
   add constraint FK_DORMITOR_REFERENCE_BUILDING foreign key (Buildings_ID)
      references Buildings (Buildings_ID);

alter table Log_Body
   add constraint FK_LOG_REFERENCE_STUDENT foreign key (Student_ID)
      references Student (Student_ID);

alter table Log_Body
   add constraint FK_LOG_REFERENCE_TEACHER foreign key (Teacher_ID)
      references TEACHER (Teacher_ID);

alter table OutRecode
   add constraint FK_OUTRECOD_REFERENCE_STUDENT foreign key (Student_ID)
      references Student (Student_ID);

alter table Student
   add constraint FK_STUDENT_REFERENCE_DORMITOR foreign key (Dormitory_ID)
      references Dormitory (Dormitory_ID);

alter table TBManage
   add constraint FK_TBMANAGE_REFERENCE_DORMITOR foreign key (Dormitory_ID)
      references Dormitory (Dormitory_ID);

alter table TBManage
   add constraint FK_TBMANAGE_REFERENCE_TEACHER foreign key (Teacher_ID)
      references TEACHER (Teacher_ID);

