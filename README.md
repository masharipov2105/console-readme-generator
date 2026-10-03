# Console Readme Generator


**Console Readme Generator** - A CLI tool that generates standardized README.md files through an interactive questionnaire.

---


## About the project

Writing a good README is time-consuming and often overlooked. Developers either skip it entirely or produce inconsistent documentation across projects. Console Readme Generator solves this problem by asking a series of simple questions in your terminal and automatically producing a clean, standardized README.md file — all in under 10 minutes. No templates to remember, no Markdown syntax to memorize, no formatting decisions to make.

- Interactive CLI questionnaire — just 14 simple questions and your README is ready.
- Standardized output — every README follows the same clean structure, making projects easier to compare and evaluate.
- Pure Java implementation — no external dependencies beyond the JDK, no frameworks, just plain Java.
- Custom output path — save the generated README.md anywhere in your project.
- Layered architecture — controller, service, generator, and model layers are cleanly separated, making the codebase easy to extend and test.

---


## Features

| Function | Description |
|----------|-------------|
| Interactive CLI | Just 14 simple questions and your README is ready. |
| Standardized output | Every README follows the same clean structure, making projects easy to compare. |
| Zero dependencies | Pure Java implementation with no external libraries beyond the JDK. |
| Custom output path | Save the generated README.md anywhere in your project. |

---


## Project objective

This project was born out of a personal need: I wanted to improve my Java skills, practice software architecture, and apply clean code principles to a real problem. Writing READMEs was always tedious for me — I would either skip it entirely or write something inconsistent — so I decided to solve two problems at once: build a useful tool and grow as a developer. While the primary motivation was learning, the result is a working CLI tool that anyone can use to generate standardized README files in minutes.

- The primary goal was personal growth. I wanted to move beyond tutorials and build something real — from idea to working release. This project gave me hands-on experience with layered architecture, dependency injection, and clean code principles.
- The second goal was to solve a problem I personally faced: writing READMEs is time-consuming and easy to postpone. I wanted a tool that turns this tedious task into a simple, guided process. It produces a clean, standardized README without requiring any Markdown knowledge.

---


## Technologies

| Technology | Version | Objective |
|------------|---------|-----------|
| Java  |  17  |  Core language for the entire application |
| Maven  |  3.8.7  |  Build tool and dependency management |
| JUnit  |  5.10.1  |  Unit testing |

---


## Installation and Execution

### Windows
```cmd
 git clone https://github.com/masharipov2105/console-readme-generator.git

 cd console-readme-generator

 mvn clean package

 java -jar target/console-readme-generator-1.0-SNAPSHOT.jar

```
---

### Linux/Mac
```bash
 git clone https://github.com/masharipov2105/console-readme-generator.git

 cd console-readme-generator

 mvn clean package

 java -jar target/console-readme-generator-1.0-SNAPSHOT.jar

```
---


## Project view

![Home](https://raw.githubusercontent.com/masharipov2105/console-readme-generator/refs/heads/main/screenshots/img1.png)
![Home](https://raw.githubusercontent.com/masharipov2105/console-readme-generator/refs/heads/main/screenshots/img2.png)

---


## Project Structure

```cmd
console-readme-generator/
├── screenshots/
│   ├── img1.png
│   └── img2.png
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── masharipov2105/
│   │               └── systems/
│   │                   ├── controller/
│   │                   │   └── ReadmeController.java
│   │                   ├── generator/
│   │                   │   ├── ReadmeGenerator.java
│   │                   │   └── ReadmeGeneratorImpl.java
│   │                   ├── model/
│   │                   │   ├── ReadmeModel.java
│   │                   │   └── RequestModel.java
│   │                   ├── service/
│   │                   │   ├── ReadmeService.java
│   │                   │   └── ReadmeServiceImpl.java
│   │                   ├── utils/
│   │                   │   ├── InputValidator.java
│   │                   │   ├── MarkdownTransmitter.java
│   │                   │   └── TreeGenerator.java
│   │                   └── Main.java
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── masharipov2105/
│       │           └── systems/
│       │               ├── model/
│       │               │   ├── ReadmeModelTest.java
│       │               │   └── RequestModelTest.java
│       │               ├── utils/
│       │               │   ├── InputValidatorTest.java
│       │               │   ├── MarkdownTransmitterTest.java
│       │               │   └── TreeGeneratorTest.java
│       │               └── MainTest.java
│       └── resources/
│           ├── example-tree/
│           │   ├── level1-a/
│           │   │   ├── level2-a/
│           │   │   │   ├── level3-a/
│           │   │   │   │   └── file6.txt
│           │   │   │   └── file5.txt
│           │   │   ├── level2-b/
│           │   │   │   └── file7.txt
│           │   │   ├── file3.txt
│           │   │   └── file4.md
│           │   ├── level1-b/
│           │   │   ├── level2-c/
│           │   │   │   ├── file10.txt
│           │   │   │   └── file9.txt
│           │   │   └── file8.txt
│           │   ├── file1.txt
│           │   └── file2.pdf
│           └── result.txt
├── target/
│   ├── classes/
│   │   └── com/
│   │       └── masharipov2105/
│   │           └── systems/
│   │               ├── controller/
│   │               │   └── ReadmeController.class
│   │               ├── generator/
│   │               │   ├── ReadmeGenerator.class
│   │               │   └── ReadmeGeneratorImpl.class
│   │               ├── model/
│   │               │   ├── ReadmeModel.class
│   │               │   └── RequestModel.class
│   │               ├── service/
│   │               │   ├── ReadmeService.class
│   │               │   └── ReadmeServiceImpl.class
│   │               ├── utils/
│   │               │   ├── InputValidator.class
│   │               │   ├── MarkdownTransmitter.class
│   │               │   └── TreeGenerator.class
│   │               └── Main.class
│   ├── generated-sources/
│   │   └── annotations/
│   └── maven-status/
│       └── maven-compiler-plugin/
│           └── compile/
│               └── default-compile/
│                   ├── createdFiles.lst
│                   └── inputFiles.lst
├── pom.xml
└── README.md
```
---


## License

This project is licensed under the MIT License. See the LICENSE file for details.

---


## Author

    masharipov2105

    @masharipov2105

    masharipov2105@gmail.com


