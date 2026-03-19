# Java Exception Handling Demo

A simple Java project demonstrating core exception handling concepts.

## Overview

This project shows how to handle runtime errors gracefully in Java using `try`, `catch`, `finally`, `throw`, `throws`, and custom exceptions.

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- A terminal or any Java IDE (IntelliJ, Eclipse, VS Code)



## What's Covered

| Concept | Description |
|---|---|
| `try` | Wraps code that might throw an exception |
| `catch` | Handles a specific exception type |
| `finally` | Always executes, used for cleanup |
| `throw` | Manually triggers an exception |
| `throws` | Declares that a method may throw an exception |
| Custom Exception | Extend `Exception` to define your own types |

## Examples

### 1. ArithmeticException
Demonstrates catching a division-by-zero error and using `finally`.

### 2. Multiple Catch Blocks
Shows how to handle different exception types from the same `try` block. Always order from most specific to most general.

### 3. Custom Exception
Defines `InvalidAgeException` to validate business logic with a meaningful error message.

## Key Rule

> Always catch exceptions from **most specific to most general** — otherwise the compiler will complain.

