CREATE TABLE noticia (
    id BIGSERIAL PRIMARY KEY,
    categoria_id BIGINT NOT NULL,
    autor_id BIGINT NOT NULL,
    titulo VARCHAR(200) NOT NULL,
    slug VARCHAR(220) NOT NULL UNIQUE,
    resumo VARCHAR(400),
    texto TEXT NOT NULL,
    image_url TEXT,
    premium BOOLEAN NOT NULL DEFAULT FALSE,
    publicada_em TIMESTAMPTZ,
    criada_em TIMESTAMPTZ NOT NULL DEFAULT now(),

    CONSTRAINT fk_noticia_categoria FOREIGN KEY (categoria_id)
    REFERENCES categoria(id) ON DELETE RESTRICT,
    CONSTRAINT fk_noticia_autor FOREIGN KEY (autor_id)
    REFERENCES usuario(id) ON DELETE RESTRICT
);
