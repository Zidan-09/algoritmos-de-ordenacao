def selectionSort(array):
  for i in range(len(array)):
    minorNumberIdx = i;

    for j in range(i + 1, len(array)):
      if array[j] < array[minorNumberIdx]:
        minorNumberIdx = j
    
    if minorNumberIdx != i:
      temp = array[minorNumberIdx]
      array[minorNumberIdx] = array[i]
      array[i] = temp
    
  return array

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

sorted = selectionSort(arr)

print(f"resultado: {sorted}")