WITH mini_noticia(id, titulo, categoria_id) AS (
    VALUES (1, 'Viaduto', 2), (8, 'Metrô', 1), (21, 'Dólar', 5)
),
mini_categoria(id, nome) AS (
    VALUES (1, 'Cidade'), (2, 'Ameaças Urbanas'), (7, 'Tecnologia')
)

SELECT n.titulo, c.nome
FROM mini_noticia n
-- exige que os dados da tabela esquerda sejam válidos
-- mas permite que a tabela da direita contenham nulos
LEFT JOIN mini_categoria c
ON c.id = n.categoria_id;
