Application that allows you to download an arbitrary HTML page
via an HTTP request to your computer's hard drive and outputs statistics on
the number of unique words to the console.

The order of execution of the program:
The main thread runs two methods in order
_reader.run();_
_util.displayingRows();_

The method establishes a connection to the url, and reads data from it as a string.
A class using _createLetterList();_ method, which selects words by the specified regex.
This method using a class Writer and its only method createNewFileAndRecordResult();
the input is a sorted string, and writes the lines to a new, created file **parse.txt**
in package resources.

Reading from a file **parse.txt** occurs from the class  _Util.displayingRows();_
The method already takes a ready-made file installed on the path, and performs a count
of unique words and saves it to a new file **result.txt** in package resources.

