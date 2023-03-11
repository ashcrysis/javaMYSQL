/*O sistema deve ser capaz de gerenciar os dados referentes aos alunos da instituição, na qual devem ser armazenados 
(CPF, RG, nome completo, data  de nascimento, sexo, endereço, escolaridade, nome da mãe e nome do pai, telefone, e-mail,
 o registro do aluno deve ser criado automaticamente no  momento do cadastro e deve conter 5 dígitos). 
O sistema deve ser capaz de cadastrar, atualizar e excluir alunos da base de  dados.
*/

create database asherPro;
use asherPro;

create table usuario(
cod int(3) zerofill auto_increment not null primary key,
Usuario varchar(60) not null,
Senha varchar(60) not null
);


create table aluno(
registro int(5) unsigned zerofill auto_increment not null primary key ,
CPF varchar(20) not null,
RG varchar(20) not null,
nome varchar(120) not null,
data_nascimento varchar(20) not null,
Sexo varchar(30) not null, 
endereco varchar(200) not null,
escolaridade varchar(60) not null,
nome_mae varchar(60) not null,
nome_pai varchar(60) not null,
telefone varchar(20) not null,
email varchar(120) not null);

/*
Gerenciar os dados dos colaboradores armazenando as seguintes  informações
 (CPF, RG, nome completo, data de nascimento, sexo, endereço,  escolaridade, cargo, telefone, e-mail) 
O sistema deve ter uma área de cadastro dos cargos que deve conter (título,  descrição e salário).
 O cadastro do cargo dos colaboradores dever baseado no  cadastro prévio dos cargos. 
O sistema deve ser capaz de cadastrar e atualizar colaboradores da base de  dados. */

create table cargo(
cod int(3) not null primary key,
titulo varchar(60) not null,
descricao varchar(300) not null,
salario varchar(60) not null
);

create table colaborador(
CPF varchar(20) not null primary key,
RG varchar(20) not null,
Nome varchar(120) not null,
Data_Nasci varchar(20) not null,
Sexo varchar(30) not null, 
endereco varchar(200) not null,
escolaridade varchar(60) not null,
cargo int(3) not null,
telefone varchar(20) not null,
email varchar(120) not null,
CONSTRAINT Cargo_Colaborador FOREIGN KEY(cargo) REFERENCES cargo(cod)
);

/*3 – Gestão de professores: 
Deve ser possível gerenciar os seguintes dados de todos os professores da  instituição, contendo as seguintes informações 
(CPF, área a atuação,  especialização). 
Será necessário ter um cadastro de expertises, ou seja, armazenar as  informações de todas as disciplinas que os professores ministram. 
O sistema deve ser capaz de cadastrar, atualizar e excluir professores da base  de dados, assim como suas expertises. 
*/

create table professor(
CPF varchar(20) not null primary key,
Area_atuacao varchar(120) not null,
especializacao varchar(35) not null
);

/*O gerenciamento de cursos deve ser realizado através do cadastro,  atualização e exclusão dos cursos da base de dados, 
que deverá ter as  informações (título do curso, descrição, área tecnológica, carga horária,  conteúdo, nível 
(aperfeiçoamento, qualificação ou técnico).
*/

create table curso(
cod int(3) unsigned zerofill not null primary key,
Titulo varchar(120) not null,
descricao varchar(300) not null,
area_tecnologica varchar(120) not null,
carga_horaria varchar(30) not null,
conteudo varchar(200) not null,
nivel varchar(60) not null
);

/*Na área de matrículas, deve haver um cadastro de turma, que deverá ter  
(código, curso, turno, data de início, data de término, professor). Deverá ser possível adicionar alunos a cada turma. 
Inclua uma área de listagem de turma buscando o código, onde será exibido os dados da turma, assim como os alunos nela matriculados. 
*/

create table turma(
cod int(3) unsigned zerofill not null primary key,
curso int(3) unsigned zerofill not null,
turno varchar(60) not null,
data_inicio varchar(20) not null,
data_termino varchar(20) not null,
professor varchar(20) not null,
constraint Professor_turma foreign key (professor) references professor(CPF),
constraint Curso_turma foreign key (curso) references curso(cod)
);

create table turma_aux(
cod int(3) unsigned zerofill not null primary key,
Registro_Aluno int(5) unsigned zerofill not null,
Nome varchar(120) not null,
constraint Turma_Turma_COD foreign key (cod) references turma(cod),
constraint Aluno_Turma_Registro foreign key (Registro_Aluno) references aluno(registro)
);



/*

 -- o registro do aluno deve ser criado automaticamente no  momento do cadastro e deve conter 5 dígitos). 
O sistema deve ser capaz de cadastrar, atualizar e excluir alunos da base de  dados.
 * O cadastro do cargo dos colaboradores dever baseado no  cadastro prévio dos cargos. 
O sistema deve ser capaz de cadastrar e atualizar colaboradores da base de  dados.
* O sistema deve ter uma área de cadastro dos cargos que deve conter (título,  descrição e salário).
* O cadastro do cargo dos colaboradores dever baseado no  cadastro prévio dos cargos. 
O sistema deve ser capaz de cadastrar e atualizar colaboradores da base de  dados. 
* Deverá ser  possível adicionar alunos a cada turma. 
Inclua uma área de listagem de turma buscando o código, onde será exibido os dados da turma, assim como os alunos nela matriculados. 

*/