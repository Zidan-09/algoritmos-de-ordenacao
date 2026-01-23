function bubbleSort(array: number[]): number[] {
  let swapped: boolean = true;

  while (swapped) {
    swapped = false;

    for (let i = 0; i < array.length - 1; i++) {
      if (array[i + 1] < array[i]) {
        const temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;

        swapped = true;
      }
    };
  };
  return array;
};

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

const sorted = bubbleSort(arr);

console.log(`resultado: ${sorted}`);

export {};