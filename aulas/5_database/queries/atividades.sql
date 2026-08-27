--  1. Liste todas as colunas de todas as categorias.
SELECT * FROM categoria;

--  2. Liste apenas nome e o slug das categorias.
SELECT nome, slug FROM categoria;

--  3. Liste os títulos de todas as notícias, fazendo a coluna aparecer com o nome "breaking news".
SELECT titulo AS breaking_news FROM noticia;

--  4. Liste o nome e o e-mail dos usuários que são do tipo EDITOR.
SELECT nome, email FROM usuario WHERE papel = 'EDITOR';

--  5. Liste os títulos das notícias da categoria de id 5.
SELECT titulo FROM noticia WHERE categoria_id = 5;

--  6. Liste nome e email dos usuários que não possuem senha cadastrada.
SELECT nome, email FROM usuario WHERE senha_hash IS NULL;

--  7. Liste o nome dos usuários que ainda não têm um cliente criado na Stripe.
SELECT nome FROM usuario WHERE stripe_customer_id IS NULL;

--  8. Liste os títulos das notícias das categorias 4 e 6.
SELECT titulo FROM noticia WHERE categoria_id IN (4, 6);

--  9. Liste o id e o status das assinaturas que não estão ativas.
SELECT id, status FROM assinatura WHERE status <> 'ACTIVE';

-- 10. Liste as cidades e as unidades federativas dos endereços que ficam no RS ou em SC.
SELECT cidade, uf FROM endereco WHERE uf IN ('RS', 'SC');
