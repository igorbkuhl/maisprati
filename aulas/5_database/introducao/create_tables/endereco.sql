CREATE TABLE endereco (
    id          BIGSERIAL PRIMARY KEY,
    usuario_id  BIGINT NOT NULL UNIQUE,
    cep         VARCHAR(9) NOT NULL,
    logradouro  VARCHAR(200),
    numero      VARCHAR(20),
    complemento VARCHAR(100),
    bairro      VARCHAR(120),
    cidade      VARCHAR(120),
    uf          CHAR(2),

    -- usuario_id deve ser encontrado na tabela usuario
    CONSTRAINT fk_endereco_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (id) ON DELETE CASCADE
);
