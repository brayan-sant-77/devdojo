
Crie um sistema que gerencie seminários
O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

um aluno poderá estar em apenas um seminário,
um seminário poderá ter nenhum ou vários alunos,
um professor poderá ministrar vários seminários,
um seminário deve ter um local

Campos básicos (excluindo relacionamento)

- seminário: título

- aluno: nome, idade

- professor: nome, especialidade

- local: endereço


Aluno
- nome
- idade

Relacionamentos:
- participa de um seminário

-------------------

Seminário
- título

Relacionamentos:
- possui vários alunos
- possui um local
- possui um professor

-------------------

Professor
- nome
- especialidade

Relacionamentos:
- ministra vários seminários

-------------------

Local
- endereço

Relacionamentos:
- é utilizado por um seminário