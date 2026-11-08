DROP DATABASE IF EXISTS biblioteca;
CREATE DATABASE biblioteca;

DROP TABLE IF EXISTS item       CASCADE;
DROP TABLE IF EXISTS usuario    CASCADE;
DROP TABLE IF EXISTS emprestimo CASCADE;



CREATE TABLE item
(
  id         BIGINT  GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  codigo     TEXT    NOT NULL,
  titulo     TEXT    NOT NULL,
  tipo       TEXT    NOT NULL,
  autor      TEXT    NOT NULL,
  edicao     INT     NOT NULL,
  disponivel BOOLEAN NOT NULL DEFAULT TRUE,

  CONSTRAINT ck_tipo_item
    CHECK (tipo IN ('DVD', 'LIVRO', 'REVISTA', 'TESE'))
);


CREATE TABLE usuario
(
  id           BIGINT  GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  nome         TEXT    NOT NULL,
  tipo         TEXT    NOT NULL,
  limite_itens INT     NOT NULL,

  CONSTRAINT ck_tipo_usuario
    CHECK (tipo IN ('ALUNO_GRADUACAO', 'ALUNO_POS_GRADUACAO', 'PROFESSOR'))
);


CREATE TABLE emprestimo
(
  id                      BIGINT    GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  item_id                 BIGINT    NOT NULL REFERENCES item (id),
  usuario_id              BIGINT    NOT NULL REFERENCES usuario (id),

  data_retirada           TIMESTAMP NOT NULL,
  data_devolucao_prevista TIMESTAMP NOT NULL,
  data_devolucao          TIMESTAMP,
  valor_multa             INT
);

