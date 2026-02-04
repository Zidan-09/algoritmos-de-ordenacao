# Selection Sort

Algoritmo de ordenação simples que seleciona repetidamente o menor elemento e o coloca na posição correta.

---

## 📖 Descrição

O Selection Sort percorre o array procurando o menor elemento e o posiciona no início.
Depois disso, repete o processo para o restante do array, ignorando a parte que já está ordenada.
O algoritmo reduz o número de trocas, mas ainda realiza muitas comparações.

---

## ⚙️ Como funciona

1. Considera o primeiro índice como a posição atual.
2. Procura o menor elemento no restante do array.
3. Troca o menor elemento encontrado com o elemento da posição atual.
4. Avança para a próxima posição.
5. Repete o processo até o array estar totalmente ordenado.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n²)        |
| Caso médio   | O(n²)        |
| Pior caso    | O(n²)        |
| Espaço       | O(1)         |

> A complexidade é a mesma em todos os casos, pois o algoritmo sempre percorre todo o array.

---

## ✅ Vantagens
- Simples de entender e implementar
- Número reduzido de trocas
- Não usa memória extra

---

## ❌ Desvantagens
- Muito lento para grandes arrays
- Não é estável
- Pouco utilizado em aplicações reais

---

## 📌 Quando usar
- Para aprendizado
- Para entender comparação e seleção de elementos
- Em cenários onde o custo de troca é alto, mas comparações são baratas

---

## 🧠 Observações
Apesar de não ser eficiente, o Selection Sort é útil para compreender a ideia de seleção e posicionamento correto dos elementos em um array.