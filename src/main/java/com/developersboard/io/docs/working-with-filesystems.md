## Working with Filesystems

Package `java.nio.file` contains classes that handle filesystem interactions:

- Class `Path` represents files and folders
- Class `Files` provides operations that handle path objects.
- Class `FileSystem` describes available filesystems and their properties:
  - Access properties of file storage using a stream of FileStore objects
  - Discover filesystem roots using a stream of Path objects "/" or "C:" etc.
  - Get path node separator for the given OS "/" or "\". 

* Class `java.io.File` is a legacy API class whose functionalities are now distributed between `Path`, `Files` and `FileSystem` classes of a new IO API
* Operation `toFile()` of the `Path` class converts path object to file object.
* Operation `toPath()` of the File class converts file object to path object.