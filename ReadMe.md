# Introduction

## User Story
As a ...
I want ...
So that ...

In this sample project:
As a ...
I want ...
So that ...

## Good Points
- We can have 100% code coverage and still have missing tests.
- Creating an executable specification is an important benefit of TDD.
- Triangulation ==> when we rely on adding tests to drive out the missing implementation details.
- We must be able to skim-read a test and quickly see why it exists and what it does.
- Badly written code is hard to read. Sadly, it is easy to write.
- Dependency inversion, dependency injection, Inversion of Control (IoC) ==> runtime technique where we supply an implementation of an abstraction to code that depends on it.
- Stub = a test double (for an external system) that provides an input value to create predictability in our test.
- Mock = a test double (for an external system) that records interaction with SUT = "Did the SUT call the method correctly?" 

### SOLID Principle
SRP = Single Responsibility Principle - simple building blocks
DIP = Dependency Inversion Principle - hiding irrelevant details
LSP = Liskov Substitution Principle - swappable objects
OCP = Open-Close Principle - extensible design
ISP = Interface Segregation Principle - effective interfaces

- SRP: Do one thing and do it well. Have only one reason for a code block to change.
- DIP: Make code depend on abstractions and not on details.
- LSP: A code block can be safely swapped for another if it can handle the full range of inputs and provide (at least) all expected outputs, with no undesired side effects.
- OCP: Code should be **open to extension** but **closed to modification**.
- ISP: Keep interfaces small and strongly related to a single idea.

# Reference
Test-Driven Development with Java by Alan Mellor