function selectionSort(array: number[]): number[] {
  for (let i = 0; i < array.length; i++) {
    let minorNumberIdx = i;

    for (let j = i + 1; j < array.length; j++) {
      if (array[j] < array[minorNumberIdx]) {
        minorNumberIdx = j;
      }
    }

    if (minorNumberIdx !== i) {
      let temp = array[minorNumberIdx];
      array[minorNumberIdx] = array[i];
      array[i] = temp;
    }
  }

  return array;
}

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

const sorted = selectionSort(arr);

console.log(`resultado: ${sorted}`);

export {};