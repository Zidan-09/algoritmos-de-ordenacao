# Insertion Sort

Algoritmo de ordenação simples que constrói o array ordenado gradualmente, inserindo cada novo elemento na posição correta.

---

## 📖 Descrição

O Insertion Sort funciona de forma semelhante à maneira como organizamos cartas na mão.
Ele divide o array em duas partes: uma já ordenada e outra não ordenada.
A cada iteração, um elemento da parte não ordenada é inserido na posição correta da parte ordenada.

---

## ⚙️ Como funciona

1. Começa considerando o primeiro elemento como uma lista ordenada.
2. Seleciona o próximo elemento da parte não ordenada.
3. Compara esse elemento com os anteriores.
4. Desloca os elementos maiores uma posição para a direita.
5. Insere o elemento na posição correta.
6. Repete o processo até o array estar totalmente ordenado.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n)         |
| Caso médio   | O(n²)        |
| Pior caso    | O(n²)        |
| Espaço       | O(1)         |

> O melhor caso ocorre quando o array já está ordenado.

---

## ✅ Vantagens
- Fácil de entender e implementar
- Muito eficiente para arrays pequenos
- Bom desempenho para arrays quase ordenados
- Algoritmo estável

---

## ❌ Desvantagens
- Ineficiente para grandes volumes de dados
- Não escala bem com o aumento do tamanho do array

---

## 📌 Quando usar
- Para aprendizado
- Para listas pequenas
- Quando os dados já estão quase ordenados
- Em cenários onde simplicidade é mais importante que desempenho

---

## 🧠 Observações
O Insertion Sort é bastante usado como base para otimizações em algoritmos mais avançados, como o Quick Sort e o Tim Sort, em casos de pequenos subarrays.