# Merge Sort

Algoritmo de ordenação eficiente baseado na estratégia de dividir para conquistar, que divide o array em partes menores, ordena cada uma e depois as combina.

---

## 📖 Descrição

O Merge Sort divide o array recursivamente em duas metades até que cada parte tenha apenas um elemento.
Depois disso, ele começa a fase de *merge*, onde combina essas partes menores de forma ordenada.
O processo garante que, ao final, o array inteiro esteja ordenado.

Diferente de algoritmos como Bubble ou Insertion Sort, o Merge Sort mantém um desempenho consistente mesmo para grandes volumes de dados.

---

## ⚙️ Como funciona

1. Divide o array em duas metades.
2. Aplica o Merge Sort recursivamente em cada metade.
3. Quando as partes tiverem apenas um elemento, começa a junção.
4. Combina duas partes ordenadas em uma única lista ordenada.
5. Repete o processo até reconstruir o array completo.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n log n)   |
| Caso médio   | O(n log n)   |
| Pior caso    | O(n log n)   |
| Espaço       | O(n)         |

> A complexidade é a mesma em todos os casos, pois o array sempre é dividido da mesma forma.

---

## ✅ Vantagens
- Excelente desempenho para grandes arrays
- Complexidade previsível
- Algoritmo estável
- Muito usado como base para outros algoritmos

---

## ❌ Desvantagens
- Usa memória extra
- Implementação mais complexa que algoritmos simples
- Pode ser excessivo para arrays pequenos

---

## 📌 Quando usar
- Quando desempenho é importante
- Para grandes volumes de dados
- Quando estabilidade é necessária
- Em sistemas que podem usar memória extra

---

## 🧠 Observações
O Merge Sort é um ótimo exemplo de recursão e do paradigma dividir para conquistar.
Por causa disso, ele é muito utilizado no ensino de estruturas de dados e algoritmos.