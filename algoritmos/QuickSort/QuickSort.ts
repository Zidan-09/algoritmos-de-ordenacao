function quickSort(array: number[]): void;
function quickSort(array: number[], lowIdx: number, highIdx: number): void;

function quickSort(array: number[], lowIdx?: number, highIdx?: number): void {
  if (lowIdx === undefined || highIdx === undefined) {
    quickSort(array, 0, array.length - 1);
    return;
  }

  if (lowIdx >= highIdx) return;

  const pivotIdx = Math.floor(Math.random() * (highIdx - lowIdx + 1)) + lowIdx;
  const pivot = array[pivotIdx];

  const aux = array[highIdx];
  array[highIdx] = array[pivotIdx];
  array[pivotIdx] = aux;

  let leftPointer = lowIdx;
  let rightPointer = highIdx;

  while(leftPointer < rightPointer) {
    while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
      leftPointer++;
    }

    while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
      rightPointer--;
    }

    const temp = array[leftPointer];
    array[leftPointer] = array[rightPointer];
    array[rightPointer] = temp;
  }

  const temp = array[leftPointer];
  array[leftPointer] = array[highIdx];
  array[highIdx] = temp;

  quickSort(array, lowIdx, leftPointer - 1);
  quickSort(array, leftPointer + 1, highIdx);
}

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

quickSort(arr);

console.log(`resultado: ${arr}`);

export {};