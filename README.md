# Sistema de Funcionários
# 

<img src="./assest/Captura.png">


## 📝 Descrição
Projeto que adota um relacionamento esquematizado hierarquicamente na linguagem **Java**.

### ✏️ Aplicação
A classe base **(Funcionario)** concede as características **id, nome e salário** para as classes derivadas **(Atendente, Caixa e Gerente)**, cada classe filha tem caracteristicas que as tornam únicas: **Atendente (dias de férias), Caixa (dias trabalhados) e Gerente (ano de admissão)**.

### 📎 Resultado
    isabelle@cristine: ~$ cat funcionarios.txt

    Id: 49 Funcionário Graziela Sálario: 1000.25 Bonificação: 2000.5
    Id: 34 Funcionário Vitória Sálario: 1050.5 Bonificação: 2101.0
    Id: 1 Funcionário Isabelle Sálario: 2510.1 Bonificação: 3510.1
    Id: 2 Funcionário Maria Betania Sálario: 1510.0 Bonificação: 3020.0
    Id: 13 Funcionário Jones Sálario: 1230.0 Bonificação: 1291.5
    Id: 89 Funcionário Bruno Sálario: 1230.0 Bonificação: 1476.0

    isabelle@cristine: ~$ _

## ⚡ Quick Start

```bash

# 1. Clone o repositório
git clone https://github.com/IsacristineReis/SistemaFuncionario.git

```

## 📁 Estrutura do Projeto

```

|── SistemaFuncionário
   └── src
       ├── cargos
       │   ├── Atendente.java
       │   ├── Caixa.java
       │   └── Gerente.java
       ├── funcionarios
       │   └── Funcionario.java
       ├── main
       │   └── Main.java
       └── module-info.java

```

## 💡 Principais recursos

* 💻 Interação via Linha de Comando — Configurado para operação via terminal, permitindo a execução eficiente de operações com dados.
