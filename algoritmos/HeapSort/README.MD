# Heap Sort

Algoritmo de ordenação eficiente baseado na estrutura de dados Heap (árvore binária), que sempre mantém o maior ou menor elemento no topo.

---

## 📖 Descrição

O Heap Sort utiliza uma estrutura chamada *heap*, geralmente um *max heap*, onde o maior elemento fica sempre na raiz.
A partir disso, o algoritmo remove o maior elemento e o coloca na posição correta no array, reconstruindo o heap a cada passo.
Esse processo se repete até que todos os elementos estejam ordenados.

---

## ⚙️ Como funciona

1. Constrói um *max heap* a partir do array.
2. O maior elemento fica na raiz do heap.
3. Troca o elemento da raiz com o último elemento do array.
4. Reduz o tamanho do heap.
5. Reorganiza o heap para manter a propriedade.
6. Repete o processo até o array estar ordenado.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n log n)   |
| Caso médio   | O(n log n)   |
| Pior caso    | O(n log n)   |
| Espaço       | O(1)         |

> O Heap Sort possui desempenho consistente, independentemente da ordem inicial dos dados.

---

## ✅ Vantagens
- Boa performance garantida
- Não utiliza memória extra significativa
- Não sofre degradação no pior caso

---

## ❌ Desvantagens
- Não é estável
- Implementação mais complexa
- Geralmente mais lento que Quick Sort na prática

---

## 📌 Quando usar
- Quando é necessário desempenho previsível
- Quando não se pode usar memória extra
- Em sistemas que exigem limite rígido de recursos

---

## 🧠 Observações
O Heap Sort é uma ótima forma de aprender heaps e árvores binárias, conceitos fundamentais em estruturas de dados.