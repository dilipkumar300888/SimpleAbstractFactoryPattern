package org.example;

public interface AbstractFactory<T> {
    T Create(String type);
}
