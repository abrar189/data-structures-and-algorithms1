# Insertion Sort

Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

example :
![image](img/insertionsort.png)

## Pseudocode

  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

## Trace

Sample Array: [8,4,23,42,16,15]

Pass 1:

j=0;

temp=4;

will compare the 4 with 8, when it's less than 8, will assign it equal to 8 and minus 1 from j to become -1 and break the while loop.

then assign arr[j+1] the value of temp which is 4.


![image](img/step1.png)


Pass 2:

j=1;

temp=23;

while temp is grater than 4 (the previous value) will move to the next iteration.

arr[j]=arr[1]=8
temp=arr[i]=23

8<23 ==> move to next iteration
[4,8,23,42,16,15]

Pass 3:

j=2;

temp=42;


while temp is grater than 23 (the previous value) will move to the next iteration.

arr[j]=arr[1]=23
temp=arr[i]=42

23<42 ==> move to next iteration
[4,8,23,42,16,15]

Pass 4:

j=3;

temp=16;

will compare the 16 with 42, when it's less, will assign it equal to 42 and minus 1 from j to become 2, then compare again 16 is less than 23, so will assign the value of arr[j+1] to be equal 23. then compare again 16 is grater than 8 so will break the loop and assign the value of arr[j+1] to be equal the temp which is 16.


![image](img/step4.png)


Pass 5:

j=4;

temp=15;

will compare the 15 with 42, when it's less, will assign it equal to 42 and minus 1 from j to become 2, then compare again 15 is less than 23, so will assign the value of arr[j+1] to be equal 23, then compare again 15 is less than 16, so will assign the value of arr[j+1] to be equal 16. then compare again 15 is grater than 8 so will break the loop and assign the value of arr[j+1] to be equal the temp which is 15.


![image](img/step5.png)


## Efficency

Time: O(n^2):

The basic operation of this algorithm is comparison. This will happen n*(n-1) number of times…concluding the algorithm to be n squared.

Space: O(1):

No additional space is being created. This array is being sorted in place…keeping the space at constant O(1).