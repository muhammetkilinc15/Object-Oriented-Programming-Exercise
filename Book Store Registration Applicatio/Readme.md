** Book Store Registration Application **

Book Class:
-----------
* Simple Java object that contains three instance variables; 
* String: name, 
* String: authorName,
* int: yearPublished. 
* The Book class should also implement a single public constructor and a public toString() 
method. The details of how toString() should operate can be observed from the visuals 
that are shared later in this assignment document.

BookStoreClerk Class:
----------------------
* This class is expected to handle the input information processing and supervision. For 
the specific BookStore application at hand, we only want input book information in the 
following format:
             “name-authorName-yearPublished” for example:
             "One Hundred Years of Solitude-Gabriel Garcia Marquez-1967"
* In other words, in order for our application to accept an input argument as a valid book 
information, the input string should contain exactly 2 hyphen characters ‘-’, which 
separates the 3 input variables that a book should have.
* To correctly implement the BookStoreClerk class, you are asked to complete its two 
methods, namely a private helper method partitionString() and a public method 
readAndValidateBook().

--> private String[] partitionString(String) <--

* As the name and the above description suggests, this method is expected to take a single String instance as input and return an array of Strings which contains three elements.
* These three Strings should be substrings of the original input where the separation is governed by the hyphen characters ‘-’. 
* Use any Java.String method of your choosing in order to complete this method. It should be noted that in case where partitionString() method fails to identify exactly 2 hyphen characters ‘-’ inside the input String argument, it should throw an IllegalArgumentException declaring that the input to the partitionString() method is invalid.
*  If book name is not given, throw an exception.
*  If author name is not given, throw an exception.
*  If publishing year is not given, throw an exception.
*  If the second separator is different from hyphen character ‘-‘, throw an exception.
* While throwing an exception, give detail information about what is missing in the input.

--> public Book readAndValidateBook() <--

* readAndValidateBook() throws InvalidBookException (we gave it to you) if the 
input is blank and/or empty. Otherwise, it calls partitionString() method to parse the  input and get individual parts. 
* These will be used to create and return a Book object if all the required information exists in the input with the desired format. 
* Bear in mind that partitionString() method returns an array of Strings however the yearPublished method needs to be int type. So Integer.parseInt() will be used to convert it to int. 
* Then these values are used to instantiate the Book instance. 

BookStore Class:
-------------------
* BookStore is the class that contains our main method, as it can be also observed from the template that is provided to you. 
* It initiates a BookStoreClerk object, creates a file object to read file, and scanner object to read file object. 
* While reading the each line of the file “books.txt”, print what that line is and assign readAndValidateBook method of BookStoreClerk class with the line to a Book instance.
* Last, print out toString method of Book class that you just initiated.
* toString method of the Book class should be filled by looking at following outputs.
* Also create a File and PrintWriter object to write accepted inputs to a file.
* Name your output file as “log.txt”.

InvalidBookException Class:
----------------------------
* We will give you this class which has a constructor method and extends the Exception 
class.
* The constructor takes one parameter which is a String and passes it to the super class


Output: 

![Screenshot (158)](https://user-images.githubusercontent.com/108901980/236651711-79f78651-07e2-41b9-b397-3f7f4eace6fa.png)


![Screenshot (159)](https://user-images.githubusercontent.com/108901980/236651697-161deac1-5269-4ea7-a761-d71093b4692c.png)
