# Java Data Types and Memory Allocation

## 1. Primitive Data Types in Java
Primitive data types are the basic building blocks of data manipulation in Java. They are predefined by the language and store simple values.

| **Type**   | **Size**    | **Default Value** | **Range**                        | **Usage**                         |
|------------|-------------|------------------|---------------------------------|----------------------------------|
| `byte`     | 8 bits      | 0                | -128 to 127                     | Small integers, memory-efficient  |
| `short`    | 16 bits     | 0                | -32,768 to 32,767               | Larger range than `byte`         |
| `int`      | 32 bits     | 0                | -2^31 to 2^31-1                 | Default for integers             |
| `long`     | 64 bits     | 0L               | -2^63 to 2^63-1                 | Large integers                   |
| `float`    | 32 bits     | 0.0f             | Approx. 6-7 decimal digits      | Single-precision floating point  |
| `double`   | 64 bits     | 0.0d             | Approx. 15-16 decimal digits    | Double-precision floating point  |
| `char`     | 16 bits     | `\u0000`         | 0 to 65,535 (Unicode characters)| Store characters                 |
| `boolean`  | 1 bit       | `false`          | `true` or `false`               | Logical values                   |

**Notes**:
- Primitive types are **stored in Stack memory**.
- They are passed **by value** during method calls.
- They do not support methods.

---

## 2. Non-Primitive Data Types in Java
Non-primitive types are created by the programmer and include objects, arrays, and classes.

| **Type**            | **Examples**                   | **Stored In**        | **Characteristics**                       |
|---------------------|--------------------------------|----------------------|-----------------------------------------|
| `String`            | "hello", `new String()`       | Heap Memory          | Immutable, supports methods              |
| Arrays              | `int[] arr = new int[5];`     | Heap Memory          | Fixed size, index-based access           |
| Classes/Objects     | `Student s = new Student();`  | Heap Memory          | Blueprint for objects, dynamic allocation|
| Interfaces          | `interface MyInterface`       | Metaspace            | Defines abstract behavior                |
| Collections         | `List`, `Set`, `Map`          | Heap Memory          | Dynamic and resizable                    |

**Notes**:
- Non-primitive types store references **in Stack**, but the actual data resides in **Heap memory**.
- Strings are immutable objects.

---

## 3. Memory Allocation in Java
Java divides memory into different regions to manage data efficiently:

### Stack Memory
- **Stores**: Local variables, method calls, function parameters.
- **Type**: Static memory allocation.
- **Scope**: Exists until the method ends.
- **Speed**: Fast access.
- **Example**:
    ```java
    int x = 5;   // Stored in Stack memory
    ```

### Heap Memory
- **Stores**: Objects, class instances, and arrays.
- **Type**: Dynamic memory allocation.
- **Scope**: Exists until Garbage Collection.
- **Speed**: Slower than stack.
- **Example**:
    ```java
    String s = new String("hello");  // Stored in Heap memory
    ```

### Metaspace (Method Area)
- **Stores**: Class metadata, static variables, runtime constant pool.
- **Scope**: Exists until the JVM shuts down.

### Program Counter (PC) Register
- **Stores**: Address of the currently executing instruction for a thread.

### Native Method Stack
- **Stores**: Data for native methods (e.g., methods written in C or C++).

---

## 4. Difference Between Stack and Heap Memory

| **Aspect**            | **Stack Memory**                   | **Heap Memory**                    |
|-----------------------|------------------------------------|------------------------------------|
| **Purpose**           | Stores local variables and method calls | Stores objects, arrays, and class data |
| **Allocation**        | Static memory allocation           | Dynamic memory allocation          |
| **Speed**             | Fast                              | Slower                            |
| **Lifetime**          | Exists until method execution ends | Exists until garbage collection     |
| **Storage**           | Primitive data, references         | Actual objects, class instances     |
| **Access**            | Sequential                        | Random                             |

---

## 5. Methods in Java
Java supports various method types based on their behavior and usage.

### 5.1 **Based on Parameters and Return Type**
| **Type**                      | **Definition**                                               | **Example**                     |
|-------------------------------|-------------------------------------------------------------|---------------------------------|
| **No Parameter, No Return**   | Method takes no input and returns nothing.                  | `void display()`                |
| **Parameter, No Return**      | Method takes input but returns nothing.                     | `void display(int a)`           |
| **No Parameter, With Return** | Method takes no input but returns a value.                  | `int getValue()`                |
| **Parameter, With Return**    | Method takes input and returns a value.                     | `int add(int a, int b)`         |

### 5.2 **Static vs Instance Methods**
| **Type**          | **Definition**                                         | **Example**                         |
|-------------------|-------------------------------------------------------|-------------------------------------|
| **Static**        | Belongs to the class, called without creating objects.| `public static void main()`         |
| **Instance**      | Belongs to objects, requires an object to be called.  | `public void display()`             |

### 5.3 **Abstract Methods**
- Declared **without implementation** (only in abstract classes or interfaces).
```java
abstract void display();
```

### 5.4 **Final Methods**
- Cannot be overridden in subclasses.
```java
final void display() {
    System.out.println("Hello");
}
```

### 5.5 **Synchronized Methods**
- Used in multithreading to ensure only one thread accesses a method at a time.
```java
synchronized void printData() {
    // Critical section
}
```

---

## 6. Key Interview Points
1. **Primitive vs Non-Primitive Data Types**:
   - Primitives are basic types; non-primitives store references.
   - Primitives are stored in **Stack**, objects in **Heap**.

2. **Memory Allocation**:
   - **Stack**: Fast, stores method calls, local variables.
   - **Heap**: Dynamic, stores objects and arrays.

3. **String Immutability**:
   - Strings are immutable for **security, performance, and thread safety**.

4. **Static vs Instance Methods**:
   - Static methods belong to the class.
   - Instance methods belong to objects.

5. **Garbage Collection**:
   - Automatically deallocates memory for unreferenced objects in **Heap memory**.

---

## Summary
- Java supports **primitive types** for efficiency and **non-primitive types** for flexibility.
- Memory is divided into **Stack** (method calls, local variables) and **Heap** (objects, dynamic data).
- Methods can be classified as static, instance, abstract, or synchronized.
- Key concepts like memory allocation, method types, and object behavior are essential for interviews.
