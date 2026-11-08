INSERT INTO item
  (codigo, titulo, tipo, autor, edicao, disponivel)
VALUES
  (
    '978-0131103627',
    'The C Programming Language',
    'LIVRO',
    'Brian W. Kernighan',
    2,
    FALSE
  ),
  (
    '978-1633438538',
    'Grokking Algorithms, Second Edition: An illustrated guide for programmers and other curious people',
    'LIVRO',
    'Aditya Y. Bhargava',
    2,
    TRUE
  ),
  (
    '978-1974752546',
    'Jojo''s Bizarre Adventure: Part 7 -- Steel Ball Run, Vol. 1',
    'LIVRO',
    'Hirohiko Araki',
    1,
    FALSE
  ),
  (
    'B07MWQ9CCM',
    'A Silent Voice - The Movie',
    'DVD',
    'Miyu Irino',
    1,
    TRUE
  );

INSERT INTO usuario
  (nome, tipo, limite_itens)
VALUES
  (
    'Taís Araújo',
    'ALUNO_GRADUACAO',
    2
  ),
  (
    'Sílvio Barros',
    'PROFESSOR',
    2
  );

INSERT INTO emprestimo
  (item_id, usuario_id, data_retirada, data_devolucao_prevista, data_devolucao, valor_multa)
VALUES
  (
    1,
    1,
    '2026-10-18 15:29:32+00',
    '2026-11-10 18:00:00+00',
    '2026-11-12 11:03:52+00',
    2400
  ),
  (
    3,
    2,
    '2026-11-03 14:05:43+00',
    '2026-11-24 18:00:00+00',
    NULL,
    3200
  );
