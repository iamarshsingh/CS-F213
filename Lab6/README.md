**Object Oriented Programming Lab6**

The objective of this lab is to understand the working of UML using StarUML.<br>

The problem statement is defined in the doc provided. Please go through the notes below for additional information.<br>


Steps to install StarUML:
1. This step is only required if you do not have StarUML present on your system with the java extension. If you already have StarUML, move to the next step.
1. There should be a `StarUML.AppImage` file on the Desktop. If not, download the same from Gitlab, and copy to the Desktop.
1. On the Desktop, first start `StarUML.AppImage` by double clicking the file. Once it opens, click on evaluate and now close it.
This step is needed to install the java extension which will be used to generate the java code.
1. If StarUML does not open by double clicking on the file icon, you need to give execute permissions to the file, to run it. You can run the following comand for the same:
    ```shell
     chmod a+x StarUML.AppImage   
    ```     

1. Now there should be a `master.zip` file available on your system in Downloads. If not present, the same can be downloaded from Gitlab.
1. Open a terminal in the directory where `master.zip` is present, and run the following command
    ```shell
     unzip master.zip -d ~/.config/StarUML/extensions/user
    ```     

1. Now, you can open `StarUML.AppImage` from the desktop and verify if the java extension has been successfully added to StarUML. Once it is done, you can start designing the lab problem.


Steps to get started:
1. Go through the `LabStatement.pdf` to get a better explanation of the problem statement.
1. Make sure the parameter types, return types, method names and variable names match exactly as given in the LabStatement.
1. Generate the java code for the UML diagram using the java extension, and submit only the java files `Building.java`, `CommercialBuilding.java`, `ResidentialBuilding.java`, `Mall.java`, `OfficeComplex.java`.
1. Create a repository named `Lab6` on your Gitlab account and upload your solution according to the directory structure and filenames  
   provided in the AutolabJS instructions and javadoc.
1. Submit on AutolabJS for `Lab6`.


Note:
1. There are 10 test cases for 1 mark each.
1. You can submit any number of times till the deadline ends.
1. For final consideration, only your best score across all submissions will be taken.
