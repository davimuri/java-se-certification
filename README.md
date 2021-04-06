# Java 11 SE Certification
This repo contains some notes and code that I did during preparation for OCP java 11 SE certification (exam code 1Z0-819).
It took me 60 hours of study to pass the exam. 
This is not a complete list. 
It is just a list of things that I needed additional study apart from the acquired knowledge 
I got from my usual job and experience with Java.

## Topics

### Control Flow
* continue and break with labels.

### Automatic Type Promotion
* byte > short > int > long > float > double > Autoboxing

### Method Overloading
* Method to apply depends on type precedence order: primitive widening > boxing > varargs
* Overloading methods take: modifier, method name and parameter types. You can narrow accessibility
  (e.g. from public to private)

### InnerClasses
* Innerclass inside a method

### Object Creation
* Constructor call order for a subclass. Superclass and subclass have their own constructors.

### Object References
* [Arguments passed by value](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value) 
* Dereferencing a variable (objRef = null) inside a method doesn't make the outside reference dereferenced.

### Interfaces
* By default, all public methods and all methods without modifiers are public abstract.
* By default, all fields are public static final.
* Protected methods are not allowed
* Final methods are not allowed

### Collections
* Arrays.asList(...) Returns a fixed-size list backed by the specified array.
  Changes made to the array will be visible in the returned list,
  and changes made to the list will be visible in the array
* List.copyOf(Collection) returns an unmodifiable list
* List.of(...) returns an unmodifiable list

### Generics
* [Covariance and Contravariance](https://dzone.com/articles/covariance-and-contravariance)

### Enums
* Constructors are private by default. Public constructor generates a compilation error.
* All enums extend from java.lang.Enum abstract class which implements Comparable and Serializable.
* https://javaconceptoftheday.com/18-points-every-java-developer-should-know-about-enums-in-java/

### Exceptions
* Identify the right catch given a hierarchy of exceptions.
* A return inside a catch skips the remaining code after the try catch block but still the finally is executed.

### Try-with-resources
* If both, the try block and the try-with-resources statement throw exceptions,
  the exception that is thrown is the one from the try block. The exception from the try-with-resources statement
  is suppressed and can be retrieved by getSuppressed() method.
* In a try-catch conventional block, the exception thrown is the one in the finally, and the suppressed exception
  is the one from the try block.
* You can add catch and finally blocks. They are executed after closing the resources.
* The statements in the try-with-resources statement are closed in reverse order of creation.

### Annotations
* How to define an annotation
* Valid locations to put annotations
* @SuppressWarnings
* @SafeVarargs

### IO
* Path relativize()
* How to use FileChannel
* How to get BasicFileAttributeView and what info we can get from that.

### I18N
* [How a Resource Bundle relates to Locale](https://docs.oracle.com/javase/tutorial/i18n/resbundle/concept.html)
* Ways to create a Locale (new Locale(“ru”))

### JDBC
* How to set NULL in a PreparedStatement. There is a method setNull(index, type) or setObject(index, object).
  Caveat: set methods for primitive data types (setInt(), setLong(), setFloat(), ...) will cause NullPointerException
  if you send a null wrapper object (Integer wrapper = null;)
* Previous set values in a PreparedStatement are kept between execute calls unless you call setXXX() again.

### Threads
* Thread.sleep() throws InterruptedException when another thread calls interrupt() method on the sleeping thread.
* Trying to start a thread that already finished throws IllegalThreadStateException.
* ExecutorService. Understand execute(), submit(), invokeAny(), invokeAll().

### Security
* [AccessController.doPrivileged()](https://www.selikoff.net/2020/11/05/819-security/)
* [API for priviledge blocks](https://docs.oracle.com/javase/7/docs/technotes/guides/security/doprivileged.html)

### Garbage Collection
* Array with references to object of a specific class. Some array elements points to same instances.
  Tell how many objects are for garbage collector.

### Modules
* An unnamed module: All classes loaded from classpath
* Automatic modules have access to the unnamed module
* [jlink](https://www.baeldung.com/jlink)
* [What is an automatic module](https://stackoverflow.com/questions/46741907/what-is-an-automatic-module) 
* [Automatic modules example](https://www.logicbig.com/tutorials/core-java-tutorial/modules/automatic-modules.html)
* [Service in modules](https://dzone.com/articles/java-9-module-services)
* Declare a module that uses a service from other module

### Jdeps
* Calling jdeps with summary and .class file
