def shellSort(array):
  gap = len(array) // 2

  while gap > 0:
    for i in range(gap, len(array)):
      temp = array[i]

      j = i
      while j >= gap and array[j - gap] > temp:
        array[j] = array[j - gap]
        j -= gap
      
      array[j] = temp
    
    gap //= 2

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

shellSort(arr)

print(f"resultado: {arr}")