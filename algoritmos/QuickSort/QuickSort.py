import random

def quickSort(array, lowIdx=None, highIdx=None):
  if lowIdx is None or highIdx is None:
    quickSort(array, 0, len(array) - 1)
    return
  
  if lowIdx >= highIdx:
    return
  
  pivotIdx = random.randint(lowIdx, highIdx)
  pivot = array[pivotIdx]

  aux = array[highIdx]
  array[highIdx] = array[pivotIdx]
  array[pivotIdx] = aux

  leftPointer = lowIdx
  rightPointer = highIdx

  while leftPointer < rightPointer:
    while array[leftPointer] <= pivot and leftPointer < rightPointer:
      leftPointer += 1
    
    while array[rightPointer] >= pivot and leftPointer < rightPointer:
      rightPointer -= 1
    
    temp = array[leftPointer]
    array[leftPointer] = array[rightPointer]
    array[rightPointer] = temp

  temp = array[leftPointer]
  array[leftPointer] = array[highIdx]
  array[highIdx] = temp

  quickSort(array, lowIdx, leftPointer - 1)
  quickSort(array, leftPointer + 1, highIdx)

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

quickSort(arr)

print(f"resultado: {arr}")