# Shell Sort

Algoritmo de ordenação que melhora o Insertion Sort ao permitir comparações e trocas entre elementos distantes.

---

## 📖 Descrição

O Shell Sort é uma generalização do Insertion Sort.
Ele começa ordenando elementos que estão longe uns dos outros, usando um intervalo (*gap*).
À medida que o algoritmo avança, esse intervalo diminui, até que o array seja ordenado com um Insertion Sort final.

Essa abordagem reduz drasticamente o número de movimentações necessárias.

---

## ⚙️ Como funciona

1. Define um valor inicial de intervalo (*gap*).
2. Ordena os elementos considerando esse intervalo.
3. Diminui o valor do *gap*.
4. Repete o processo até o *gap* ser igual a 1.
5. Finaliza com uma ordenação completa do array.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n log n)   |
| Caso médio   | Depende do gap |
| Pior caso    | O(n²)        |
| Espaço       | O(1)         |

> A eficiência do Shell Sort depende diretamente da sequência de gaps utilizada.

---

## ✅ Vantagens
- Mais rápido que Insertion Sort
- Não usa memória extra
- Implementação relativamente simples

---

## ❌ Desvantagens
- Complexidade difícil de prever
- Não é estável
- Menos utilizado que outros algoritmos O(n log n)

---

## 📌 Quando usar
- Como melhoria do Insertion Sort
- Para arrays médios
- Quando simplicidade e eficiência equilibrada são desejadas

---

## 🧠 Observações
O Shell Sort foi um dos primeiros algoritmos a quebrar a barreira do O(n²), sendo um marco histórico na evolução dos algoritmos de ordenação.