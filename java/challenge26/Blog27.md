# Merge Sort

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves.

![image](img/Mergesort.png)


## Pseudocode

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left


## Trace

Sample Array: [8,4,23,42,16,15]

- step 1 :

will declare n equal to arr.length and if it grater than 1 will divide the array and assign it in the new 2 arrays.

==> [8,4,23,42,16,15]
n=arr.length=6
mid=n/2=3

left arr => [8,4,23]
Right arr => [42,16,15]

### steps for left side:

- step 2:

will recall the function in the left side of the array [8,4,23],divide it to also left and right.

lef arr =[8,4,23]
n=arr.length=3
mid=n/2=1

left => [8]
Right => [4,23]

than recall the the function in the left side of it [8]. and because it length is not grater than 1 will move to next step.

left arr =[8]
n=arr.length=1
n>1

- step 3: 

will recall the function in the right side of the array [4,23]. and because it length is grater than 1 will divide it to left [4] and right [23], then call the function for the left [4] array and because it length is not grater than 1 will move to next step. and call the function for the right [23] array.and because it length is not grater than 1 will move to next step.

right arr =[4,23]
n=arr.length=2
mid=n/2=1

left =[4]
right=[23]

- step 4 :

Will call the marge function the right array of the left array [4, 23]. then compare the values and re-assign the values from less to greatest in the array.

then Will call the marge function the left array main array [8, 4, 23]. then compare the values and re-assign the values from less to greatest in the array.

the result a sorted left part of the main array [4,8,23].

arr =[4,23]

left =[4]
right=[23]
while loop --> 4<23
i=0
arr[0]=4
i=1 !<left.length ==> stop loop
arr[1]=23
==> arr=[4,23]

arr=[8,4,23]
left=[8]
right=[4,23]
while loop --> 4< 8 -->arr[0]=4
j++
k++
while loop --> 8< 23 -->arr[1]=8
i++ --> i!<left.length ==> stop loop
arr[2]=23
arr=[4,8,23]

### steps for right side :

- step 5:

will recall the function in the right side of the array [42, 16, 15],divide it to also left and right.

arr=[42,16,15]
n=arr.length=3
mide=n/2=1
left => [42]
Right => [16,15]

than recall the the function in the left side of it [42]. and because it length is not grater than 1 will move to next step.

- step 6:

will recall the function in the right side of the array [16,15]. and because it length is grater than 1 will divide it to left [16] and right [15], then call the function for the left [16] array and because it length is not grater than 1 will move to next step. and call the function for the right [15] array.and because it length is not grater than 1 will move to next step.

Right => [16,15]
n=arr.length=2
mide=n/2=1

left=[16]
right=[15]

- step 7:

Will call the marge function the right array of the right array [16,15]. then compare the values and re-assign the values from less to greatest in the array.

then Will call the marge function the right array of main array [42,15,16]. then compare the values and re-assign the values from less to greatest in the array.

the result a sorted right part of the main array [15,16,42].


arr =[16,15]

left =[16]
right=[15]
while loop --> 15<16
i=0
arr[0]=15
j++ !<right.length ==> stop loop
arr[1]=16
==> arr=[15,16]

arr=[42,15,16]
left=[42]
right=[15,16]
while loop --> 15< 42 -->arr[0]=15
j++
k++
while loop --> 16< 42 -->arr[1]=16
j++ --> j!<left.length ==> stop loop
arr[2]=42
arr=[15,16,42]

- step 8:

Will call the marge function the main array [8,4,23,42,16,15]. then compare the values and re-assign the values from less to greatest in the array. the result a sorted right part of the main array [4,8,15,16,23,42].

arr =[8,4,23,42,16,15]
left=[4,8,23]
right=[15,16,42]

while loop --> 4<15 --> arr[0]=4
i++ -> i=1
k++ -> k=1

while loop --> 8<15 --> arr[1]=8
i++ -> i=2
k++ -> k=2

while loop --> 15<23 --> arr[2]=15
j++ -> j=1
k++ -> k=3

while loop --> 16<23 --> arr[3]=16
j++ -> j=2
k++ -> k=4

while loop --> 23<42 --> arr[4]=23
i++ , i=3 !< left.length ==> stop loop
k=5

arr[5]=42
arr=[4,8,15,23,42]

## Efficency

Time: n*log(n):

we divide a number into half in every step,it can be represented using a logarithmic function, which is log n and the number of steps can be represented by log n + 1 and to merge the subarrays, made by dividing the original array of n elements, a running time of O(n) will be required. the total time for mergeSort function will become n(log n + 1), which gives us a time complexity of O(n*log n).

Space: O(n):

additional space is being created. two new arrays the space at constant O(n).