package com.miracle.service;

@FunctionalInterface
public interface MathService<T> {
    T add(T a, T b);
}
