function shellSort(array: number[]) {
  let gap = Math.floor(array.length / 2);

  while (gap > 0) {
    for (let i = gap; i < array.length; i++) {
      const temp = array[i];
      let j;
  
      for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
        array[j] = array[j - gap];
      }
      
      array[j] = temp;
    }

    gap = Math.floor(gap / 2);
  }
}

const arr: number[] = [10, 5, 3, 9, 8, 1, 2, 5];

console.log(`original: ${arr}`);

shellSort(arr);

console.log(`resultado: ${arr}`);

export {};