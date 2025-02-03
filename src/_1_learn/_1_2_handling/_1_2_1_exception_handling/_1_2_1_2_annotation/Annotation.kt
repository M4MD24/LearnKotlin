package _1_learn._1_2_handling._1_2_1_exception_handling._1_2_1_2_annotation

import jdk.jfr.Name
import java.util.logging.Logger

/* Annotation Types ! */

/**
 * <h1>Types of Annotations</h1>
 *
 * <h2>1. Predefined Annotations</h2>
 *
 * <h3>1.1. Predefined Annotations</h3>
 *
 *
 *  * `@Deprecated`:
 *
 *
 * This annotation indicates that a class, method, or field is deprecated. It is similar to `@deprecated` but can be applied at the class level as well.
 *
 *
 *  * `@Override`:
 *
 *
 * This annotation ensures that a method is intended to override a method in its superclass. A compilation error will occur if the annotated method does not override a method in the superclass.
 *
 *
 *  * `@SuppressWarnings`:
 *
 *
 * This annotation suppresses compiler warnings for specific code or code patterns. It is often used when a developer is aware of a warning but has determined that it is safe to ignore.
 *
 *
 *  * `@SafeVarargs`:
 *
 *
 * This annotation suppresses warnings related to unsafe operations on variable argument lists. It is typically used on methods that accept a variable number of arguments of a generic type.
 *
 *
 *  * `@FunctionalInterface`:
 *
 *
 * This annotation indicates that an interface is intended to be a functional interface, meaning it has only one abstract method. Functional interfaces are often used in conjunction with lambda expressions.
 *
 *
 *
 *
 * <h3>1.2. Meta-Annotations</h3>
 *
 *
 *  * `@Retention`:
 *
 *
 * This annotation specifies how long an annotation should be retained. It has values like `SOURCE`, `CLASS`, and `RUNTIME`, indicating whether the annotation should be retained during compilation, in the class file, or at runtime, respectively.
 *
 *
 *  * `@Documented`:
 *
 *
 * This annotation indicates that the annotated element should be documented by tools that generate documentation.
 *
 *
 *  * `@Target`:
 *
 *
 * This annotation is used to specify where the annotation can be applied. It can be applied to types (classes, interfaces), fields, methods, parameters, and other program elements.
 *
 *
 *  * `@Inherited`:
 *
 *
 * This annotation indicates that the annotation type can be inherited by subclasses. It is used to annotate other annotations, suggesting that if a class is a subclass of an annotated class, it inherits the annotation.
 *
 *
 *  * `@Repeatable`:
 *
 *
 * This annotation indicates that the annotated annotation can be applied multiple times to the same element. It allows for a more concise syntax when using repeated annotations.
 *
 *
 *
 *
 * <h2>2. Custom Annotation</h2>
 */

fun main() {
    customNotation()
    deprecatedMethod()
    val logger = Logger.getLogger(Annotation::class.java.name)
    println(logger.filter)
}

@Deprecated("", ReplaceWith("println(\"■ Deprecated method\")"))
fun deprecatedMethod() {
    println("■ Deprecated method")
}

@Name("elementValue")
fun customNotation() {
    println("■ Custom Notation: ")
}