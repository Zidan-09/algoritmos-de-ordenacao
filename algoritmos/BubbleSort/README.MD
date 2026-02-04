# Bubble Sort

Algoritmo simples de ordenação que compara elementos adjacentes e os troca de lugar se estiverem na ordem errada.

---

## 📖 Descrição

O Bubble Sort percorre o array várias vezes, comparando pares de elementos vizinhos.
Sempre que encontra um par fora de ordem, ele realiza a troca.
Os maiores valores "sobem" para o final do array, como bolhas na água — daí o nome.

---

## ⚙️ Como funciona

1. Percorre o array do início ao fim.
2. Compara o elemento atual com o próximo.
3. Se o atual for maior, troca os dois.
4. Repete o processo até que nenhuma troca seja necessária.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n)         |
| Caso médio   | O(n²)        |
| Pior caso    | O(n²)        |
| Espaço       | O(1)         |

> O melhor caso acontece quando o array já está ordenado e o algoritmo possui otimização de parada.

---

## ✅ Vantagens
- Fácil de entender
- Simples de implementar
- Bom para fins educacionais

---

## ❌ Desvantagens
- Muito lento para grandes volumes de dados
- Pouco eficiente em aplicações reais

---

## 📌 Quando usar
- Para aprendizado
- Para explicar conceitos básicos de ordenação
- Nunca recomendado para produção com grandes arrays

---

## 🧠 Observações
Apesar de ser um dos algoritmos mais simples, o Bubble Sort ajuda muito a entender como funcionam comparações e trocas em algoritmos de ordenação.