## Object Oriented Programming Lab5  

The objective of this lab is to test the understanding of inheritance in Java.<br>

The problem statement is defined in the javadoc provided. Please go through the notes below for additional information.<br>

**Steps to get started**:
1. Go through the `LabStatement.pdf` to get a better explanation of the problem statement.
1. Download the docs.zip and extract it.
1. Open index.html page. This page contains all the information about the class and methods to be created. 
1. For this lab, you have to create five classes named `SchoolMember`, `Teacher`, `Student`, `PartTimeStudent` and `FullTimeStudent`. Define the properties, methods and classes as described in the javadoc. 
1. It would be helpful if you create the classes in the same order as the tests are progressive in nature. Attempt the problem, testcase by testcase(as described below) to get the best of the partial marking scheme. 
1. Go through the javadoc carefully, and take care of the method signatures. 
1. No main method has to be created in any class. 
1. Make sure the parameter types, return types, and print statements match exactly as given in the javadoc.
1. Create a repository named `Lab5` on your Gitlab account and upload your solution according to the directory structure and filenames provided in the AutolabJS instructions and javadoc.
1. Submit on AutolabJS for `Lab5`.

**Note**: 
1. There are 9 test cases with 1 test case of 2 marks and the rest for 1 mark each.
1. All calculations are of integer type. Do not use any other datatype for the same.
1. You can submit any number of times till the deadline ends. 
1. For final consideration, only your best score across all submissions will be taken.


**Instructions for using Eclipse IDE**
1. Use Eclipse Photon June2018 edition.
1. Create a new java project by navigating to 
	`File->New->Java Project`
1. Enter the Name your project and make a note of the eclipse-workspace location, or set it to a location you are comfortable with. Click on Finish to finish the setup
1. Upon creation you can see all the files available in the Package Explorer sidebar. If it is not visible by default you can turn it on by 
	`Window->Show View->Package Explorer`
1. You can add classes to your project by right click on `src` folder in the Package Explorer and `New->Class`.  Please make sure the `Package` textbox is empty.
1. While pushing code to gitlab, make a new folder coressponding to the Lab name, i.e. `Lab5` and copy the classes created from `<eclipse-workspace>/<name-of-the-project>/src` folder to `java` folder inside `Lab5`.<br>
For example, if eclipse-workspace was `/home/user/eclipse-workspace/` and the name of the project was `LabAnswer`, then the files to be copied are in `/home/user/eclipse-workspace/LabAnswer/src/`. Copy these java files to the location `Lab5/java/`.
1. Use the default way to upload code from `Lab5` folder.
1. Everytime you make a change, you will have to copy the modified code back to the Lab folder, i.e. in the above case into the `Lab5/java` folder and then push the code

**Test Cases(In correct order)**:

|Classes Tested| Methods Tested | Marks|
|:------------:|:--------------:|:----:|
|    Teacher   |  floatCourse() |   1  |
|    Teacher   |  addFeedback() |   1  |
|    Teacher   | getAverageFeedback() <br> promoted()|1|
|    Student   |  registerCourse() |   1  |
|    Student   |  addGrades() |   1  |
|    Student   | getAverageGrade() <br> promoted() |1|
|    Student   | removeCourse() <br> getNumberOfCourses() |1|
|Student <br> PartTimeStudent <br> FullTimeStudent| getMinCredits() |1|
|      All     |  toString()    |   2  | 

