--liquibase formatted sql

--changeset kodality:message_table
create table message (
  id             serial not null,
  content        text not null
);
--rollback drop table if exists dummy_table;
