# Quick Sort

Algoritmo de ordenação eficiente baseado na estratégia de dividir para conquistar, que organiza os elementos a partir de um pivô.

---

## 📖 Descrição

O Quick Sort escolhe um elemento do array como pivô e reorganiza os demais elementos ao redor dele.
Todos os valores menores que o pivô ficam à sua esquerda, e os maiores à sua direita.
Esse processo é aplicado recursivamente às duas partes, até que o array esteja totalmente ordenado.

Apesar do nome, sua eficiência depende da escolha do pivô.

---

## ⚙️ Como funciona

1. Escolhe um elemento como pivô.
2. Reorganiza o array de forma que:
   - Elementos menores que o pivô fiquem à esquerda.
   - Elementos maiores que o pivô fiquem à direita.
3. O pivô fica automaticamente na posição correta.
4. Aplica o Quick Sort recursivamente nas sublistas da esquerda e da direita.
5. Repete o processo até que o array esteja ordenado.

---

## ⏱️ Complexidade

| Caso          | Complexidade |
|--------------|--------------|
| Melhor caso  | O(n log n)   |
| Caso médio   | O(n log n)   |
| Pior caso    | O(n²)        |
| Espaço       | O(log n)     |

> O pior caso ocorre quando o pivô escolhido é sempre o menor ou o maior elemento.

---

## ✅ Vantagens
- Muito rápido na prática
- Usa pouca memória extra
- Um dos algoritmos mais utilizados em produção
- Bom para grandes volumes de dados

---

## ❌ Desvantagens
- Pior caso pode ser muito lento
- Não é estável
- Implementação mais complexa que algoritmos simples

---

## 📌 Quando usar
- Quando desempenho é prioridade
- Para grandes arrays
- Quando a memória é limitada
- Em sistemas onde a estabilidade não é necessária

---

## 🧠 Observações
Escolher um bom pivô é essencial para o desempenho do Quick Sort.
Estratégias comuns incluem usar o elemento do meio ou o método da mediana de três.