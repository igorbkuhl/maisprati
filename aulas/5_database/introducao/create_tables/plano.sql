CREATE TABLE plano (
    id              BIGSERIAL PRIMARY KEY,
    nome            VARCHAR(60) NOT NULL,
    preco_centavos  INTEGER NOT NULL,
    intervalo       VARCHAR(10) NOT NULL,
    stripe_price_id VARCHAR(60) NOT NULL UNIQUE,
    ativo           BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT      ck_plano_intervalo CHECK (intervalo IN ('MONTH', 'YEAR')),
    CONSTRAINT      ck_plano_preco CHECK (preco_centavos > 0)
);

