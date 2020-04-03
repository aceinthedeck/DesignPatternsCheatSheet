## Creational Patterns

### Singleton

- Guarantees a single instance.
- only one instance created.
- lazily loaded.
- Guarantees control of resource.
- Example - Spring framework, runtimes

Design

- Class is responsible for lifecycle
- Static in nature
- Needs to be thread safe
- Private instance
- Private constructor
- No parameter required for constructor

Pitfalls 
- Overused
- Difficult to unit test.
- If not careful, not thread safe.

### Builder

- Handles complex structures.
- Large number of parameters.
- Ensures immutability.
- Example String builder, Document builder.

Pitfalls
- It has to be designed first.
- It is complicated to code.

### Prototype
- Avoids costly creation.
- It avoids subclassing.
- It doesn't use keyword new.
- Often uses an interface.
- Usually implement with a registry.
- Example java.lang.Object.clone()

Design
- Prototype is a great fit if object creation is expensive and it is better to copy member variables.
- Implements the clone() method in the interface thus avoids new keyword (ie object creation).
- although a copy, each instance is unique.
- Shallow vs deep copy.


Factory Method

Abstract Factory Method
