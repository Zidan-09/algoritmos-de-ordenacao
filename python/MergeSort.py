import math

def merge(array, left, right):
  leftSize = len(left)
  rightSize = len(right)

  l = r = s = 0

  while l < leftSize and r < rightSize:
    if left[l] <= right[r]:
      array[s] = left[l]
      l += 1
    
    else:
      array[s] = right[r]
      r += 1
    
    s += 1
  
  while l < leftSize:
    array[s] = left[l]
    l += 1
    s += 1
  
  while r < rightSize:
    array[s] = right[r]
    r += 1
    s += 1

def mergeSort(array):
  arrayLenght = len(array)

  if arrayLenght < 2:
    return
  
  middleIndex = math.floor(arrayLenght / 2)

  leftHalf = array[0:middleIndex]
  rightHalf = array[middleIndex::]

  mergeSort(leftHalf)
  mergeSort(rightHalf)

  merge(array, leftHalf, rightHalf)

arr = [10, 5, 3, 9, 8, 1, 2, 5]

print(f"original: {arr}")

mergeSort(arr)

print(f"resultado: {arr}")