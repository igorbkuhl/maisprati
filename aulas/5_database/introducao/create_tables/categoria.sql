CREATE TABLE categoria (
    id        BIGSERIAL PRIMARY KEY,
    nome      VARCHAR(80) NOT NULL UNIQUE,
    slug      VARCHAR(80) NOT NULL UNIQUE,
    descricao VARCHAR(200)
);
