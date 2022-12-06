# Java IO API

## Objectives

- Describe Java IO
- Read and write text and binary data
- Use Java Serialization
- Work with the file system

## Java Input-Output Principals

### Characteristics of Java Input-Output (IO):

- Read information from various sources - input direction
- Write information to various destinations - output direction
- Information is transferred through a series of interconnected streams (pipes)

### Streams are categorized based on:

- The type of data that stream can carry, for example, text binary
- Direction of the stream - input or output
- Type of the source or destination to which the stream is connected
- Additional features, such as filtering or transformation of data

[Java Input-Output API](docs/java-input-output-api.md)

### Reading and Writing Binary Data

Basic binary data reading and writing capabilities are defined by the pair of abstract classes

- [InputStream](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/io/InputStream.html)
- [OutputStream](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/io/OutputStream.html)

[Basic Binary Data Reading and Writing](docs/basic-binary-data-reading-and-writing.md)

[Connecting Streams](docs/connecting-streams.md)

[Standard Input and Output](docs/standard-input-output.md)

[Understand Serialization](docs/understand-serialization.md)

[Working with Filesystems](docs/working-with-filesystems.md)


