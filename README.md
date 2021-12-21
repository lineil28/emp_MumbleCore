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

In our tests, one of the independent variables tested was the size of the Comparable array. The trial number remained at 10,000 for consistency. The dependent variable that we measured was the time it took to find the last element in the array 10,000 times. Using this, we can determine which search method is quicker. 

## Results
#### TARGET: <code>SIZE-1</code>
| SIZE | TRIALS | BinSearch Time for all Trials (milliseconds)  | LinSearch Time for all Trials (milliseconds) |
|-----------------|:-------------|:---------------:|---------------:|
| 6         | 10000         | 2      | 1                  |
| 60        | 10000         | 1      | 6                  |
| 600       | 10000         | 1      | 8                  |
| 6000      | 10000         | 1      | 47                 |
| 60000     | 10000         | 1      | 455                |
| 600000    | 10000         | 1      | 6222               |
| 6000000   | 10000         | 1      | 88369              |
| 60000000  | 10000         | 1      | 1320064            |
| 210000000 | 10000         | 1      | 5689082            |

The recorded time shows the time needed to search for the target <code>TRIALS</code> amount of times. 

![alt text](https://github.com/lineil28/emp_MumbleCore/blob/main/BinSearch%20Time%20and%20LinSearch%20Time.png)

TARGET: <code>SIZE*Math.random()</code>
| SIZE | TRIALS | BinSearch Time for all Trials (milliseconds)  | LinSearch Time for all Trials (milliseconds) |
|-----------------|:-------------|:---------------:|---------------:|
| 6         | 10000         | 1      | 2                   |
| 60        | 10000         | 1      | 11                  |
| 600       | 10000         | 2      | 65                  |
| 6000      | 10000         | 2      | 337                 |
| 60000     | 10000         | 2      | 1305                |
| 600000    | 10000         | 2      | 43273               |
| 6000000   | 10000         | 2      | 141976              |
| 60000000  | 10000         | 3      | 1345215             |
| 210000000 | 10000         | 1      | 2466126             |

The recorded time shows the time needed to search for the target <code>TRIALS</code> amount of times. 

![alt text](https://github.com/lineil28/emp_MumbleCore/blob/main/BinSearch%20Time%20and%20LinSearch%20Time.png)
## Conclusions
* As we can see from the table and bar graph above, BinSearch clearly takes less time than LinSearch. As the size increases by multiples of 10, the time needed to complete 10,000 trials of the search grows exponentially.
* Interestingly enough, when the size was very small, 6, LinSearch actually took less time than BinSearch!
* When the target was random, LinSearch still took more time to run than BinSearch, but the times were not as large. This is because the random target was most likely not the worst case scenario. 
* In conclusion, BinSearch takes less time to run than LinSearch. 
