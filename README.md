# 🏋️ Mart Train System

## 🚀 Sobre o projeto

O **Mart Train System** é um sistema desenvolvido em Java com foco na organização de treinos e cálculo de indicadores de saúde, aplicando conceitos fundamentais de backend.

💡 Este projeto simula um cenário real de academia, permitindo gerar treinos personalizados com base no objetivo do usuário.

---

## ✨ Destaques

🔥 Cálculo automático de IMC
🔥 Classificação de saúde
🔥 Geração de treinos por objetivo
🔥 Estrutura organizada em camadas
🔥 Código limpo e reutilizável

---

## 🧠 Arquitetura do projeto

O sistema foi estruturado seguindo uma separação clara de responsabilidades:

```id="9px2nf"
app       → Entrada da aplicação
model     → Entidades do sistema
service   → Regras de negócio
util      → Funções auxiliares
```

---

## 🛠️ Tecnologias utilizadas

* Java
* Maven
* IntelliJ IDEA

---

## 📁 Estrutura do projeto

```id="jxm3rg"
src/main/java
├── app
│   └── TreinoApp.java
├── model
│   ├── alunos
│   │   └── Aluno.java
│   └── treinos
│       ├── Treino.java
│       ├── Exercicio.java
│       └── DiadeTreino.java
├── service
│   └── TreinosPreDefinidos.java
└── util
    └── SaudeUtil.java
```

---

## ⚙️ Funcionalidades

✔ Cálculo de IMC
✔ Classificação de saúde
✔ Geração de treinos (emagrecimento / hipertrofia)
✔ Organização modular

---

## ▶️ Como executar

```id="8q8ksq"
git clone https://github.com/GabrielFerre13/mart-train-system.git
cd mart-train-system
```

Abra no IntelliJ e execute:

```id="ew4qk6"
TreinoApp.java
```

---

## 📈 Evolução do projeto

Este projeto faz parte da minha evolução como desenvolvedor Java.
Novas funcionalidades serão adicionadas em breve:

* Integração com banco de dados
* API REST com Spring Boot
* Interface gráfica

---

**Gabriel Ferreira Machado**
🎯 Estudante de Análise e Desenvolvimento de Sistemas





