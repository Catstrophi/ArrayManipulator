# ArrayManipulator
Array manipulator that creates array based on given index

It defines a class called arrayFInd.
The main method is the entry point of the program. It throws a FileNotFoundException.
Inside the main method, a 2D array of strings, arr, is declared and initialized with a size of 5x5.

A nested loop is used to fill the arr array with values. Each element is assigned a string representing its row and column indices.
A Scanner object named scan is created to read input from a file. The file path is provided as a parameter to the File constructor.
The next integer read from the file represents the number of lines to process.
A loop is used to iterate over the specified number of lines.

For each line, two integers are read from the file representing the row and column indices.
A message is printed indicating the current pattern's coordinates.
Another nested loop is used to print the pattern surrounding the specified coordinates.
The loop iterates over rows from row-2 to row+2 and columns from col-2 to col+2.

If the current indices are outside the bounds of the 5x5 array, a placeholder string (**) is printed.

If the current indices match the specified coordinates, a special indicator (<>) is printed.

Otherwise, the value from the arr array corresponding to the current indices is printed.
After printing each row of the pattern, a newline is inserted.
The process continues for the remaining lines read from the file.
