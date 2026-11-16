# Store Management

A java collections example.

## Tech stack

- Java
- Lombok

## Concepts covered

Collections, console input (Scanner), custom exceptions, exception handling, static/final members.

## Project structure

- `CommandMgt`: Command, Commands
- `DatabaseConnection`: DbConnection
- `Enumerations`: CustomerType
- `Exceptions`: ProductLabelException, ProviderExistException, ProviderNotFoundException
- `Main`: Application
- `ProductMgt`: Product, Products
- `ProviderMgt`: Provider, Providers
- `customerMgt`: Customer, Customers

## How to run

Open the folder in IntelliJ IDEA or Eclipse and run `Application` (it contains the `main` method).

The code uses Lombok annotations: add the Lombok library and enable annotation processing in your IDE.

The JDBC code expects a running database server; set your own connection URL, username and password before running.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
