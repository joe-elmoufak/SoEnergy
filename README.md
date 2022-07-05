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

In the action workflow file "maven.yml" I have added some steps to make the test run on linux -> Download Java -> Install Chrome browser -> run tests using the test runner.

Reports are stored in Target -> HTML reports file
