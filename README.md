<img src="images/easyMed.png" width="250" style="margin-left: -15px">

<div style=" height:35px; display: flex; flex-direction: row; gap: 10px; align-items: center;">
  <h2 style="width: 100%; border-bottom: none">Sistema de Gestão de Clínicas</h2>
 
  <img alt="Java" src="https://img.shields.io/badge/Java-orange?style=flat&logo=openjdk&  logoColor=white">
  <img alt="License" src="https://img.shields.io/badge/license-MIT-blue.svg">
  <img alt="Status" src="https://img.shields.io/badge/Status-Concluído-success">
</div>

<br>

O **EasyMed** é uma aplicação desktop desenvolvida para otimizar e simplificar a rotina administrativa e médica de clínicas e consultórios. Com uma interface limpa e intuitiva, o sistema centraliza o gerenciamento de pacientes, controle de estoque de medicamentos, agendamento de consultas e gestão financeira em um único ambiente.


## Funcionalidades

O sistema foi modularizado para atender as principais demandas de uma clínica.

### Gestão de Pacientes
* **Cadastro Completo:** Registro de informações (Nome, CPF, Idade, Peso, Altura, Contato e Observações Médicas).
* **Cálculo Automático de IMC:** O sistema calcula e exibe automaticamente o Índice de Massa Corporal (IMC) na listagem de pacientes.
* **Manutenção de Dados:** Facilidade para listar, editar e excluir registros clínicos.

### Controle de Medicamentos e Estoque
* **Inventário Integrado:** Visualização dos medicamentos cadastrados (ex: Semaglutida, Tirzepatida, Vitamina B12).
* **Controle Financeiro de Insumos:** Registro do valor de compra unitário e acompanhamento do estoque atual.
* **Atualização Dinâmica:** Ferramentas para adição e edição rápida do volume de estoque.

### Agenda
* **Calendário Interativo:** Interface de calendário dinâmico para agendamento e acompanhamento das consultas do mês.
* **Prontuário Rápido:** Modal detalhado da consulta contendo os dados antropométricos do paciente e campo de observações para retorno/prescrição.
* **Gestão de Status:** Controle do ciclo de vida do atendimento, permitindo agendar, editar, cancelar e **Finalizar Consultas**.

### Financeiro
* **Controle de Fluxo de Caixa:** Tabela dupla detalhando as movimentações da clínica.
* **Entradas:** Registro automático/manual dos pagamentos vinculados aos pacientes e consultas.
* **Despesas:** Rastreamento de gastos com reposição de estoque de medicamentos e outros custos.
* **Saldo em Tempo Real:** Cálculo automático do saldo financeiro atual da clínica.
  
---

<br>

| Tela Inicial | Cadastro de Pacientes |
|:---:|:---:|
| <img src="images/Home.png" width="500"> | <img src="images/Pacientes.png" width="500"> |



| Estoque de Medicamentos | Agenda |
|:---:|:---:|
| <img src="images/Medicamentos.png" width="500"> | <img src="images/Agenda.png" width="500"> |

| Consultas | Financeiro |
|:---:|:---:|
| <img src="images/Consulta.png" width="500"> | <img src="images/Financeiro.png" width="500"> |




## Tecnologias Utilizadas

O projeto foi inteiramente construído com foco em performance local e usabilidade, utilizando as seguintes tecnologias:

* **Linguagem:** Java
* **Interface Gráfica:** Swing
* **ORM:** JPA (Java Persistence API)
* **Banco de Dados:** Postgres ou SQLite
<br>
---
<br>

Este software foi desenvolvido como trabalho final de Desenvolvimento Orientado a Objetos II,desenvolvido pelos alunos: André Salvalaggio, Caio Radtke, João Cardoso