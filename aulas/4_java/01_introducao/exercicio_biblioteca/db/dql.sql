-- 1. Liste todo o acervo, com código, título, tipo e disponibilidade
SELECT codigo, titulo, tipo, disponivel
FROM item;

-- 2. Liste os empréstimos em aberto, com nome do usuário e título do item.
SELECT u.nome, i.titulo
FROM emprestimo AS e
JOIN item AS i
  ON i.id = e.item_id
JOIN usuario AS u
  ON u.id = e.usuario_id
WHERE e.data_devolucao IS NULL;

-- 3. Calcule o total de multas acumuladas por usuário.
SELECT u.nome, sum(e.valor_multa) AS total_multas
FROM emprestimo AS e
JOIN usuario AS u
  ON u.id = e.usuario_id
WHERE e.data_devolucao > e.data_devolucao_prevista
GROUP BY u.nome;

-- 4. Liste os itens que nunca foram emprestados.
SELECT i.titulo
FROM emprestimo AS e
RIGHT JOIN item AS i
  ON i.id = e.item_id
WHERE e.data_retirada IS NULL;
