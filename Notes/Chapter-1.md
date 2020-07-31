## Introduction to Objects

* Why OOPs?
    * Thinking about problem instead of system (C lang used to think in terms of system)
    * Reusability
    * Time and complexity for writing robust code
    * Security (How to protect data earlier)
* Compile time vs Run time
* Types
    * Default - Non specified type with access within the package
    * Public - Universal access (Outside package?)
    * Private - Only within itself
    * Protected - Inheritance (non private methods)
* Reusability
    * Member object
        * Object created for a call in another class
        * Member objects are private
    * Composition
        * Process of composing a new class from existing classes.
        * Member objects can be changed at run time dynamically.
        * Referred to as has-a-relation
        * Aggregation
            * If composition happens dynamically - its called aggregation.
        * Examples
    * Casting ??
        * Upcasting
        * Downcasting
    * Late binding and Early binding
    * Inheritance
        * Compile time restrictions
        * Dynamic modification is not possible.
    * Difference between Composition & Inheritance (Base class modified)
    * Overriding
        * Re-implement base class methods
* Containers
    * Dynamic size
    * Holds information about other objects, holds references
    * Types
        * Lists
        * Maps
        * Sets
        * Trees
        * Stacks
        * Queues
* Generics (Parameterised Types)
    * Down-casting is dangerous - causes run time errors if there is a type mismatch
    * If everything is an object, type might be different
    * So, a specific type down the hierarchy is required for efficient and faster runtime, and explicit mentioning ensures safety at the compile time due to checks.
* Object creation and Lifetime
    * Non-trivial
    * As different types might be referencing the objects and you wouldn’t know when its work is done
    * Also, you wouldn’t know if its appropriate to do it immediately as it might effect runtime speed of the program.
    * In C++ you need to explicitly delete objects.
    * Static objects - Stack
        * Compiler knows when to clean
    * Dynamic objects - Heap
        * As these objects are created dynamically, compiler has no knowledge of these objects, hence garbage collector is needed.
        * How will garbage collector know when to clean memory?
* Exception Handling
    * Compile time errors 
        * Exception is an object thrown from the error site and needs to be addressed before you can proceed
* Concurrent Programming
    * Why are hardware interrupts difficult and non-portable
    * Interrupts are used for time critical tasks
    * Languages abstract multiple processors and deal with the complexity of concurrency
    * History of processors
        * When did multi processor first come
        * Which programming language used multi processing for the first time
    * Shared resources
        * Two tasks can’t have access to the same resource at a time, such as a printer.
        * Locks are used so the task can have exclusive access, complete the task and release the lock to the resource.
    * 
