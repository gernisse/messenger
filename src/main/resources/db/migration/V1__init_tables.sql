/*==============================================================*/
/* Table: message                                               */
/*==============================================================*/
CREATE TABLE message (
                         id BIGSERIAL NOT NULL,
                         message VARCHAR NOT NULL,
                         author_id BIGSERIAL NOT NULL,
                         CONSTRAINT pk_message PRIMARY KEY (id)
);

COMMENT ON TABLE message is 'Сообщения';
COMMENT ON COLUMN message.id is 'Идентификатор сообщения';
COMMENT ON COLUMN message.message is 'Содержимое сообщения';
COMMENT ON COLUMN message.author_id is 'Идентификатор автора сообщения';

