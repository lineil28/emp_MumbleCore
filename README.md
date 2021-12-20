# emp_MumbleCore
#### TEAM MumbleCore - Abdullah Faruque, Neil Lin, Russell Goychayev
## Tests Performed
Our plan goes as follows...
1. grasp currentTimeMillis() and use it to create some sort of testing method
2. have a Comparable array thats When the size will be determined by the input of the tester.
3. get a number of "trials" which was the number of times <code>BinSearch</code> or <code>LinSearch</code> will search for the target, which will be a random int using <code>SIZE*Math.random()</code>.
4. record the time needed to find the target <code>TRIALS</code> amount of times. 
5. Do these tests for numerous sizes. 
6. analyze.

In our tests, one of the independent variables tested was the size of the Comparable array. The trial number remained at 10,000 for consistency. The dependent variable that we measured was the time it took to find the random target it was assigned. Since both search methods had to find a random target, it falls under the category of a control variable. 


## Results

| SIZE | TRIALS | BinSearch Time (milliseconds)  | LinSearch Time (milliseconds) | 
|-----------------|:-------------|:---------------:|---------------:|
| 60        | 10000         | 7      | 11                 |
| 600       | 10000         | 1      | 1                  |
| 6000      | 10000         | 2      | 65                 |
| 60000     | 10000         | 2      | 337                |
| 600000    | 10000         | 2      | 1305               |
| 6000000   | 10000         | 2      | 43273              |
| 60000000  | 10000         | 3      | 141976             |
| 210000000 | 10000         | 1      | 2466126            |

![alt text](https://github.com/lineil28/emp_MumbleCore/blob/main/BinSearch%20Time%20and%20LinSearch%20Time.png)
## Conclusions
* As we can see from the table and bar graph above, BinSearch clearly takes less time than LinSearch. As the size increases by multiples of 10, the time needed to complete 10,000 trials of the search grows exponentially. 
*An interesting observation is that when the size of the <code>Comparable</code> is less than 60, LinSearch typically takes less time than BinSearch.
* Another observation is the times recorded for when the size was 600. In this scenario, both took 1 millisecond. The only explanation for this was that the <code>target</code> was located at the beginning of the container, meaning that LinSearch would not have to traverse through the 600 length array 10,000 times. This is a good example of an outlier.



  

