-- SELECT titulo, resumo      -- QUAIS colunas eu quero ver?
-- FROM noticia               -- DE ONDE elas vêm?
-- WHERE premium = TRUE       -- QUAIS linhas eu quero
-- ORDER BY publicada_em DESC -- EM QUE ORDEM?
-- LIMIT 5;                   -- QUANTAS no máximo?

SELECT
    titulo AS manchete,
    publicada_em AS data_publicacao
FROM noticia
WHERE categoria_id = 2 AND premium = TRUE;

EXPLAIN ANALYZE -- exibe informações da consulta
SELECT * FROM noticia WHERE categoria_id = 2;

-- cria um índice para acelerar consultas, ao custo da velocidade de alteração na tabela
CREATE INDEX idx_noticia_categoria ON noticia (categoria_idx);

-- busca por valor exato
SELECT * FROM noticia WHERE titulo = 'Notícia de teste 150000';

-- NULL não é um valor, é a ausência de valor, logo, verificamos com `IS NULL` ou `IS NOT NULL`
SELECT titulo FROM noticia WHERE publicada_em IS NULL;

-- busca por textos que contém um texto
SELECT titulo FROM noticia WHERE titulo ILIKE '%VIGILANTE%';
