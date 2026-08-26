CREATE TABLE noticia_tag (
    noticia_id BIGINT NOT NULL,
    tag_id     BIGINT NOT NULL,

    CONSTRAINT pk_noticia_tag PRIMARY KEY(noticia_id, tag_id),
    CONSTRAINT fk_nt_noticia FOREIGN KEY(noticia_id) REFERENCES noticia(id) ON DELETE CASCADE,
    CONSTRAINT fk_nt_tag FOREIGN KEY(tag_id) REFERENCES tag(id) ON DELETE CASCADE
);
