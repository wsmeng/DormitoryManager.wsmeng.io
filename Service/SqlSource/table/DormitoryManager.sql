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
'����Ա��½ʱʹ�õ��˺�';

comment on column Administrator.Admin_Password is
'����Ա��¼ʱʹ�õ�����';

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
'¥Ⱥ������';

comment on column Buildings.Buildings_Desc is
'¥Ⱥ������';

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
'���������';

comment on column Dormitory.Dormitory_Type is
'�����������ѧ������';

comment on column Dormitory.Dormitory_No is
'������';

comment on column Dormitory.Domitory_Tel is
'����绰';

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
'��־���ɵ�����';

comment on column LOG_Body."Log_Content" is
'��־������';

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
'�ü�¼�����������';

comment on column "OutRecode"."OutRecode_Reson" is
'���ԭ��';

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
'ѧ����½����ϵͳʱʹ�õ��˺�';

comment on column "Student"."Student_State" is
'��ס��Ǩ��';

comment on column "Student"."Student_Class" is
'ѧ�������꼶';

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
'��ʦ�ڵ�½ϵͳʱ��ʹ�õ��˺�';

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

