# SoEnegy Web Test

INSTRUCTIONS ON HOW TO RUN THESE TESTS

***This is a test framework created using Java & Cucumber ***

***Dependancies are added to the project via maven ***

***Java 15 is required to run these tests ***

1) Clone project
2) Right click on POM file and select 'Build Project' to get all the dependancies
2) To run the tests via the command line, cd to the root of the project and run:

-- mvn clean test

***Notes***

I Have set these tests up to run via github actions everytime a new push is made to the repo you can see the results of the last github action test run here:

https://github.com/joe-elmoufak/SoEnergy/actions

In the action workflow file "maven.yml" I have added some steps to make the test run on linux -> Download Java -> Install Chrome browser via a SH script -> run tests using the test runner.

Reports are stored in Target -> HTML reports file

# Improvements to make

Invest more time in better element selectors that would be less flakey (the test site wasnt great for hooks!)

I left a thread sleep in one of the classes. Need to remove and replace with a wait condition.

More asseertions. Eg when initially selecitng the product... I could store the name and price in a var and check that it matches up with the name and price in shown in the basket (more assertions like this would be good)

Add a switch in the command line to choose headless or not headless running mode

Add more Browsers to run the tests with

Add parallel test run functionality

Add automatic test rerun for failed tests

Add nicer reports
