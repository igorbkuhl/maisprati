INSERT INTO noticia(categoria_id, autor_id, titulo, slug, texto, premium, publicada_em)
SELECT 
	1 + (i % 6),
	1 + (i % 4),
	'Notícia de teste ' || i,
	'noticia-de-teste-' || i,
	'Texto gerado para teste de desempenho.',
	(i % 5 = 0),
	now() - (i || 'minutes')::interval
FROM generate_series(1, 200000) AS i;
