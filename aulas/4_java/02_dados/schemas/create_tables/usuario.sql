CREATE TABLE usuario (
    id                 BIGSERIAL PRIMARY KEY,
    nome               VARCHAR(120) NOT NULL,
    email              VARCHAR(180) NOT NULL UNIQUE,
    senha_hash         VARCHAR(72),
    papel              VARCHAR(20) NOT NULL DEFAULT 'LEITOR',
    provider           VARCHAR(20) NOT NULL DEFAULT 'LOCAL',
    provide_id         VARCHAR(120),
    avatar_url         TEXT,
    stripe_customer_id VARCHAR(60) UNIQUE,
    criado_em          TIMESTAMPTZ NOT NULL DEFAULT now(),

    CONSTRAINT ck_usuario_papel CHECK (papel IN ('LEITOR', 'EDITOR', 'ADMIN')),
    CONSTRAINT ck_usuario_provider CHECK (provider in ('LOCAL', 'GOOGLE'))
);
