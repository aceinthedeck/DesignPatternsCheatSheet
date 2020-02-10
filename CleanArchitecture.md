- Structured programming is discipline imposed upon direct transfer of control.
- Object-oriented programming is discipline imposed upon indirect transfer of control.
- Functional programming is discipline imposed upon variable assignment.

## SOLID principles
The SOLID principles tell us how to arrange our functions and data structures into classes, and how those classes should be interconnected

### SRP (Single responsiblity principle)
Each software module has one and only one reason to change.

### OCP (Open closed principle)
System should be open to extension and closed for modification.

### Liskov Substitution principle
This principle says that to build software systems from interchangeable parts, those parts must adhere to a contract that allows those parts to be substituted one for another. If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering any of the desirable properties of the program.

### Interface segregation principle
Clients should not be forced to depend upon interfaces that they do not use.

### DIP (The Dependency Inversion Principle)
The code that implements high-level policy should not depend on the code that implements lowlevel details. Rather, details should depend on policies.
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.
- If component A should be protected from changes in component B, then component B should depend on component A.
- Do not refer to volatile concrete classes, use interfaces instead.
- Do not dervice from volatile concrete classes.
- Do not override concrete functions, use abstract functions.
- DIP violations cannot be entirely removed, but they can be gathered into a small number of concrete components and kept separate from the rest of the system.

## Component cohesion

#### REP (Reuse/Release equivalence principle)
Reuse and release should not be done unless there is a release managment and versioning in place.

#### Common closure principle
- Gather into components those classes that change for the same reasons and at the same times. Separate into different components those classes that change at different times and for different reasons.
- A component should not have multiple reasons for change.
#### Common reuse principle (CRP)
- Do not force users of a component to depend on things they don't need.
- The CRP tells us more about which classes shouldn’t be together than about which classes
should be together. The CRP says that classes that are not tightly bound to each other should not be in
the same component.

## Component coupling
#### Ascyclic dependecies principle
- Allow no cycles in dependency graph

#### Stable dependencies principle
- The modules that are intended to be easy to change are not depeneded on by modules that are harder to change.

#### Stable abstraction principle
- A component should be as abstract as it is stable.




