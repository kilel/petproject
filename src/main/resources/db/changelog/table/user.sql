--liquibase formatted sql

--changeset kilel:create_user_seq
create sequence seq_user_id;

--changeset kilel:create_user_data_table
create table user_data
(
  id   bigint       not null,
  name longnvarchar not null
)
