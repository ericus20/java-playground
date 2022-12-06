## Basic Binary Data Reading and Writing

Basic Binary data read and write capabilities are provided by `Input` and `Output` streams.
Binary data is a type of data that is represented or displayed in the binary numeral system. 
Binary data is the only category of data that can be directly understood and executed by a computer. 
It is numerically represented by a combination of zeros and ones.

- Input and Output streams both implement `AutoCloseable` interface.
  - Can be used in the [try-with-resources](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html) construct
  - Closed within the implicit finally block
  - Otherwise, must be closed explicitly within finally block.
- Method `read` populates the `buffer` with portions of binary data and returns an int `length` indicator.
  - On intermediate reads, this indicator is equal to the buffer length.
  - On the read before last, it is equal to how much data remains in the stream
  - On the last read, it equal to -1, which indicates the end of the stream.