# Calculator-1.0
Finished the basic Java course from programmieren-starten.de

First real practice project to consolidate what I've learned there.
A very basic calculator console application with 10 memory slots for the latest results.
Coded in a way that makes future extensions easy to do.
Humble beginnings...

Update May 8th 2022
Finished my little calculator app, learned a lot about basic console program flow control and how a scanner behaves
when a single input prompt must allow for different types of data to be read and process them accordingly.
With a scanner like that I found out that it seems to be best to just read the data into a String and from there
make junctions in the program flow depending on whether the input was strictly numeric via an .isNumeric()
boolean return method utilizing for example the Double.parseDouble(String) or Integer.parseInt(String) methods
of the corresponding Wrapper classes. Other approaches I've tried lead to weird results, trying to .nextDouble()
or .nextInt() from a scanner prompt will accept strictly a numeric input, or else a type mismatch exception is thrown
and the program terminated if left alone. And if the exception is handled the previous input seems to be just queued
and the next time the code asks for an input it will take the queued one instead of issuing a prompt, leading to bugs
in program flow. Also learned how to customize a memory array and a proper algorithm to write the results of the
calculations into the array in the order I want it to. Next up Tic Tac Toe.