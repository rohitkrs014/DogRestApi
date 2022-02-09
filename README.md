# DogRestApi

A Rest api which returns the list of dogs from an in memory h2-database.

The api returns the list of all dogs, Dog by id, Dog by Name and Dog by breed. If the id of the dog is not present in the database, it returns a custom exception DogNotFound.
