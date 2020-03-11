# problem-Marcs_Cakewalk

1-Review:

Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to expend those calories. If Marc has eaten cupcakes so far, after eating (j) a cupcake with (c) calories he must walk at least miles (2^j * c) to maintain his weight.

For example, if he eats 3 cupcakes with calorie counts in the following order: [5,10,7], the miles he will need to walk are (2^0 * 5) + (2^1 * 10) + (2^2 * 7) = 5 + 20 + 28 = 53. This is not the minimum, though, so we need to test other orders of consumption. In this case, our minimum miles is calculated as (2^0 * 10) + (2^1 * 7) + (2^2 * 5) = 10 + 14 + 20 = 44.

Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order. 

2-Input Format

The first line contains an integer (n) the number of cupcakes in calories.
The other line contains (n) integers calories[i].

3-Output Format

Print a long integer denoting the minimum number of miles Marc must walk to maintain his weight. 

EX:

1-Input:

    4
    
    7
    4
    9
    6
    
2-Output:

    The minimum number of miles Marc must walk to maintain his weight: 79.0
