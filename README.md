# Word-Puzzle
Generates a random grid of letters and identifies the words as in the given database file in all directions 


It takes in the size of rows and columns from the user. The program then generates a grid. A database of words names "dictionary.txt" is given. The program matches the words in the dictionary to the words found in grid (all 8 directions) and displays all such words. Hash tables are used for this purpose. WOrds are stored in hash tables. Two algorithms were used. 

In the first algorithm (without enhancement),  prefix matching is not used. 
In the second algorithm (with enhancement), prefix matching is used. The program checks words from a point in the grid in all the 8 directions inboth cases. But in second case, if it matches the prefic using a flag. For example, while in the grid, let us suppose, in upward direction, it finds "aaa", if there is not word starting from "aaa" in given databse of words, the program wont look further. The program did not do this when it used the first algorithm. 

Finally, timing of two algorithms are compared. As expected, the second algorithm above does the work efficiently. 
