# 💻 Exercícios de Java — Lambdas & Streams

## ✅ Objetivo

Praticar:
- Funções **Lambda**
- **Streams API**
- Combinar **Lambda + Streams**

Todos os exercícios devem ser feitos em **Java 8 ou superior**.

---

## 📦 Como praticar

✅ Crie uma classe `Exercicios.java` ou várias classes separadas (Exercicio1, Exercicio2 etc.).

✅ Para cada exercício:
- Escreva o código.
- Rode seu programa.
- Imprima o resultado no console para testar.

---

# 🎯 Exercícios Lambda (10)

### 1. Dobro
Crie uma lambda que receba um número inteiro e devolva o dobro.

---

### 2. Somar dois números
Escreva uma lambda que receba dois inteiros e retorne a soma.

---

### 3. Texto em maiúsculas
Lambda que receba uma `String` e devolva ela em maiúsculas.

---

### 4. Verificar se número é par
Lambda que receba um inteiro e retorne `true` se for par, `false` caso contrário.

---

### 5. Mensagem sem parâmetros
Lambda sem parâmetros que apenas imprima `Olá, mundo!`.

---

### 6. Concatenar duas Strings
Lambda que receba duas Strings e retorne uma só, separadas por espaço.

---

### 7. Calcular potência
Lambda que calcule `x` elevado a `y`.

---

### 8. Tamanho de uma String
Lambda que receba uma String e devolva seu comprimento.

---

### 9. Calcular imposto
Lambda que receba um valor e aplique 10% de imposto.

---

### 10. Saudação personalizada
Lambda que receba um nome e retorne:


---

# 🎯 Exercícios Streams (10)

### 1. Filtrar nomes
De uma lista de nomes, filtre só os que começam com a letra A.

---

### 2. Contar nomes longos
Conte quantos nomes possuem mais de 4 letras.

---

### 3. Transformar lista em maiúsculas
De uma lista de Strings, retorne uma nova lista toda em maiúsculas.

---

### 4. Somar números
Some todos os valores de uma lista de inteiros.

---

### 5. Buscar o menor número
Encontre o menor número em uma lista.

---

### 6. Buscar qualquer elemento
Use `findAny` para pegar algum nome de uma lista.

---

### 7. Remover duplicatas
De uma lista com nomes repetidos, retorne apenas nomes distintos.

---

### 8. Limitar resultados
Pegue apenas os 3 primeiros nomes de uma lista.

---

### 9. Pular elementos
Pule os 2 primeiros elementos e retorne o restante.

---

### 10. Ordenar números
Ordene uma lista de inteiros em ordem decrescente.

---

# 🎯 Exercícios Lambda + Streams (10)

### 1. Filtrar e deixar maiúsculas
De uma lista de nomes, filtre nomes com mais de 3 letras e transforme-os em maiúsculas.

---

### 2. Contar pares
Conte quantos números pares existem em uma lista.

---

### 3. Soma dos quadrados
De uma lista de inteiros, calcule a soma de todos os quadrados dos números.

---

### 4. Agrupar por tamanho
Agrupe nomes de uma lista por quantidade de letras (Map<Integer, List<String>>).

---

### 5. Encontrar nomes únicos
Pegue nomes distintos e coloque-os todos em maiúsculas.

---

### 6. Concatenar nomes
De uma lista, gere uma String única com todos os nomes separados por vírgula.

---

### 7. Verificar presença
Verifique se algum nome da lista contém a letra “z” (maiúscula ou minúscula).

---

### 8. Pegar nomes começando com “J”
Pegue apenas nomes que começam com a letra J e coloque-os em uma lista ordenada.

---

### 9. Imprimir elementos + índice
Imprima cada nome junto do seu índice na lista (ex.: `0 - Ana`).

---

### 10. Dobrar apenas números ímpares
De uma lista de inteiros, dobre apenas os números ímpares.

---

## ✅ Dicas

- Use:
    - `.map()`
    - `.filter()`
    - `.forEach()`
    - `.collect()`
    - `.reduce()`
    - `.count()`
    - Lambdas → `(x) -> ...`
    - `::` (method reference)

---

Bons estudos! 🚀
