## Understand Serialization

Serialization Purpose:

- Serialization is a process of writing objects from memory into a stream.
- Deserialization is a process of reading objects from the stream.
- Data is serialized in a binary form.

Serialization use cases:

- Swapping objects to avoid running out of memory
- Sending objects across network:
  - replicate data between nodes in a cluster
  - pass parameters and return values when calling methods remotely
- Serialization is not a suitable solution for long-term data storage.
  - Serialized value is specific to the compiled code version