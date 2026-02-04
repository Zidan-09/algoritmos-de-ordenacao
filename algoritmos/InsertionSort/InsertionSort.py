def insertionSort(array):
  for i in range(1, len(array)):
    value = array[i]

    j = i - 1

    while j >= 0 and array[j] > value:
      array[j + 1] = array[j]

      j -= 1
    
    array[j + 1] = value
    
  return array

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

sorted = insertionSort(arr)

print(f"resultado: {sorted}")