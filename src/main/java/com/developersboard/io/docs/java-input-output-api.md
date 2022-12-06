### Java Input-Output API

IO classes are located in `java.io` and `java.nio` packages.

- Abstract classes define general text and binary data read and write abilities.
- Concrete classes descend from these parents to provide different types of IO stream handlers:
    - Connect to different sources and destinations
    - Transform stream content
    - Perform content buffering
        - Provide convenience methods

<style>
.tg  {border-collapse:collapse;border-spacing:0;padding}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 10px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 10px;word-break:normal;}
.tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-0pky"></th>
    <th class="tg-0pky">Read</th>
    <th class="tg-0pky">Write</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">Binary</td>
    <td class="tg-0pky">InputStream<br> - FileInputStream<br> - ObjectInputStream<br> - PipedInputStream</td>
    <td class="tg-0pky">OutputStream<br> - FileOutputStream<br> - ObjectOutputStream<br> - PipedOutputStream</td>
  </tr>
  <tr>
    <td class="tg-0pky">Character</td>
    <td class="tg-0pky">Reader<br> - BufferedReader<br> - InputStreamReader<br> &nbsp;&nbsp;&nbsp;&nbsp;- FileReader<br> - PipedReader<br> - URLReader</td>
    <td class="tg-0pky">Writer<br> - BufferedWriter<br> - OutputStreamWriter<br> &nbsp;&nbsp;&nbsp;&nbsp;- FileWriter<br> - PipedWriter<br> - PrintWriter</td>
  </tr>
</tbody>
</table>