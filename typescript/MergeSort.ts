function mergeSort(array: number[]): number[] {
  const arrayLength = array.length;

  if (arrayLength < 2) return;

  const middleIndex = Math.floor(arrayLength / 2);
  
  const leftHalf = array.slice(0, middleIndex);
  const rightHalf = array.slice(middleIndex, arrayLength);

  mergeSort(leftHalf);
  mergeSort(rightHalf);

  merge(array, leftHalf, rightHalf);

  return array;
}

function merge(array: number[], left: number[], right: number[]) {
  const leftSize = left.length;
  const rightSize = right.length;

  let l = 0; let r = 0; let s = 0;

  while (l < leftSize && r < rightSize) {
    if (left[l] <= right[r]) {
      array[s] = left[l];
      l++;

    } else {
      array[s] = right[r];
      r++;
    }

    s++;
  }

  while (l < leftSize) {
    array[s] = left[l];
    l++;
    s++;
  }

  while (r < rightSize) {
    array[s] = right[r];
    r++;
    s++;
  }
}

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

const sorted = mergeSort(arr);

console.log(`resultado: ${sorted}`);

export {};