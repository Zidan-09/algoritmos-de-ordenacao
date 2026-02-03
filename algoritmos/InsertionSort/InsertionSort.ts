function insertionSort(array: number[]): number[] {
  for (let i = 1; i < array.length; i++) {
    let value = array[i];

    let j = i - 1;
    while (j >= 0 && array[j] > value) {
      array[j + 1] = array[j];

      j--;
    }

    array[j + 1] = value;
  }

  return array;
};

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

const sorted = insertionSort(arr);

console.log(`resultado: ${sorted}`);

export {};