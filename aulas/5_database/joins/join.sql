SELECT n.titulo, t.nome
    FROM noticia n
JOIN noticia_tag nt
    ON n.id = nt.noticia_id
JOIN tag t
    ON nt.tag_id = t.id;
