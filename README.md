# HorusRekru

## Description
A small project for great company **Horus**, which gave me chance to learn Java :D
Thanks guys & girls!

User can create **MySimpleNode** or **MyNode**, giving them `code` and `renderer` arguments.

MyNodes can have subnodes added to them (MyNodes or MySimpleNodes) to create tree hierarchy.
MySimpleNodes cannot be a parent node to any other node.

Nodes can be searched for by looking up `code` or `renderer` string value in appropriate methods (`findByCode()`, `findByRenderer()`).

Object **MyStructure** must be created, so MyNodes can be added to it. By using its `count()` method user can check the number of root nodes.




## Requirements
Java15

## Usage
For running the **program** from command line:
```
gradlew run
```

For running the **tests** from command line:

```
gradlew test
```

## Authors
paulina.wojno@gmail.com

## Project status
Finished for now, but hopefully it is not the end of this adventure :D
