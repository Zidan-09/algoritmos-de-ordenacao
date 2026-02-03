def bubbleSort(array):
  swapped = True

  while (swapped):
    swapped = False

    for i in range(len(array) - 1):
      if array[i + 1] < array[i]:
        temp = array[i]
        array[i] = array[i + 1]
        array[i + 1] = temp

        swapped = True
  
  return array

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

sorted = bubbleSort(arr)

print(f"resultado: {sorted}")