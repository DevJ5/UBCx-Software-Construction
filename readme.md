There are four phases in our design approach (often applied in a circular way): specification of public interface, usage scenarios, test specification, and finally implementation. 

1) Create a model - UML

Together with a UML start thinking about usage scenarios by putting stubs in for all the methods in the class. These stubs include the proper signature (name, parameter list) and full specifications.

Specification consists of:

- // REQUIRES: a REQUIRES specification of a method indicates the preconditions of running that method. 
- // MODIFIES: The MODIFIES clause indicates whether a method, or any method it calls, mutates any object.
- // EFFECTS: The EFFECTS clause indicates the purpose of the method -- describing the work that the method does and returns. 

2) Use the main method to write out a flow of the program. Add new methods to the class if needed.

3) Test our methods. For each test case, we write a method in our Test class, and annotate it with @Test 

We write the set up code for each test, and put it in the set up method, and annotate that method with @BeforeEach
Then we write comments to indicate the 3 parts of the test: 
- I. check that the set up is correct, 
- II. invoke behaviour to test, 
- III. check that the outcomes were expected. 

4) Implement according to the specification and run the tests on the method.