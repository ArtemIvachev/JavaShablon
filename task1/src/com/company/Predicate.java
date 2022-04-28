package com.company;
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}