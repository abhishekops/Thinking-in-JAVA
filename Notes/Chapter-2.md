## Everything is an Object

* Objects
  * Reference
    * Ex: String s;
    * The above is just a reference, but throws an exception when you send a message to `s`.
    * Instead, its safer to initialise when object reference is created like String s = "asdf".
  * Creation
    * Objects are created with new keyword.
      * String s = new String("asdf");.
  * Where storage lives
    * Registers
      * Fastest storage available inside processors
      * Usually abstracted
      * Limited allocation to size constraints
    * Stack
      * RAM
      * Very fast and efficient.
      * Access from processor is available via stack pointer.
      * Move down to create new memory & move up to release memory
      * Java system must know the exact lifetime.
      * Static and limits flexibility
    * Heap
      * Dynamic
      * Compiler doesn't need to know the lifetime.
      * More flexiblity.
      * Price to pay as we need to cleanup memory
      * Slow to allocate.
      * `new` is used to create object, storage is allocated in the heap.
    * Constant storage
      * Never change.
      * Usually placed in the program code.
      * Usually stored in ROM in emebedded systems.
    * Non-RAM storage
      * Storage required when data resides outside the program
        * Ex: Streaming of bytes, persistence
      * Data stored outside program when program is not running so that it can be loaded when needed with persistence.
      * Java supports lightweight persistence and provides support for JDBC and hibernate for much sophisticated storage.
* Primitive types
  * When objects are created with `new`, JVM places them on the heap.
  * To avoid this, primitive types have been introduced so these can be automatic variable can be created and assigned a value and be placed on the stack.
  * Java determines the size of each primitive type.
  * Types
    * Boolean (size?? --> precisely take only literal values of `true` and `false`.)
    * Byte (8 bits)   - false
    * Char (16 bits)  - ‘\u0000’ (null)
    * Short (16 bits) - o
    * Int   (32 bits) - o
    * Long  (64 bits) - oL
    * Float (32 bits) - o.of
    * Double (64 byes) - o.od
    * Void  (size??)
  * Default values are only used when part of class, otherwise its an error during compile time.
  * Uninitialised local variables that are not part of a class are assigned an arbitrary value.
    * Throws a compile time error that variable is not initalised.
  * Wrapper classes for primitive types allow to make non-primitive object on heap for primitve types.
    * char c = 'x';
    * Character ch = new Character(c);
    * Autoboxing
      * Convert from primitive to wrapper type
        * Character ch = ‘x’;
        * And back 
        * char c = ch;
    * Uses??? --> Later chapters
  * How are signed types stored?
  * High precision numbers
    * BigInteger
    * BigDecimal
    * No primitive types available.
    * Provide analouge of primitive type operations.
  * Arrays
    * Guaranteed to be initialised and cannot be accessed outside its range.
    * Java arrays are safe unlike C or C++.
    * When you create an array of objects, its creating references to special keyword null.
  * Lifetime of objects
    * Java simpliefies by doing the cleanup.
    * Scope defines the visibility and lifetime of names defined.
    * Java objects don't have same scope as primitives.
  * Methods, Arguments and Return Values
    * in C & C++, function is used to describe a named subroutine.
    * Java uses `method` which is a way to do something.
    * Methods
      * Determine messages received for an object.
      * Have name, arguments, return type and body.
      * Method name and argument list form a signature for the method which is uniquely identified.
      * Return type defines what type is returned when called, and arguments also mention type.
      * They can only be created as part of the class, and called for an object, and object must be able to perform a method call.
      * Object-oriented programming is often summarized as simply “sending messages to objects, where message is a method rather loosely used.
    * Arguments
      * When handing objects around, you are passing references, with the type specified.
    * Return
      * Has a type
      * you can have no return value for a method when void is used.
    * Building Java program
      * Name Visibility
        * Name clashing is avoided by reverse domain name structure for packages.
        * forward referencing ???
        * Class name clashing can happen with same classname in different files.
        * `import` tells the compiler to bring in a package, which is a library of classes, prevents class name clashing.
          * import java.util.ArrayList;
          * import java.util.*;
      * Static
        * Generally, methods are defines in classed and objects are created and storage is allocated and then used to call the methods.
        * But, we might need single piece of storage of particular field, irrespective of how many objects are created or no objects or created.
        * And, the other is create a method not associated with any object of the class.
        * Static - means that particular field or method is not tied to any particular object instance of that class.
        * Data methods and class methods in some languages.
          * Class methods or fields is what static represents.
        * <code>class StaticTest { static int i = 47;}</code>
        * Can be called in two ways
          * <code>StaticTest st1 = new StaticTest();</code>
          * <code>StaticTest.i;</code>
        * Using the class name is the preferred way to refer to a static variable.
        * Constants vs Static variables ???