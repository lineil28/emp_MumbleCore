# emp_MumbleCore
#### TEAM MumbleCore - Abdullah Faruque, Neil Lin, Russell Goychayev
## Tests Performed
Our plan goes as follows...
1. grasp currentTimeMillis() and use it to create some sort of testing method
2. have a Comparable array thats When the size will be determined by the input of the tester.
3. get a number of "trials" which was the number of times <code>BinSearch</code> or <code>LinSearch</code> will search for the target, which will be <code>SIZE - 1</code>.
4. record the time needed to find the target <code>TRIALS</code> amount of times.
5. Do these tests for numerous sizes.
6. analyze.

In our tests, one of the independent variables tested was the size of the Comparable array. The trial number remained at 10,000 for consistency. The dependent variable that we measured was the time it took to find the random target it was assigned. Since both search methods had to find a random target, it falls under the category of a control variable.


## Results

| SIZE | TRIALS | BinSearch Time for all Trials (milliseconds)  | LinSearch Time for all Trials (milliseconds) |
|-----------------|:-------------|:---------------:|---------------:|
| 60        | 10000         | 8      | 13                 |
| 600       | 10000         | 2      | 47                 |
| 6000      | 10000         | 1      | 57                 |
| 60000     | 10000         | 1      | 952                |
| 600000    | 10000         | 4      | 17768              |
| 6000000   | 10000         | 3      | 133159             |
| 60000000  | 10000         | 2      | 141976             |
| 210000000 | 10000         | 1      | 2466126            |

The recorded time shows the time needed to search for the target <code>TRIALS</code> amount of times. 

![alt text](https://github.com/lineil28/emp_MumbleCore/blob/main/BinSearch%20Time%20and%20LinSearch%20Time.png)
## Conclusions
* As we can see from the table and bar graph above, BinSearch clearly takes less time than LinSearch. As the size increases by multiples of 10, the time needed to complete 10,000 trials of the search grows exponentially.
* An interesting observation is that when the size of the <code>Comparable</code> is less than 60, LinSearch typically takes less time than BinSearch.
* In conclusion, BinSearch takes less time to run than LinSearch. s
