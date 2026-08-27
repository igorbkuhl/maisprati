-- 1. Liste o título de cada notícia com o nome do autor.
SELECT n.titulo, u.nome
    FROM noticia n
JOIN usuario u
    ON n.autor_id = u.id;

-- 2. Liste o nome de cada usuário com a cidade e UF do endereço.
SELECT u.nome, e.cidade, e.uf
    FROM usuario u
JOIN endereco e
    ON u.id = e.usuario_id;

-- 3. Liste título, categoria e autor de todas as notícias.
SELECT n.titulo, c.nome AS categoria, u.nome
    FROM noticia n
JOIN categoria c
    ON n.categoria_id = c.id
JOIN usuario u
    ON n.autor_id = u.id;
