## Connecting Streams

Streams can be connected to one another to apply features.

- Connecting streams apply transform, filter, and buffer data capabilities.
- Connect stream into a chain until you get the required and convenient way of handling content.

- Everything that is `stream` is binary
- Everything that is `reader` or `writer` is character
- Everything that includes both is conversion


| Reader                                    | Writer                                     |
|-------------------------------------------|--------------------------------------------|
| BufferedReader provides readLine method   | PrintWriter provides println method        |
| <center>is connected to</center>          | <center>is connected to</center>           |
| InputStreamReader converts bytes to chars | OutputStreamReader converts chars to bytes |
| <center>is connected to</center>          | <center>is connected to</center>           |
| FileInputStream reads bytes from file     | FileOutputStream writes bytes to the file  |