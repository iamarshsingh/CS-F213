## Object Oriented Programming Lab9  

The objective of this lab is to test the understanding of file operations and I/O in Java.<br>

The problem statement is defined in the javadoc provided and Lab Statement. Please go through the notes below for additional information.<br>

**Steps to get started**:
1. Go through the `LabStatement.pdf` to get a better explanation of the problem statement.
1. Download the docs.zip and extract it.
1. Open index.html page. This page contains all the information about the class and methods.
1. For this lab, you have to create only **one** class named `HotelBill`. Reuse the other classes given in the `student_template.zip`. **Do not use your own classes from the last labs.** 
1. Define the properties, methods and classes as described in the javadoc. 
1. Only the necessary javadoc has been given. You have to determine the usage and placement of exceptions and error handling idioms. 
1. It would be helpful if you create the classes in the same order as the tests (given below) are progressive in nature. Attempt the problem, testcase by testcase(as described below) to get the best of the partial marking scheme. 
1. Go through the javadoc carefully, and take care of the method signatures. 
1. Main method has to be created in `HotelBill` class. 
1. Make sure the parameter types, return types, and print statements match exactly as given in the javadoc.
1. Create a repository named `Lab9` on your Gitlab account and upload your solution according to the directory structure and filenames provided in the AutolabJS instructions and javadoc.
1. Submit on AutolabJS for `Lab9`.

**Note**: 
1. There are 4 test cases in total. (Marking Scheme below)
1. All calculations are of integer type. Do not use any other datatype for the same.
1. Take care of the string format at the required places. Do not expect marks if you fail to follow the string formats given.
1. You can submit any number of times till the deadline ends. 
1. For final consideration, only your best score across all submissions will be taken.


**Instructions for using Eclipse IDE**
1. Use Eclipse Photon June2018 edition.
1. Create a new java project by navigating to 
	`File->New->Java Project`
1. Enter the Name your project and make a note of the eclipse-workspace location, or set it to a location you are comfortable with. Click on Finish to finish the setup
1. Upon creation you can see all the files available in the Package Explorer sidebar. If it is not visible by default you can turn it on by 
	`Window->Show View->Package Explorer`
1. You can add classes to your project by right click on `src` folder in the Package Explorer and `New->Class`.
1. While pushing code to gitlab, make a new folder coressponding to the Lab name, i.e. `Lab9` and copy the classes created from `<eclipse-workspace>/<name-of-the-project>/src` folder to `java` folder inside `Lab9`.<br>
For example, if eclipse-workspace was `/home/user/eclipse-workspace/` and the name of the project was `LabAnswer`, then the files to be copied are in `/home/user/eclipse-workspace/LabAnswer/src/`. Copy these java files to the location `Lab9/java/`.
1. Use the default way to upload code from `Lab9` folder.
1. Everytime you make a change, you will have to copy the modified code back to the Lab folder, i.e. in the above case into the `Lab9/java` folder and then push the code

**Test Cases**

|Test Case|Class Tested|Marks|
|:-------:|:----------:|:--:|
|1| FileNotFoundException handled in readContent() | 1 |
|2| readContent() method works correctly | 4 |
|3| writeResult() | 2 |
|4| main() and getCost() | 3 |

Note: 
1. Main() method uses all the methods of this class. If the above 3 test cases do not work, main() method will **not** work.
1. There is no partial marks for readContent() method. It should work correctly according to the description given.
 