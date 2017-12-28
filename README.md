[![facebook](https://github.com/nagendramca2011/Scala/blob/master/social/facebook.png)](https://www.facebook.com/nagendramca4u)
[![google-plus](https://github.com/nagendramca2011/Scala/blob/master/social/google-plus.png)](https://plus.google.com/u/0/107349924696808464956)
[![twitter](https://github.com/nagendramca2011/Scala/blob/master/social/twitter.png)](https://twitter.com/nagendramca2011)
[![github](https://github.com/nagendramca2011/Scala/blob/master/social/github.png)](https://github.com/nagendramca2011)

Design Pattern
==============

### What is the design pattern?

If a problem occurs over and over again, a solution to that problem has been used effectively. That solution is described as a pattern. The design patterns are ***language-independent*** strategies for solving common object-oriented design problems. When you make a design, you should know the names of some common solutions. Learning design patterns is good for people to communicate each other effectively. In fact, you may have been familiar with some design patterns, you may not use well-known names to describe them. SUN suggests GOF (Gang Of Four--four pioneer guys who wrote a book named "Design Patterns"- Elements of Reusable Object-Oriented Software), so we use that book as our guide to describe solutions. Please make you be familiar with these terms and learn how other people solve the code problems.

### Do I have to use the design pattern?

If you want to be a professional Java developer, you should know at least some popular solutions to coding problems. Such solutions have been proved efficient and effective by the experienced developers. These solutions are described as so-called design patterns. Learning design patterns speeds up your experience accumulation in ***OOA/OOD***. Once you grasped them, you would be benefit from them for all your life and jump up yourselves to be a master of designing and developing. Furthermore, you will be able to use these terms to communicate with your fellows or assessors more effectively.

Many programmers with many years’ experience don't know design patterns, but as an Object-Oriented programmer, you have to know them well, especially for new Java programmers. Actually, when you solved a coding problem, you have used a design pattern. You may not use a popular name to describe it or may not choose an effective way to better intellectually control over what you built. Learning how the experienced developers to solve the coding problems and trying to use them in your project are a best way to earn your experience and certification.

Remember that learning the design patterns will really change how you design your code; not only will you be smarter but will you sound a lot smarter, too.

### What is the relationship among these patterns?

Generally, to build a system, you may need many patterns to fit together. Different designer may use different patterns to solve the same problem. Usually:

-   Some patterns naturally fit together
-   One pattern may lead to another
-   Some patterns are similar and alternative\*
-   Patterns are discoverable and documentable
-   Patterns are not methods or framework
-   Patterns give you hint to solve a problem effectively

### Where to use & benefits

-   One request should be handled by more than one object.
-   Don't know which object should handle a request; probably more than one object will handle it automatically.
-   Reduce coupling.
-   Flexible in handling a request.
-   Related patterns include
-   Composite, which a chain of responsibility pattern is often applied in conjunction with.

### Example

The ***Java Servlet*** filter framework is an example of chain of responsibility design. Note that the ***chain.doFilter()*** is the method that should be called to make the chain roll. If the subclass missed it, the whole chain would be stopped or blocked.

Java ***exception handling*** is another example of chain of responsibility design. When an error occurs, the exception call will look for a handling class. If there is no handler, the super Exception class will be called to throw the exception. Otherwise, the handler class will handle it.

Here comes a simple example, just to show how chain of responsibility works. Whenever you spend company's money, you need get approval from your boss, or your boss's boss. Let's say, the leadership chain is:

Manager--&gt;Director--&gt;Vice President--&gt;President

### Creational Pattern

Creational design patterns are concerned with `the way of creating objects`. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).

-   [Factory Method Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Factory%20Method.md)
-   [Abstract Factory Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Abstract%20Factory.md)
-   [Singleton Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Singleton.md)
-   [Prototype Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Prototype.md)
-   [Builder Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Builder.md)
-   [Object Pool Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/creational/Object%20Pool.md)

### Structural Pattern

`Structural design patterns` are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns `simplifies the structure by identifying the relationships`.

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

-   [Adapter Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Adapter.md)
-   [Bridge Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Bridge.md)
-   [Composite Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Composite.md)
-   [Decorator Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Decorator.md)
-   [Facade Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Facade.md)
-   [Flyweight Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Flyweight.md)
-   [Proxy Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/structural/Proxy.md)

### Behavioral Pattern

Behavioral design patterns are concerned with `the interaction and responsibility of objects`.

In these design patterns,`the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled`
.

That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.

-   [Chain of Responsibility](https://github.com/nagendramca2011/DesignPatterns/blob/master/behavioral/Chain%20of%20Responsibility.md)
-   [Command Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/behavioral/Command%20Pattern.md)
-   [Interpreter Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/behavioral/Interpreter%20Pattern.md)
-   [Iterator Pattern](https://github.com/nagendramca2011/DesignPatterns/blob/master/behavioral/Iterator%20Pattern.md)

