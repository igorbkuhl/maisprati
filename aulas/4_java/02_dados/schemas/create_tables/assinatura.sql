CREATE TABLE assinatura (
    id                     BIGSERIAL PRIMARY KEY,
    usuario_id             BIGINT NOT NULL,
    plano_id               BIGINT NOT NULL,
    stripe_subscription_id VARCHAR(60) NOT NULL UNIQUE,
    status                 VARCHAR(20) NOT NULL,
    periodo_fim            TIMESTAMPTZ,
    cancelar_ao_fim        BOOLEAN NOT NULL DEFAULT FALSE,
    criado_em              TIMESTAMPTZ NOT NULL DEFAULT now(),
    atualizado_em          TIMESTAMPTZ NOT NULL DEFAULT now(),

    CONSTRAINT             fk_assinatura_usuario FOREIGN KEY(usuario_id) REFERENCES usuario(id) ON DELETE CASCADE,
    CONSTRAINT             fk_assinatura_plano FOREIGN KEY(plano_id) REFERENCES plano(id) ON DELETE CASCADE,
    CONSTRAINT             ck_assinatura_status CHECK (status IN ('ACTIVE', 'TIALING', 'PAST_DUE', 'CANCELLED', 'INCOMPLETE'))
);
